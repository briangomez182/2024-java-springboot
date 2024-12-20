package poo_002_codeaConmigo;

public class Producto {
    private String nombre;
    private double precio;
    private String descripcion;
    private int stock;
    private String categoria;

    // Constructor por defecto
    public Producto() {
        this("Producto sin nombre", 0.0, "", 0, "Sin categoría");
    }

    // Constructor parametrizado
    public Producto(String nombre, double precio, String descripcion, int stock, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.stock = stock;
        this.categoria = categoria;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // ... (similares para los demás atributos)

    // Método toString
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", stock=" + stock +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    // Método describirProducto
    public void describirProducto() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Stock: " + stock);
        System.out.println("Categoría: " + categoria);
    }

     // Método para calcular el IVA (21% de ejemplo, puedes ajustarlo según tu país)
     public double calcularIVA() {
        return this.precio * 0.21;
    }

    // Método para calcular el precio con descuento si el cliente está registrado
    public double calcularPrecioFinal(boolean clienteRegistrado) {
        if (clienteRegistrado) {
            return this.precio * 0.5; // 50% de descuento
        }
        return this.precio;
    }
}