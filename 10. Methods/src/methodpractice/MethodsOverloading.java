/*
Methods Overloading:
---------------------
- Methods with the same name having different parameter is known as method overloading.


- In Java, it allows you to define multiple methods with the same name in the same class, but with different parameter lists. 
- These methods are called overloaded methods. 
- When you call an overloaded method, Java cleverly figures out which one to execute based on the number and types of arguments you pass to it.


Why Overload?
--------------
    - Imagine you’re building a calculator class. You want it to handle addition, multiplication, and division. Instead of naming your methods addInt, addDouble, multiplyInt, multiplyDouble, and so on, you can use method overloading to keep things tidy.
    - Overloading makes your code readable, concise, and intuitive. Plus, it’s a form of polymorphism—specifically, compile-time polymorphism or static polymorphism.

How to Overload?
-----------------
You can overload methods by:
    - Changing the number of parameters.
    - Changing the data types of the arguments.
    - Changing the order of the parameters.



*/
package methodpractice;

import java.util.Scanner;


public class MethodsOverloading {
    static int max(int x, int y) {
        return x > y ? x : y;
    }
    static float max(float x, float y){
        return x > y ? x : y;
    }
    
    static int max(int x, int y, int z){
        return x>y && x>z ? x : (y>z ? y : z);
    }
    
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       // Maximum between two Integer
        System.out.println("Enter the first integer value x : ");
        int x = sc.nextInt();
        System.out.println("Enter the second integer value y : ");
        int y = sc.nextInt();
       
        // maximum between these two integer
        System.out.println("Maximum between these two Integer values : " + max(x, y));
        
       
        
       // Maximum between two Float
        System.out.println("\n\nEnter the first float value a : ");
        float a = sc.nextFloat();
        System.out.println("Enter the second float value b : ");
        float b = sc.nextFloat();
       
        System.out.println("Maximum between these two float value is : " + max(a, b));
        
        
       // Maximum between three Integers
        System.out.println("\n\nEnter the third integer value z : ");
        int z = sc.nextInt();
        
       
        System.out.println("Maximum between these three integer value is : " + max(x, y, z));
        
    }
}



/*
Output:-
----------
Enter the first integer value x : 
5
Enter the second integer value y : 
15
Maximum between these two Integer values : 15


Enter the first float value a : 
102.3
Enter the second float value b : 
110.11
Maximum between these two float value is : 110.11


Enter the third integer value z : 
6
Maximum between these three integer value is : 15


*/