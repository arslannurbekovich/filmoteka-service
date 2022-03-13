package kg.megacom.filmotekaservice.controllers;

import kg.megacom.filmotekaservice.models.dto.ClientFilmDto;
import kg.megacom.filmotekaservice.models.dto.RequestDto;
import kg.megacom.filmotekaservice.models.dto.TestDto;
import kg.megacom.filmotekaservice.services.ClientFilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/clientFilm")
public class ClientFilmController {

    @Autowired
    private ClientFilmService clientFilmService;

    @PostMapping("/order")
    public ClientFilmDto order(@RequestBody RequestDto requestDto) {
        return clientFilmService.order(requestDto);
    }

    @PostMapping("/test")
    public TestDto test(@RequestBody TestDto testDto) {
        return null;
    }

}
