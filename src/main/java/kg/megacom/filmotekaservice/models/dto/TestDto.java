package kg.megacom.filmotekaservice.models.dto;

import kg.megacom.filmotekaservice.models.entity.ClientFilm;
import lombok.Data;

import java.util.List;

@Data
public class TestDto {
    private Long id;
    private List<ClientFilm> clientFilms;

}
