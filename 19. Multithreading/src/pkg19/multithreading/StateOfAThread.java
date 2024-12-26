/*
States of Thread:-
====================

States:
---------
States of a thread can be definded as, a position or behaviour of the state that gonna tell us,
either our Thread is in what state.

Here is the following states inside the java-

1). new - when an obect of a thread class is created, thread goes is new state.
2). ready - after creating an object of the Thread class, and we call the start() methods so, it is ready to run(it will calls the run method automatically).
3). running - this state is running state where a thread is running.
              wait - let we want to perfom another task, and this thread is waiting for its own chance, then it 'wait' and 'notify' after its comletion of task.
              timed-wait    -   here Thread would 'sleep' for a certain period of time that we assign, and 'wait' for some time.
              blocked   -   After completing its task it blocked.
4). termination     -       After performing all the certain task it would entered into the end mode for terminating a thread.



Note:- Once a Thread would end it does not gonna start again at the same time. But we can re-run that Thread.



*/
package pkg19.multithreading;


public class StateOfAThread {
    
    public static void main(String[] args) {
        
        
    }
 
}


/*
Output:-
--------

*/