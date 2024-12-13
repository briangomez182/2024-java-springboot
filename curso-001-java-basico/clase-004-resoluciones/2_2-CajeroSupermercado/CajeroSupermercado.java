
package cajerosupermercado;

import java.util.Scanner;

/**
 *
 * @author Luisina
 */
public class CajeroSupermercado {


    public static void main(String[] args) {

        boolean bandera = false;
        double total = 0;
        double precioProducto;
        Scanner teclado = new Scanner(System.in);

        System.out.println("***Bienvenido*** \nRecuerde ingresar 0 o algún número negativo para finalizar la compra");
        
        while (bandera != true) {
            System.out.println("Ingrese el precio del producto a sumar");
            precioProducto = teclado.nextDouble();

                //Con esto validamos que no haya ingresado una condición de salida
                if (precioProducto > 0) {
                    total = total + precioProducto;
                } else {
                    //en caso que haya puesto un 0 o algún número negativo, activamos la bandera 
                    //para salir del bucle
                    bandera = true;
                }

        }

        System.out.println("El total de la compra es: " + total);

    }

}
