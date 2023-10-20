package com.fred.eshop.controller;




import com.fred.eshop.model.Product;

import com.fred.eshop.service.ProductService;

import jakarta.servlet.http.HttpServletResponse;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("eshop/product")
// Product microservice API endpoints
public class ProductAPI {   

    // @GetMapping("/get/{id}")
     @GetMapping(value="/get/{id}", consumes="application/json",produces="application/json")
    public Product getProduct(@PathVariable int id) {
        ProductService pService = new ProductService();
        Product product =  pService.read(id);
        return product;
    } 

    @GetMapping(value="/getall", consumes="application/json",produces="application/json")
    public List<Product> getAllProduct() {
        ProductService pService = new ProductService();
        List<Product> products =  pService.readAll();
        return products;
    } 
    
    @PostMapping(value="/create", consumes="application/json")
    public void createProduct(@RequestBody Product product) {
        ProductService pService = new ProductService();
        pService.create(product);        
    } 

    

    

}
