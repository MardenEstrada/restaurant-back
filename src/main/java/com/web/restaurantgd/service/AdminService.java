/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.web.restaurantgd.service;

import com.web.restaurantgd.model.Pedido;
import com.web.restaurantgd.model.Producto;
import com.web.restaurantgd.model.Usuario;
import com.web.restaurantgd.repository.PedidoRepository;
import com.web.restaurantgd.repository.ProductRepository;
import com.web.restaurantgd.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marde
 */
@Service
public class AdminService {

    @Autowired
    private UsuarioRepository usuarioRepository; // Cambiado de CustomerRepository a UsuarioRepository
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private PedidoRepository orderRepository; // Cambiado de OrderRepository a PedidoRepository

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll(); // Devuelve todos los usuarios (admin y cliente)
    }

    public List<Producto> getAllProducts() {
        return productRepository.findAll();
    }

    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }

    public List<Pedido> getAllOrders() {
        return orderRepository.findAll();
    }
}
