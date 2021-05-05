/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class shoes extends footwear
{
    public String brand;

    public shoes(String brand, String type) {
        super(type);
        this.brand = brand;
    }


    public String getBrand() {
        return brand;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString()+"\nshoes" + "\nbrand: " + brand;
    }
    
    
    
}
