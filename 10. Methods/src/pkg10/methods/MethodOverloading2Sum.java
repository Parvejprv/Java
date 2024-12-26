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

package pkg10.methods;

public class MethodOverloading2Sum {
    public int sum(int a, int b) {
        return (a+b);
    }
    public int sum(int a, int b, int c) {
        return (a + b + c);
    }
    public double sum(double x, double y) {
        return (x + y);
    }
    
    public static void main(String[] args) {
       MethodOverloading2Sum  mo2 = new MethodOverloading2Sum();
       
        System.out.println("Sum of two integers = " + mo2.sum(10, 20));
        System.out.println("Sum of three integers = " + mo2.sum(10, 20, 30));
        
        System.out.println("Sum of two double values = " + mo2.sum(12.5, 13.567));
    }
}



/*
Output:
---------
Sum of two integers = 30
Sum of three integers = 60
Sum of two double values = 26.067
*/