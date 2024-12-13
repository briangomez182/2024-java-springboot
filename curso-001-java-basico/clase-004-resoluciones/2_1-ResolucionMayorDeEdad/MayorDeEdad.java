package mayordeedad;

import java.util.Scanner;

/**
 *
 * @author Luisina
 */
public class MayorDeEdad {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

            System.out.print("Ingresa tu edad: ");
            int edad = teclado.nextInt();

            if (edad >= 18) {
                System.out.println("Puede ingresar");
            } else {
                System.out.println("No puede ingresar");
            }

        
    }
    
}
