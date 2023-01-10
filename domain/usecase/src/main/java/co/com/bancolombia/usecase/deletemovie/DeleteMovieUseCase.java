package co.com.bancolombia.usecase.deletemovie;

import co.com.bancolombia.model.movie.gateways.MovieRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.function.Function;

@RequiredArgsConstructor
public class DeleteMovieUseCase implements Function<String, Mono<Void>> {
    private final MovieRepository movieRepository;
    @Override
    public Mono<Void> apply(String id) {
        return movieRepository.deleteById(id);
    }
}
