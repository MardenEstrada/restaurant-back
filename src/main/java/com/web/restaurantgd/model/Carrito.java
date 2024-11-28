package com.web.restaurantgd.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "carrito")
public class Carrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCarrito")
    private Integer idCarrito;

    @Column(name = "IDUsuario")
    private Integer idUsuario;

    @Column(name = "IDProducto")
    private Integer idProducto;

    @Column(name = "Cantidad")
    private Integer cantidad;

    @Column(name = "Subtotal")
    private Double subtotal;

    // Constructor sin argumentos
    public Carrito() {
    }

    // Constructor con todos los atributos
    public Carrito(Integer idCarrito, Integer idUsuario, Integer idProducto, Integer cantidad, Double subtotal) {
        this.idCarrito = idCarrito;
        this.idUsuario = idUsuario;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    // Constructor sin id
    public Carrito( Integer idUsuario, Integer idProducto, Integer cantidad, Double subtotal) {
        this.idUsuario = idUsuario;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    /**
     * @return the idCarrito
     */
    public Integer getIdCarrito() {
        return idCarrito;
    }

    /**
     * @param idCarrito the idCarrito to set
     */
    public void setIdCarrito(Integer idCarrito) {
        this.idCarrito = idCarrito;
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
     * @return the idProducto
     */
    public Integer getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the subtotal
     */
    public Double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;

    }

    @Override
    public String toString() {
        return "Carrito{"
                + "idCarrito=" + getIdCarrito()
                + ", idProducto=" + getIdProducto()
                + ", idUsuario=" + getIdUsuario()
                + ", cantidad=" + getCantidad()
                + '}';
    }
}
