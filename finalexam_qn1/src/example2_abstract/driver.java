/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2_abstract;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        System.out.println("ANSWER FOR QUESTION 1: SOWMYA YALAMARTHI");
        two_wheeler tw=new two_wheeler("AUDI","A6",60000);
        four_wheeler fw=new four_wheeler("BWM","X8",50000,"Black");
        System.out.println(tw.type());
        System.out.println(tw.toString());
        System.out.println("Total Cost: "+tw.totalCost());
        System.out.println(fw.type());
        System.out.println(fw.toString());
        System.out.println("Total Cost: "+fw.totalCost());
        
        
    }
    
}
