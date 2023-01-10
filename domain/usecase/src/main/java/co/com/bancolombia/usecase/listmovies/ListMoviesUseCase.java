package co.com.bancolombia.usecase.listmovies;

import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.gateways.MovieRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class ListMoviesUseCase {
    private final MovieRepository movieRepository;


    public Flux<Movie> ListMovies(){
        return movieRepository.findAll();
    }
}
