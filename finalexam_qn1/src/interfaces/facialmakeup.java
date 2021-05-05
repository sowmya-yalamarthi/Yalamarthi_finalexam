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
public class facialmakeup implements cosmetics 
{
    public String brand;
    public String type;
   public static final double discount=5;
    public double cost;

    public facialmakeup(String brand, String type, double cost) {
        this.brand = brand;
        this.type = type;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public static double getDiscount() {
        return discount;
    }


    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "facialmakeup" + "\n brand: " + brand + "\n type: " + type + "\n cost: " + cost;
    }
    

    @Override
    public double totalcost() 
    {
        return cost-(cost*discount)/100.0;
        
    }

    @Override
    public String category() 
    {
        return "** MAKE UP **";
        
    }
    
    
}
