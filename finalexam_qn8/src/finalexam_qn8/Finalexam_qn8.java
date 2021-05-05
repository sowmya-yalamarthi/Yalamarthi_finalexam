/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam_qn8;

import java.io.IOException;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class Finalexam_qn8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws ArithmeticException,NumberFormatException
    {
        // TODO code application logic here
        System.out.println("ANSWER FOR QUESTION 8: SOWMYA YALAMARTHI");
        try{
           
          int a = Integer.parseInt(null);   
          System.out.println(a/8);
    }catch(ArithmeticException| NumberFormatException e)
    {
        System.out.println("Number Format Exception");
        System.out.println(e);
    }
    } 
}
