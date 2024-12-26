/*
Finally Block Demo2 :
========================




*/




package pkg18.exception.handling;


public class FinallyBlockDemo2 {
    
    // Let suppose we are writting a method, that gonna write the 
    static void meth1() throws Exception {
        
        // Let handle the exception using the try-catch and finally block
        try {
            throw new Exception();
        } catch(Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Final Message");
        }
        
        
        
        
        /*
        // We can use the finally block followed by the try block, and did not catch the exception
        try {
            throw new Exception();
        } 
        finally {
            System.out.println("Final Message");
        }
        */
        
        
        
        
        
        /*
        
        // throw an Exception
        throw new Exception();    // here, this line causes an exception and  unreachable to the next line of statements     
        
        System.out.println("Final Message");
        
        */
        
    }
    
    public static void main(String[] args) throws Exception {
        meth1();
    }
}




/*
Output:-
==========

java.lang.Exception
Final Message



run:
Final Message
Exception in thread "main" java.lang.Exception
	at pkg18.exception.handling.FinallyBlockDemo2.meth1(FinallyBlockDemo2.java:23)
	at pkg18.exception.handling.FinallyBlockDemo2.main(FinallyBlockDemo2.java:46)
C:\Users\parve\AppData\Local\NetBeans\Cache\22\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\parve\AppData\Local\NetBeans\Cache\22\executor-snippets\run.xml:68: Java returned: 1


*/