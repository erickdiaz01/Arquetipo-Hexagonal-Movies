package co.com.bancolombia.usecase.savemovie;

import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.gateways.MovieRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@RequiredArgsConstructor
public class SaveMovieUseCase implements Function<Movie, Mono<Movie>>{

    private final MovieRepository movieRepository;
    @Override
    public Mono<Movie> apply(Movie movie) {
        return movieRepository.save(movie);
    }
}
