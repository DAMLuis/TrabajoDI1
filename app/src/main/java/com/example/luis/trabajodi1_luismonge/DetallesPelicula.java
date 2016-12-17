package com.example.luis.trabajodi1_luismonge;


public class DetallesPelicula {


    private String titulo;
    private String genero;
    private String descripcion;
    private String reparto;
    private int video;
    private int portada;

    public DetallesPelicula(String titulo, String genero, String descripcion, String reparto, int video, int portada) {
        this.setTitulo(titulo);
        this.setGenero(genero);
        this.setDescripcion(descripcion);
        this.setReparto(reparto);
        this.setVideo(video);
        this.setPortada(portada);
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getReparto() {
        return reparto;
    }

    public void setReparto(String reparto) {
        this.reparto = reparto;
    }

    public int getVideo() {
        return video;
    }

    public void setVideo(int video) {
        this.video = video;
    }

    public int getPortada() {
        return portada;
    }

    public void setPortada(int portada) {
        this.portada = portada;
    }
}
