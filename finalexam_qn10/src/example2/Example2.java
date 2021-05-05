/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;

import java.util.Scanner;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class Example2 {

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) 
            
    {
        System.out.println("ANSWER FOR QUESTION 10: SOWMYA YALAMARTHI");
        System.out.print("enter a value: ");
        Scanner scan=new Scanner(System.in);
        int number = scan.nextInt();
  
        //print first 10 numbers of fibonacci series
        System.out.println ("Fibonacci Series is : ");
        for (int i = 1; i <= number; i++) 
        {
            System.out.println(fibonacci(i));
        }
  
}
}

    

