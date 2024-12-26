/*
Topic:
==========
Multiple Inheritance VS Intefaces :-
-----------------------------------
- We can not create an object of the interface class, because it have the abstract methods.
- We can not use the extends keyword here, because interfaces are implemented using the implements keyowrd.




*/


package pkg14.interfaces;

interface Test11 {
    void meth1();
    void meth2();
}
class My implements Test11 {    // because interface also has the abstract method, so that to make the subclass as concrete class, all the abstract method should be overrided.
    @Override
    public void meth1() {
        System.out.println("meth1() of class My, from Interface");
    }
    @Override
    public void meth2() {
        System.out.println("meth2() of class My, from Interface");
    }
    public void meth3() {
        System.out.println("meth3() of class My.");
    }
}

public class MultipleInheritanceAndInterfaces {
    public static void main(String[] args) {
        Test11  t11 = new My();
        t11.meth1();
        t11.meth2();


        System.out.println("\n\n\n");        
        // Create an object of the Sub class
        My t2 = new My();
        t2.meth1();
        t2.meth2();
        t2.meth3();
        
        
        
    }
}


/*
Output:-
--------------
meth1() of class Test12, from Interface
meth2() of class Test12, from Interface


meth1() of class My, from Interface
meth2() of class My, from Interface




meth1() of class My, from Interface
meth2() of class My, from Interface
meth3() of class My.

*/
