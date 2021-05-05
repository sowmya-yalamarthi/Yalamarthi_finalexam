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
public class footwear 
{
    public String type;

    public footwear(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "footwear" + "\ntype: " + type ;
    }
    
    
}
