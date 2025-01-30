package com.sait.productService.controller;

import com.sait.productService.entity.Product;
import com.sait.productService.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/products/add")
    public String addProduct(@RequestBody Product product){
        return service.addProduct(product);
    }

    @GetMapping("/products/view")
    public List<Product> viewProducts(){
        return service.viewproducts();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        return service.deleteProduct(id);
    }





}
