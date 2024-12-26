/*
 
Exception Demo :- 
-------------------
-


*/


package pkg18.exception.handling;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a, b, c;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of a : ");
        a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        b = sc.nextInt();
        
        try {
            c = a / b;
            System.out.println(c);
        } catch(ArithmeticException e) {
            System.out.println("Denominator should not be zero(0), try again");
        }
        System.out.println("Bye");      // it shows successfully continuing
    }
}




/*

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 10, b = 0, c;
        
        try {
            c = a / b;
            System.out.println(c);
        } catch(ArithmeticException e) {
            System.out.println("Denominator should not be zero(0), try again");
        }
        System.out.println("Bye");      // it shows successfully continuing
    }
}


*/






/*
Output:-
---------
Denominator should not be zero(0), try again
Bye


Enter the value of a : 
10
Enter the value of b : 
0
Denominator should not be zero(0), try again
Bye




Enter the value of a : 
10
Enter the value of b : 
5
2
Bye

*/