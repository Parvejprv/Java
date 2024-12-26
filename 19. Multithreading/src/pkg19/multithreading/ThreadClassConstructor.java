/*
 
Thread class:-
-----------------

Constructor:-
----------------
Thread()
Thread(String name)
Thread(Runnable r)
Thread(Runnable r, String name)
Thread(ThreadGroup g, String name)



getxxx() | setxxx()         i.e. getter and setter method
-------------------------------------------------------------


long getId()
String getName()
int getPriority()
Thread.State getState()
ThreadGroup getThreadGroup()


void setName(String name)
void setPriority(int p)
void setDaemon(boolean d)


Enquiry
-----------
boolean isAlive()
boolean isDaemon()
boolean isInterrupted()



Instance method()
--------------------
void interrupt()  -     to interrupt the current thread | task what it is running, and continue with another task.
void join()  -  means this Thread would have to wait to join the another Thread | task untill it finished.
void join(long millis)   -  it means it would wait for some time to join the another thread, it would join the another thread for certain period of time.
void run()  -   we should override this method
void start()  - this will run our thread via calling the start().  


static methods
------------------
int activeCount()  -    This will gonna shows how many thread are currently active or acting right now.
Thread currentThread()  -   This will gives us reference of the current Thread.
void yield()    -   to make a request to scheduler to let execute the lower priority thread also.
void dumpStack()    -   




starvation : Th1 P10  Th2 P5


*/


package pkg19.multithreading;

public class ThreadClassConstructor {
    
    public static void main(String[] args) {
        
    }
    
}


/*
Output:-


*/
