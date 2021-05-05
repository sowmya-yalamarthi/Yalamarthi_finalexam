/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2_interface;

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
        casuals c1=new casuals(80,2);
        nightwear n1=new nightwear(60,"M");
        System.out.println(c1.type());
        System.out.println(c1.toString());
        System.out.println("Total Cost: "+c1.totalprice());
        System.out.println(n1.type());
        System.out.println(n1.toString());
        System.out.println("Total Cost: "+n1.totalprice());
        
    }
    
}
