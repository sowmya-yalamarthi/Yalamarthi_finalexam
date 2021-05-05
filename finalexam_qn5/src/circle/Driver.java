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
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ANSWER FOR QUESTION 5: SOWMYA YALAMARTHI");
        ComparableCircle c1 = new ComparableCircle(8.0);
	ComparableCircle c2 = new ComparableCircle(6.0);

	
	System.out.println("ComparableCircle object 1: "+c1);
	System.out.println("\nComparableCircle object 2: "+c2);
		
        if(c1.compareTo(c2) == 1 )
        {
            System.out.println("\nComparableCircle object 1 is larger");
        }
        else
       {
            System.out.println("\nComparableCircle object 2 is larger");
       }
		
    }
    
}
