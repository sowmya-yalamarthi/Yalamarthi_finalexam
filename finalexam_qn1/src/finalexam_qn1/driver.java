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
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        System.out.println("ANSWER FOR QUESTION 1: SOWMYA YALAMARTHI");
        partywear p1=new partywear(50,"M",2);
        casualwear c1=new casualwear(80,"slim fit");
        System.out.println(p1.brand());
        System.out.println(p1.category());
        System.out.println(p1.toString());
        System.out.println(c1.brand());
        System.out.println(c1.category());
        System.out.println(c1.toString());

    }
    
}
