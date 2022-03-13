package kg.megacom.filmotekaservice.services.impl;

import kg.megacom.filmotekaservice.dao.FilmRepo;
import kg.megacom.filmotekaservice.exceptions.NotFound;
import kg.megacom.filmotekaservice.mappers.FilmMapper;
import kg.megacom.filmotekaservice.models.dto.FilmDto;
import kg.megacom.filmotekaservice.models.entity.Film;
import kg.megacom.filmotekaservice.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmRepo filmRepo;

    @Override
    public FilmDto save(FilmDto filmDto) {
        return FilmMapper.INSTANCE.toDto(filmRepo.save(FilmMapper.INSTANCE.toEntity(filmDto)));
    }

    @Override
    public FilmDto update(FilmDto filmDto) {
        if (!filmRepo.existsById(filmDto.getId())) {
            throw new NotFound("Фильм не найден!");
        }
        return FilmMapper.INSTANCE.toDto(filmRepo.save(FilmMapper.INSTANCE.toEntity(filmDto)));
    }

    @Override
    public List<FilmDto> findAll() {
        List<Film> subscribers = filmRepo.findAll();
        List<FilmDto> filmDtos = subscribers.stream().map(x -> FilmMapper.INSTANCE.toDto(x)).collect(Collectors.toList());
        return filmDtos;
    }

    @Override
    public FilmDto findById(Long id) {
        Film film = filmRepo.findById(id).orElseThrow(() -> new NotFound("Фильм не найден!"));
        return FilmMapper.INSTANCE.toDto(film);
    }
}
