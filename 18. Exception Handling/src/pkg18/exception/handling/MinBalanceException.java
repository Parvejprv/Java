/*
How to write our own exception class:-
===========================================
- An Exception class must inherited the Exception.
- 


*/



package pkg18.exception.handling;

// Defining our own exception class
class LowBalanceException extends Exception {
    @Override
    public String toString() {
        return "Balance should not be 5000";
    }
}

public class MinBalanceException extends Exception {
    
    static void fun1() {
        try{
            throw new LowBalanceException();
        } catch(LowBalanceException e) {
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
------------
Balance should not be 5000

*/