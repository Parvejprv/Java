/*
Multi-threading :-
--------------------


How to achieve multi-threading in java?
--------------------------------------------
Ans: here we want to achieve multi threading inside the java. In this program we want that 1 time display will run and 1 time code inside main method should run.


To achieve the multi-threading inside java we need to know about some of the method and class inside java.
1) Thread class - Mechanism is present here.
2) Runnable interface 



Note:-
1). To achieve the multi threading you must need to inherit the Thread class it means you must have to extends your own class with Thread class.
2). If your class is already inherited from another class and you also want to write your multi threading then you must have to implements a runnable interface.

Note: 
--------
Because a class can be inherited from only a single class. and interface can be implemented from multiple classes.

1). A class should be extended from the Thread class.
2). For writting the functionality of a thread you must have to override the run method.

*/
package pkg19.multithreading;


public class Example1_withMultipleThread_TwoFlowOfControl {
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
----------


*/