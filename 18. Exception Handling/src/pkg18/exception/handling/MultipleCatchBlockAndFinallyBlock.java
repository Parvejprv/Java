/*
Multiple catch block and finally block:-
--------------------------------------------

If In a program there is multiple exception occurs and we use the multiple catch block for handling each using a seperate catch block then this is called multiple catch block.

Syntax:
---------

try {
    // statement 1
    // statement 2
    // statement 3
}
catch(..Exception1.) {
    // catch-statements1
    // catch-statements2
}
catch(..Exception2.) {
    // catch-statements1
    // catch-statements2
}




*/
package pkg18.exception.handling;


public class MultipleCatchBlockAndFinallyBlock {
    
    public static void main(String[] args) {
         
        try {
            int A[] = {10, 0, 8, 3, 5};
            int r;
            r = A[0]/A[1];          // 10/0 = infinite (This line thrown an exception, divisible by zero exception)
            
//            r = A[0]/A[3];          // 10/8 = infinite (divisible by zero exception)
            System.out.println("Result r = "+ r);
            System.out.println(A[10]);
        } catch (ArithmeticException e) {
            System.out.println("Divisible by zero " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds for length 5 " + e);
        } 
//      //  Note- Finally block must be exceute at the end of the program either the exception occurs or not
//        finally {
//            System.out.println("I hope you'll enjoy 'exception handling' :)");
//        }
        
        
        // at the end 
        System.out.println("Program end here....");
        
    }
}





/*
Output:-
------------
Divisible by zero java.lang.ArithmeticException: / by zero
Program end here....




Result r = 3
Array index out of bounds for length 5 java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
I hope you'll enjoy 'exception handling' :)

*/