package coleccion_001_list;


import java.util.LinkedList;

public class ListaEnlazada {

        public static void main(String[] args) {
            // Crear una LinkedList de tipo String
            // Puede ser de una clase en particular también
            LinkedList<String> miListaEnlazada = new LinkedList<>();

            // Agregar elementos al final de la lista
            miListaEnlazada.add("Manzana");
            miListaEnlazada.add("Banana");
            miListaEnlazada.add("Cereza");

            // Agregar un elemento en una posición específica, pero remplaza la anterior
            miListaEnlazada.add(1, "Uva");

            miListaEnlazada.add("Juan");

            // Acceder a elementos por índice
            String fruta = miListaEnlazada.get(0); // Obtendrá "Manzana"

            // Eliminar un elemento por índice
            miListaEnlazada.remove(2); // Eliminará "Banana"

            // Tamaño de la LinkedList
            int tamaño = miListaEnlazada.size(); // Devolverá 3

            // Iterar sobre la LinkedList con un for
            for (int i= 0; i< miListaEnlazada.size(); i++){
                System.out.println(miListaEnlazada.get(i));

            }

            // Iterar sobre la LinkedList con un foreach
            for (String elemento : miListaEnlazada) {
                System.out.println(elemento);
            }




        }
}
