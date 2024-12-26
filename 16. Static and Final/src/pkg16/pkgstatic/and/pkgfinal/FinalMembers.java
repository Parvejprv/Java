/*
Final Keyword:-
----------------------
Final Keyword is used to declare as of final, if we want that method of member must run.
- It is used as constant.


Final Keyword can be used as three types:-
-------------------------------------------
- Final Variable
- Final Method
- Final Class





1. Final Variables:
When you declare a variable as final, you’re essentially saying, “Hey, buddy, this value is set in stone. Don’t even think about changing it!”
These final variables are like constants—they can’t be modified once initialized.

- A Final Variable can not be modified, it is acting just like a constant.
- Final variable can be written in capital letter
- Here are the way of initializing final variable, final variable can not be modified, once it get initialized.

There are three way of initialising the final variable in java-
1). direct initialization
2). inside a static block
3). inside a constructor


    Ex-
    
    class My {
    
        final int MIN = 1;
        final int NORMAL;
        final int MAX;

        static {
            NORMAL = 5;
        }

        My (MAX = 10) {

        }
    
    }




For example, imagine we’re dealing with the magical number π (pi). We’d declare it as a final double:

public class ConstantExample {
    public static void main(String[] args) {
        final double PI = 3.14159;
        System.out.println("Value of PI: " + PI);
    }
}






2. Here are the diffrents flavour of final variables-
Different Flavors of final Variables:- 
---------------------------------------

1. Regular final Variable:
This one’s straightforward. You declare it, initialize it, and it stays put:

2. final int THRESHOLD = 5;
AI-generated code. Review and use carefully. More info on FAQ.
Blank final Variable:
A bit mysterious, like a locked treasure chest waiting for its secret code.
You declare it without an initial value, but you must assign it in the constructor:

3. final int THRESHOLD;
// ... constructor sets THRESHOLD value
AI-generated code. Review and use carefully. More info on FAQ.

4. Static final Variable:
A global constant that doesn’t change across instances of a class:

static final double PI = 3.141592653589793;


5. Final Methods:
When you mark a method as final, it’s like saying, “Nope, subclasses, you can’t mess with my method implementation!”
Useful for protecting critical methods in a class’s public API.
Subclasses can’t override a final method.

- If a method is declared as final it can not be overrided.





6. Final Classes:
These classes are like the Mona Lisa—beautiful, unmodifiable, and not to be tampered with.
When you declare a class as final, it can’t be extended by any other class.
Useful for utility classes or when you want to prevent inheritance.
- If a class is declared as final it can not be inherited from another class.





NOTE: Final variables in Java is written as naming convention as in Capital.

*/



// Final class

package pkg16.pkgstatic.and.pkgfinal;

final class Parent {
    final void meth1() {
        System.out.println("meth1() from Parent");
    }
}

// final class can not be inherited from other classes
//class Child extends Parent {
//    // final method can not be overrided
//    void meth1() {
//        System.out.println("meth1() from Child.");
//    }
//}

public class FinalMembers {
    
    public static void main(String[] args) {
        
        
    }
    
}



























// Final Method Example:-

/*

package pkg16.pkgstatic.and.pkgfinal;

class Parent {
    final void meth1() {
        System.out.println("Hello");
    }
}

class Child extends Parent {
    
    
//    @Override
//    void meth1() {      // final method can not be override    
//        System.out.println("Hi");
//    }
    
    
    void meth2() {
        System.out.println("Bye");
    }
}


public class FinalMembers {
    
    public static void main(String[] args) {
        
        Child c = new Child(); 
//        sb.meth1();
        c.meth2();
        
    }
}

*/












/*
Output:-
---------
Bye

*/