package com.sena.earthcrud.Entity;

import jakarta.persistence.*;

@Entity
@Table( name = "pais")
public class Pais extends ABaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "codigo", length = 50, nullable = false)
    private String codigo;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "continente_id", nullable = false)
    private Continente continenteId;

    public Long getId() {
        return id;
    }

    public Continente getContinenteId() {
        return continenteId;
    }

    public void setContinenteId(Continente continenteId) {
            this.continenteId = continenteId;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
