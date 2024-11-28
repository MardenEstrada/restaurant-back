/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.web.restaurantgd.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "resenia")
public class Resenia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDResenia")
    private Integer idResenia;

    @Column(name = "IDUsuario")
    private Integer idUsuario;

    @Column(name = "IDRestaurante")
    private Integer idRestaurante;

    @Column(name = "Calificacion")
    private Integer calificacion;

    @Column(name = "Comentario")
    private String comentario;

    @Column(name = "FechaResenia")
    private LocalDateTime fechaResenia;

    // Constructor sin argumentos
    public Resenia() {
    }

    // Constructor con todos los atributos
    public Resenia(Integer idResenia, Integer idUsuario, Integer idRestaurante, Integer calificacion, String comentario, LocalDateTime fechaResenia) {
        this.idResenia = idResenia;
        this.idUsuario = idUsuario;
        this.idRestaurante = idRestaurante;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fechaResenia = fechaResenia;
    }

    // Getters y Setters
    
    /**
     * @return the idResenia
     */
    public Integer getIdResenia() {
        return idResenia;
    }

    /**
     * @param idResenia the idResenia to set
     */
    public void setIdResenia(Integer idResenia) {
        this.idResenia = idResenia;
    }

    /**
     * @return the idUsuario
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the idRestaurante
     */
    public Integer getIdRestaurante() {
        return idRestaurante;
    }

    /**
     * @param idRestaurante the idRestaurante to set
     */
    public void setIdRestaurante(Integer idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    /**
     * @return the calificacion
     */
    public Integer getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * @return the fechaResenia
     */
    public LocalDateTime getFechaResenia() {
        return fechaResenia;
    }

    /**
     * @param fechaResenia the fechaResenia to set
     */
    public void setFechaResenia(LocalDateTime fechaResenia) {
        this.fechaResenia = fechaResenia;
    }
    
     @Override
    public String toString() {
        return "Resenia{"
                + "idResenia=" + getIdResenia()
                + ", idUsuario=" + getIdUsuario()
                + ", idRestaurante=" + getIdRestaurante()
                + ", calificacion=" + getCalificacion()
                + ", comentario='" + getComentario() + '\''
                + ", fechaResenia=" + getFechaResenia()
                + '}';
    }
    
}
