package com.web.restaurantgd.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoriaproducto")
public class CategoriaProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCategoria")
    private Integer idCategoria;

    @Column(name = "NomCategoria", length = 50)
    private String nomCategoria;

    @Column(name = "Descripcion", length = 150)
    private String descripcion;

    // Constructor sin argumentos
    public CategoriaProducto() {
    }

    // Constructor con todos los atributos
    public CategoriaProducto(Integer idCategoria, String nomCategoria, String descripcion) {
        this.idCategoria = idCategoria;
        this.nomCategoria = nomCategoria;
        this.descripcion = descripcion;
    }

    // Constructor sin id
    public CategoriaProducto(String nomCategoria, String descripcion) {
        this.nomCategoria = nomCategoria;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "CategoriaProducto{"
                + "idCategoria=" + getIdCategoria()
                + ", nomCategoria='" + getNomCategoria()
                + ", descripcion='" + getDescripcion()
                + '}';
    }
}
