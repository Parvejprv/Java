/*
 this vs super:-
--------------------
- this keyword is used to refer the current object, within the same class.



this Keyword:
The this keyword is like a mirror—it reflects the current object (instance) within a class. Here’s what it does:
Refers to the Current Object:
When you’re inside an instance method, this refers to the object on which that method was called.
It’s particularly useful when you want to access instance variables or call other methods within the same class.
Used for Constructor Chaining:
In constructors, this can be used to call another constructor within the same class.
This allows constructor chaining, where one constructor sets up common behavior and then delegates to another constructor.
Clarifies Ambiguity:
When a local variable shadows an instance variable, this helps differentiate between them.


For example:

class MyClass {
    private int x;

    public void setX(int x) {
        this.x = x; // Refers to the instance variable
    }
}








super Keyword:
The super keyword is like a bridge—it connects you to the superclass (parent class). Here’s what it does:

Accesses Superclass Members:
- You can use super to access superclass instance variables, methods, or constructors.
- It’s handy when you want to avoid ambiguity (e.g., when subclass and superclass have methods with the same name).

Invokes Superclass Constructors:
- In a subclass constructor, you can use super to call a constructor from the superclass.
- This ensures that superclass initialization happens before subclass-specific logic.

Navigates Up the Inheritance Hierarchy:
- If you override a method in a subclass, super lets you invoke the superclass version of that method.
- Useful when you want to extend existing behavior rather than replace it entirely.



For Example:

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        super.makeSound(); // Calls the superclass method
        System.out.println("Dog barks");
    }
}
















*/
package pkg12.inheritance;

class Rectangle {
    int length;
    int breadth;
    
    // constructor parameterized
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    void display() {
        System.out.println("Length : " + this.length);
        System.out.println("Breadth : " + this.breadth);
    }
}

public class thisVsSuper {
    public static void main(String[] args) {
        
        // Create an object of the Rectangle class
        Rectangle r1 = new Rectangle(10, 5);
        r1.display();
        
        Rectangle r2 = new Rectangle(100, 50);
        r2.display();
        
    }
}



/*
Output:-
--------
Length : 10
Breadth : 5
Length : 100
Breadth : 50

*/