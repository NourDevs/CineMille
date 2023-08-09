package cinemille.project.filmapp.managers;

import cinemille.project.filmapp.models.Film;
import cinemille.project.filmapp.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmManager {

    private final FilmService filmService;

    @Autowired
    public FilmManager(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public ResponseEntity<List<Film>> getAllFilms () {
        List<Film> films = filmService.findAllFilms();
        return new ResponseEntity<>(films, HttpStatus.OK);
    }
}
