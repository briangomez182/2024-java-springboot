package com.hackaboss.numerosRomanos.services;

public class RomanConverterService {
    //Servicios o utilidades es para poner logica
    public static String convertirNumeroRomano(int numero) {
        /*números enteros hasta 3999*/
        int[] valoresDecimales = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] valoresRomanos = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder resultado = new StringBuilder();
        int indice = 0;
        while (numero > 0) {
            if (numero >= valoresDecimales[indice]) {
                resultado.append(valoresRomanos[indice]);
                numero -= valoresDecimales[indice];
            } else {
                indice++;
            }
        }
        return resultado.toString();
    }
}
