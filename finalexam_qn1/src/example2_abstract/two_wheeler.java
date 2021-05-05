/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2_abstract;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class two_wheeler extends vehicles
{
    public String brand;
    public String model;
    public double price;
    public static final double TAX=4;

    public two_wheeler(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\nModel: " + model + "\nPrice: " + price ;
    }
    

    @Override
    public double totalCost() 
    {
        return price+(price*TAX)/100.0;
    }

    @Override
    public String type() {
        return "***TWO_WHEELER***\nBIKE";
    }
    
}
