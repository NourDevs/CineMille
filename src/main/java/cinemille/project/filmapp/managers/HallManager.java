package cinemille.project.filmapp.managers;


import cinemille.project.filmapp.services.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hall")
public class HallManager {

    private final HallService hallService;

    @Autowired
    public HallManager(HallService hallService) {
        this.hallService = hallService;
    }
}
