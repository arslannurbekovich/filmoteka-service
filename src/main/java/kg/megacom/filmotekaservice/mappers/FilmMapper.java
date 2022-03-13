package kg.megacom.filmotekaservice.mappers;

import kg.megacom.filmotekaservice.models.dto.FilmDto;
import kg.megacom.filmotekaservice.models.entity.Film;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface FilmMapper {
    FilmMapper INSTANCE = Mappers.getMapper(FilmMapper.class);

    Film toEntity(FilmDto filmDto);

    FilmDto toDto(Film film);

    List<Film> toDtos(List<FilmDto> filmDtos);

    List<FilmDto> toEntities(List<Film> films);

}
