package kg.megacom.filmotekaservice.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "checkbox_option")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CheckBoxOption extends BaseEntity{

    @Column(name = "filed_text")
    private String text;

    @Column(name = "isCorrect")
    private boolean isCorrect;

    @ManyToOne
    @JoinColumn(name = "check_box_field_id")
    private CheckBoxField checkBoxField;

}
