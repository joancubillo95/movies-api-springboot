package com.joancubillo.moviesapi.genre;

import com.joancubillo.moviesapi.movie.Movie;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Genre {
    @Id
    private int id;

    private String name;

    public Genre() {
    }

    public Genre(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
