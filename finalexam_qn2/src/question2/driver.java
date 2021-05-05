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
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ANSWER FOR QUESTION 2: SOWMYA YALAMARTHI");
        GeometricObject[] gObj = new GeometricObject[5];
        gObj[0] = new Square(4,true);
        gObj[1] = new Square(5,false);
        gObj[2] = new Square(8,true);
        gObj[3] = new Square(6,false);
        gObj[4] = new Square(3,true);
       // System.out.println(gObj[0].toString());
        for (int i = 0; i < gObj.length; i++) {

            System.out.println("Object " + (i + 1) + ": \nArea = " + gObj[i].Area());
            if (gObj[i] instanceof Colorable) {
                ((Colorable)gObj[i]).howToColor();
            }
        }
        
    }
    
}
