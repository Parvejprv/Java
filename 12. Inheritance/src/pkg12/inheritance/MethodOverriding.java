/*
Method Overriding:-
----------------------
- Method Overriding is define as, redefining the method of a super class in a sub class.


// Note: Reference of a Super class holding an object of the Sub class and the method of an object will called, this is called dynamic method dispatch.

*/
package pkg12.inheritance;

class Super{
    void display() {
//        System.out.println("Hello");
        System.out.println("Super class Display");
    }
}
class Sub extends Super{
    @Override
    void display() {
        System.out.println("Sub class Display");
//        System.out.println("Hello! Welcome to Java Learning.");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        
//        // Object of a Sub class and calling a display() 
//        Sub sb = new Sub();
//        sb.display();       // Hello! Welcome to Java Learning.
//        
        
        // Creation of object of Sub class but having the reference of Super class, Method will be called depending upon the object not the reference. (This is called Dynamic method dispatch)
        // Note: Reference of a Super class holding an object of the Sub class and the method of an object will called, this is called dynamic method dispatch.
        Super sup = new Sub();
        sup.display();      // Hello! Welcome to Java Learning.
        
    }
}



/*
Output:-
-----------
Hello! Welcome to Java Learning.
Hello! Welcome to Java Learning.



Super class Display


Sub class Display


*/