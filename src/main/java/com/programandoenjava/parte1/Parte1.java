package com.programandoenjava.parte1;

public class Parte1 {
    /**
     * Programa que invierte una cadena de texto.
     *
     * @param cadena cadena de entrada
     * @return cadena invertida
     */
    public String invertirPalabras(final String cadena) {
        if (cadena == null) {
            return "";
        }
        //StringBuilder es más eficiente que String para concatenar cadenas
        StringBuilder fraseInvertida = new StringBuilder();
        //Recorremos la frase
        for (int i = 0; i < cadena.length(); i++) {
            StringBuilder palabraInvertida = new StringBuilder();
            //Si el caracter no es una letra
            if (!Character.isLetter(cadena.charAt(i))) {
                //Lo añadimos a la frase invertida
                fraseInvertida.append(cadena.charAt(i));
            } else {
                //Si el caracter es una letra, recorremos la palabra hasta el final
                for (int j = i; j < cadena.length() && cadena.charAt(j) != ' '; j++) {
                    //Si el caracter es una letra, lo añadimos al principio de la palabra invertida
                    if (Character.isLetter(cadena.charAt(j))) {
                        palabraInvertida.insert(0, cadena.charAt(j));
                    } else {
                        //Si el caracter es un espacio en blanco, lo añadimos a la palabra invertida
                        palabraInvertida.append(cadena.charAt(j));
                    }
                }
                //Añadimos la palabra invertida a la frase invertida
                fraseInvertida.append(palabraInvertida);
                //Movemos el índice hasta el final de la palabra
                i += palabraInvertida.length() - 1;
            }
        }
        //toString() convierte el StringBuilder en String
        return fraseInvertida.toString();
    }
}