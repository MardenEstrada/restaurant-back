/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.web.restaurantgd.controller;

import com.web.restaurantgd.model.Pedido;
import com.web.restaurantgd.model.Producto;
import com.web.restaurantgd.model.Usuario;
import com.web.restaurantgd.service.PedidoService;
import com.web.restaurantgd.service.ProductService;
import com.web.restaurantgd.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author marde
 */
@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private ProductService productService;

    @Autowired
    private PedidoService orderService;

    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> getAllUsuarios() {
        List<Usuario> usuarios = usuarioService.getAllUsuarios();
        return ResponseEntity.ok(usuarios);
    }

    @GetMapping("/productos")
    public ResponseEntity<List<Producto>> getAllProducts() {
        List<Producto> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @PostMapping("/productos")
    public ResponseEntity<String> addProduct(@RequestBody Producto product) {
        productService.addProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body("Product added successfully");
    }

    @PutMapping("/productos/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable Long id, @RequestBody Producto product) {
        productService.updateProduct(id, product);
        return ResponseEntity.ok("Product updated successfully");
    }

    @DeleteMapping("/productos/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.ok("Product deleted successfully");
    }

    @GetMapping("/pedidos")
    public ResponseEntity<List<Pedido>> getAllOrders() {
        List<Pedido> orders = orderService.getAllOrders();
        return ResponseEntity.ok(orders);
    }
}
