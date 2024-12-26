/*
Interfaces Do's and Don't
==========================
- If a identifier is declared inside the interface, identifier name should be in capital letter.
- It has by default as static and final.
- we can not allowed to write a method with the body, without static keyword.
- It Only allowed a static method.
- interfaces can be extended.

*/
package pkg14.interfaces;

interface Test {
    final static int X = 10; // It has by default static and final
    public abstract void meth1();   // abstract method
    public abstract void meth2();   // abstract method
    
    // an interface allow the static method
    default void meth3() {
        System.out.println("Meth3 of Test");
    }
}
interface Test2 extends  Test {
    void meth4();
}

class My implements Test2 {
    // Override all the method that is extended or inherited by the Super class
    @Override
    public void meth1() {}
    @Override
    public void meth2() {}
    @Override
    public void meth4() {}
}

public class InterfacesDoAndDont {
    public static void main(String[] args) {
        System.out.println("Identifier X : " + Test.X);
        System.out.println("");
        
        
        My m = new My();
        m.meth3();      // Meth3 of Test
        
    }
}

/*
Output:-
----------
Identifier X : 10

Meth3 of Test

*/



