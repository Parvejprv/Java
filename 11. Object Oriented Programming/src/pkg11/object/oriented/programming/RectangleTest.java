/*
Question:
----------
Write a Rectangle class.



*/



// Using the two different classes

package pkg11.object.oriented.programming;

import java.util.Scanner;


class Rectangle {
    
    public int length;
    public int breadth;
    
    public int area() {
        return (length*breadth);
    }
    
    public int perimeter() {
        return 2*(length+breadth);
    }
    
    public int circumference() {
        //return 2*(length+breadth);
        return perimeter();
    }
    
    public boolean isSquare(){
//        return length == breadth;
        if(length == breadth) 
            return true;
        else 
            return false;
    }
    
}


public class RectangleTest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Rectangle r1 = new Rectangle();     // a new Rectangle object is created inside the heap
        
        int len, bre;
        
        System.out.println("Dimension for the Rectangle-");
        System.out.println("Enter the length : ");
        len = sc.nextInt();
        System.out.println("Enter the breadth : ");
        bre = sc.nextInt();
        
        
        // Assign the len and bre to the object's property
        r1.length = len;
        r1.breadth = bre;
        
        
        System.out.println("Here is the output related to the Rectangle-");
        System.out.println("Length : " + r1.length);
        System.out.println("Breadth : " + r1.breadth);
        
        System.out.println("Area = " + r1.area());
        System.out.println("Perimeter = " + r1.perimeter());
        System.out.println("Circumference = " + r1.circumference());
        System.out.println("Is it a Square = " + r1.isSquare());
    }
}

/*
Output:-
---------
Dimension for the Rectangle-
Enter the length : 
5
Enter the breadth : 
4
Here is the output related to the Rectangle-
Length : 5
Breadth : 4
Area = 20
Perimeter = 18
Circumference = 18
Is it a Square =  false



Dimension for the Rectangle-
Enter the length : 
4
Enter the breadth : 
4
Here is the output related to the Rectangle-
Length : 4
Breadth : 4
Area = 16
Perimeter = 16
Circumference = 16
Is it a Square =  true

*/






































// Using the single Class 

/*

package pkg11.object.oriented.programming;

import java.util.Scanner;

public class RectangleClass {
    
    public int length;
    public int breadth;
    
    public int area() {
        return (length*breadth);
    }
    public int perimeter() {
        return 2*(length+breadth);
    }
    public int circumference() {
        //return 2*(length+breadth);
        return perimeter();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        RectangleClass r1 = new RectangleClass();
        
        int len, bre;
        
        System.out.println("Dimension for the Rectangle-");
        System.out.println("Enter the length : ");
        len = sc.nextInt();
        System.out.println("Enter the breadth : ");
        bre = sc.nextInt();
        
        
        // Assign the len and bre to the object's property
        r1.length = len;
        r1.breadth = bre;
        
        
        System.out.println("Here is the output related to the Rectangle-");
        System.out.println("Length : " + r1.length);
        System.out.println("Breadth : " + r1.breadth);
        
        System.out.println("Area = " + r1.area());
        System.out.println("Perimeter = " + r1.perimeter());
        System.out.println("Circumference = " + r1.circumference());
        
    }
}

*/


/*
Output:-
------------
Dimension for the Rectangle-
Enter the length : 
5
Enter the breadth : 
4
Here is the output related to the Rectangle-
Length : 5
Breadth : 4
Area = 20
Perimeter = 18
Circumference = 18



Dimension for the Rectangle-
Enter the length : 
4
Enter the breadth : 
4
Here is the output related to the Rectangle-
Length : 4
Breadth : 4
Area = 16
Perimeter = 16
Circumference = 16
*/