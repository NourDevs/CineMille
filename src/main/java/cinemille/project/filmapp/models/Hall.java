package cinemille.project.filmapp.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table
public class Hall implements Serializable {

    @Id
    @GeneratedValue
    @Column(nullable = false, updatable = false)
    private Long id;
    private int number;
    private int capacity;
    private String technology;

    public Hall() {
    }

    public Hall(int number, int capacity, String technology) {
        this.number = number;
        this.capacity = capacity;
        this.technology = technology;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}
