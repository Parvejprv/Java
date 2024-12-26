/*
Multi threading (Two control flow) with example:-
---------------------------------------------------

Here is the Example of Multi-threading (with an external and with the same class)






*/


package pkg19.multithreading;

// Instead of using the two different class we can use single class extended with Thread class

public class Test extends Thread {
    
    // To write the Thread class we need to override the run method
    public void run() {
        int i = 1;
        
        while(true) {
            System.out.println(i + " Hello Guys!");
            i++;
        }
    }
    
    public static void main(String[] args) {
        
        // To run the Thread, Create an object of the class
        Test t = new Test();
        t.start();      // to start the Thread class
        
        // Another operation to print the message simultaneouly, so that two thread will run alternatively
        int i = 1; 
        
        while(true) {
            System.out.println(i + " Good morning!");
            i++;
        }     
    }
}

/*
Output:-
--------
run:
1 Hello Guys!
2 Hello Guys!
3 Hello Guys!
4 Hello Guys!
5 Hello Guys!
6 Hello Guys!
7 Hello Guys!
8 Hello Guys!
1 Good morning!
9 Hello Guys!
10 Hello Guys!
11 Hello Guys!
2 Good morning!
3 Good morning!
4 Good morning!
5 Good morning!
6 Good morning!
7 Good morning!
12 Hello Guys!
13 Hello Guys!
14 Hello Guys!
15 Hello Guys!
8 Good morning!
16 Hello Guys!
17 Hello Guys!
18 Hello Guys!
19 Hello Guys!
20 Hello Guys!
21 Hello Guys!
22 Hello Guys!
23 Hello Guys!
24 Hello Guys!
25 Hello Guys!
26 Hello Guys!
27 Hello Guys!
28 Hello Guys!
29 Hello Guys!
30 Hello Guys!
31 Hello Guys!
9 Good morning!

....
..
.
(infinite time)

*/































/*
// Multi threading using the two different classes

// Lets write own thread class, so that we have to override the run method
class myThread extends Thread{
    public void run() {
        int i = 1;
        
        while(true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}
        


public class Test {
    
    public static void main(String[] args) {
        
        // Lets create an object of the Thread class
        myThread t = new myThread();
        // to run the Thread we need to call the start method
        t.start();
        
        
        int i = 1; 
        
        while(true) {
            System.out.println(i + " world!");
            i++;
        }
    }
}


*/



/*
Output:-
----------
run:
1 world!
2 world!
3 world!
4 world!
5 world!
6 world!
1 Hello
2 Hello
3 Hello
4 Hello
5 Hello
6 Hello
7 Hello
8 Hello
7 world!
9 Hello
10 Hello
11 Hello
12 Hello
13 Hello
14 Hello
15 Hello
8 world!
16 Hello
17 Hello
18 Hello
19 Hello
20 Hello
21 Hello
22 Hello
23 Hello
24 Hello
25 Hello
26 Hello
9 world!
10 world!
27 Hello
28 Hello
29 Hello
30 Hello
11 world!
12 world!
13 world!
14 world!
31 Hello
32 Hello
15 world!
16 world!
17 world!
18 world!
19 world!
20 world!
21 world!
22 world!
33 Hello


........
....
...
.


*/
