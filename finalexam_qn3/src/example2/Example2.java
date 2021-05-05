/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;
/**
 *
 * @author Sowmya Yalamarthi
 */
public class Example2 
{
    public static void main(String[] args)
    {
        
    System.out.println("ANSWER FOR QUESTION 3: SOWMYA YALAMARTHI");
    footwear f1=new shoes("ADDIDAS","Casuals");
    footwear f2=new footwear("sandals");
    shoes s1=new shoes("PUMA","regular");
    System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println("****After explicit type casting****");
    shoes s=(shoes) f1;
    footwear f=(footwear) s1;
        System.out.println(s.toString());
        System.out.println(f.toString());
    }
}
