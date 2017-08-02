package me.moosecanswim.startinvoiceapp.Models;

public class Product {
    private String itemCode;
    private String itemName;
    private double itemPrice;

    public void product(String name, double price){
        this.setItemName(name);
        this.setItemPrice(price);
    }

    //getters and setters
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
}
