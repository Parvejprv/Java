/*
Constructor in Java
=========================
Inheritance and constructor in Java
--------------------------------------


Constructor in Java:
---------------------
- A Constructor is also a special type of method of the class that does has same name as the class name. 
- Constructor get called automatically when an object of a class is created.
- It does not have any return type, we could not even return as void here because it deos not has any return type.
- It is by default public, it could be private as well.
- Each java class has default Constructor, If we use our constructor then it will use and default will removed automatically. Default Constructor is provided by the JVM.
- Constructor can be parameterized and non-parameterized both.
- Like method can be overloaded similarily Constructor can be also overloaded.


Sytanx:

class Parent {
    public Parent() {
        System.out.println("Parent Constructor");
    }
}




 
*/

package inheritance;

class Parent {
    
    public Parent() {
        System.out.println("Parent Constructor");
    }
    
    public void meth1() {
        System.out.println("meth1() from parent class.");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child {
    public GrandChild() {
        System.out.println("GrandChild Constructor");
    }
}

public class InheritConstructor {
    
    public static void main(String[] args) {
        
//        GrandChild ch = new GrandChild();
        
//        Child ch = new Child();

          Parent p = new Parent();

    }
    
}


/*

Output:-
-----------
// Let create object of the grand child class

Parent Constructor
Child Constructor
GrandChild Constructor


//Child class constructor
Parent Constructor
Child Constructor



//Parent class constructor
Parent Constructor


*/


