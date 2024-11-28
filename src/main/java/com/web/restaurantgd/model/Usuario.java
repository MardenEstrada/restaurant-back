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
@Table (name = "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "IDUsuario")
    private Integer idUsuario;
    
    @Column (name = "Nombre")
    private String nombre;
    
    @Column (name = "Apellido")
    private String apellido;
    
    @Column (name = "Email")
    private String email;
    
    @Column (name = "Password")
    private String password;
    
    @Column (name = "IDRol")
    private Integer idRol;

    // Getters y Setters
    
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the idRol
     */
    public Integer getIdRol() {
        return idRol;
    }

    /**
     * @param idRol the idRol to set
     */
    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }
    
    // Constructor sin argumentos
    public Usuario(){
    }
    
    // Constructor con todos los atributos
    public Usuario(Integer idUsuario, String nombre, String apellido, String email, String password, Integer idRol){
        
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.idRol = idRol;
      
    }
    
    // Cosntructor sin id
    
    public Usuario(String nombre, String apellido, String email, String password, Integer idRol){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.idRol = idRol;
      
    }
    
    @Override
    
    public String toString(){
        return "Usuario{"
                + "iddUsuario=" + getIdUsuario()
                + ", nombre='" + getNombre()
                + ", apellido='" + getApellido()
                + ", password=" + getPassword()
                + ", idRol=" + getIdRol()
                + '}';
    }
    
}
