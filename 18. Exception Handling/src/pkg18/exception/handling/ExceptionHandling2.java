/*
Exception handling using try and catch block:- 
---------------------------------------------------
WAP a Program for the exception handling, when denominator will be zero then this exception is generated.



Example 1. Division by zero exception.


*/


package pkg18.exception.handling;


public class ExceptionHandling2 {
    public static void main(String[] args) {
        
        // Handling the exception using the try and catch block
        try {
            int a, b, c;
            a = 10;
            b = 0;
            c = a / b;
            System.out.println("Result is " + c);
        } catch(ArithmeticException e) {
            System.out.println("Divisible by zero " + e);
        }
                
    }
}


/*
Output:-
-----------
Divisible by zero



Divisible by zero java.lang.ArithmeticException: / by zero


*/
