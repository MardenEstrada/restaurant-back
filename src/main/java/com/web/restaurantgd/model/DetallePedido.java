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

/**
 *
 * @author marde
 */
@Entity
@Table(name = "detalle_pedido")
public class DetallePedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDDetallePedido")
    private Integer idDetallePedido;

    @Column(name = "IDPedido")
    private Integer idPedido;

    @Column(name = "IDProducto")
    private Integer idProducto;

    @Column(name = "Cantidad")
    private Integer cantidad;

    @Column(name = "Precio")
    private Double precio;

    // Constructor sin argumentos
    public DetallePedido() {
    }

    // Constructor con todos los atributos
    public DetallePedido(Integer idDetallePedido, Integer idPedido, Integer idProducto, Integer cantidad, Double precio) {
        this.idDetallePedido = idDetallePedido;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Constructor sin id
    
    public DetallePedido(Integer idPedido, Integer idProducto, Integer cantidad, Double precio) {
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    // Getters y Setters
    /**
     * @return the idDetallePedido
     */
    public Integer getIdDetallePedido() {
        return idDetallePedido;
    }

    /**
     * @param idDetallePedido the idDetallePedido to set
     */
    public void setIdDetallePedido(Integer idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
    }

    /**
     * @return the idPedido
     */
    public Integer getIdPedido() {
        return idPedido;
    }

    /**
     * @param idPedido the idPedido to set
     */
    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
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

    @Override
    public String toString() {
        return "DetallePedido{"
                + "idDetallePedido=" + getIdDetallePedido()
                + ", idPedido='" + getIdPedido()
                + ", idProducto='" + getIdProducto()
                + ", cantidad='" + getCantidad()
                + ", precio='" + getPrecio()
                + '}';
    }
    
}
