/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.web.restaurantgd.service;

import com.web.restaurantgd.model.Producto;
import com.web.restaurantgd.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marde
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Producto> getAllProducts() {
        return productRepository.findAll();
    }

    public Producto getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Producto createProduct(Producto product) {
        return productRepository.save(product);
    }

    public Producto addProduct(Producto product) {
        return productRepository.save(product);
    }

    public Producto updateProduct(Long id, Producto product) {
        if (productRepository.existsById(id)) {
            product.setIdProducto(id);
            return productRepository.save(product);
        }
        return null;
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
