package operadores;

public class Asignacion {

    public static void main(String[] args) {

        int a = 10; // Variable inicial
        int b = 5;  // Otra variable para operar

        // Operador += (suma y asigna)
        a += b;
        System.out.println("Resultado de a += b: " + a); // 15

        // Operador -= (resta y asigna)
        a -= b;
        System.out.println("Resultado de a -= b: " + a); // 10

        // Operador *= (multiplica y asigna)
        a *= b;
        System.out.println("Resultado de a *= b: " + a); // 50

        // Operador /= (divide y asigna)
        a /= b;
        System.out.println("Resultado de a /= b: " + a); // 10

        // Operador %= (módulo y asigna)
        a %= b;
        System.out.println("Resultado de a %= b: " + a); // 0
    }
}
