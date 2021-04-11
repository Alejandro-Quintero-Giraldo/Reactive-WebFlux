package co.example.demo.model;

import java.time.LocalDate;
import java.util.Objects;

public class RegistroAsistenciaTraining {
    private final Integer id;
    private final LocalDate fecha;
    private String nombreCoach;
    private String nombreEstudiante;


    public RegistroAsistenciaTraining(Integer id, LocalDate fecha, String nombreCoach, String nombreEstudiante) {
        this.id = id;
        this.fecha = LocalDate.now();
        this.nombreCoach = nombreCoach;
        this.nombreEstudiante = nombreEstudiante;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getNombreCoach() {
        return nombreCoach;
    }

    public void setNombreCoach(String nombreCoach) {
        this.nombreCoach = nombreCoach;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    @Override
    public String toString() {
        return "RegistroAsistenciaTraining:{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", nombreCoach='" + nombreCoach + '\'' +
                ", nombreEstudiante='" + nombreEstudiante + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistroAsistenciaTraining that = (RegistroAsistenciaTraining) o;
        return Objects.equals(id, that.id) && Objects.equals(fecha, that.fecha) && Objects.equals(nombreCoach, that.nombreCoach) && Objects.equals(nombreEstudiante, that.nombreEstudiante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fecha, nombreCoach, nombreEstudiante);
    }

}
