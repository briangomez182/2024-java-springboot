package coleccion_001_list;

import java.util.ArrayList;

public class ListaDeArreglos {

    public static void main(String[] args) {

        ArrayList<String> miLista = new ArrayList<String>();

        miLista.add("Manzana");
        miLista.add("Banana");
        miLista.add("Cereza");

        String fruta = miLista.get(0);  // Obtendrá "Manzana"

        miLista.remove(1);  // Eliminará el elemento en el índice 1 (en este caso, "Banana")

        int tamaño = miLista.size();  // Devolverá 2 después de eliminar "Banana"

        for (int i = 0; i < miLista.size(); i++) {
            System.out.println(miLista.get(i));
        }




    }
}
