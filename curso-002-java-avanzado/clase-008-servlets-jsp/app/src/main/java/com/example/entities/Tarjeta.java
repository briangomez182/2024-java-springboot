package com.example.entities;

import jakarta.persistence.*;

@Entity
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // TODO: 02/01/2025 @Enumerated: Esta anotación le indica a JPA que el campo que se está anotando es un tipo enumerado. EnumType.STRING: Este argumento dentro de la anotación @Enumerated especifica que el valor del enum se debe almacenar en la base de datos como una cadena de texto (STRING).
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoTarjeta tipo;

    /*No crear en la 1ra DEMO*/
    @ManyToOne
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona persona;

    // Getters y setters

    public enum TipoTarjeta {
        DEBITO,
        CREDITO
    }

    public Tarjeta() {
    }

    public Tarjeta(Long id, TipoTarjeta tipo, Persona persona) {
        this.id = id;
        this.tipo = tipo;
        this.persona = persona;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoTarjeta getTipo() {
        return tipo;
    }

    public void setTipo(TipoTarjeta tipo) {
        this.tipo = tipo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
