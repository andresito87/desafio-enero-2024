package com.programandoenjava.parte3;

/**
 * Clase que representa un <strong>Libro</strong>.
 * Un libro tiene un id, un título, un autor y un año de publicación.
 * @see LibroDigital
 * @see Biblioteca
 * @see Persona
 * @version 1.0
 * @author Andres Samuel Podadera Gonzalez
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
     * @param titulo el título del libro.
     * @param autor el autor del libro.
     * @param anioPublicacion el año de publicación del libro.
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.id = ++Libro.contadorIds;
    }

    //Métodos
    /**
     * Devuelve el id del libro.
     * @return int el id del libro.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Devuelve el título del libro.
     * @return String el título del libro.
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Establece el título del libro.
     * @param titulo el título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Devuelve el autor del libro.
     * @return String el autor del libro.
     */
    public String getAutor() {
        return this.autor;
    }

    /**
     * Establece el autor del libro.
     * @param autor el autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Devuelve el año de publicación del libro.
     * @return int el año de publicación del libro.
     */
    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }

    /**
     * Establece el año de publicación del libro.
     * @param anioPublicacion el año de publicación del libro.
     */
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
