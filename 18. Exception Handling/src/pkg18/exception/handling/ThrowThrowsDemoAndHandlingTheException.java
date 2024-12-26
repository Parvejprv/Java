/*
Throw VS Thorws Demo and Exception handling;-
================================================




- Let's handle the exception that is arises into the meth1 but we are handling that exception in main method, 
it is okay we can handle the exception any of the method where it causes the exception.


*/


package pkg18.exception.handling;


public class ThrowThrowsDemoAndHandlingTheException {
    static int meth1(int a, int b) throws Exception {
        int c = a / b;
        return c;
    }
    
    static void meth2() throws Exception {
        meth1(10, 0);
    }
    
    static void meth3() throws Exception {
        meth2();
    }
    
    public static void main(String[] args) throws Exception {
        
        // If no Exception is handle earlier, the easy way to deal with exception to throws and exception from the method
        meth3();
        
        
        
        /*
            try {
                meth3();
            } catch(Exception e){
                System.out.println(e);
            }
        */
        
    }
}




















/*

public class ThrowThrowsDemoAndHandlingTheException {
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
        try {
            meth3();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}

*/




/*
Output:-
------------
java.lang.ArithmeticException: / by zero





*/


