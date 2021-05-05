/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Sowmya yalamarthi
 */
public class Person 
{
    public String name;
    public int age;
    public String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
   
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() 
    {
        if (age < 1 || age > 99) {
        throw new IllegalArgumentException("Invalid age");
        
    }
    int newage=age;
        return age;
    }

    public void setAge(int age) {
    this.age=age;
}

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", gender=" + gender + '}';
    }
   
    
}
