package co.example.demo.model;

import java.util.Objects;

public class VideoYoutube {
    private final String id;
    private final String tituloVideo;
    private final String descripcion;
    private final String fechaDePublicacion;
    private final String nombreCanal;

    public VideoYoutube(String id, String tituloVideo, String descripcion, String fechaDePublicacion, String nombreCanal) {
        this.id = id;
        this.tituloVideo = tituloVideo;
        this.descripcion = descripcion;
        this.fechaDePublicacion = fechaDePublicacion;
        this.nombreCanal = nombreCanal;
    }

    public String getId() {
        return id;
    }

    public String getTituloVideo() {
        return tituloVideo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public String getNombreCanal() {
        return nombreCanal;
    }

    @Override
    public String toString() {
        return "VideoYoutube{" +
                "id='" + id + '\'' +
                ", tituloVideo='" + tituloVideo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaDePublicacion='" + fechaDePublicacion + '\'' +
                ", nombreCanal='" + nombreCanal + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoYoutube that = (VideoYoutube) o;
        return Objects.equals(id, that.id) && Objects.equals(tituloVideo, that.tituloVideo) && Objects.equals(descripcion, that.descripcion) && Objects.equals(fechaDePublicacion, that.fechaDePublicacion) && Objects.equals(nombreCanal, that.nombreCanal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tituloVideo, descripcion, fechaDePublicacion, nombreCanal);
    }
}
