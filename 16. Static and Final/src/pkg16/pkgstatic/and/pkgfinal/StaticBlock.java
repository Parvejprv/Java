/*
Static Block :-
------------------
- Static block code get executed when the class is loaded.
- Static block get execute in which order it defines.
- It can be defined as:
    static {
        // static block code statements here
    }


*/
package pkg16.pkgstatic.and.pkgfinal;

class Test {
    static int s;
    
    static {
        System.out.println("Block 1");
//        s = 10;
    }
    static {
        System.out.println("Block 2");
    }
}

public class StaticBlock {
    // firts it get exceute the static block code then it gonna execute the next statements, static block is get executed when a class is loaded
    static {
        System.out.println("This is the static block 1");
    }
    
    public static void main(String[] args) {
        System.out.println("Main");
    }
    
    static {
        System.out.println("This is the static block 2");
    }
    
    
    
    
    
    
    
    
    
    
  
//    public static void main(String[] args) {
//        Test t = new Test();
//        
//        System.out.println("Main");
//        
//    }
//    
}




/*
Output:-
-----------
This is the static block 1
This is the static block 2
Main



Block 1
Block 2
Main

*/

