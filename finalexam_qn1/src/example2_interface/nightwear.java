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
public class nightwear implements clothing
{
    public double price;
    public static final double Tax=3;
    public String size;

    public nightwear(double price, String size) {
        this.price = price;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public static double getTax() {
        return Tax;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "nightwear" + "\n  price: " + price + "\n  size: " + size  ;
    }
    
            
    @Override
    public double totalprice() 
    {
        return price+(price*Tax)/100.0;
        
    }

    @Override
    public String type() {
        return "REGULAR WEAR";
    }
    
    
}
