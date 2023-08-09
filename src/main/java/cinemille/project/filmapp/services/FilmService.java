package cinemille.project.filmapp.services;

import cinemille.project.filmapp.models.Film;
import cinemille.project.filmapp.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    @Autowired
    private final FilmRepository filmRepository;


    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public List<Film> findAllFilms() {
        return filmRepository.findAll();
    }
}
