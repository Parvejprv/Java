/*
Interfaces in Java:-
------------------------

Interfaces:-
---------------


1). What is an interface?
2). Multiple Inheritance vs Interfaces
3). Example of Interfaces
4). Do's and Don't for Interfaces



1). What is an interface?
----------------------------
14. Interfaces 
- Interfaces are completely used for achieving polymorphism. If we want to use only polymorphism we don't want to borrow anything then we use interfaces.
- Interfaces can be implemented whereas classes can be extended.
- In Interface we use keyword interface to implement a class, and all the methods that are written inside the interfaces are by default abstract and public. So no need to write the abstract for that.


- There is a very important point that we have to keep in mind is that Java doesn't support multiple inheritance. At the place of the multiple inheritance they introduced a new thing that is Interfaces.
- A class can be extended or inherited from a single class only but an interface can be implemented from multiple classes.
- Interface is used to achieve the polymorphism.





-------------------------------------------------------------
Note: Classes are extended, but Interfaces are implemented.
-------------------------------------------------------------
- In Java When we say extends, a class can extends from only one class, but using interfaces a class can be implemented an interfaces from the multiple classes.
*/
package pkg14.interfaces;



// Interfaces
interface Test1 {
    void meth1();
    void meth2();
}
class Test2 implements Test1 {
    @Override
    public void meth1(){
        System.out.println("meth1() from Test2, using interface.");
    }
    @Override
    public void meth2(){
        System.out.println("meth2() from Test2, using interface.");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        // here having the reference of the Super class "Test1" and creating an object of the Sub class "Test2".
        Test1 t = new Test2();
        t.meth1();
        t.meth2();
    }
}

/*
Output:-
----------
meth1() from Test2, using interface.
meth2() from Test2, using interface.

*/



















// Abstract class
/*
Topic that we gonna cover in this part:-
-------------------------------------------
1. What is an interface?
2. Multiple Inheritance vs Interface
3. Example of Interface
4. Do's and Don't for Intefaces
 */



/*
//Now, At the place of writing the abstract class we can create an interface,

abstract class Test1 {
    abstract void meth1();      // abstract method meth1()
    abstract void meth2();      // abstract method meth1()
}
class Test2 extends Test1 {     // Now, after overriding all the method of the abstract class, Sub class would be the concrete class.
    @Override
    public void meth1() {
        System.out.println("Meth1 for Test2");
    }
    @Override
    public void meth2() {
        System.out.println("Meth2 for Test2");
    }
}


public class Interfaces {

    public static void main(String[] args) {
        // Create an object of the Sub class
        Test1  t = new Test2();
        t.meth1();
        t.meth2();
        
    }
}

*/






/*
Output:-
-----------
Meth1 for Test2
Meth2 for Test2




*/