package cinemille.project.filmapp.services;

import cinemille.project.filmapp.repositories.ScreeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScreeningService {

    @Autowired
    private final ScreeningRepository screeningRepository;

    public ScreeningService(ScreeningRepository screeningRepository) {
        this.screeningRepository = screeningRepository;
    }
}
