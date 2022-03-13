package kg.megacom.filmotekaservice.models.entity;

import kg.megacom.filmotekaservice.models.enums.TypeField;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@MappedSuperclass
@Getter
@Setter
public abstract class FieldAbs extends BaseEntity {

    @Column(name = "field_name")
    private String name;

    @Column(name = "field_number")
    private Long number;

    @Column(name = "field_type")
    @Enumerated(EnumType.STRING)
    private TypeField typeField;

    @JoinColumn(name = "form_id")
    @ManyToOne
    private Form form;;
}
