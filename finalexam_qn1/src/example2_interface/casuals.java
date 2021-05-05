/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2_interface;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class casuals implements clothing
{
    public double cost;
    public static final double discount=4;
    public int quantity;

    public casuals(double cost, int quantity) {
        this.cost = cost;
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public static double getDiscount() {
        return discount;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "casuals" + "\n  cost: " + cost + "\n  quantity: " + quantity ;
    }
    

    @Override
    public double totalprice() 
    {
        return cost-(cost*discount)/100.0;
        
    }

    @Override
    public String type() 
    {
        return "CASUAL WEAR";
        
    }  
}
