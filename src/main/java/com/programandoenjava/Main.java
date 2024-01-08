package com.programandoenjava;

import com.programandoenjava.parte3.Libro;

public class Main {

    public static void main(String[] args) {
        Libro libro= new Libro("Effective Java", "Joshua Bloch", 2017);
        Libro libro2= new Libro("JavaScript - The Definitive Guide", "David Flanagan", 2020);
        System.out.println("El id del libro es: " + libro.getId());
        System.out.println("El id del libro es: " + libro2.getId());

    }
}