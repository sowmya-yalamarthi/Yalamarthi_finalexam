/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class Example2 
{
    public static void main(String[] args)
    {
        System.out.println("ANSWER FOR QUESTION 8: SOWMYA YALAMARTHI");
        Example2 e = new Example2();
        e.fileExe();
    }
    public void fileExe()
    {
        try
        {
            FileInputStream f = new FileInputStream("input.txt");
            
        } 
        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found");
            System.out.println(e);
        }
    }
    
}
