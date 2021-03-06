package me.moosecanswim.startinvoiceapp.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Product {
    @NotNull(message="You must enter an item code")
    @Min(value = 1, message = "Item code should be a 'long' greater than 1")
    @Id
    private long itemID;

    @NotNull(message="You must enter an item name")
    @Size(min=1, max = 30, message = "Item Name can be between 1 and 30 characters")
    private String itemName;

    @NotNull(message = "You must enter a price")
    private double itemPrice;


    public void product(){

    }

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


    public long getItemID() {
        return itemID;
    }

    public void setItemID(long itemID) {
        this.itemID = itemID;
    }


}
