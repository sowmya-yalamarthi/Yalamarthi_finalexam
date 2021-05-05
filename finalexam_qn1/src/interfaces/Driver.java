/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("ANSWER FOR QUESTION 1: SOWMYA YALAMARTHI");
        moisturizers m1=new moisturizers("Maybelline","cleanser",50,2);
        facialmakeup f1=new facialmakeup("Mac","foundation",80);
        
        System.out.println(m1.category());
        System.out.println(m1.toString());
        System.out.println(" Total Cost is: "+m1.totalcost());
        
        System.out.println(f1.category());
        System.out.println(f1.toString());
        System.out.println(" Total Cost is: "+f1.totalcost());
    }
    
}
