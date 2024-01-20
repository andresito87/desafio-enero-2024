package com.programandoenjava.parte3;

import java.util.ArrayList;

/**
 * Clase que representa una <strong>Persona</strong>.
 * Una persona tiene un id, un nombre, una edad y una colección de libros prestados.
 *
 * @author Andres Samuel Podadera Gonzalez
 * @version 1.0
 * @see Libro
 */
public class Persona {

    //Atributos
    /**
     * contdadorIdsPersonas es un contador de ids de personas.
     */
    private static int contdadorIdsPersonas = 1;
    /**
     * id es el id de la persona.
     */
    private final int id = contdadorIdsPersonas++;
    /**
     * nombre es el nombre de la persona.
     */
    private String nombre;
    /**
     * edad es la edad de la persona.
     */
    private int edad;
    /**
     * librosPrestados es una colección de libros prestados.
     */
    private final ArrayList<Libro> librosPrestados;

    //Constructor

    /**
     * Crea un objeto Persona con un nombre y una edad.
     *
     * @param nombre el nombre de la persona.
     * @param edad   la edad de la persona.
     * @throws IllegalArgumentException si el nombre de la persona es nulo o vacío.
     */
    public Persona(String nombre, int edad) throws IllegalArgumentException {
        this.setNombre(nombre);
        this.setEdad(edad);
        this.librosPrestados = new ArrayList<>();
    }

    //Métodos

    /**
     * Devuelve el id de la persona.
     *
     * @return int el id de la persona.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Devuelve el nombre de la persona.
     *
     * @return String el nombre de la persona.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre el nombre de la persona.
     * @throws IllegalArgumentException si el nombre de la persona es nulo o vacío.
     */
    public void setNombre(String nombre) throws IllegalArgumentException {
        if (nombre == null || nombre.isBlank() || nombre.length() > 20 || nombre.length() < 4) {
            throw new IllegalArgumentException("El nombre de la persona no puede ser nulo o vacío.");
        }
        this.nombre = nombre;
    }

    /**
     * Devuelve la edad de la persona.
     *
     * @return int la edad de la persona.
     */
    public int getEdad() {
        return this.edad;
    }

    /**
     * Establece la edad de la persona.
     *
     * @param edad la edad de la persona.
     * @throws IllegalArgumentException si la edad de la persona es menor que 0 o mayor que 120.
     */
    public void setEdad(int edad) throws IllegalArgumentException {
        if (edad < 0 || edad > 120) {
            throw new IllegalArgumentException("La edad de la persona debe estar entre 0 y 120.");
        }
        this.edad = edad;
    }

    /**
     * Devuelve una copia de la colección de libros prestados.
     *
     * @return ArrayList<Libro> una copia de la colección de libros prestados.
     */
    public ArrayList<Libro> getLibrosPrestados() {
        return new ArrayList<>(this.librosPrestados);
    }

    /**
     * Busca un libro por su id.
     *
     * @param id el id del libro a buscar.
     * @return Libro el libro encontrado o null si no se encuentra.
     */
    public Libro buscarLibroPorId(int id) {
        for (Libro libro : this.librosPrestados) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Toma prestado un libro o agrega un libro a la colección de libros prestados.
     *
     * @param libro el libro a tomar prestado.
     */
    public void tomarPrestado(Libro libro) {
        this.librosPrestados.add(libro);
    }

    /**
     * Devuelve un libro o elimina un libro de la colección de libros prestados.
     *
     * @param libro el libro a devolver.
     */
    public void devolver(Libro libro) {
        this.librosPrestados.remove(libro);
    }
}
