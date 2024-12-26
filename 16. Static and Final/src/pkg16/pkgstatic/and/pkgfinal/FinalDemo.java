/*
Final Member in Java:-
-------------------------
- final in Java act like a constant

- Final Variable
- Final Methods
- Final Class




Note:- 
- Final Variable can not be modified.
- Final Method can not be overrided.
- Final class can not be inherited from its sub-class.

*/
package pkg16.pkgstatic.and.pkgfinal;

class Test {
    public final void show() {
       System.out.println("Show meth from Test");
    }
}
// We can not override the method that is written as final and we can not extends the class also that is written as final
class Test3 extends Test {
    // Here we are try to override the method that is not allowed when we declare the method as final. 
//    public void show() {
//        System.out.println("Show METHOD from the class Test3");
//    }
}



public class FinalDemo {
    // non-static member can not be reference from the static method
    static final float PI = 3.14562f;
    
    // We can also initialize them inside the constructor
//    public FinalDemo() {
//       final float PI = 3.14562f;
//    }
  
    
    public static void main(String[] args) {
//        final float PI;
//        PI = 3.1452f;
        System.out.println(PI);
    }
}



/*
Output:-
------------
3.1452

*/
