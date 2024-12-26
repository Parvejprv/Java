/*
Construtors:-
--------------

*/



package pkg11.object.oriented.programming;

import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;
    
    // constructors, default constructor
    public Rectangle() {
        this.length = 1;
        this.breadth = 1;
    }
    // Parameterized constructor
    public Rectangle(double length, double breadth){
        setLength(length);
        setBreadth(breadth);
    }
//    public Rectangle (double s) {
//        length = breadth = s;
//    }
    
    
    // Getter and Setter method
    // Getter
    public double getLength() {
        return length;
    }
    public double getBreadth() {
        return breadth;
    }
    
    // Setter
    public void setLength(double len) {
        // positive case for length
        if(len >= 0) {
            length = len;
        } 
        // negitve case for length
        else {
            length = 0;
        }
    }
    public void setBreadth(double bre) {
        // positive case for breadth
        if(bre >= 0) {
            breadth = bre;
        } 
        // negative case for breadth
        else {
            breadth = 0;
        }
    }
    
    // area()
    public double area() {
        return length * breadth;
    }
    // perimeter()
    public double perimeter() {
        return 2*(length + breadth);
    }
    // circumference()
    public double circumference() {
        return perimeter();
    }
    
    // isSquare
    public boolean isSquare() {
        if(length == breadth)
            return true;
        else 
            return false;
    }
}

public class Constructors {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double userLength = sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double userBreadth = sc.nextDouble();

        // Create a Rectangle object using the parameterized constructor
        Rectangle r3 = new Rectangle(userLength, userBreadth);
        
//        System.out.println("Let's print the length, breadth : " + userLength + ", " + userBreadth );
        
        System.out.println("Area = " + r3.area());
//        System.out.println("Perimeter = " + r3.perimeter());
//        System.out.println("It is a Square? " + r3.isSquare());
    }
}


/*
Output:-
---------
Enter the length of the rectangle: 10
Enter the breadth of the rectangle: 5
Let's print the length, breadth : 10.0, 5.0
Area = 50.0
Perimeter = 30.0



Enter the length of the rectangle: 5
Enter the breadth of the rectangle: 10
Let's print the length, breadth : 5.0, 10.0
Area = 50.0
Perimeter = 30.0
It is a Square? false



Enter the length of the rectangle: 10
Enter the breadth of the rectangle: 10
Let's print the length, breadth : 10.0, 10.0
Area = 100.0
Perimeter = 40.0
It is a Square? true


Enter the length of the rectangle: -15
Enter the breadth of the rectangle: -5
Area = 75.0
Perimeter = -40.0
It is a Square? false

*/
























/*
// Method 2.

package pkg11.object.oriented.programming;

class Rectangle {
    private double length;
    private double breadth;
    
    // constructors, default constructor
    public Rectangle() {
        length = 1;
        breadth = 1;
    }
    // Parameterized constructor
    public Rectangle(double len, double bre){
        length = len;
        breadth = bre;
    }
    public Rectangle (double s) {
        length = breadth = s;
    }
    
    
    // Getter and Setter method
    // Getter
    public double getLength() {
        return length;
    }
    public double getBreadth() {
        return breadth;
    }
    
    // Setter
    public void setLength(int length) {
        if(length > 0) {
            this.length = length;
        } else {
            length = 0;
        }
    }
    public void setBreadth(int breadth) {
        if(breadth > 0) {
            this.breadth = breadth;
        } else {
            breadth = 0;
        }
    }
    
    // area()
    double area() {
        return length * breadth;
    }
    // perimeter()
    double perimeter() {
        return 2*(length + breadth);
    }
    // circumference()
    double circumference() {
        return perimeter();
    }
    
    // isSquare
    boolean isSquare(double length) {
        return this.length == breadth;
    }
}

public class Constructors {
    public static void main(String[] args) {
        
//        // Let create an object having without having parameter into the 
//        Rectangle r = new Rectangle();      // Default constructor will called
//        System.out.println("Area = " + r.area());


//        // Create another Constructor having two param
//        Rectangle r2 = new Rectangle(10.5, 5.5);
//        System.out.println("Area = " + r2.area());                                                                  
        
        
        // 
        Rectangle r3 = new Rectangle(5);
        System.out.println("Area = " + r3.area());
        System.out.println("Perimeter = " + r3.perimeter());
        System.out.println("Square = " + r3.isSquare(5));
        
        
    }
}


*/


/*
Output:-
----------
Area = 25.0
Perimeter = 20.0
Square = true

*/



