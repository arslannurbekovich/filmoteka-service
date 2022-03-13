package kg.megacom.filmotekaservice.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "forms")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Form extends BaseEntity{

    @Column(name = "form_name")
    private String name;

    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;
}
