package webmeteorologia;

import java.util.Scanner;

/**
 *
 * @author Luisina
 */
public class WebMeteorologia {

   
    public static void main(String[] args) {
       
        Double temperaturas[] = new Double [7];
        Scanner teclado = new Scanner (System.in);
        Double sumaTemp=0.0;
        Double promedioTemp;
        
        for (int i=0;i<temperaturas.length;i++) {
            System.out.println("Ingrese la temperatura del día Nº " + i);
            temperaturas [i] = teclado.nextDouble();
        }
        
        System.out.println("-----Calculando promedio de temperaturas-----");
        
        for (int i=0;i<temperaturas.length;i++) { 
            sumaTemp = sumaTemp + temperaturas [i];
        }
        
        promedioTemp = sumaTemp / temperaturas.length;
        
        System.out.println("El promedio de temperaturas es: " + promedioTemp);
    }
    
}
