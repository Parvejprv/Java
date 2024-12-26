/*
Question: Finding Prime number within a range. 
*/
package methodpractice;

import java.util.Scanner;


public class FindingPrimeNumbersWithinARange {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n value : ");
        int n = sc.nextInt();
           
        System.out.println("Prime numbers between 1 and " + n + " are : ");
        for(int j=2; j<=n; j++){
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
