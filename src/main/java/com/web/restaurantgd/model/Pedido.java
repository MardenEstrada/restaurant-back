package com.web.restaurantgd.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDPedido")
    private Integer idPedido;

    @Column(name = "FechaPedido")
    private Date fechaPedido;

    @Column(name = "EstadoPedido")
    private Integer estadoPedido;

    @Column(name = "Total")
    private Double total;

    @Column(name = "IDUsuario")
    private Integer idUsuario;

    @Column(name = "IDRestaurante")
    private Integer idRestaurante;

    // Constructor sin argumentos
    public Pedido() {
    }

    // Constructor con todos los atributos
    public Pedido(Integer idPedido, Date fechaPedido, Integer estadoPedido, Double total, Integer idUsuario, Integer idRestaurante) {
        this.idPedido = idPedido;
        this.fechaPedido = fechaPedido;
        this.estadoPedido = estadoPedido;
        this.total = total;
        this.idUsuario = idUsuario;
        this.idRestaurante = idRestaurante;
    }

    // Constructor sin id
    public Pedido(Date fechaPedido, Integer estadoPedido, Double total, Integer idUsuario, Integer idRestaurante) {
        this.fechaPedido = fechaPedido;
        this.estadoPedido = estadoPedido;
        this.total = total;
        this.idUsuario = idUsuario;
        this.idRestaurante = idRestaurante;
    }

    // Getters y Setters
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
     * @return the fechaPedido
     */
    public Date getFechaPedido() {
        return fechaPedido;
    }

    /**
     * @param fechaPedido the fechaPedido to set
     */
    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    /**
     * @return the estadoPedido
     */
    public Integer getEstadoPedido() {
        return estadoPedido;
    }

    /**
     * @param estadoPedido the estadoPedido to set
     */
    public void setEstadoPedido(Integer estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    /**
     * @return the total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Double total) {
        this.total = total;
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

    @Override
    public String toString() {
        return "Pedido{"
                + "idPedido=" + getIdPedido()
                + ", fechaPedido='" + getFechaPedido()
                + ", estadoPedido='" + getEstadoPedido()
                + ", total=" + getTotal()
                + ", idUsuario=" + getIdUsuario()
                + ", idRestaurante='" + getIdRestaurante()
                + '}';
    }

}
