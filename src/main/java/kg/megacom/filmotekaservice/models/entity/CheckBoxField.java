package kg.megacom.filmotekaservice.models.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "checkbox_field")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CheckBoxField extends FieldAbs{

    @OneToMany(mappedBy = "checkBoxField")
    List<CheckBoxOption> checkBoxOptionList;

}