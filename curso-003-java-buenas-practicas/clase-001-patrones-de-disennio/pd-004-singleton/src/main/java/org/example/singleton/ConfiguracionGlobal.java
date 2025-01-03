package org.example.singleton;

public class ConfiguracionGlobal {

     // Atributo estático privado que almacenará la única instancia de la clase
    private static ConfiguracionGlobal instancia;

    // Atributo adicional para almacenar la versión de la aplicación
    private String version;

    // Constructor privado para evitar que la clase sea instanciada directamente, nosotros siempre lo hacemos publico
    private ConfiguracionGlobal() {
        System.out.println("Constructor privado");
        System.out.println("Instancia creada");
        this.version = "1.0.5"; // Valor inicial de la versión
    }

    // Método público estático para obtener la única instancia de la clase
    public static ConfiguracionGlobal getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionGlobal(); // Crea la instancia si no existe
        }
        return instancia; // Devuelve la instancia existente
    }

    // Método de ejemplo para demostrar funcionalidad
    public void mostrarMensaje() {
        System.out.println("Hola desde la clase Singleton!");
    }

    // sin set( ) no es recomendable desde afuera cambiar ningun atributo
    public String getVersion() {
        return version;
    }

}
