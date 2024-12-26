/*


Exception classes
====================

Object
^
|
Throwable
^
|-----------------------------| 
Exception                   Error
^
|
|- ClassNotFoundException
|- IOException
|- InterruptedException
|- NumberFormatException
|- RuntimeException
        |- ArithmeticException
        |- IndexOutOfBoundsException
        |- NullPointerException





ClassNotFoundException: If a class is not found then it will shown the class not found exception.

IOException : Input-output file is not present  or file not found then it will occurs.

InterruptedException:

NumberFormatException: If a number is given in string format that means it is expecting in number forma only.







There are two types of exception:-
-------------------------------------
1. Checked exception
2. Unchecked exception


1. Checked exception:-
------------------------
Checked exception means you must have to handle this exception using the try and catch, java forces you to handle them using try-catch.

2. Unchecked exception:-
-------------------------
Unchecked exception means it is not compulsory to handle it, if you want to handle it you may handle it.




Here is the correct way of writing the exception:
--------------------------------------------------


try{
    ....
} 
catch(ArithmeticException e) {        // this is the sub-class exception
    .....
} catch(Exception e) {
    .....
}



Note: if I wrote the super class first then it got shadowed the next sub-classes



*/

package pkg18.exception.handling;


public class ClassExceptionInJava {
    public static void main(String[] args) {
        
    }
}
