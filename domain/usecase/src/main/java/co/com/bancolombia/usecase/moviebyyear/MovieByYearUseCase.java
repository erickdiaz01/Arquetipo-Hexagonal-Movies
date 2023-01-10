package co.com.bancolombia.usecase.moviebyyear;

import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.gateways.MovieRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@RequiredArgsConstructor
public class MovieByYearUseCase implements Function<String, Flux<Movie>> {
private final MovieRepository movieRepository;
    @Override
    public Flux<Movie> apply(String year) {
        return movieRepository.findAll().filter(mov-> mov.getYear().equals(year));
    }
}
