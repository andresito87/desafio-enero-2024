package com.programandoenjava;

import com.programandoenjava.parte1.Parte1;
import com.programandoenjava.parte2.Parte2;
import com.programandoenjava.parte3.Biblioteca;
import com.programandoenjava.parte3.Libro;
import com.programandoenjava.parte3.LibroDigital;


public class Main {

    public static void main(String[] args) {
        //Ejemplo de uso de la clase Parte1
        Parte1 parte1 = new Parte1();
        String cadena = "Desarrollo de aplicaciones Java";
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + parte1.invertirPalabras(cadena));

        //Ejemplo de uso de la clase Parte2
        Parte2 parte2 = new Parte2();
        parte2.agregarNumero(1.0);
        parte2.agregarNumero(2.0);
        parte2.agregarNumero(3.0);
        System.out.println("Suma de los números 1,2 y 3: " + parte2.sumarNumeros());

        //Ejemplo de uso de la clase Parte3
        Biblioteca biblioteca = new Biblioteca();
        try {
            Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1605);
            biblioteca.agregarLibro(libro1);
            Libro libro2 = new Libro("El Señor de los Anillos", "J. R. R. Tolkien", 1954);
            biblioteca.agregarLibro(libro2);
            LibroDigital libro3 = new LibroDigital("El Principito", "Antoine de Saint-Exupéry", 1943, "https://www.amazon.com/El-Principito-Spanish-Antoine-Saint-Exup%C3%A9ry-ebook/dp/B00K5JU8RY");
            biblioteca.agregarLibro(libro3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Libros en la biblioteca: " + biblioteca);
        System.out.println("Libro con id 1: " + biblioteca.buscarLibro(1));
        System.out.println("Libro con id 2: " + biblioteca.buscarLibro(2));
        System.out.println("Libro con id 3: " + biblioteca.buscarLibro(3));


    }
}