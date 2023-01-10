package co.com.bancolombia.model.movie.gateways;

import co.com.bancolombia.model.movie.Movie;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovieRepository {
    Flux<Movie> findAll();
    Mono<Movie> save(Movie movie);
    Mono<Movie> findById(String id);
    Mono<Void> deleteById(String id);
}
