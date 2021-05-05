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
      static void exam() throws StringIndexOutOfBoundsException
    {
        try
        {
      
        String str="SOWMYA";
            System.out.println(str.charAt(8));
            throw new StringIndexOutOfBoundsException();
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
            throw e; // rethrowing the exception
        }
    }
 
    public static void main(String args[])
    {
        System.out.println("ANSWER FOR QUESTION 9: SOWMYA YALAMARTHI");
        exam();
    }
    
}
