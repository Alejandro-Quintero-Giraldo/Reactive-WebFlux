package co.example.demo.repository;

import co.example.demo.model.VideoYoutube;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface IYoutubeRepository {

    Flux<VideoYoutube> listarTodos();
    Mono<VideoYoutube> listarVideoPorId(String id);
    Mono<VideoYoutube> registrarVideo(VideoYoutube videoYoutube);
    Mono<VideoYoutube> modificarVideo(VideoYoutube videoYoutube);
    Mono<Void> eliminarVideo(String id);
}
