package kg.megacom.filmotekaservice.mappers;

import kg.megacom.filmotekaservice.models.dto.ClientFilmDto;
import kg.megacom.filmotekaservice.models.entity.ClientFilm;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientFimMapper {

    ClientFimMapper INSTANCE = Mappers.getMapper(ClientFimMapper.class);

    ClientFilm toEntity(ClientFilmDto requestDto);

    ClientFilmDto toDto(ClientFilm clientFilm);


}
