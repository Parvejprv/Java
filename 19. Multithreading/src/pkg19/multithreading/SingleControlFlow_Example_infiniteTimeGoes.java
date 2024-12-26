/*
Single threaded program 
------------------------------ 
here is the single threaded program that runs till the infinite loop, but it will 

But here statements from the display will only executes, control never goes for the next line of code inside the main() method



*/
package pkg19.multithreading;

public class SingleControlFlow_Example_infiniteTimeGoes {
    
    static void display() {
        int i = 1;
        while(true) {
            System.out.println(i +" Hello");
            i++;
        }
    }
    
    public static void main(String[] args) {
        
        // display() method call
        display();
        
        int i = 1; 
        while(true) {
            System.out.println(i + "world!");
            i++;
        }
    }
}


/*
Output:-
---------

*/