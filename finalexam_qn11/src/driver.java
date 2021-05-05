/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        System.out.println("ANSWER FOR QUESTION 11: SOWMYA YALAMARTHI");
        cars c1=new cars();
        cars c2=new cars();
        cars c3=new cars(1002,"BMW");
        cars c4=new cars(1002,"BMW");
      
        c1.setBrand("AUDI");
        c2.setBrand("AUDI");
        System.out.println("**** EQUALS ****");
        //here we are comparing the object brands using equals method
        System.out.println(c1.getBrand().equals(c2.getBrand()));
        System.out.println(c1.getBrand().equals(c4.getBrand()));
        if(c3.equals(c4))
        {
            System.out.println("Two objects are equal");
            
        }
        else
        {
            System.out.println("Two objects are not equal");
        }
        //here printing the hascode for each object using hashcode() method
        System.out.println("**** HASH CODE ****");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
    }
    
}
