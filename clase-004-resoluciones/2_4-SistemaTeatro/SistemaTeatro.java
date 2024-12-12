package sistemateatro;

import java.util.Scanner;

/**
 *
 * @author Luisina
 */
public class SistemaTeatro {

    public static void main(String[] args) {
        
        String asientos [][] = new String [5][5];
        boolean bandera = false;
        Scanner teclado = new Scanner (System.in);
        int fila, asiento;
        String respuesta;
        
        System.out.println("-----------Bienvenido al sistema de teatros-----------");
        
        //rellenamos la matriz con O porque está vacía
        for (int f=0;f<5;f++) {
            for (int c=0;c<5;c++) {
                asientos[f][c]="O";
            }
        }
        
        while (bandera!=true) {
            
            System.out.println("Ingrese el número de fila y asiento a reservar");
            System.out.print("Fila (entre 0 y 4): ");
            fila = teclado.nextInt();
            System.out.println(fila);
            
            System.out.print("Asiento (entre 0 y 4): ");
            asiento = teclado.nextInt();
            System.out.println(asiento);
        
            if (asientos[fila][asiento].equals("O")) {
                asientos[fila][asiento] = "X";
                System.out.println("Asiento reservado correctamente");
                
                System.out.println("¿Desea finalizar las reservas? S: Si. Cualquier otra letra:  No ");
                respuesta = teclado.next();
                    
                //equalsIgnoreCase ignora si la letra ingresada es mayúscula o minúscula, le importa el caracter
                    if (respuesta.equalsIgnoreCase("S"))  {
                        bandera = true;
                    }
            }
           else {
               System.out.println("Asiento ocupado, seleccione otro");
           }
                
                
            }
            
            
            
        }
        
        

    }

   
