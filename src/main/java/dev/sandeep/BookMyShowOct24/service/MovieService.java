package dev.sandeep.BookMyShowOct24.service;

import dev.sandeep.BookMyShowOct24.exception.MovieNotFoundException;
import dev.sandeep.BookMyShowOct24.model.Movie;
import dev.sandeep.BookMyShowOct24.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie getMovieById(int id) {
        return movieRepository.findById(id).orElseThrow(
                () -> new MovieNotFoundException("Movie not found with id: " + id)
        );
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public void deleteMovieById(int id) {
        movieRepository.deleteById(id);
    }
}
