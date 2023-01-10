package co.com.bancolombia.usecase.updatemovie;

import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.gateways.MovieRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.function.BiFunction;

@RequiredArgsConstructor
public class UpdateMovieUseCase implements BiFunction< String, Movie, Mono<Movie>> {
    private final MovieRepository movieRepository;
    @Override
    public Mono<Movie> apply(String id, Movie movie) {
        movie.setId(id);
        return movieRepository.save(movie);
    }
}
