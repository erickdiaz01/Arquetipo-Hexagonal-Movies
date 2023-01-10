package co.com.bancolombia.usecase.rankingmovies;

import co.com.bancolombia.model.movie.Movie;
import co.com.bancolombia.model.movie.gateways.MovieRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

import java.util.function.Function;

@RequiredArgsConstructor
public class RankingMoviesUseCase implements Function<Integer, Flux<Movie>> {
    private final MovieRepository movieRepository;
    @Override
    public Flux<Movie> apply(Integer rate) {
        return movieRepository.findAll()
                .filter(mov->mov.getRate() >= rate);
    }
}
