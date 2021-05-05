/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.util.Scanner;

/**
 *
 * @author S542049
 */
public class Search {

        static int linearSearch(int arr[], int s, int end, int num) {
        if (s > end) {
            return -1;
        } else if (arr[s] == num) {
            return s;
        } else if (arr[end] == num) {
            return end;
        }
        return linearSearch(arr, s+1, end-1, num);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("ANSWER FOR QUESTION 10: SOWMYA YALAMARTHI");
        int[] ele = {8,6,10,5,21,88,45,35,9};
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n=scan.nextInt();
        int index = linearSearch(ele, 0, ele.length-1, n);
        if (index != -1) {
           System.out.println(n + " is found at index " + index);
        }
        else {
            System.out.println(n + " is not present");
        }
    }    
}
    

