package com.programandoenjava.parte2;

import java.util.ArrayList;
import java.util.List;

/**
 * Programa que utiliza un ArrayList para almacenar números de cualquier tipo que extienda de Number.
 * Permite agregar números a la lista y calcular la suma de todos los números.
 *
 * @param <T> Tipo de número que extiende de Number.
 */
public class Parte2<T extends Number> {
    /**
     * listaNumeros Lista de números.
     */
    private List<T> listaNumeros = new ArrayList<>();

    /**
     * Calcula la suma de todos los números.
     *
     * @return La suma de los números.
     */
    public double sumarNumeros() {
        // Programación funcional, reduce suma todos los elementos de la lista
        return listaNumeros.stream().mapToDouble(Number::doubleValue).sum();
    }

    /**
     * Agrega un número a la lista.
     *
     * @param numero El número que se va a agregar.
     */
    public void agregarNumero(T numero) {
        // Agrega un número a la lista
        listaNumeros.add(numero);
    }
}
