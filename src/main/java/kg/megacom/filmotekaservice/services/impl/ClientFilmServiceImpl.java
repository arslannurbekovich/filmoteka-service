package kg.megacom.filmotekaservice.services.impl;

import kg.megacom.filmotekaservice.dao.ClientFilmRepo;
import kg.megacom.filmotekaservice.mappers.ClientFimMapper;
import kg.megacom.filmotekaservice.models.dto.ClientDto;
import kg.megacom.filmotekaservice.models.dto.ClientFilmDto;
import kg.megacom.filmotekaservice.models.dto.FilmDto;
import kg.megacom.filmotekaservice.models.dto.RequestDto;
import kg.megacom.filmotekaservice.models.entity.ClientFilm;
import kg.megacom.filmotekaservice.services.ClientFilmService;
import kg.megacom.filmotekaservice.services.ClientService;
import kg.megacom.filmotekaservice.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientFilmServiceImpl implements ClientFilmService {

    @Autowired
    private ClientFilmRepo clientFilmRepo;

    @Autowired
    private FilmService filmService;

    @Autowired
    private ClientService clientService;

    @Override
    public ClientFilmDto order(RequestDto requestDto) {
        ClientFilmDto clientFilmDto = new ClientFilmDto();
        FilmDto filmDto = filmService.findById(requestDto.getFilmId());

        clientFilmDto.setFilm(filmDto);

        clientFilmDto.setStartDate(requestDto.getStartDate());
        clientFilmDto.setEndDate(requestDto.getEndDate());

        ClientDto clientDto = clientService.save(requestDto.getClient());
        clientFilmDto.setClient(clientDto);
        clientFilmDto = ClientFimMapper.INSTANCE.toDto(clientFilmRepo.save(ClientFimMapper.INSTANCE.toEntity(clientFilmDto)));
        return clientFilmDto;

    }

}
