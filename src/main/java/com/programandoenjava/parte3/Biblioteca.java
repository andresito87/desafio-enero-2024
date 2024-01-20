package com.programandoenjava.parte3;

import java.util.HashSet;

/**
 * Clase que representa una <strong>Biblioteca</strong>.
 * Una biblioteca tiene una colección de libros.
 *
 * @author Andres Samuel Podadera Gonzalez
 * @see Libro
 * @see LibroDigital
 */
public class Biblioteca {
    /**
     * libros es una colección de libros.
     */
    private final HashSet<Libro> libros; //HashSet es una colección que no permite duplicados, id del libro es único

    //Constructor

    /**
     * Crea un objeto Biblioteca con una colección de libros vacía.
     */
    public Biblioteca() {
        libros = new HashSet<>();
    }

    //Métodos

    /**
     * Devuelve una copia de la colección de libros.
     *
     * @return HashSet<Libro> una copia de la colección de libros.
     */
    public HashSet<Libro> getLibros() {
        return new HashSet<>(libros); //devuelve una copia de la colección
    }

    /**
     * Agrega un libro a la colección de libros.
     *
     * @param libro el libro a agregar.
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    /**
     * Busca un libro por su id.
     *
     * @param id el id del libro a buscar.
     * @return Libro el libro encontrado o null si no se encuentra.
     */
    public Libro buscarLibro(int id) {
        //version Funcional
        //return libros.stream().filter(libro -> Libro.getId() == id).findFirst().orElse(null);
        //version Imperativa
        for (Libro libro : libros) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Representación en String de la colección de libros.
     *
     * @return String la representación en String de la colección de libros.
     * @see Libro
     * @see LibroDigital
     */
    @Override
    public String toString() {
        return libros.toString();
    }
}
