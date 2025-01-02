package com.example.entities;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Tarjeta> tarjetas;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "persona_productos",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
    private Set<Producto> productos;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, Set<Tarjeta> tarjetas, Set<Producto> productos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjetas = tarjetas;
        this.productos = productos;
    }

    // Getters y setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Set<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(Set<Tarjeta> tarjetas) {
        this.tarjetas = tarjetas;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", tarjetas=" + tarjetas +
                ", productos=" + productos +
                '}';
    }
}
