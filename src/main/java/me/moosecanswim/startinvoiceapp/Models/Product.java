package me.moosecanswim.startinvoiceapp.Models;

public class Product {
    private String objectName;
    private double objectPrice;

    public void product(String name, double price){
        this.setObjectName(name);
        this.setObjectPrice(price);
    }

    //getters and setters
    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public double getObjectPrice() {
        return objectPrice;
    }

    public void setObjectPrice(double objectPrice) {
        this.objectPrice = objectPrice;
    }
}
