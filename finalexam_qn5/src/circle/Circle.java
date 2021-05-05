/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class Circle 
{
    private double radius;
    public static final double PI=3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
public double Area()
{
    return 2*PI*radius;
}
    @Override
    public String toString() {
        return "\nradius: " + radius;
    }
    
    
}
