package com.example.APIRESTSURA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilis {
    public static Boolean validarString (String regex,String nombre){
        // validaré que el nombre solo tenga letras

        // paso 1: debo crear una expresión regular que valida que solo reciba letras
        // la expresion viene en regex

        // paso 2: crear un patron de java para la REGEX
        Pattern patron = Pattern.compile(regex);

        // paso 3: aplicar el patron al texto que introduce el usuario
        Matcher coincidencia = patron.matcher(nombre);

        // paso 4: Se verifica la coincidencia
        return coincidencia.find();
    }
}
