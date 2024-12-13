package ciclos_03_for_while;

public class While {
    public static void main(String[] args) {

        String[] peliculas = {"El Padrino", "Matrix", "Interstellar", "Pulp Fiction"};
        int contador = 0;

        while (contador < peliculas.length ) {
            System.out.println(peliculas[contador]);
            contador++;
        }

    }
}
