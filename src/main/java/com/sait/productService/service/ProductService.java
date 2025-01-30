package com.sait.productService.service;

import com.sait.productService.entity.Product;
import com.sait.productService.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public String addProduct(Product product) {
        return repo.save(product).toString();
    }

    public List<Product> viewproducts(){
        return repo.findAll();
    }

    public String deleteProduct(Long id) {
        repo.deleteById(id);
        return "product deleted successfully";
    }
}
