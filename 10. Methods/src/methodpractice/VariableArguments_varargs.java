/*
 variable arguments:
-------------------------
- Variable arguments, also known as varargs, allow methods to accept a flexible number of arguments. 
- Imagine a method that can handle none, one, or many arguments—varargs make that possible! 

- it would takes any number of arguments while method overloading.



Here are the key points about varargs:

1. Why Varargs?
Before Java 5 (JDK 4 and earlier), declaring methods with a variable number of arguments was a bit of a hassle. You either had to create overloaded methods (one for each argument count) or manually put arguments into an array and pass that array to the method. Both approaches were error-prone and verbose.
Varargs came to the rescue! They simplify method declarations and improve code readability.

2. Syntax of Varargs:
To declare a varargs method, add the ellipsis (...) operator to the end of the parameter type for the varargs parameter.


Example:

public static void printNumbers(int... numbers) {
    // method body
}
AI-generated code. Review and use carefully. More info on FAQ.
Here, numbers is implicitly declared as an array of integers.

3. How It Works:
Internally, varargs methods use single-dimensional arrays.
You can differentiate arguments by their index within the array.
The number of arguments can be determined using array.length.


4. Example:-

public class VarargsExample {
    static void printNumbers(int... numbers) {
        System.out.println("Number of arguments: " + numbers.length);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printNumbers(100);              // One argument
        printNumbers(1, 2, 3, 4);      // Multiple arguments
        printNumbers();                 // No arguments
    }
}



*/
package methodpractice;


public class VariableArguments_varargs {
    static void show(int... x) {
        // Display the elements of the varargs
        System.out.println("\nOutput of the Variable arguments:-");
        for(int a : x){
            System.out.print(a + " ");
        }
    }
    public static void main(String[] args) {
//        show(null);     // calling varargs with null arguments
//        show();     // calling varargs with 0 arguments
//        show(10);     // calling varargs with 1 arguments
//        show(10, 20);     // calling varargs with 2 arguments
//        show(10, 20, 30);     // calling varargs with 3 arguments
//        show(10, 20, 30, 40);     // calling varargs with 4 arguments
//        show(10, 20, 30, 40, 50);     // calling varargs with 5 arguments
        show(new int[] {10, 20, 30, 40, 50, 60, 70});     // calling varargs with 5 arguments
    }
}


/*
Output:-
-----------


Output of the Variable arguments:-

Output of the Variable arguments:-
10 
Output of the Variable arguments:-
10 20 
Output of the Variable arguments:-
10 20 30 
Output of the Variable arguments:-
10 20 30 40 
Output of the Variable arguments:-
10 20 30 40 50 
Output of the Variable arguments:-
10 20 30 40 50 60 70










// function call without argument
Output of the Variable arguments:-


// function call with one argument
Output of the Variable arguments:-
10


// function call with two arguments
Output of the Variable arguments:-
10 20


// function call with three arguments
Output of the Variable arguments:-
10 20 30


// function call with four arguments
Output of the Variable arguments:-
10 20 30 40


// function call with five arguments
Output of the Variable arguments:-
10 20 30 40 50


// function call with six arguments
Output of the Variable arguments:-
10 20 30 40 50 60


// function call with anonymous array as arguments
Output of the Variable arguments:-
10 20 30 40 50 60 70










*/