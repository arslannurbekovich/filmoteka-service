package kg.megacom.filmotekaservice.controllers;


import kg.megacom.filmotekaservice.models.dto.FormDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/create")
public class FormController {

    @PostMapping("/form")
    public FormDto create(@RequestBody FormDto formDto) {
        return null;
    }
}
