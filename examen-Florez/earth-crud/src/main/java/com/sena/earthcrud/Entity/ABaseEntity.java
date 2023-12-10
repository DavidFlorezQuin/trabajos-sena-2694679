package com.sena.earthcrud.Entity;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ABaseEntity {

    @Column(name = "estado", nullable = false)
    private Boolean estado;


    @Column(name = "fecha_creacion", nullable = true)
    private LocalDateTime fechaCreacion;
    @Column(name = "fecha_modificacion", nullable = true)
    private LocalDateTime fechaModificacion;

    @Column(name = "fecha_eliminacion", nullable = true)
    private LocalDateTime fechaEliminacion;


    @Column(name = "user_creacion", nullable = true)
    private LocalDateTime userCreacion;

    @Column(name = "user_modificacion", nullable = true)
    private LocalDateTime userModificacion;

    @Column(name = "user_eliminacion", nullable = true)
    private LocalDateTime userEliminacion;


    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public LocalDateTime getFechaEliminacion() {
        return fechaEliminacion;
    }

    public void setFechaEliminacion(LocalDateTime fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }

    public LocalDateTime getUserCreacion() {
        return userCreacion;
    }

    public void setUserCreacion(LocalDateTime userCreacion) {
        this.userCreacion = userCreacion;
    }

    public LocalDateTime getUserModificacion() {
        return userModificacion;
    }

    public void setUserModificacion(LocalDateTime userModificacion) {
        this.userModificacion = userModificacion;
    }

    public LocalDateTime getUserEliminacion() {
        return userEliminacion;
    }

    public void setUserEliminacion(LocalDateTime userEliminacion) {
        this.userEliminacion = userEliminacion;
    }
}
