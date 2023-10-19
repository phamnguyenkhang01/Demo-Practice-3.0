package com.fred.eshop.model;

public class Product {
    private int id;
    private String description;
    private float price;
    private int quantity;

    public Product(String description, float price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public int getID() {
        return this.id;
    }
    public void setID(int id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return this.price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return this.id + " " + this.description + " " + this.price + " " + this.quantity;
    }
}
