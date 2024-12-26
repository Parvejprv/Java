/*
Finally Block:-
-----------------
Finally block will definitely get executed , if there is any exception or there is no exception.


*/


package pkg18.exception.handling;


public class FinallyBlockDemo {
    public static void main(String[] args) {

        
        // We will also use a catch block and handle the catch block exception
        // Finally block code will  definitely get executed if there is any excetpion or there is no exception. We can also use the try and finally block
        try {
            System.out.println(10/0);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        /*
        
        finally {
            System.out.println("Final Message");
        }
        
        */
        
        // We can also print the statement at the end without using the finally block
        System.out.println("welcome to the Java Learning!");
        
        
        
        /*
        // without catching the catch block, we can also use finally block direclty
        // Finally block statement, definitely get executed if there is any excetpion or there is no exception. We can also use the try and finally block
        try {
            System.out.println(10/0);
        }
        finally {
            System.out.println("Final Message");
        }
        
        
        */
        
        
        
        
        /*
            // if there is no exception
            System.out.println(10/5);
            System.out.println("Final Message");
        
        */
    }
}




/*
Output:-
-----------
2
Final Message






java.lang.ArithmeticException: / by zero
Final Message





java.lang.ArithmeticException: / by zero
welcome to the Java Learning!
*/




