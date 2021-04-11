package co.example.demo.controller;

import co.example.demo.model.VideoYoutube;
import co.example.demo.repository.IYoutubeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/youtube")
public class YoutubeController {

    @Autowired
    private IYoutubeRepository repo;

    @GetMapping(value="/buscarTodos")
    public Flux<VideoYoutube> listarTodos(){
        Flux<VideoYoutube> flux = repo.listarTodos();
        return flux;
    }

    @GetMapping(value="/buscarVideo")
    public Mono<VideoYoutube> listarVideoPorId(String id){
        Mono<VideoYoutube> mono = repo.listarVideoPorId(id);
        return mono;
    }

    @PutMapping(value="/registrar")
    public Mono<VideoYoutube> registrarVideoPorId(VideoYoutube videoYoutube){
        Mono<VideoYoutube> mono = repo.registrarVideo(videoYoutube);
        return mono;
    }

    @PutMapping(value="/modificar")
    public Mono<VideoYoutube> modificarVideo(VideoYoutube videoYoutube){
        Mono<VideoYoutube> mono = repo.modificarVideo(videoYoutube);
        return mono;
    }

    @DeleteMapping
    public Mono<Void> eliminarVideo(String id){
        Mono<Void> mono = repo.eliminarVideo(id);
        return mono;
    }

}
