package co.example.demo.repository;

import co.example.demo.model.RegistroAsistenciaTraining;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IRegistroAsistenciaTraining {

    Flux<RegistroAsistenciaTraining> buscarTodos();
    Mono<RegistroAsistenciaTraining> buscarPorId(Integer id);
    Mono<RegistroAsistenciaTraining> añadir(RegistroAsistenciaTraining registro);
    Mono<Void> eliminar(Integer id);
    Mono<RegistroAsistenciaTraining> modificar(RegistroAsistenciaTraining registro);

}
