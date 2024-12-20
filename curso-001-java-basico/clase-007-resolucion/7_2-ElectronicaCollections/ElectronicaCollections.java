package electronicacollections;

import java.util.ArrayList;

public class ElectronicaCollections {

 
    public static void main(String[] args) {
     
        // Crear un ArrayList para almacenar productos
        ArrayList<Producto> inventario = new ArrayList<>();

        // Crear 10 objetos de tipo Producto con sus correspondientes valores
        inventario.add(new Producto(1, "Teléfono", "Samsung", "Smartphone", 300, 450, 20));
        inventario.add(new Producto(2, "Laptop", "HP", "Portátil", 600, 900, 10));
        inventario.add(new Producto(3, "Auriculares/Cascos", "Sony", "Accesorio", 40, 70, 50));
        inventario.add(new Producto(4, "Cargador", "Apple", "Accesorio", 15, 25, 30));
        inventario.add(new Producto(5, "Tablet", "Lenovo", "Tablet", 200, 300, 15));
        inventario.add(new Producto(6, "Smartwatch", "Fitbit", "Wearable", 80, 130, 12));
        inventario.add(new Producto(7, "Altavoz Bluetooth", "JBL", "Accesorio", 50, 80, 25));
        inventario.add(new Producto(8, "Monitor", "Dell", "Accesorio", 100, 150, 8));
        inventario.add(new Producto(9, "Impresora", "Epson", "Accesorio", 70, 100, 18));
        inventario.add(new Producto(10, "Router Wi-Fi", "Linksys", "Accesorio", 25, 40, 22));

        // Recorrer el ArrayList y determinar el producto con el mayor precio de venta
        double maxPrecioVenta = Double.MIN_VALUE;
        Producto productoMaxPrecioVenta = null;

        for (Producto producto : inventario) {
            if (producto.getPrecioVenta() > maxPrecioVenta) {
                maxPrecioVenta = producto.getPrecioVenta();
                productoMaxPrecioVenta = producto;
            }
        }
        System.out.println("El producto con el mayor precio de venta es: " + productoMaxPrecioVenta.getNombre());

       
        // Recorrer el ArrayList y determinar el producto con el menor precio de costo
        double minPrecioCosto = Double.MAX_VALUE;
        Producto productoMinPrecioCosto = null;

        for (Producto producto : inventario) {
            if (producto.getPrecioCosto() < minPrecioCosto) {
                minPrecioCosto = producto.getPrecioCosto();
                productoMinPrecioCosto = producto;
            }
        }
        System.out.println("\nEl producto con el menor precio de costo es: " + productoMinPrecioCosto.getNombre());

        // Borrar el producto que se encuentre en la posición 5 del ArrayList
        if (inventario.size() > 5) {
            Producto productoEliminado = inventario.remove(5);
            System.out.println("Se ha eliminado el producto en la posición 5: " + productoEliminado.getNombre() + " " + productoEliminado.getMarca());
        } else {
            System.out.println("No hay suficientes productos en la lista para eliminar en la posición 5.");
        }

        // Determinar el producto con la mayor cantidad en stock
        int maxStock = Integer.MIN_VALUE;
        Producto productoMaxStock = null;

        for (Producto producto : inventario) {
            if (producto.getCantidadStock() > maxStock) {
                maxStock = producto.getCantidadStock();
                productoMaxStock = producto;
            }
        }

        // Descontar 3 unidades del stock del producto con la mayor cantidad
        if (productoMaxStock != null) {
            productoMaxStock.setCantidadStock(productoMaxStock.getCantidadStock() - 3);
            System.out.println("\nEl producto con la mayor cantidad en stock es: " + productoMaxStock.getNombre());
            System.out.println("Se han descontado 3 unidades del stock.");
        } else {
            System.out.println("No hay productos en el inventario.");
        } 
        
    }
    
}
