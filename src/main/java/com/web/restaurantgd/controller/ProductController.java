/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.web.restaurantgd.controller;

import com.web.restaurantgd.model.Producto;
import com.web.restaurantgd.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Obtener todos los productos
    @GetMapping
    public List<Producto> getAllProducts() {
        return productService.getAllProducts();
    }

    // Obtener un producto por su ID
    @GetMapping("/{id}")
    public Producto getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    // Crear un nuevo producto
    @PostMapping
    public Producto createProduct(@RequestBody Producto product) {
        return productService.createProduct(product);
    }

    // Actualizar un producto existente
    @PutMapping("/{id}")
    public Producto updateProduct(@PathVariable Long id, @RequestBody Producto product) {
        return productService.updateProduct(id, product);
    }

    // Eliminar un producto por su ID
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}