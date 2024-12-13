package condicionales_01_if;

public class Condicional_if {

    public static void main(String[] args) {

        // TODO: 21/11/2024   IF SIMPLE
        double estaturaJuego = 1.67;

        if (estaturaJuego >= 1.50) {
            System.out.println("Puede subir al juego");
        }else {
            System.out.println("No puede subir al juego. No supera la estatura de seguridad mínima solicitada");
        }


        double estatura = 1.67;
        double edad = 14;

        if (estatura >= 1.50) {
            if (estatura <= 1.95) {
                System.out.println("Puede subir al juego");
            }
            else {
                System.out.println("Si bien cumple con la estatura mínima para el juego, supera la estatura máxima");
            }
        }
        else {
            if (edad <= 12){
                System.out.println("No puede subir al juego. No supera la estatura de seguridad mínima solicitada");
                System.out.println(" Sin embargo puedes acceder a los siguientes juegos infantiles: Calesita, Paseo de Cisnes y Tren de la alegría");
            }
            else {
                System.out.println("No puede subir al juego. No supera la estatura de seguridad mínima solicitada");
                System.out.println(" Sin embargo puedes acceder a los siguientes juegos: Noria, Casa embrujada y Montaña de Agua");
            }
        }


    }
}
