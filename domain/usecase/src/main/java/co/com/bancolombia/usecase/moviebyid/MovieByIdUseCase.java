package co.com.bancolombia.usecase.moviebyid;

import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.gateways.MovieRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@RequiredArgsConstructor
public class MovieByIdUseCase implements Function<String, Mono<Movie>> {
    private final MovieRepository movieRepository;
    @Override
    public Mono<Movie> apply(String id) {
        return movieRepository.findById(id);
    }
}
