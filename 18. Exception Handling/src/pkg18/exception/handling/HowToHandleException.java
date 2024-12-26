/*
18. Exception Handling:-
============================

What are the Exceptions?
-------------------------
Exception are run time errors. that may occurs while running the program.

Types of errors:-
-------------------
There are three types of errors-
....................................

1. Syntax errors
2. Logical errors
3. Runtime errors



1. Syntax errors            {compiler  will be helpful for removing this type of error}
---------------------
These are faced by the programmer, While typing a program if a programmer is doing some mistake  
like syntactical mistake, gramatical mistake or spelling mistake that is knowns as the "Syntax Errors".


Example 1.

int x, y;
x = 10              // here a semocolon is missed at the end of the staemenet
z = x+y;   


Note: here example 1 is a perfect example of "Syntax error", because here a semicolon is missing and variable z is not declared.
- This type | syntax errors can be remove using the compiler, compiler is helpful to remove this kind of error.



2. Logical errors    {Tracing | Debugger will be helpful for removing these type of error}
----------------------
Logical errors is often cause by the programmer, in the logical errors program's often runs but didn't give the expected result.

Example 1.

r = -b/2a  =>   r = -b / 2 * a   (wrong)

=> r = -b /(2*a);           (correct)


Note: here in the above 1st example, priority must be defined using the paranthesis so that we specify which operation we need to perform first when precedence level will be same.


Example 2.

for(int i=1; i < A.length(); i++) {
    System.out.println(A[i]);
}


Note: here in the 2nd example array index starts from 0, but we written from 1 progams runs and compiler will not gonna say that it should start from 0.
But we didn't get the expected result what we needed.




3. Runtime errors   {Proper input, avaiblity of resources}
----------------------
Runtime errors is often faces by the user end, let suppose program wants to enter the user age and user enters the age = -10, at this points program was suppose to crash due to the bad input, or unavailability of resource.


Enter age ?
-10

age can not be negative



Note: 
- Runtime error can be handle by the programmers and guide the user for the correction of the program.
- Tell the user for the proper input and try again.
 



*/


package pkg18.exception.handling;


public class HowToHandleException {
    
    
    
    public static void main(String[] args) {
        
        int a, b, c;
        a = 5;
        b = 0;
        c = a/b;        // 5/0 = infinite           // ArithmeticException: / by zero
        System.out.println("c = " + c);
        System.out.println("End of the program");
        System.out.println("Bye");
    }
    
    
    
    /*
    // Here is the normal flow of the program if there is no exception inside this program
    
    public static void main(String[] args) {
        int a, b, c;
        a = 5;
        b = 2;
        c = a/b;        // 5/2 = 2 (integer devision)
        System.out.println("c = " + c);
        System.out.println("End of the program");
        System.out.println("Bye");
    }
    
    // Output:-
    c = 2
    End of the program
    Bye
    
    */
    
    
}
