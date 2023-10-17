package com.fred.eshop;

import org.springframework.web.bind.annotation.RestController;

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
