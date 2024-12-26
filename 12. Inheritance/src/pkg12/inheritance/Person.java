/*

this keyword:-
----------------
- this keyword is used to refer the current object within the same class.


*/
package pkg12.inheritance;

import java.util.Scanner;


public class Person {
    
    private String name;
    
    public Person (String name) {
        this.name = name;
        System.out.println("Name : " + this.name);
    }
    
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public static void main(String[] args) {
        Person p = new Person("Rohit");
    }
}


/*
Output:-
------------
Name : Rohit
*/