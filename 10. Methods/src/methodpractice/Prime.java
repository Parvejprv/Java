/*
Student Challenge:
-------------------
Prime numbers are those magical digits that can only be divided by 1 and themselves—no other numbers can sneak into their exclusive club. 


*/
package methodpractice;

import java.util.Scanner;


public class Prime {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        primeCal(n);
    }
    
    static void primeCal(int num) {
        int count = 0;
        for(int i=1; i<=num; i++){
            if(num % i == 0){
                count++;
            }
        }
        
        if(count == 2) {
            System.out.println("It's a prime number!");
        } else {
            System.out.println("Not a prime number.");
        }
    }
}


/*
Output:-
---------
Enter a number : 
11
It's a prime number!   


Enter a number : 
13
It's a prime number!


Enter a number : 
14
Not a prime number.

*/
