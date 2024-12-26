/*
Let revise the previously what we have learnt-
----------------------------------------------------
- inheritance




Note: 
- Here class Test1 is an abstract class, because it has abstract method inside it.
- And class Test2 extends Test1 it means class Test2 inherit the class Test1, 
to make this as an concrete class we must have to override the method that are present inside the abstract class otherwise,
class Test2 also would be an abstract class.




point to be noted:-
----------------------
1). An Interfaces can be implemented but a class can be extended.
2). An Interface has by default has public & abstract method inside it no need to use keyword abstract.


    Ex-

    interface Test1 {
        void meth1();
        void meth2();
    }






*/





// Note - the thing that we can do using the inheritance we can also do it using the interfaces.




/* Interfaces */

package pkg14.interfaces.inheritance;

interface Test1 {
    void meth1();
    void meth2();
}

class Test2 implements Test1 {
    @Override
    public void meth1() {
        System.out.println("meth1() from Test2 from an Interface");
    }
    
    @Override
    public void meth2() {
        System.out.println("meth2() from Test2 from an Interface");
    }
}

public class LetRevisePreviouslyWhatWeLearn {
    public static void main(String[] args) {
        
        Test1 t = new Test2();
        t.meth1();
        t.meth2();
        
        
        
    }
}


/*
Output:-
---------
meth1() from Test2 from an Interface
meth2() from Test2 from an Interface

*/











































































/* Inheritance */


/*

package pkg14.interfaces.inheritance;

abstract class Test1 {
    abstract public void meth1();
    abstract public void meth2();
}

class Test2 extends Test1 {
    @Override
    public void meth1() {
        System.out.println("meth1() from Test2");
    }
    @Override
    public void meth2() {
        System.out.println("meth1() from Test2");
    }
}

public class LetRevisePreviouslyWhatWeLearn {
    public static void main(String[] args) {
        
          // We can create the reference and Object of the Sub class
//        Test2 t2 = new Test2();
//        t2.meth1();
//        t2.meth2();
        
        
        
        
        // Can we have a Super class reference and object of the Sub class, Yes we can have it,
        
        Test1 t = new Test2();      
        t.meth1();
        t.meth2();
        
    }
}


*/











/*
Output:-
------------
meth1() from Test2
meth1() from Test2


meth1() from Test2
meth1() from Test2



*/