package coleccion_005_codea_conmigo;

public class Jugador {
    private String nombre;
    private String posicion;
    private int numeroCamiseta;

    public Jugador() {
    }

    public Jugador(String nombre, String posicion, int numeroCamiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    @Override
    public String toString() {
        return "Jugador { " +
                "nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", numeroCamiseta=" + numeroCamiseta +
                '}';
    }
}