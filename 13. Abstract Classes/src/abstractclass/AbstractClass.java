/*

Topic:
---------

Abstract class in Java
===========================

1). What ia an abstract class
2). Example of Abstract class
3). Why Abstract class
4). Key Points




Abstract class:
-------------------
- A class that is declared using the abstract keyword is known as abstract class.
- Abstract class must have atleast one abstract method, 
it means abstract method is the method that is also declared using the abstract keyword and haven't body is known as abstract method.
- We can not create the object of the abstract class, we can only create the object of the concrete class only.
- Reference of the abstract class can be created, it means it is allowed to create the reference of the abstract class.




Note:- 
1. If a class having atleast one abstract method is known as abtract class, ans it object can not be created.
2. An abstract method that is also declared using the abstract keyword and it is the method which does not have body.

    abstract void methodName() {};

3. Abstract class can have the abstract and concrete method both.
4. If a sub class inherited from its parent class (it also an abtract class) then sub class also would be the abstract class.
5. To become a concrete class, it (sub class) must override all the abtract methods of the parent class.



*/


package abstractclass;

/* 
- A class that is declared using the abstract keyword is known as abstract class.
- If a class having atleast one abstract method, then class would be also abstract class, and abstract class object cannot be created.
- If a Super class extends the abstract class, then Sub class also would be abstract class. To Become it concrete class, all the abstract methods should be overrided.

*/

abstract class Super1 {
    public Super1() {
        System.out.println("Super1 Constructor");
    }
    
    public void meth1() {
        System.out.println("Super1 meth1()");
    }
    
    // abstract method
    abstract public void meth2();
}

class Sub1 extends Super1 {     // I Override the Super class abstract method so that this class is now a concrete class.
//    public Sub1() {
//        System.out.println("Sub1 Constructor");
//    }
//    
    @Override
    public void meth2() {
        System.out.println("Sub1 meth2()");
    }
}



public class AbstractClass {
    
    public static void main(String[] args) {
       
        // Super1  sup = new Super1();         // Here we can not create an object of the Abstract class, getting as - Super is an abstract we can not intantiated
        
        Super1 s1;          // Here we can create only reference of an abstract class
        
        
        // We can create, reference of the Super1 class and object of the Sub1 class
        s1 = new Sub1(); 
        s1.meth1();
        s1.meth2();
        
        
        
        
        
        
        // Sub1 sb1 = new Sub1();
        // sb1.meth1();
        // sb1.meth2();
       




    }
    
}



/*
Output:-
----------
Note:-
---------
- Here meth1() get inherited from the Super class, and meth2() will be overrided



Super1 Constructor
Super1 meth1()
Sub1 meth2()


*/