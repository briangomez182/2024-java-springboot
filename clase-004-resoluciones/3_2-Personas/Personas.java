package personas;

public class Personas {

   
    public static void main(String[] args) {
     
        // Crear un vector de tipo Persona con cinco posiciones
        Persona[] personas = new Persona[5];

        // Crear cinco personas y guardarlas en el vector
        personas[0] = new Persona(1, "Juan", 25, "Calle A, Ciudad", "123-456-7890");
        personas[1] = new Persona(2, "Maria", 35, "Calle B, Ciudad", "987-654-3210");
        personas[2] = new Persona(3, "Pedro", 40, "Calle C, Ciudad", "111-222-3333");
        personas[3] = new Persona(4, "Ana", 28, "Calle D, Ciudad", "555-444-7777");
        personas[4] = new Persona(5, "Carlos", 50, "Calle E, Ciudad", "999-888-0000");

        // Recorrer el vector y mostrar por pantalla el nombre y edad de cada persona almacenada
        System.out.println("Datos de las personas almacenadas:");
        
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
        }

        //Mostrar el antes de los datos de las dos personas cuyos nombres serán cambiados
        System.out.println("\nAntes del cambio de nombres:");
        System.out.println("Antes - Nombre: " + personas[1].getNombre() + ", Edad: " + personas[1].getEdad());
        System.out.println("Antes - Nombre: " + personas[3].getNombre() + ", Edad: " + personas[3].getEdad());
         
        // Cambiar el nombre de dos personas
        personas[1].setNombre("Martha");
        personas[3].setNombre("Luis");

        // Mostrar por pantalla el después de los datos de las dos personas cuyos nombres fueron cambiados
        System.out.println("\nCambios de nombres:");
        System.out.println("Después - Nombre: " + personas[1].getNombre() + ", Edad: " + personas[1].getEdad());
        System.out.println("Después - Nombre: " + personas[3].getNombre() + ", Edad: " + personas[3].getEdad());

        // Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años
        System.out.println("\nPersonas cuya edad es mayor de 30 años:");
        
        for (Persona persona : personas) {
            if (persona.getEdad() > 30) {
                System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
            }
        }
        
    }
    
}
