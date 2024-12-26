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

/*
To Debug a program,
 Step 1 : Ctrl + f5 (To debug a prject where you present - 10.Methods)
 step 2. Ctrl + Shift + f5 (Debug file)
 Step 3. Shift + f7 (Step into the next method)
 Step 4. f7 (Step into)
 Step 5. Ctrl + f7   (Step out)

Shift + f8                    (to finish the Debuger)
Ctrl + shift + f8               (New Breakpoint)
Ctrl + f8                     (Toggle the Breakpoint)

*/

package pkg10.methods;

class Product {
    public int multiply(int a, int b) {
        return a*b;
    }
    public int multiply(int a, int b, int c) {
        return a*b*c;
    }
    public double multiply(double a, double b) {
        return a*b;
    }
    public double multiply(double a, double b, double c) {
        return a*b*c;
    }
}

public class MethodOverloading3Multiply {
    
    public static void main(String[] args) {
        
        Product p = new Product();
        
        // call the integer prod
        System.out.println("Product of two integer elements with two parameter : " + p.multiply(2, 20));
        System.out.println("Product of three integer elements with three parameter : " + p.multiply(2, 20, 10));
        
        
        // call the double prod
        System.out.println("Product of two double elements with two parameter : " + p.multiply(2.5, 10));
        System.out.println("Product of three double elements with three parameter : " + p.multiply(2.5, 10, 10));
    }
}


/*
Output:-
----------
Product of two integer elements with two parameter : 40
Product of three integer elements with three parameter : 400
Product of two double elements with two parameter : 25.0
Product of three double elements with three parameter : 250.0

*/