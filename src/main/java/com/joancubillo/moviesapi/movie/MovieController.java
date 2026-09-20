package com.joancubillo.moviesapi.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/getAll")
    public List<Movie> hello(){
        List<Movie> response = movieRepository.findAll();
        return movieRepository.findAll();
    }
}
