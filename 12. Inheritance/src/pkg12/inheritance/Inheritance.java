/*
 12. Inheritance:-
---------------------


*/
package pkg12.inheritance;

class Circle {
    private double radius;
    
    public Circle() {
        radius = 0.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    public void setRadius(double rad) {
        radius = rad;
    }
    
    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Cylinder extends Circle {
    private double height;
    
    public Cylinder () {
        super();    
        height = 0.0;
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    
    public double Volume() {
        return area() * height;
    }
}

public class Inheritance {

    public static void main(String[] args) {
        
//        // Using the Circle class
//        Circle c1 = new Circle();           // Super class cosntructor (default)
//        System.out.println("Using the Circle class:");
//        System.out.println("Radius : " + c1.getRadius());
//        System.out.println("Area of the Circle : " + c1.area());
//        System.out.println("Perimeter of the Circle : " + c1.perimeter());
        


//        // Using the Circle class
//        Circle c1 = new Circle(5);           // Super class cosntructor
//        System.out.println("Using the Circle class:");
//        System.out.println("Radius : " + c1.getRadius());
//        System.out.println("Area of the Circle : " + c1.area());
//        System.out.println("Perimeter of the Circle : " + c1.perimeter());
//        
        
        

    Cylinder cyl = new Cylinder();
    
    cyl.setRadius(7);
    cyl.setHeight(10);
    
    System.out.println("Details About the Cylinder class | Sub class :");
    System.out.println("Radius = " + cyl.getRadius());
    System.out.println("Height = " + cyl.getHeight());
    System.out.println("Volume : " + cyl.Volume());
    System.out.println("Area : " + cyl.area());
    
  
    }
}


/*
Output:-
----------
// Using the Super class object
---------------------------------
Default constructor from the Super class
Using the Circle class:
Radius : 0.0
Area of the Circle : 0.0
Perimeter of the Circle : 0.0  


// Using the Super class Object and parameterized constructor
---------------------------------------------------------------
Using the Circle class:
Radius : 5.0
Area of the Circle : 78.53981633974483
Perimeter of the Circle : 31.41592653589793




Details About the Cylinder class | Sub class :
Radius = 7.0
Height = 10.0
Volume : 1539.3804002589986
Area : 153.93804002589985


*/
