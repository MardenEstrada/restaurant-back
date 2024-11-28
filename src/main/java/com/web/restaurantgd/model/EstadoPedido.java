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
@Table(name = "estado_pedido")
public class EstadoPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDEstadoPedido")
    private Integer idEstadoPedido;

    @Column(name = "Descripcion")
    private String descripcion;

    // Constructor sin argumentos
    public EstadoPedido() {
    }

    // Constructor con todos los atributos
    public EstadoPedido(Integer idEstadoPedido, String descripcion){
        this.idEstadoPedido = idEstadoPedido;
        this.descripcion = descripcion;
    }

    // Constructor sin id
    
    public EstadoPedido(String descripcion) {
        this.descripcion = descripcion;
    }

    /// Getters y Setters
    
    /**
     * @return the idEstadoPedido
     */
    public Integer getIdEstadoPedido() {
        return idEstadoPedido;
    }

    /**
     * @param idEstadoPedido the idEstadoPedido to set
     */
    public void setIdEstadoPedido(Integer idEstadoPedido) {
        this.idEstadoPedido = idEstadoPedido;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString() {
        return "DetallePedido{"
                + "idEstadoPedido=" + getIdEstadoPedido()
                + ", descripcion='" + getDescripcion()
                + '}';
    }
    

}
