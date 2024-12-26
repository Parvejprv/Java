/*
Constructors in Inheritance:-
---------------------------------


*/
package pkg12.inheritance;

class Parent {
    public Parent() {
        System.out.println("Parent Constructor");
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

public class CosntructorsInInheritance {
    public static void main(String[] args) {
        GrandChild c = new GrandChild();
        
    }
}


/*
Output:-
---------
// creating a object of the Child class
------------------------------------------
Parent Constructor
Child Constructor


// creating a object of the GrandChild class
------------------------------------------
Parent Constructor
Child Constructor
GrandChild Constructor

*/


