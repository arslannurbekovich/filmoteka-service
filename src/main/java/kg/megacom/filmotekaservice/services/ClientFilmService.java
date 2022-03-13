package kg.megacom.filmotekaservice.services;

import kg.megacom.filmotekaservice.models.dto.ClientFilmDto;
import kg.megacom.filmotekaservice.models.dto.RequestDto;

public interface ClientFilmService {
    ClientFilmDto order(RequestDto requestDto);
}
