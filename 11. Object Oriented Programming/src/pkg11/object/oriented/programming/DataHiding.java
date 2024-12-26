/*
 Data Hiding | Properties method :-
--------------------------------------
- In Data Hiding data is hidden and operations or methods are performed over(on) the data. 
- To Hide the data we must uses the private as access modifier, so that it can not be direct access. And to access them we use setxxx(){} and getxxx(){}  method.



*/






//package pkg11.object.oriented.programming;
//import java.util.Scanner;


// To Hide the data we often use the private keyword in java
//class Rectangle {
//    private int length;
//    private int breadth;
//    
//    // Getter and Setter method
//    // Getter
//    public int getLength() {
//        return length;
//    }
//    public int getBreadth() {
//        return breadth;
//    }
//    
//    // Setter
//    public void setLength(int length) {
//        if(length > 0) {
//            this.length = length;
//        } else {
//            length = 0;
//        }
//    }
//    public void setBreadth(int breadth) {
//        if(breadth > 0) {
//            this.breadth = breadth;
//        } else {
//            breadth = 0;
//        }
//    }
//    
//    
//    int area() {
//        return length * breadth;
//    }
//    
//    int perimeter() {
//        return 2*(length + breadth);
//    }
//    
//    int circumference() {
//        return perimeter();
//    }
//}


public class DataHiding {
    public static void main(String[] args) {
        
        // Create a object of the Rectangle class
        Rectangle r = new Rectangle();
        
        // setting the length and breadth
//        r.setLength(10);
//        r.setBreadth(5);


        r.setBreadth(10);
        r.setLength(5);
        
        System.out.println("Area = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());
        System.out.println("Circumference = " + r.circumference());
        
        System.out.println("\n\nLength : " + r.getLength());
        System.out.println("Breadth : " + r.getBreadth());
        
    }
}



/*
Output:
----------
Area = 50
Perimeter = 30
Circumference = 30


Length : 5
Breadth : 10




*/
























/*

package pkg11.object.oriented.programming;
import java.util.Scanner;

class Rectangle {
    public int length;
    public int breadth;
    
    public int area() {
        return length*breadth;
    }
    public int perimeter() {
        return 2*(length+breadth);
    }
}


public class DataHiding{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        Rectangle r = new Rectangle();
        
        System.out.println("Enter the Length: ");
        int len = sc.nextInt();
        System.out.println("Enter the Breadth: ");
        int bre = sc.nextInt();
        
        
        // Assign the value of length(len) and breadth(bre) to the object of Rectale class properties
        r.length = len;
        r.breadth = bre;
        
        // length and breadth
        System.out.println("Length : " + r.length);
        System.out.println("Breadth : " + r.breadth);
        
        System.out.println("Area = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());
    }
}

*/



/*
Output:-
---------
Enter the Length: 
5
Enter the Breadth: 
10
Length : 5
Breadth : 10
Area = 50
Perimeter = 30


*/











