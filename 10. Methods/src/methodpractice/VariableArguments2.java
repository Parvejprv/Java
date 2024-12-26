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


// Here we can pass another variable, let say I want to give an starting number for that 

public class VariableArguments2 {
    static void showList(int start, String...S){
        for(int i=0; i<S.length; i++){
            System.out.println(start +  ". " + S[i]);
            start++;
        }
    }
    
//    public static void main(String []args)        // execute correctly
//    public static void main(String args[])        // execute correctly
//    public static void main(String ...args)        // execute correctly
    public static void main(String...args)        // execute correctly
//    public static void main(String[] args) 
    {
        int start = 5;
        showList(start, "John", "Smith", "AJ", "Ahamad", "Mark", "Amita");
    }
    
}














/*

public class VariableArguments2 {
    static void showList(String...S){
        for(int i=0; i<S.length; i++){
            System.out.println(i+1 +  ". " + S[i]);
        }
    }
    
    public static void main(String[] args) {
        showList("John", "Smith", "AJ", "Ahamad", "Mark", "Amita");
    }
    
}

*/



/*
Output:-
----------
1. John
2. Smith
3. AJ
4. Ahamad
5. Mark
6. Amita

*/