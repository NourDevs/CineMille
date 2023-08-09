package cinemille.project.filmapp.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table
public class Screening implements Serializable {

    @Id
    @GeneratedValue
    @Column(nullable = false, updatable = false)
    private Long id;
    private Film film;
    private Hall hall;
    private Date startTime;

    public Screening() {
    }

    public Screening(Film film, Hall hall, Date startTime) {
        this.film = film;
        this.hall = hall;
        this.startTime = startTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
