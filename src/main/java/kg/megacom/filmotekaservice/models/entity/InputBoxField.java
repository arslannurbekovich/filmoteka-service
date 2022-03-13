package kg.megacom.filmotekaservice.models.entity;

import kg.megacom.filmotekaservice.models.enums.TypeValue;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "input_field")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InputBoxField extends FieldAbs {

    @Column(name = "field_correct_text")
    private String correctText;

    @Column(name = "field_type_value")
    @Enumerated(EnumType.STRING)
    private TypeValue typeValue;
}