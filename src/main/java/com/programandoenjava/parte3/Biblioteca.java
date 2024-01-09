package com.programandoenjava.parte3;

import java.util.HashSet;

public class Biblioteca {
     private HashSet<Libro> libros; //HashSet es una colección que no permite duplicados, id del libro es único
    
    public Biblioteca() {
        libros = new HashSet<>();
    }
    
    public HashSet<Libro> getLibros() {
       return new HashSet<>(libros); //devuelve una copia de la colección
    }
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
    
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
}
