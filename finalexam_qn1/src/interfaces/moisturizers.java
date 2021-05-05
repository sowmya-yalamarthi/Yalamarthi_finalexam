/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class moisturizers implements cosmetics
{
    public String brand;
    public String name;
    public double price;
    public int quantity;

    public moisturizers(String brand, String name, double price, int quantity) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "moisturizers" + "\n brand: " + brand + "\n name: " + name + "\n price: " + price + "\n quantity: " + quantity ;
    }
    
    
    @Override
    public double totalcost() {
        return quantity*price;
    }

    @Override
    public String category() {
        return "** SKIN CARE **";
    }
    
    
}
