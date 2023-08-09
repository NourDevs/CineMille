package cinemille.project.filmapp.repositories;

import cinemille.project.filmapp.models.Screening;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreeningRepository extends JpaRepository<Screening, Long> {

}
