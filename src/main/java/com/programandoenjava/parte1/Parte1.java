package com.programandoenjava.parte1;

public class Parte1 {
    /**
     * Método que invierte las palabras de una cadena
     * Ejemplo: "Hola Mundo" -> "aloH odnuM"
     *
     * @param cadena cadena de entrada
     * @return cadena invertida
     */
    public String invertirPalabras(final String cadena) {
        if (cadena == null) {
            return "";
        }
        //StringBuilder es más eficiente que String para concatenar cadenas
        StringBuilder frase = new StringBuilder();
        //Recorremos la frase
        for (int i = 0; i < cadena.length(); i++) {
            //Si el caracter no es una letra
            if (!Character.isLetter(cadena.charAt(i))) {
                //Lo añadimos a la frase
                frase.append(cadena.charAt(i));
            } else {
                //Si el caracter es una letra
                StringBuilder palabra = new StringBuilder();
                //Recorremos la palabra
                for (int j = i; j < cadena.length() && Character.isLetter(cadena.charAt(j)) ; j++) {
                    palabra.append(cadena.charAt(j));
                }
                //Añadimos la palabra invertida a la frase
                frase.append(palabra.reverse());
                //Actualizamos el índice
                i += palabra.length() - 1;
            }
        }
        //toString() convierte el StringBuilder en String
        return frase.toString();
    }
}