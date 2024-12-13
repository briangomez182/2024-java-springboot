public class Main {

    public static void main(String[] args) {

        // TODO: 21/11/2024
        //   PUBLIC Qué significa?
        //        Es accesible desde cualquier lugar, lo que permite a la JVM encontrarlo.
        //   STATIC Qué significa?
        //        Que Pertenece a la clase y no a una instancia, por lo que la JVM puede ejecutarlo directamente.
        //   VOID Qué significa?
        //        Que No retorna ningún valor.
        //   MAIN Qué significa?
        //        Es el nombre obligatorio del metodo principal para ejecutar un programa en JAVA. ENTRY POINT
        //   String[] args Qué significa?
        //        Permite pasar argumentos o parametros desde la línea de comando.

        System.out.println("Mi primer mensaje");
        for (String arg : args) {
            System.out.println(arg);
        }

    }
}
