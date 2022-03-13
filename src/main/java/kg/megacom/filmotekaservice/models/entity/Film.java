package kg.megacom.filmotekaservice.models.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "films")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private double price;
    private String author;
}
