package vestimentas;

public class Sombrero extends Vestimenta{
    
    private String tipo;
    private String tamaño;

    public Sombrero() {
    }

    public Sombrero(String tipo, String tamaño, String codigo, String nombre, double precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
            // Método para mostrar mensaje personalizado
    @Override
    public void mostrarMensaje() {
        System.out.println("Este sombrero/gorro es de marca: " + this.getMarca());
    }
    
    
}
