package com.fred.eshop.controller;

import org.springframework.web.bind.annotation.RestController;

import com.fred.eshop.model.Order;
import com.fred.eshop.model.Product;
import com.fred.eshop.service.OrderService;
import com.fred.eshop.service.ProductService;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class APIController {
    @GetMapping("/")
    public String index() {
        return "hello";
    }

    @GetMapping("/getProduct")
    public String getProduct() {
        ProductService pService = new ProductService();
        Product product =  pService.read(2);
        return product.toString();
    } 

    @Autowired
    OrderService oSercvice;
    @GetMapping("/getOrder")
    public String getOrder() {
        Order order = oSercvice.read("71");
        return order.toString();
    }

}
