/*
Nested Try and catch block:
-----------------------------

*/

package pkg18.exception.handling;


public class NestedTryCatch {
    public static void main(String[] args) {
        
        try {
            int A[] = {30, 20, 10, 40, 0};
            
            int c = A[0]/A[4];
            System.out.println(c);
            
            try {
                System.out.println(A[5]);
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Index is Invalid");
            }
            
        } catch(ArithmeticException e) {
            System.out.println("Denominator should not be zero(0).");
        }
        
        System.out.println("Bye");
    }
}


/*
Output:-
--------
Denominator should not be zero(0).
Bye

*/