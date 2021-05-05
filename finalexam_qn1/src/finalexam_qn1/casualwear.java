/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam_qn1;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class casualwear extends clothing
{
    public double cost;
    public static final double discount=2;
    public String fittype;

    public casualwear(double cost, String fittype) {
        this.cost = cost;
        this.fittype = fittype;
    }

    public double getCost() {
        return cost;
    }

    public static double getDiscount() {
        return discount;
    }

    public double getTotalcost() {
        return cost-(cost*discount)/100.0;
    }

    public String getFittype() {
        return fittype;
    }

    @Override
    public String toString() {
        return  "   Cost: " + cost +  "\n   Fit Type: " + fittype+"\n   Discount: "+discount+"\n   Total Cost: "+getTotalcost();
    }
    
    
    
    
    @Override
    public String brand() {
        return "UNDER ARMOUR";
    }

    @Override
    public String category() {
       return "Casuals";
    }
    
    
}
