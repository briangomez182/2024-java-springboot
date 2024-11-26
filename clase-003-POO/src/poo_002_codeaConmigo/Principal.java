package poo_002_codeaConmigo;

public class Principal {

    public static void main(String[] args) {
        // Crear un objeto Producto utilizando el constructor por defecto
        Producto producto1 = new Producto();

        // Crear un objeto Producto utilizando el constructor parametrizado
        Producto producto2 = new Producto("iPhone 14", 999.99, "Smartphone de alta gama", 100, "Electrónica");

        // Imprimir información del producto utilizando toString
        System.out.println(producto2);

        // Describir el producto
        producto2.describirProducto();
    }
}
