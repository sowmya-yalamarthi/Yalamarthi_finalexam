/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam10;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class revString
{
    public void revString(String s) 
    { 
       
        if ((s==null)||(s.length() <= 1)) 
           System.out.println(s); 
        else
        { 
            System.out.print(s.charAt(s.length()-1)); 
            revString(s.substring(0,s.length()-1)); 
        } 
    }
    
}
