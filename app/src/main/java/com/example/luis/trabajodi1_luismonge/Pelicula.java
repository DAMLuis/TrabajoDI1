package com.example.luis.trabajodi1_luismonge;

/**
 * Created by luis on 6/12/16.
 */

public class Pelicula {

    private String titulo;
    private String genero;
    private int portada;
    private boolean vo;

    Pelicula(String ti, String genero, int portada, boolean vo){
        this.setTitulo(ti);
        this.setGenero(genero);
        this.setPortada(portada);
        this.setVo(vo);
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPortada() {
        return portada;
    }

    public void setPortada(int portada) {
        this.portada = portada;
    }

    public boolean isVo() {
        return vo;
    }

    public void setVo(boolean vo) {
        this.vo = vo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
