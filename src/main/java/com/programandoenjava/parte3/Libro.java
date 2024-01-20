package com.programandoenjava.parte3;

import java.time.LocalDate;

/**
 * Clase que representa un <strong>Libro</strong>.
 * Un libro tiene un id, un título, un autor y un año de publicación.
 *
 * @author Andres Samuel Podadera Gonzalez
 * @version 1.0
 * @see LibroDigital
 * @see Biblioteca
 * @see Persona
 */
public class Libro {
    //Atributos
    /**
     * contadorIds es un contador de ids de libros.
     */
    public static int contadorIds = 0; //id del libro es único y empieza en 1, autoincremental
    /**
     * id es el id del libro.
     */
    private final int id;

    /**
     * titulo es el título del libro.
     */
    private String titulo;

    /**
     * autor es el autor del libro.
     */
    private String autor;

    /**
     * anioPublicacion es el año de publicación del libro.
     */
    private int anioPublicacion;

    //Constructor

    /**
     * Crea un objeto Libro con un id, un título, un autor y un año de publicación.
     *
     * @param titulo          el título del libro.
     * @param autor           el autor del libro.
     * @param anioPublicacion el año de publicación del libro.
     * @throws IllegalArgumentException si el título del libro es nulo o vacío.
     * @throws IllegalArgumentException si el autor del libro es nulo o vacío.
     * @throws IllegalArgumentException si el año de publicación es menor que 0 o mayor que el año actual.
     * @see LocalDate
     */
    public Libro(String titulo, String autor, int anioPublicacion) throws IllegalArgumentException {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setAnioPublicacion(anioPublicacion);
        this.id = ++Libro.contadorIds;
    }

    //Métodos

    /**
     * Devuelve el id del libro.
     *
     * @return int el id del libro.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Devuelve el título del libro.
     *
     * @return String el título del libro.
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Establece el título del libro.
     *
     * @param titulo el título del libro.
     * @throws IllegalArgumentException si el título del libro es nulo o vacío.
     */
    public void setTitulo(String titulo) throws IllegalArgumentException {
        if (titulo == null || titulo.isBlank() || titulo.length() > 50 || titulo.length() < 4) {
            throw new IllegalArgumentException("El título del libro no puede ser nulo o vacío.");
        }
        this.titulo = titulo;
    }

    /**
     * Devuelve el autor del libro.
     *
     * @return String el autor del libro.
     */
    public String getAutor() {
        return this.autor;
    }

    /**
     * Establece el autor del libro.
     *
     * @param autor el autor del libro.
     * @throws IllegalArgumentException si el autor del libro es nulo o vacío.
     */
    public void setAutor(String autor) throws IllegalArgumentException {
        if (autor == null || autor.isBlank() || autor.length() > 50 || autor.length() < 3) {
            throw new IllegalArgumentException("El autor del libro no puede ser nulo o vacío.");
        }
        this.autor = autor;
    }

    /**
     * Devuelve el año de publicación del libro.
     *
     * @return int el año de publicación del libro.
     */
    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }

    /**
     * Establece el año de publicación del libro.
     *
     * @param anioPublicacion el año de publicación del libro.
     * @throws IllegalArgumentException si el año de publicación es menor que 0 o mayor que el año actual.
     */
    public void setAnioPublicacion(int anioPublicacion) throws IllegalArgumentException {
        if (anioPublicacion < 0 || anioPublicacion > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("El año de publicación no puede ser menor que 0 ni mayor que el año actual.");
        }
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * Representación en String del libro.
     *
     * @return String la representación en String del libro.
     */
    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                '}';
    }
}
