/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        System.out.println("ANSWER FOR QUESTION 6: SOWMYA YALAMARTHI");
        Scanner scan=new Scanner(System.in);
        Person p1=new Person("sowmya",0,"Female");
        System.out.println(p1.getName());
        System.out.println(p1.getGender());
        
            try{
            
                System.out.println(p1.getAge());
            
        }catch(IllegalArgumentException e)
        {
            e.printStackTrace();
           
        }  
    }
}
    

