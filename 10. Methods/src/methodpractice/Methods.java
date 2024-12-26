/*
Methods :-
=========

What are the Methods?
----------------------
- In Java methods is a block of code that use to perform a specific task. 
- When you call a method, it buzzez into action and deos its thing.

Here is a key points about methods:-

1. Method Declaration : 
-----------------------
-> A Method must be declared within a class. 
-> You defined with a name followed by parantheses ().


Syntax:-
-----------
return_type methodName() {
    // statement | code to be executed
}



For example,

public void greet() {
    // code to greet the user
}



===========================================
2. Why Use Methods?

Reuse Code: Methods allow you to define a piece of code once and use it multiple times. 
Imagine writing a greeting function—you wouldn’t want to type out “Hello, nice to meet you!” every time you meet someone, right? Methods save you from that repetition.

Modularity: By breaking down complex tasks into smaller methods, your code becomes more organized and easier to manage.



3. Method Types:

Instance Methods: 
These belong to an object of a class. You’ll learn more about objects and how to access instance methods through them.

Static Methods: These belong to the class itself, not any specific object. They’re like global helpers that don’t need an instance.

Abstract Methods: These are declared in an interface or an abstract class but don’t have a body. 
Concrete classes that implement the interface or extend the abstract class must provide the actual implementation.


4. Method Signature:
The method signature includes the method name and its parameters (if any). For example, public void greet(String name) has the method name “greet” and a single parameter of type String.


5. Return Type:
Methods can return values (or nothing). The void keyword means the method doesn’t return anything. If it does, you specify the data type of the return value.


6. Calling a Method:
To call a method, use its name followed by parentheses (). For instance:


public static void main(String[] args) {
    greet(); // Calling the greet method
}


7. Example:



public class Main {
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        myMethod(); // Outputs: "I just got executed!"
    }
}



8. Multiple Calls:
You can call a method as many times as you like:
Java

public class Main {
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
    }
}
// Outputs:
// I just got executed!
// I just got executed!
// I just got executed!

*/


package methodpractice;


public class Methods {
    static void myMethod() {
        System.out.println("I just got executed!");
    }
    
    public static void main(String[] args) {
        myMethod();     // Output: "I just got executed!"
        myMethod();     // Output: "I just got executed!"
        myMethod();     // Output: "I just got executed!"
    }

}







/*

public class Methods {
    static void myMethod() {
        System.out.println("I just got executed!");
    }
    
    public static void main(String[] args) {
        myMethod();     // Output: "I just got executed!"
    }

}

*/



/*
Output:-
------------
I just got executed!



I just got executed!
I just got executed!
I just got executed!


*/