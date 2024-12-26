/*
Question: Finding Prime number within a range. 
*/

package pkg10.methods;

import java.util.Scanner;

public class FindingPrimeNumberWithinRange {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        
        System.out.println("Prime number between 1 and " + n +" are : ");
        for(int j=2; j<=n; j++) {
            int count = 0;
            for(int i=1; i<=j; i++){
                if(j % i == 0){
                    count++;
                }
            }
            
            if(count == 2) {
                System.out.println(j + " ");
            }
        }
    }
    
}

/*
Output:
-------
Enter the value of n: 
13
Prime number between 1 and 13 are : 
2 
3 
5 
7 
11 
13 

*/