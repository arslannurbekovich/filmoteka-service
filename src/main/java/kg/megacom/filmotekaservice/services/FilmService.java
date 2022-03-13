package kg.megacom.filmotekaservice.services;

import kg.megacom.filmotekaservice.models.dto.FilmDto;

import java.util.List;

public interface FilmService {
    FilmDto save(FilmDto filmDto);

    FilmDto update(FilmDto filmDto);

    List<FilmDto> findAll();

    FilmDto findById(Long id);
}
