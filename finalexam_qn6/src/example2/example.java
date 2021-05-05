/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class example 
{
    public static void main(String[] args) 
    {
        System.out.println("ANSWER FOR QUESTION 6: SOWMYA YALAMARTHI");
        String s = "2021-05-02";
        DateFormat d = new SimpleDateFormat("yyyy-MM-dd");
         System.out.println(s);
            Date date;
             
            try {
                s="2021 05 02";
                date = d.parse(s);
                System.out.println(date);
 
            } catch (ParseException e) {
                System.out.println(" enter date invalid format");
                System.out.println(e);
            }
            
            String day = "wednesday";
        System.out.println("Length: " + day.length());
                try{
                    char ch = day.charAt(11);
                }catch(StringIndexOutOfBoundsException e)
                {
                    System.out.println("enter valid index");
                    System.out.println(e);
                }
    }
}