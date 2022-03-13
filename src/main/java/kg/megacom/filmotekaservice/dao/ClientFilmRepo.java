package kg.megacom.filmotekaservice.dao;

import kg.megacom.filmotekaservice.models.entity.ClientFilm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientFilmRepo extends JpaRepository<ClientFilm, Long> {
}
