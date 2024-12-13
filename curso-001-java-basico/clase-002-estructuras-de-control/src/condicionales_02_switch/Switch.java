package condicionales_02_switch;

public class Switch {
    public static void main(String[] args) {
        int destino = 5;  // Cambia el valor para probar diferentes destinos

        double costoEnvio;

        switch (destino) {
            case 1:
                costoEnvio = 5.0; // Costo para el destino 1
                break;
            case 2:
                costoEnvio = 7.5; // Costo para el destino 2
                break;
            case 3:
                costoEnvio = 6.0; // Costo para el destino 3
                break;
            case 4:
                costoEnvio = 8.0; // Costo para el destino 4
                break;
            default:
                costoEnvio = 0.0; // Destino desconocido, costo cero
        }

        System.out.println("El costo de envío a destino " + destino + " es: $" + costoEnvio);

    }
}
