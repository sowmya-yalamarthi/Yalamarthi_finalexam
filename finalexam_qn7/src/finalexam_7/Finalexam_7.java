/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam_7;

import java.util.Scanner;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class Finalexam_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("ANSWER FOR QUESTION 7: SOWMYA YALAMARTHI");
		Scanner scan = new Scanner(System.in);

		int[] arrEle = getArrayElement();

		System.out.print("Enter the index of the array: ");
		try{
			System.out.println("The corresponding element value is " + 
				arrEle[scan.nextInt()]);
                }catch(ArrayIndexOutOfBoundsException e1)
                {
                    System.out.println("Out of Bounds");
                }
	}
	public static int[] getArrayElement() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		return array;
	}
}
    
    

