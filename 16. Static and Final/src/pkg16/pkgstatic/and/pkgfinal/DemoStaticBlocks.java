/*
Static Block Demo:
----------------------
- static block is used to execute the code automatically when it execute.
- When ever the class is loaded these block get automatically executes.


 
*/


package pkg16.pkgstatic.and.pkgfinal;

class Test {
    static {
        System.out.println("Block1");
    }
    static {
        System.out.println("Block2");
    }
}



public class DemoStaticBlocks {
    public static void main(String[] args) {
        
//        Test t = new Test();
//        System.out.println("Main");



        System.out.println("Main");
        Test t = new Test();



//        System.out.println("Main");
        
          

//          Test t = new Test();
        
    }
}


/*
Output:-
------------
Block1
Block2
Main





Main
Block1
Block2






Main




Block1
Block2



*/
























/*

public class DemoStaticBlocks {
    static {
        System.out.println("Block1");
    }
    
    public static void main(String[] args) {
        System.out.println("Main");
    }
    
    static {
        System.out.println("Block2");
    }
}

*/

/*
Output:-
----------
Block1
Block2
Main



*/