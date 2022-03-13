package kg.megacom.filmotekaservice.models.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ClientDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String address;
    private Date dateOfBirth;

}
