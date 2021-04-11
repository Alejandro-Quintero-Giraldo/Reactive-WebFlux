package co.example.demo.controller;

import co.example.demo.model.RegistroAsistenciaTraining;
import co.example.demo.repository.IRegistroAsistenciaTraining;
import co.example.demo.repository.RepositoryRegistroAsistencia;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/register")
public class RegistroAsistenciaController {
    private static final Logger Log = LoggerFactory.getLogger(RepositoryRegistroAsistencia.class);

    @Autowired
    private IRegistroAsistenciaTraining repo;

    @GetMapping
    public Flux<RegistroAsistenciaTraining> buscarTodos(){
        Flux<RegistroAsistenciaTraining> flux =  repo.buscarTodos();
        return flux;
    }

    public Mono<RegistroAsistenciaTraining> buscarPorId(Integer id){
        Mono<RegistroAsistenciaTraining> mono = repo.buscarPorId(id);
        return mono;
    }

    public Mono<RegistroAsistenciaTraining> añadir(RegistroAsistenciaTraining registro){
        Mono<RegistroAsistenciaTraining> mono = repo.añadir(registro);
        return mono;
    }

    public Mono<Void>  eliminar(Integer id){
        Mono<Void> mono = repo.eliminar(id);
        return mono;
    }

    public Mono<RegistroAsistenciaTraining> modificar(RegistroAsistenciaTraining registro){
        Mono<RegistroAsistenciaTraining> mono = repo.modificar(registro);
        return mono;
    }
}