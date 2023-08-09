package cinemille.project.filmapp.repositories;

import cinemille.project.filmapp.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Long> {
}
