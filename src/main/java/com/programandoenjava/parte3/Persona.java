package com.programandoenjava.parte3;

import java.util.ArrayList;

public class Persona {
    private static int contdadorIdsPersonas = 1;
    private final int id = contdadorIdsPersonas++;
    private final String nombre;
    private final int edad;
    private final ArrayList<Libro> librosPrestados;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.librosPrestados = new ArrayList<>();
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
    
    public ArrayList<Libro> getLibrosPrestados() {
        return new ArrayList<>(this.librosPrestados);
    }
    
    public Libro buscarLibroPorId(int id) {
        for (Libro libro : this.librosPrestados) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }

    public void tomarPrestado(Libro libro) {
        this.librosPrestados.add(libro);
    }

    public void devolver(Libro libro) {
        this.librosPrestados.remove(libro);
    }
}
