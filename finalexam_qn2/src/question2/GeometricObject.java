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
public abstract class GeometricObject 
{
    private boolean isFilled;

    public GeometricObject(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public boolean isIsFilled() {
        return isFilled;
    }
    

    @Override
    public String toString() {
        return "GeometricObject{" + "isFilled=" + isFilled + '}';
    }
    
    public abstract double Area();
}
