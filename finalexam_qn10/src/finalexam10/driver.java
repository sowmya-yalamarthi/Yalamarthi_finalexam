/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam10;

import java.util.Scanner;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ANSWER FOR QUESTION 10: SOWMYA YALAMARTHI");
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=scan.nextLine();
        
        System.out.println("The given string: " + str);
        revString r = new revString(); 
        System.out.print("The reversed string: ");
        r.revString(str); 
    }
    
}
