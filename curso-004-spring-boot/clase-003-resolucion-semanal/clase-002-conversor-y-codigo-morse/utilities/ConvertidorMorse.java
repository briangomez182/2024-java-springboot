package com.hackaboss.app.utilities;

import java.util.HashMap;
import java.util.Map;

public class ConvertidorMorse {

    private static final Map<Character, String> mapaDeCaracteres = Map.ofEntries(
            Map.entry('A', ".-"),
            Map.entry('B', "-..."),
            Map.entry('C', "-.-."),
            Map.entry('D', "-.."),
            Map.entry('E', "."),
            Map.entry('F', "..-."),
            Map.entry('G', "--."),
            Map.entry('H', "...."),
            Map.entry('I', ".."),
            Map.entry('J', ".---"),
            Map.entry('K', "-.-"),
            Map.entry('L', ".-.."),
            Map.entry('M', "--"),
            Map.entry('N', "-."),
            Map.entry('O', "---"),
            Map.entry('P', ".--."),
            Map.entry('Q', "--.-"),
            Map.entry('R', ".-."),
            Map.entry('S', "..."),
            Map.entry('T', "-"),
            Map.entry('U', "..-"),
            Map.entry('V', "...-"),
            Map.entry('W', ".--"),
            Map.entry('X', "-..-"),
            Map.entry('Y', "-.--"),
            Map.entry('Z', "--.."),
            Map.entry('0', "-----"),
            Map.entry('1', ".----"),
            Map.entry('2', "..---"),
            Map.entry('3', "...--"),
            Map.entry('4', "....-"),
            Map.entry('5', "....."),
            Map.entry('6', "-...."),
            Map.entry('7', "--..."),
            Map.entry('8', "---.."),
            Map.entry('9', "----.")
            );


    public static String textToMorse(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        StringBuilder morseBuilder = new StringBuilder();

        // Dividimos el texto en palabras
        String[] palabras = text.toUpperCase().split(" ");

        for (int i = 0; i < palabras.length; i++) {
            String word = palabras[i];

            // Convertir cada carácter de la palabra a Morse
            for (char character : word.toCharArray()) {
                String morseCode = mapaDeCaracteres.get(character);
                if (morseCode != null) {
                    morseBuilder.append(morseCode).append(" ");
                }
            }

            // Agregar tres espacios entre palabras (excepto después de la última palabra)
            if (i < palabras.length - 1) {
                morseBuilder.append("   ");
            }
        }

        return morseBuilder.toString().trim(); // Eliminar espacios extra al final
    }
}
