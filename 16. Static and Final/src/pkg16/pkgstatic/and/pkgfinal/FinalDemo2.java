/*
Final Member in Java:-
-------------------------
- final in Java act like a constant, we can not modified once we declared the member as final.


- Final Variable
- Final Methods
- Final Class




Note:- 
- Final Variable can not be modified.
- Final Method can not be overrided.
- Final class can not be inherited from its sub-class.


There are three way of initializing the final variable:-

i). Direct initialization
ii). Inside instance block
iii). Inside static block




i). Direct initialization

Ex-
public class FinalDemo2 {
    
    final float PI = 3.1452f;
    
    public static void main(String[] args) {
        
    }
}



ii). Inside instance block



iii). Inside static block




*/



package pkg16.pkgstatic.and.pkgfinal;

public class FinalDemo2 {
    
    // Final Variable initialization (direct initialization)
//    final float PI = 3.1452f;
    
    
    

//    final float PI;
//    // Final Variable initialization using instance block
//    {
//        PI = 3.1452f;
//    }
    
    
    
    // Inside a static block, if final member is static
    static float PI;
    
    static  {
        PI = 3.1452f;
    }

    
    
    public static void main(String[] args) {
        FinalDemo2 f = new FinalDemo2();        // Create an object of the FinalDemo2() class
        
        System.out.println("PI = " + f.PI);
    }
}


/*
Output:-
----------
PI = 3.1452



*/
