/*
Writting our own exception class:-
------------------------------------

Note: when we write our own Exception class then class should be inherited (extends) from the Exception
*/


package pkg18.exception.handling;

// Writting our own exception class
class NegativeDimensionException extends Exception {
    
    @Override
    public String toString() {
        return "Dimension of length or breadth should not be negative";
    }
    
}

public class WrittingOurOwnExceptionClassDemo {
    
    static int area(int l, int b) throws NegativeDimensionException {
        if(l < 0 || b < 0) {
            throw new NegativeDimensionException();
        }
        return l * b;
    }
    
    static void meth1() throws NegativeDimensionException {
        System.out.println("Area is : " + area(-10, 5));
    }
    
    public static void main(String[] args) {
        
        try {
            meth1();
        } catch(NegativeDimensionException e) {
            System.out.println(e);          // 
        }
        
    }
}


/*
Output:-
-----------
Dimension of length or breadth should not be negative




*/