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
public class partywear extends clothing
{
    public double price;
    public String size;
    public static final double TAX=5;
    public double quantity;

    public partywear(double price, String size, double quantity) {
        this.price = price;
        this.size = size;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public static double getTAX() {
        return TAX;
    }

    public double getQuantity() {
        return quantity;
    }
public double totalCost()
{
    return (price+(price*TAX)/100.0)*quantity;
}
    @Override
    public String toString() {
        return  "   Price: " + price + "\n   Size: " + size + "\n   Quantity: " +quantity +"\n   Tax: "+TAX+"\n   Total Cost: "+totalCost();
    }
    

    @Override
    public String brand() {
        return "GUCCI";
    }

    @Override
    public String category() {
        return "Party Wear";
    }
    
}
