/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.web.restaurantgd.service;

import com.web.restaurantgd.model.Pedido;
import com.web.restaurantgd.repository.PedidoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marde
 */

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository orderRepository;

    public List<Pedido> getAllOrders() {
        return orderRepository.findAll();
    }

    public Pedido getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public Pedido saveOrder(Pedido pedido) {
        return orderRepository.save(pedido);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}