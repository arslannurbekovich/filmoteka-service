package kg.megacom.filmotekaservice.models.dto;

import lombok.Data;

@Data
public class FilmDto {

    private Long id;
    private String name;
    private double price;
    private String author;

}
