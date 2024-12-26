/*
 Using Runnable Interface
==============================


Note: If we are implementing a class we need to override all the method of that class otherwise class would be abstract class
*/

package pkg19.multithreading;

public class Test_UsingRunnableInterface implements Runnable {
    
    // Here we implements this class with an Runnable interface , so that we need to override the method run()
    public void run() {
        int i = 1;
        while(true) {
            System.out.println(i + " Welcome,");
            i++;
        }
    }
    
    public static void main(String args[]) {
        // Create an object of the class
        Test_UsingRunnableInterface t = new Test_UsingRunnableInterface();
        Thread th = new Thread(t);      // Thread class object
        th.start();
        
        int i = 1;
        
        while(true) {
            System.out.println(i + "Happy Java Learning!");
            i++;
        }        
    }
    
}



/*
Output:-
----------
1 Welcome,
2 Welcome,
3 Welcome,
4 Welcome,
5 Welcome,
6 Welcome,
1Happy Java Learning!
2Happy Java Learning!
7 Welcome,
8 Welcome,
9 Welcome

...
..
.
(Loop will runs infinite times)


*/





































/*

// Using a seperate class

// To createa a Thread class, implements a class to Runnable interface
class My implements Runnable {
    public void run() {
        int i = 1;
        
        while(true) {
            System.out.println(i + " Hello Learner!");
            i++;
        }
    }
}


public class Test_UsingRunnableInterface {
    
    public static void main(String[] args) {
        
        // Create an instance of that class
         My m = new My();
         
         // Create an object of the Thread class
         Thread t = new Thread(m);
         t.start();         // to run the thread
         
         int i = 1; 
         
         while(true) {
             System.out.println(i + " Welcome to the Java Learning class.");
             i++;
         }
        
    }
}


*/







/*
Output:-
----------
1 Welcome to the Java Learning class.
2 Welcome to the Java Learning class.
3 Welcome to the Java Learning class.
1 Hello Learner!
2 Hello Learner!
4 Welcome to the Java Learning class.
5 Welcome to the Java Learning class.
6 Welcome to the Java Learning class.
7 Welcome to the Java Learning class.
8 Welcome to the Java Learning class.
9 Welcome to the Java Learning class.
10 Welcome to the Java Learning class.
3 Hello Learner!
4 Hello Learner!
5 Hello Learner!
6 Hello Learner!
11 Welcome to the Java Learning class.
12 Welcome to the Java Learning class.
13 Welcome to the Java Learning class.
14 Welcome to the Java Learning class.
15 Welcome to the Java Learning class.
16 Welcome to the Java Learning class.
17 Welcome to the Java Learning class.
18 Welcome to the Java Learning class.
19 Welcome to the Java Learning class.
20 Welcome to the Java Learning class.
21 Welcome to the Java Learning class.
7 Hello Learner!
8 Hello Learner!
22 Welcome to the Java Learning class.
23 Welcome to the Java Learning class.
24 Welcome to the Java Learning class.
9 Hello Learner!
25 Welcome to the Java Learning class.
26 Welcome to the Java Learning class.
10 Hello Learner!
11 Hello Learner!
12 Hello Learner!
13 Hello Learner!
14 Hello Learner!
15 Hello Learner!



...
..
.
(infinite times)
*/