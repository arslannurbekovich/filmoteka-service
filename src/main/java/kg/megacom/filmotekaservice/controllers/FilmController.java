package kg.megacom.filmotekaservice.controllers;

import kg.megacom.filmotekaservice.models.dto.FilmDto;
import kg.megacom.filmotekaservice.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @PostMapping("/save")
    public FilmDto save(@RequestBody FilmDto filmDto) {
        return filmService.save(filmDto);
    }

    @PutMapping("/update")
    public FilmDto update(@RequestBody FilmDto filmDto) {
        return filmService.update(filmDto);
    }

    @GetMapping("/findAll")
    public List<FilmDto> findAll() {
        return filmService.findAll();
    }

    @GetMapping("/{id}")
    public FilmDto findById(Long id) {
        return filmService.findById(id);
    }
}

