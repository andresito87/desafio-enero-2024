package com.programandoenjava.parte2;

import java.util.ArrayList;

/**
 * Programa que utiliza un ArrayList para almacenar números doubles(cualquier número)
 * Permite agregar números enteros a la lista y calcular la suma de todos los números.
 */
public class Parte2 {
    /**
     * listaNumeros Lista de números reales.
     */
    ArrayList<Double> listaNumeros = new ArrayList<>();

    /**
     * Calcula la suma de todos los números enteros.
     *
     * @return La suma de los números enteros.
     */
    public double sumarNumeros() {
        //Programacion funcional, reduce suma todos los elementos de la lista
        return listaNumeros.stream().reduce(0.0, Double::sum);
    }

    /**
     * Agrega un número a la lista.
     *
     * @param numero El número que se va a agregar.
     */
    public void agregarNumero(double numero) {
        //Agrega un numero a la lista
        listaNumeros.add(numero);
    }
}
