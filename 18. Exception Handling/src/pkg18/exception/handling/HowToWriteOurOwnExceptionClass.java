/*
How to Write our own exception class:
---------------------------------------
- Exception class must be inherited from the Exception class.

Syntax:
class yourExceptionClassName extends Exception {
    // here methods goes
}

*/


package pkg18.exception.handling;

class MinBalanceException extends Exception {
    public String toString() {
        return "Balance should not be less than 5000.";
    }
}


public class HowToWriteOurOwnExceptionClass {
    static void fun1() {
        try {
            throw new MinBalanceException();
        } catch(MinBalanceException e) {
            System.out.println(e);
        }
    }
    
    static void fun2() {
        fun1();
    }
    
    static void fun3() {
        fun2();
    }
    
    public static void main(String[] args) {
        fun3();
    }
    
}



/*
Output:-
==========
Balance should not be less than 5000.

*/