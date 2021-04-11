package co.example.demo.repository;

import co.example.demo.model.RegistroAsistenciaTraining;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

@Repository
public class RepositoryRegistroAsistencia implements  IRegistroAsistenciaTraining {



    private static final Logger Log = LoggerFactory.getLogger(RepositoryRegistroAsistencia.class);

   @Override
    public Flux<RegistroAsistenciaTraining> buscarTodos() {
        List<RegistroAsistenciaTraining> registros = new ArrayList<>();
        registros.add(new RegistroAsistenciaTraining(1, LocalDate.now(),"Raúl", "Daniela"));
        registros.add(new RegistroAsistenciaTraining(2, LocalDate.now(),"Oscar", "Alejandro"));
        return Flux.fromIterable(registros);

    }

    @Override
    public Mono<RegistroAsistenciaTraining> buscarPorId(Integer id) {
        return null;
    }

    @Override
    public Mono<RegistroAsistenciaTraining> añadir(RegistroAsistenciaTraining registro) {
        return null;

    }

    @Override
    public Mono<Void> eliminar(Integer id) {
        return null;
    }

    @Override
    public Mono<RegistroAsistenciaTraining> modificar(RegistroAsistenciaTraining registro) {
        return null;
    }
}
