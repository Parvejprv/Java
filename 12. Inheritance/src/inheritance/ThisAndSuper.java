/*
This and Super Keyword:-
-------------------------
this keyword is used to point the current object within the class.



*/


package inheritance;

class Rectangle {
    public int length;
    public int breadth;
    
    // Default Constructor
    public Rectangle() {
        length = breadth = 1;
    }
    
    
    // if property name different from the parameter list, then there is no issue 
    /*
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    */
    
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    
    // Display method 
    public void display() {
        System.out.println("display() meth from Rectangle class.");
        System.out.println("length = " + this.length);
        System.out.println("breadth = " + this.breadth);
    }
    
}

public class ThisAndSuper {
    
    public static void main(String[] args) {
        
        // Create an object of the Rectangle class
        Rectangle r1 = new Rectangle(10, 5);
        r1.display();
        
        
        
        
        
        // Create another object of the Rectangle class
        Rectangle r2 = new Rectangle(20, 10);
        r2.display();
        
        
        
    }
    
}

/*
Output:-
----------
display() meth from Rectangle class.
length = 10
breadth = 5
display() meth from Rectangle class.
length = 20
breadth = 10


*/