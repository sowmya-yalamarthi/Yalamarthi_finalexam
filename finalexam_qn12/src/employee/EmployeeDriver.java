/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Sowmya Yalamarthi
 */
public class EmployeeDriver
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("ANSWER FOR QUESTION 12: SOWMYA YALAMARTHI");
        ArrayList<Employee> empList=new ArrayList<>();
        Employee emp1=new Employee(1001,"hari",500);
        Employee emp2=new Employee(1002,"priya",800);
        Employee emp3=new Employee(1004,"anjali",900);
        Employee emp4=new Employee(1006,"sowmya",600);
        Employee emp5=new Employee(1008,"rushika",700);
        empList.add(emp5);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp2);
        empList.add(emp1);
        for(Employee e:empList)
            {
                System.out.println(e);
            }
        System.out.println("**************************");
        System.out.println("Natural order sorting");
        Collections.sort(empList);
        System.out.println(empList);
        
        Collections.sort(empList, new Comparator<Employee>() 
        {
           
            @Override
            public int compare(Employee emp1, Employee emp2) 
            {
        
            return Double.compare(emp1.getEmpSalary(),emp2.getEmpSalary());
        
            }   
        });
        System.out.println("sorting based on employee salary \n"+empList);
        
        Collections.sort(empList, new Comparator<Employee>() 
        {
            @Override
            public int compare(Employee emp1, Employee emp2) 
            {
                
                    return emp1.getEmpName().compareTo(emp2.getEmpName());
            }  
        });
        System.out.println("sorting based on employee name \n"+empList);
        
    }
    
}
