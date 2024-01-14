package com.programandoenjava.parte3;

/**
 * Clase que representa un <strong>Libro Digital</strong>.
 * Un libro digital es un libro que tiene un id, un título, un autor, un año de publicación y una url.
 * @see Libro
 * @see Biblioteca
 * @see Persona
 * @version 1.0
 * @author Andres Samuel Podadera Gonzalez
 */
public class LibroDigital extends Libro {
    //Atributos
    /**
     * url es la url del libro digital.
     */
    private String url;

    //Constructor
    /**
     * Crea un objeto LibroDigital con un id, un título, un autor, un año de publicación y una url.
     * @param titulo el título del libro.
     * @param autor el autor del libro.
     * @param anioPublicacion el año de publicación del libro.
     * @param url la url del libro digital.
     */
    public LibroDigital(String titulo, String autor, int anioPublicacion, String url) {
        super(titulo, autor, anioPublicacion);
        this.url = url;
    }

    //Métodos
    /**
     * Devuelve la url del libro digital.
     * @return String la url del libro digital.
     */
    public String getUrl() {
        return this.url;
    }
    
    /**
     * Establece la url del libro digital.
     * @param url la url del libro digital.
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
