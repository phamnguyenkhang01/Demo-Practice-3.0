package com.fred.eshop;

public class ServiceTest {
    public static void main(String[] args) {
        //testReadOrder();
        testCancelOrder();
    }

    public static void testReadOrder() {
        OrderService oService = new OrderService();
        Order order = oService.read("73");
        System.out.println(order);

        for (Product product : order.getProducts())
            System.out.println(product);
    }

    public static void testCancelOrder() {
        OrderService oService = new OrderService();
        Order order = oService.read("73");
        oService.cancel(order);
    }
}
