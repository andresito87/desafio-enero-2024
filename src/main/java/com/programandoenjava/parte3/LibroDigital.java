package com.programandoenjava.parte3;

public class LibroDigital extends Libro {
    private final String url;

    public LibroDigital(String titulo, String autor, int anioPublicacion, String url) {
        super(titulo, autor, anioPublicacion);
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }
}
