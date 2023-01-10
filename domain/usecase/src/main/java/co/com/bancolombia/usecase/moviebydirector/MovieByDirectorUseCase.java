package co.com.bancolombia.usecase.moviebydirector;

import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.gateways.MovieRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@RequiredArgsConstructor
public class MovieByDirectorUseCase implements Function<String, Flux<Movie>> {
    private final MovieRepository movieRepository;
    @Override
    public Flux<Movie> apply(String director) {
        return movieRepository.findAll().filter(mov->mov.getDirector().equals(director));
    }
}
