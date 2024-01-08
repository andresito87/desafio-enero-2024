package com.programandoenjava.parte3;

import java.util.ArrayList;

public class Persona {
    public static int contdadorIdsPersonas = 1;
    public int id = contdadorIdsPersonas++;
    public String nombre;
    public int edad;
    public ArrayList<Libro> librosPrestados;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void tomarPrestado(Libro libro) {
        this.librosPrestados.add(libro);
    }

    public void devolver(Libro libro) {
        this.librosPrestados.remove(libro);
    }
}
