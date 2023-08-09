package cinemille.project.filmapp.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table
public class Film implements Serializable {


    @Id
    @GeneratedValue
    @Column(nullable = false, updatable = false)
    private Long id;
    private String title;
    private int duration;
    private Date releaseDate;

    public Film() {
    }

    public Film(String title, int duration, Date releaseDate) {
        this.title = title;
        this.duration = duration;
        this.releaseDate = releaseDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
