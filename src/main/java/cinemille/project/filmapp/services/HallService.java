package cinemille.project.filmapp.services;

import cinemille.project.filmapp.repositories.HallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HallService {

    @Autowired
    private final HallRepository hallRepository;


    public HallService(HallRepository hallRepository) {
        this.hallRepository = hallRepository;
    }
}
