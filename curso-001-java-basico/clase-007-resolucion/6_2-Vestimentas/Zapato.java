package vestimentas;

/**
 *
 * @author Luisina
 */
public class Zapato extends Vestimenta{
    
    private String material;
    private String tipoCierre;

    public Zapato() {
    }

    public Zapato(String material, String tipoCierre, String codigo, String nombre, double precio, String marca, String talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoCierre() {
        return tipoCierre;
    }

    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }
    
        // Método para mostrar mensaje personalizado
    @Override
    public void mostrarMensaje() {
        System.out.println("Este zapato es de marca: " + this.getMarca());
    }
    
    
    
    
}
