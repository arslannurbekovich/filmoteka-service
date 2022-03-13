package kg.megacom.filmotekaservice.dao;

import kg.megacom.filmotekaservice.models.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepo extends JpaRepository<Film, Long> {
}
