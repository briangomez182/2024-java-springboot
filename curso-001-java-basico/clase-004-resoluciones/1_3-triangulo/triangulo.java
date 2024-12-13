import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Declarar variables para la base y la altura del triángulo
        double base;
        double altura;

        // Solicitar la base del triángulo
        System.out.print("Ingrese la base del triángulo: ");
        base = scanner.nextDouble();

        // Solicitar la altura del triángulo
        System.out.print("Ingrese la altura del triángulo: ");
        altura = scanner.nextDouble();

        // Calcular el área del triángulo
        double area = (base * altura) / 2;

        // Mostrar el resultado
        System.out.println("El área del triángulo es: " + area);

        // Cerrar el Scanner
        scanner.close();
    }
}
