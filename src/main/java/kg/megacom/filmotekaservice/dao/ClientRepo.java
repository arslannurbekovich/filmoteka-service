package kg.megacom.filmotekaservice.dao;

import kg.megacom.filmotekaservice.models.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<Client, Long> {
}
