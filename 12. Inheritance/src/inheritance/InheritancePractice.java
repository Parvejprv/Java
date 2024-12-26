/*
Inheritance:-
--------------
Inheritance in Java, When a sub class aquires all the properties and method of the parent class is known as inheritance.

Circle      (Sup)       having properties, methods      -    radius, area(), perimeter()
Cylinder    (Sub)       having properties , methods     -    height, volume()               (before inheriting)             
Cylinder    (Sub)       having properties , methods     -    height, volume()               (after inheriting)      Note- all the methods and properties of the parent class will be here in the child class.           


*/


package inheritance;

import java.util.Scanner;

class Circle {
    private double radius;
    
    // Non-Parameterrized constructor
    public Circle() {
        radius = 0.0;
    }
    
    // Getter and Setter Method | Properties methods
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius =  radius;
    }
    
    public double area() {
        return Math.PI*(radius*radius);
    }
    
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}

class Cylinder extends Circle {
    private double height;
    
    public Cylinder() {
        height =  0.0;
    }
    
    // Getter and Setter method
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    
    public double volume() {
       return area() * height; 
    }
}

public class InheritancePractice {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//        // Create a Circle Object and set radius of the circle
//        Circle c1 = new Circle();
//        
//        System.out.println("Enter the radius of the Circle: ");
//        double rad = sc.nextDouble();
//        
//        c1.setRadius(rad);
//        
//        System.out.println("Circle Radius = " + c1.getRadius());
//        System.out.println("Circle Area = " + c1.area());
//        System.out.println("Circle Perimeter = " + c1.perimeter());
        
        
        
        // Create an object of the Cylinder class
        Cylinder cyl1 = new Cylinder();
        
        System.out.println("Enter the radius of the Cylinder: ");
        double rad = sc.nextDouble();
        System.out.println("Enter the height of the Cylinder : ");
        double height =  sc.nextDouble();
        
        cyl1.setRadius(rad);
        cyl1.setHeight(height);
        
        System.out.println("Cylinder height = " + cyl1.getHeight());
        System.out.println("Cylinder Volume = " + cyl1.volume());
        
        System.out.println("After inheriting -> " + cyl1.area());
        System.out.println("After inheriting -> " + cyl1.perimeter());
        
        
        
        // Set the radius property here
        //c1.setRadius(5);
 
    }
}

/*
Output:-
---------
Enter the radius of the Cylinder: 
20
Enter the height of the Cylinder : 
10
Cylinder height = 10.0
Cylinder Volume = 12566.370614359173
After inheriting -> 1256.6370614359173
After inheriting -> 125.66370614359172


*/