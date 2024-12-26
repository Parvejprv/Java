/*
  Nested Try and catch block :-
-------------------------------------
if we write one try-catch block inside another try-catch block then that statement or program will be the nested try and catch block.

syntax:
---------
try {
    .......
    try {

    } catch (...) {
        ......
        ......
    }
    .......

} catch (...) {
    ......
    ......
}





*/



package pkg18.exception.handling;

/**
 *
 * @author parve
 */
public class NestedTryAndCatchBlock {
    public static void main(String[] args) {
        
        // Nested try and catch block , at the place of using the multiple try-catch 
        
        // Outer try-catch
        try {
            int A[] = {10, 0, 8, 3, 5};
            // Inner try-catch
            try{
                int r = A[0]/A[1];
                System.out.println(r);
            } catch(ArithmeticException e) {
                System.out.println("Division by zero " + e);
            }
   
            System.out.println(A[10]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception " + e);
        }
        
    }
}




/*
Output:-
-----------
Division by zero java.lang.ArithmeticException: / by zero
Array index out of bounds exception java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5


*/

