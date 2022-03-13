package kg.megacom.filmotekaservice.models.dto;

import kg.megacom.filmotekaservice.models.entity.CheckBoxField;
import kg.megacom.filmotekaservice.models.entity.FieldAbs;
import kg.megacom.filmotekaservice.models.entity.Form;
import lombok.Data;

import java.util.List;

@Data
public class FormDto {

    private Form form;
    private List<CheckBoxField> checkBoxFieldList;
}
