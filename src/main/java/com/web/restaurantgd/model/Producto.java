package com.web.restaurantgd.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDProducto")
    private Long idProducto;

    @Column(name = "NombreP", length = 100)
    private String nombreP;

    @Column(name = "DescripcionP", length = 255)
    private String descripcionP;

    @Column(name = "Precio")
    private Double precio;

    @Column(name = "FotoP")
    private String fotoP;

    @Column(name = "IDCategoria")
    private Integer idCategoria;

    @Column(name = "IDRestaurante")
    private Integer idRestaurante;

    @Column(name = "Disponibilidad")
    private Boolean disponibilidad;

    // Constructor sin argumentos
    public Producto() {
    }

    // Constructor con todos los atributos
    public Producto(Long idProducto, String nombreP, String descripcionP, Double precio, Integer idCategoria, Integer idRestaurante, Boolean disponibilidad) {
        this.idProducto = idProducto;
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.precio = precio;
        this.idCategoria = idCategoria;
        this.idRestaurante = idRestaurante;
        this.disponibilidad = disponibilidad;
    }

    // Constructor sin id
    public Producto(String nombreP, String descripcionP, Double precio, Integer idCategoria, Integer idRestaurante, Boolean disponibilidad) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.precio = precio;
        this.idCategoria = idCategoria;
        this.idRestaurante = idRestaurante;
        this.disponibilidad = disponibilidad;
    }

    // Getters y Setters

    /**
     * @return the idProducto
     */
    public Long getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the nombreP
     */
    public String getNombreP() {
        return nombreP;
    }

    /**
     * @param nombreP the nombreP to set
     */
    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    /**
     * @return the descripcionP
     */
    public String getDescripcionP() {
        return descripcionP;
    }

    /**
     * @param descripcionP the descripcionP to set
     */
    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    /**
     * @return the precio
     */
    public Double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    /**
     * @return the fotoP
     */
    public String getFotoP() {
        return fotoP;
    }

    /**
     * @param fotoP the fotoP to set
     */
    public void setFotoP(String fotoP) {
        this.fotoP = fotoP;
    }

    /**
     * @return the idCategoria
     */
    public Integer getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
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
     * @return the disponibilidad
     */
    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    /**
     * @param disponibilidad the disponibilidad to set
     */
    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
     @Override
    public String toString() {
        return "Producto{"
                + "idProducto=" + getIdProducto()
                + ", nombreP='" + getNombreP()
                + ", descripcionP='" + getDescripcionP()
                + ", precio=" + getPrecio()
                + ", idCategoria=" + getIdCategoria()
                + ", idRestaurante=" + getIdRestaurante()
                + ", disponibilidad=" + getDisponibilidad()
                + '}';
    }
}
