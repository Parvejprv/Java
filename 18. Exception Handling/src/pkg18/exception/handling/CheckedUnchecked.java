/*
  Checked and Unchecked Exception:-
------------------------------------
- getMessage() : this will give a message
- toString : this will return a string and it is similar to the get message
- printStackTrace() : this will helpful for the developer for printing the log related to the error




Checked Exception:-
---------------------
These are the exception that java forces to handle, these exception is known as Checked Exception.


Like:-
- ClassNotFoundException
- IOException
- InterruptedException
- NumberFormatException





Unchecked Exception:-
-----------------------
These exception is not necessary to handle if you want to handle otherwise escape those exception.
- RuntimeException
    - ArithmeticException
    - IndexOutOfBoundsException
        -ArrayIndexOutOfBoundsException
        -StringIndexOutOfBoundsException
    - NullPointerException


*/

package pkg18.exception.handling;
import java.io.*;

public class CheckedUnchecked 
{
    static void fun1() {
        
        // Let's work with some file input stream
        
        try {
            FileInputStream fi = new FileInputStream("My.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        
        
        
        
//        // System.out.println(10/0);        // This will throw division by zero exception
//        
//        // Let's handle the exception using try-catch
//        try {
//            System.out.println(10/0);
//        } catch(Exception e){
//            e.printStackTrace();
//        }

    }
    
    static void fun2() {
        fun1();
    }
    
    static void fun3() {
        fun2();
    }
    
    public static void main(String[] args) 
    {
        fun3();
    }
}








/*
Output:-
============

Using printStackTrace() : 
----------------------------
java.lang.ArithmeticException: / by zero
	at pkg18.exception.handling.CheckedUnchecked.fun1(CheckedUnchecked.java:20)
	at pkg18.exception.handling.CheckedUnchecked.fun2(CheckedUnchecked.java:28)
	at pkg18.exception.handling.CheckedUnchecked.fun3(CheckedUnchecked.java:32)
	at pkg18.exception.handling.CheckedUnchecked.main(CheckedUnchecked.java:37)






*/



