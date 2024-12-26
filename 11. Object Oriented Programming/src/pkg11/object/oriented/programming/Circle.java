/*
Question: 
------------
Write the Circle class.


Here is the below class for the Circle object.




Here is the Debugging steps:-
--------------------------------
1). Put a break point.
2). Enter into debug mode (Ctrl+f5) - for Project, and (Ctrl+shift+f5) - for that particular file(here Circle).
3). Step Over via pressing f8 (Moving forward). Let in this case we reachead at the area method for object 1. Then
press shift+f7 - Step into the next method.

    - And now check the radius value is comming here as 7, in our case.

4). Step over expression - shift+f8         , come back to the original file | expression.
Again press shift+f7 - step into the next method.

    - And now check the radius value is comming here as 14, in our case.


5). Step out (ctrl+f7)

6). Toggle the Breakpoint Ctrl+f8



*/





// With setting the radius property value,

package pkg11.object.oriented.programming;

class Circle1 {
    public double radius;
    
    public double area() {
        return Math.PI*radius*radius;
    }
    
    public double perimeter() {
        return 2*Math.PI*radius;
    }
    
    public double circumference() {
        return perimeter();
    }
}


public class Circle {
    
    public static void main(String args[]) {
        
        Circle1 c1 = new Circle1();
        Circle1 c2 = new Circle1();
        
        // Assing the radius property to the object's radius
        c1.radius = 7;
        c2.radius = 14;
        
        System.out.println("Area = " + c1.area());
        System.out.println("Perimeter = " + c1.perimeter());
        System.out.println("Circumference = " + c1.circumference());
        
        System.out.println("Area2 = " + c2.area());
        System.out.println("Perimeter2 = " + c2.perimeter());
        System.out.println("Circumference2 = " + c2.circumference());
        
    }
    
}


/*
Output:-
-----------
Area = 153.93804002589985
Perimeter = 43.982297150257104
Circumference = 43.982297150257104


Area2 = 615.7521601035994
Perimeter2 = 87.96459430051421
Circumference2 = 87.96459430051421

*/













// Without setting the radius property value,

/*
package pkg11.object.oriented.programming;

class Circle1 {
    public double radius;
    
    public double area() {
        return Math.PI*radius*radius;
    }
    
    public double perimeter() {
        return 2*Math.PI*radius;
    }
    
    public double circumference() {
        return perimeter();
    }
}


public class Circle {
    
    public static void main(String args[]) {
        
        Circle1 c1 = new Circle1();
        
        System.out.println("Area = " + c1.area());
        System.out.println("Perimeter = " + c1.perimeter());
        System.out.println("Circumference = " + c1.circumference());
        
    }
    
}
*/


/*
Output:-
-----------
Area = 0.0
Perimeter = 0.0
Circumference = 0.0


Note: here above we did not setup the property radius so that we are getting the resultant value of all the methods are 0.0.




*/


















// Using two seperate classes

/*


package pkg11.object.oriented.programming;

// Let suppose I want to write the Circle class

import java.util.Scanner;

class Circle1 {
    public double radius;
    
    public double area() {
        return Math.PI*radius*radius;
    }
    
    public double perimeter() {
        return 2*Math.PI*radius;
    }
    
    public double circumference() {
        return perimeter();
    }
}


public class Circle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Circle1 c = new Circle1();
        double radius;
        
        System.out.println("Enter the radius of a circle : ");
        radius = sc.nextDouble();
        
        // Assign the value of the radius into the object radius property
        c.radius = radius;
        
        
        // set the radius
//        c.radius = 10;
        
        System.out.println("Radius = " + c.radius);
        System.out.println("Area = " + c.area());
        System.out.println("Perimeter = " + c.perimeter());
        System.out.println("Circumference = " + c.circumference());
        
    }
}

*/




/*
Output:-
---------
Radius = 10.0
Area = 314.1592653589793
Perimeter = 62.83185307179586
Circumference = 62.83185307179586


Enter the radius of a circle : 
20
Radius = 20.0
Area = 1256.6370614359173
Perimeter = 125.66370614359172
Circumference = 125.66370614359172







*/








// Written the class with single class

/*

import java.util.Scanner;

public class Circle {
    
    public double radius;
    
    public double area() {
        return Math.PI*radius*radius;
    }
    public double perimeter() {
        return 2*Math.PI*radius;
    }
    public double circumference() {
        return area();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create an object of the given class
        Circle c1 = new Circle();
        
        System.out.println("Enter the radius of the circle: ");
        double rad = sc.nextDouble();
        
        // Assign the radius to the object radius
        c1.radius = rad;
        
        // Lets display the result
        System.out.println("Radius = " + c1.radius);
        System.out.println("Area = " + c1.area());
        System.out.println("Perimeter = " + c1.perimeter());
        System.out.println("Circumference = " + c1.circumference());
        
    }
    
}


*/



/*
Output:-
---------

Enter the radius of the circle: 
15
Radius = 15.0
Area = 706.8583470577034
Perimeter = 94.24777960769379
Circumference = 706.8583470577034


*/