/*
Throw vs Throws Demo:
------------------------


*/
package pkg18.exception.handling;


public class ThrowThrowsDemo {
    static int meth1(int a, int b) {
        int c = a / b;
        return c;
    }
    
    static void meth2() {
        meth1(10, 0);
    }
    
    static void meth3() {
        meth2();
    }
    
    public static void main(String[] args) {
        meth3();
    }
}


/*
Output:-
---------
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at pkg18.exception.handling.ThrowThrowsDemo.meth1(ThrowThrowsDemo.java:12)
	at pkg18.exception.handling.ThrowThrowsDemo.meth2(ThrowThrowsDemo.java:17)
	at pkg18.exception.handling.ThrowThrowsDemo.meth3(ThrowThrowsDemo.java:21)
	at pkg18.exception.handling.ThrowThrowsDemo.main(ThrowThrowsDemo.java:25)
C:\Users\parve\AppData\Local\NetBeans\Cache\22\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\parve\AppData\Local\NetBeans\Cache\22\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 0 seconds)

*/



/*
Note:-
========
Here exception occurs at inside the method1 but it is not handled here so that it goes to the method2 and here also it is not handled, similarily for method3 and goes to main but it does not handle there as well so that the program get crashed by the JVM itself.



*/

