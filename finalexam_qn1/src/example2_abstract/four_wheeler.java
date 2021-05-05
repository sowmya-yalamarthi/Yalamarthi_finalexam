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
public class four_wheeler extends vehicles
{
    public String brand;
    public String model;
    public double cost;
    public String color;
    public static final double discount=3.0;

    public four_wheeler(String brand, String model, double cost, String color) {
        this.brand = brand;
        this.model = model;
        this.cost = cost;
        this.color = color;
    }

   
    

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getCost() {
        return cost;
    }

    public static double getDiscount() {
        return discount;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return  "Brand: " + brand + "\nModel: " + model + "\nCost: " + cost + "\nColor: " + color;
    }
   
    @Override
    public double totalCost() 
    {
          return cost-(cost*discount)/100.0;
        
    }

    @Override
    public String type() 
    {
       return "***FOUR_WHEELER***\nCAR";
    }
    
}
