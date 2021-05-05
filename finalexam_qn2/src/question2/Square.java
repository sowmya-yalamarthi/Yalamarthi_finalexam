/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class Square extends GeometricObject implements Colorable 
{
    private double side;

    public Square(double side, boolean isFilled) {
        super(isFilled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }
 
    @Override
    public String toString() {
        return "Square{" + "side=" + side + " Area of square is: "+Area()+'}';
    }
    @Override
   public double Area()
    {
        return side*side;
    }
    /**
     *
     * @return
     */
    public void howToColor() {
        
        
        System.out.println("Color all four sides");
    }
    
}
