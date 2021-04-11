package co.example.demo.repository;

import co.example.demo.model.VideoYoutube;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Repository
public class YoutubeRepo implements IYoutubeRepository{

    private static final Logger Log = LoggerFactory.getLogger(YoutubeRepo.class);

    @Override
    public Flux<VideoYoutube> listarTodos() {
        List<VideoYoutube> videos = new ArrayList<>();
        videos.add(new VideoYoutube("1", "Cocinando con Daniela #2 :D","En este video estamos con Daniela y vamos a cocinar algunas delicias. Subscríbete y siguenos en nuestras redes", "11 de abril de 2021","LasLoquillasDelMonte" ));
        videos.add(new VideoYoutube("2","Vlog de mi viaje a Japón", "Como os había dicho la semana pasada, haría un vlog de mi viaje a japón. Hoy os enseño algunos lugares que visité","24 de febrero de 2018","Elviejoexplorador"));
        videos.add(new VideoYoutube("3", "Clase #4 - Química aplicada a la industria","Clase #4 - Química aplicada a la industria\nDocente: Robert David Cuartas - Universidad Bolivariana de Chile","01 de marzo de 2013","EsoNoTieneCiencia"));
        videos.add(new VideoYoutube("4", "ESTE JUGADOR CASI ME DAÑA LA PARTIDA | Donato","Hola Chamo, te invito a ver esta partida donde un jugador casi me hace perder la partida. Naguara chamo", "22 de enero de 2020","Donato"));
        return Flux.fromIterable(videos);
    }

    @Override
    public Mono<VideoYoutube> listarVideoPorId(String id) {
        return Mono.just(new VideoYoutube(id,"Cocinando con Daniela #2 :D","En este video estamos con Daniela y vamos a cocinar algunas delicias. Subscríbete y siguenos en nuestras redes","11 de abril de 2021","LasLoquillasDelMonte"));
    }

    @Override
    public Mono<VideoYoutube> registrarVideo(VideoYoutube videoYoutube) {
        Log.info(videoYoutube.toString());
        return Mono.just(videoYoutube);
    }

    @Override
    public Mono<VideoYoutube> modificarVideo(VideoYoutube videoYoutube) {
        Log.info(videoYoutube.toString());
        return Mono.just(videoYoutube);
    }

    @Override
    public Mono<Void> eliminarVideo(String id) {
        return  Mono.empty();
    }
}
