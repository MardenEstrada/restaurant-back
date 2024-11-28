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

@Entity
@Table(name = "sede")
public class Sedes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDRestaurante")
    private Integer idRestaurante;

    @Column(name = "NombreRestaurante")
    private String nombreRestaurante;

    @Column(name = "Direccion")
    private String direccion;

    @Column(name = "Telefono")
    private String telefono;

    @Column(name = "HorarioAtencion")
    private String horarioAtencion;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "FotoRestaurante")
    private String fotoRestaurante;

    // Constructor sin argumentos
    public Sedes() {
    }

    // Constructor con todos los argumentos
    public Sedes(Integer idRestaurante, String nombreRestaurante, String direccion, String telefono,
                String horarioAtencion, String descripcion, String fotoRestaurante) {
        this.idRestaurante = idRestaurante;
        this.nombreRestaurante = nombreRestaurante;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horarioAtencion = horarioAtencion;
        this.descripcion = descripcion;
        this.fotoRestaurante = fotoRestaurante;
    }

    // Constructor sin ID
    public Sedes(String nombreRestaurante, String direccion, String telefono,
                String horarioAtencion, String descripcion, String fotoRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horarioAtencion = horarioAtencion;
        this.descripcion = descripcion;
        this.fotoRestaurante = fotoRestaurante;
    }

    // Getters y Setters

    public Integer getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(Integer idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFotoRestaurante() {
        return fotoRestaurante;
    }

    public void setFotoRestaurante(String fotoRestaurante) {
        this.fotoRestaurante = fotoRestaurante;
    }

    @Override
    public String toString() {
        return "Sede{" +
                "idRestaurante=" + getIdRestaurante() +
                ", nombreRestaurante='" + getNombreRestaurante() +
                ", direccion='" + getDireccion() +
                ", telefono='" + getTelefono() +
                ", horarioAtencion='" + getHorarioAtencion() +
                ", descripcion='" + getDescripcion() +
                ", fotoRestaurante='" + getFotoRestaurante() +
                '}';
    }
}
