/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam_qn9;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class Finalexam_qn9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws ArrayIndexOutOfBoundsException,ArithmeticException
    {
        // TODO code application logic here
        System.out.println("ANSWER FOR QUESTION 9: SOWMYA YALAMARTHI");
         int arr[]=new int[7];
         try{
         arr[5]=30/0;
         System.out.println(arr[7]);
         }catch(ArithmeticException e)
         {
             System.out.println(e);
             throw e;
         }
      
   }
    }
    

