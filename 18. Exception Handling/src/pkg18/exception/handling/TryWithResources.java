/*
 Try With Resources:-
------------------------
- Anything outside the program is a resource.
- new keyword is used to use this resource in Heap.
- Java has a built-in garbage collector to clear these resource.


For example, lets take an example of a program which is runs using the stack memory
it needed the resource like,

- CPU 
- Monitor
- DB(data)
- N/W or Internet
- Mouse
- Keyboard
- file


Note: If a Program needs aquire them or any of the resource it uses it and it does not need then return it back.
if it is not returning means it is using it.



*/



package pkg18.exception.handling;

import java.io.FileReader;      // import FileReader


public class TryWithResources {
    static int meth1() throws Exception {
        int result = 0;         // Define the result variable
        
        
        try (FileReader f = new FileReader("my.txt")) {
            
            // use file
            // Assuming some operations that modify result
            // // f.close();          // No need to close here
            result = 43;
            return result;
        } finally {
          //f.close();
        }
        
        
        
        
        
        
        
        
        
        /*
        // Just simple way and try to use without handling exception
        
        
        int result = 0;         // Define the result initially
        FileReader f;
        f = new FileReader("my.txt");
        // use file
        // Assuming some operations that modify result
        f.close();
        
        result =  43;
        return result;
        
        */
        
        
         
    }
    
    public static void main(String[] args) {
//        meth1();
    }
}
