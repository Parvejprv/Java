/*
Overriding
============



*/


package inheritance;

class Super {
    public void display() {
        System.out.println("Super class Display");
    }
}

class Sub extends Super {
    @Override
    public void display() {
        System.out.println("Sub class Display");
    }
    
//    public void display(int x) {
//        System.out.println("Sub class Display");
//    }
}

public class Overriding {
    public static void main(String[] args) {
        
//        // create an object of the Super class
//        Super sup = new Super();
//        sup.display();              // Super class Display
//        
//        
//        // create an object of the Sub class
//        Sub sb = new Sub();
//        sb.display();               // Sub class Display






    // dynamic method dispatch, If I use reference of the Super class and object of the Sub class
    
    Super supb = new Sub(); 
    supb.display();     // Sub class Display
    
    
    
        
    }
}


/*
Output:-
-------------
Super class Display
Sub class Display


*/