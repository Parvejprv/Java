/*
 Final Keyword:-
---------------------
- A class that is declared using the keyword final is known as final class.
- A Final class can not be extended the means it can not be inherited.
- We can create the object of the final class only but we can not extends that class to a child class.


*/


package pkg16.pkgstatic.and.pkgfinal;

final class FinalClassDemo {
   void method1() {
       System.out.println("Final class method from class 'FinalClassDemo'.");
   }
}

// Now, a very important point about the final class is that we can not inherit it from another class but we can create an objec of that class and we may use it-
//class Sub extends FinalClassDemo{
//    void meth2() {
//        System.out.println("Hello from the Final class Demo from meth2()");
//    }
//}



public class FinalClass {
    public static void main(String[] args) {
        FinalClassDemo fd = new FinalClassDemo();
        fd.method1();
        
    }
}



/*
Output:-
---------
Final class method from class 'FinalClassDemo'.
*/