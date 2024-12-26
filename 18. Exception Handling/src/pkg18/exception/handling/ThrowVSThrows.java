/*
Throw VS Throws :- 
=====================
Throw:
--------
Throw keyword is used to throw an exception where as Throws keyword is used to defining that be careful this method is throwing an exception. it is defining it inside the head.



Note:
1). here inside meth2 causing an exception and it is not handle inside this, that means exception is passed or raised to the calling method i.e meth1,
And here also inside meth2 it does not have the exception  handle by the meth2 so it got passed to the calling method i.e. meth1, and if it does not handle here it got passed to the calling method which is main.

2). If a method causing and exception and I don't want to write the exception handling for that i.e. I don't wanna to handle then throws Exception
The easy method is Throw it further.

*/




package pkg18.exception.handling;

public class ThrowVSThrows {
    // Note: here I don't want to handle the exception into the area method then I thrwos the exception further
    static int area(int l, int b) throws Exception {
        
        if(l < 0 || b < 0) {
            throw new Exception("Length or breadth should not be negative.");
        }
        int area = l * b;
        return area;
    } 
    
    // Let suppose here I also don't want to handle the exception then easy ways for that throws exception
    static void meth1() throws Exception {
        // call the area() method 
        int a = area(-10, 5);
        System.out.println(a);
        
        /*
        
        try{
        int a = area(-10, 5);
        System.out.println(a);
        } catch(Exception e) {
            System.out.println("Length or breadth should not be negative.");
        }
        
        */
    }
    
    public static void main(String[] args) throws Exception {
        
        // Let suppose I also don't want to handle the exception here, then throws exception from here as well.
        
        meth1();
        
        
        /*
        
        // Handling the exception using try and catch block
        try {
            meth1();
        } catch (Exception e) {
            System.out.println("Length and breadth cannot be negative.");
        }
        
        */
    }
}


/*
Output:-
------------
Length and breadth cannot be negative.







Exception in thread "main" java.lang.Exception: Length or breadth should not be negative.
	at pkg18.exception.handling.ThrowVSThrows.area(ThrowVSThrows.java:29)
	at pkg18.exception.handling.ThrowVSThrows.meth1(ThrowVSThrows.java:38)
	at pkg18.exception.handling.ThrowVSThrows.main(ThrowVSThrows.java:57)
C:\Users\parve\AppData\Local\NetBeans\Cache\22\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\parve\AppData\Local\NetBeans\Cache\22\executor-snippets\run.xml:68: Java returned: 1



*/























/*
package pkg18.exception.handling;

public class ThrowVSThrows {
    static int area(int l, int b) throws Exception {
        
        if(l < 0 || b < 0) {
            throw new Exception("Length or breadth should not be negative.");
        }
        int area = l * b;
        return area;
    } 
    
    static void meth1() {
        try{
        int a = area(-10, 5);
        System.out.println(a);
        } catch(Exception e) {
            System.out.println("Length or breadth should not be negative.");
        }
    }
    
    public static void main(String[] args) {
        meth1();
    }
}

*/


/*

(With throwable class and exception handling).
Output:- 
----------
Length or breadth should not be negative.



*/




















/*


package pkg18.exception.handling;

public class ThrowVSThrows {
    static int meth2(int a, int b){
        int c;
        
        c = a/b;        // This line causing an exception, ArithmeticException for division by zero exception.
        return c;
    }
    
    static void meth1() {
        int r = meth2(10, 0);
        System.out.println(r);
    }
    
    public static void main(String[] args) {
        meth1();
    }
}


*/



/*
Output:-
-----------
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at pkg18.exception.handling.ThrowVSThrows.meth2(ThrowVSThrows.java:23)
	at pkg18.exception.handling.ThrowVSThrows.meth1(ThrowVSThrows.java:28)
	at pkg18.exception.handling.ThrowVSThrows.main(ThrowVSThrows.java:33)
C:\Users\parve\AppData\Local\NetBeans\Cache\22\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\parve\AppData\Local\NetBeans\Cache\22\executor-snippets\run.xml:68: Java returned: 1




*/