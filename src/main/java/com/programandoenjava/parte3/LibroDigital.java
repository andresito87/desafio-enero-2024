package com.programandoenjava.parte3;

/**
 * Clase que representa un <strong>Libro Digital</strong>.
 * Un libro digital es un libro que tiene un id, un título, un autor, un año de publicación y una url.
 *
 * @author Andres Samuel Podadera Gonzalez
 * @version 1.0
 * @see Libro
 * @see Biblioteca
 * @see Persona
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
     *
     * @param titulo          el título del libro.
     * @param autor           el autor del libro.
     * @param anioPublicacion el año de publicación del libro.
     * @param url             la url del libro digital.
     */
    public LibroDigital(String titulo, String autor, int anioPublicacion, String url) {
        super(titulo, autor, anioPublicacion);
        this.setUrl(url);
    }

    //Métodos

    /**
     * Devuelve la url del libro digital.
     *
     * @return String la url del libro digital.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Establece la url del libro digital.
     *
     * @param url la url del libro digital.
     */
    public void setUrl(String url) {
        if (url == null || url.isEmpty() || url.isBlank()) {
            throw new IllegalArgumentException("La url del libro digital no puede ser nula o vacía.");
        }
        this.url = url;
    }

    /**
     * Devuelve una representación en String del objeto LibroDigital.
     *
     * @return String una representación en String del objeto LibroDigital.
     */
    @Override
    public String toString() {
        return "LibroDigital{" +
                "id=" + this.getId() +
                ", titulo='" + this.getTitulo() + '\'' +
                ", autor='" + this.getAutor() + '\'' +
                ", anioPublicacion=" + this.getAnioPublicacion() +
                ", url='" + this.getUrl() + '\'' +
                '}';
    }
}
