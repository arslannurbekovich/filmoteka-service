package kg.megacom.filmotekaservice.services.impl;

import kg.megacom.filmotekaservice.dao.ClientRepo;
import kg.megacom.filmotekaservice.mappers.ClientMapper;
import kg.megacom.filmotekaservice.models.dto.ClientDto;
import kg.megacom.filmotekaservice.models.entity.Client;
import kg.megacom.filmotekaservice.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepo clientRepo;

    @Autowired
    private ClientMapper clientMapper;

    @Override
    public ClientDto save(ClientDto clientDto) {
        Client client = clientMapper.toEntity(clientDto);
        client = clientRepo.save(client);
        return clientMapper.toDto(client);
    }
}
