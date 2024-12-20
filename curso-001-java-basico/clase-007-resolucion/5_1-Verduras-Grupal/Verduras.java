package verduras;

public class Verduras {
    
    public static void main(String[] args) {
       
        // Crear un vector de tipo Verdura y almacenar 5 verduras
        Verdura[] verduras = new Verdura[5];
        verduras[0] = new Verdura(1, "Zanahoria", "Naranja", 35.5, false);
        verduras[1] = new Verdura(2, "Brócoli", "Verde", 31.2, true);
        verduras[2] = new Verdura(3, "Tomate", "Rojo", 18.9, false);
        verduras[3] = new Verdura(4, "Espinaca", "Verde", 23.7, true);
        verduras[4] = new Verdura(5, "Calabacín", "Verde", 17.3, false);

        // Recorrer el vector y mostrar por pantalla el nombre y las calorías de las verduras almacenadas
        System.out.println("---- Información de todas las verduras: -----");
        for (Verdura verdura : verduras) {
            System.out.println("Nombre: " + verdura.getNombre() + " - Calorías: " + verdura.getCalorias());
        }

        // Cambiar todos los datos de dos verduras
        verduras[0].setNombre("Pepino");
        verduras[0].setColor("Verde");
        verduras[0].setCalorias(15.2);
        verduras[0].setDebeCocinarse(false);

        verduras[1].setNombre("Pimiento");
        verduras[1].setColor("Rojo");
        verduras[1].setCalorias(19.8);
        verduras[1].setDebeCocinarse(false);

        // Mostrar por pantalla los datos de todas las verduras luego del cambio
        System.out.println("\n------Información de todas las verduras después del cambio:------");
        for (Verdura verdura : verduras) {
            System.out.println(verdura.toString());
        }

        // Recorrer el vector y mostrar por pantalla únicamente a las verduras de color verde
        System.out.println("\n------Verduras de color verde:------");
        for (Verdura verdura : verduras) {
            if (verdura.getColor().equalsIgnoreCase("Verde")) {
                System.out.println(verdura.toString());
            }
        }
        
        
    }
    
}
