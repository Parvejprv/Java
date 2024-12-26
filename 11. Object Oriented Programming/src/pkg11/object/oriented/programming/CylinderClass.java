/*
Question:-
----------
Write the class for the Cylinder object.



*/







/*
There are three solution related is given -
1). Using Single class with the help of constructor
2). Using two different classes, and creating the object of Cylinder class
3). Using the Single class


*/








package pkg11.object.oriented.programming;

import java.util.Scanner;


public class CylinderClass {
    
    public double radius;
    public double height;
    
    
    // Constructor to initialize radius and height
    public CylinderClass(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    
    // Method to calculate the lidArea of a cylinder
    public double lidArea() {
        return Math.PI*radius*radius;
    }
    
    // Method to calculate the total surface area of the cylinder
    public double totalsurfaceArea() {
        return 2*Math.PI*radius*(radius+height);
    }
    
    // Method to calculate the volume of the cylinder
    public double volume() {
        return Math.PI*(radius*radius)*height;
    }
    
    // Method to calculate the perimeter Or lidArea
    public double perimeter() {
        return 2*Math.PI*radius;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double radius, height;
        
        
        System.out.println("Enter the radius of the Cylidner :  ");
        radius = sc.nextDouble();
        System.out.println("Enter the height of the Cylidner :  ");
        height = sc.nextDouble();
        
        // Creating a Cylinder object
        CylinderClass cyl1 = new CylinderClass(radius, height);
        
        System.out.println("Here is the output related to the Cylinder\n");
        
        System.out.println("Radius = " + String.format("%.2f", cyl1.radius));
        System.out.println("Height = " + String.format("%.2f", cyl1.height));
        

        System.out.println("Lid Area = " + String.format("%.2f", cyl1.lidArea()));
        System.out.println("Surface Area = " + String.format("%.2f", cyl1.totalsurfaceArea()));
        System.out.println("Volume = " + String.format("%.2f", cyl1.volume()));
        System.out.println("Perimeter = " + String.format("%.2f", cyl1.perimeter()));
        
    }
}



/*
Output:-
-----------
Enter the radius of the Cylidner :  
5
Enter the height of the Cylidner :  
4
Here is the output related to the Cylinder

Radius = 5.0
Height = 4.0
Surface Area = 282.7433388230814
Volume = 314.1592653589793
Perimeter = 31.41592653589793



Enter the radius of the Cylidner :  
4
Enter the height of the Cylidner :  
4
Here is the output related to the Cylinder

Radius = 4.0
Height = 4.0
Surface Area = 201.06192982974676
Volume = 201.06192982974676
Perimeter = 25.132741228718345



Enter the radius of the Cylidner :  
5
Enter the height of the Cylidner :  
6
Here is the output related to the Cylinder

Radius = 5.0
Height = 6.0
Lid Area = 78.53981633974483
Surface Area = 345.57519189487726
Volume = 471.23889803846896
Perimeter = 31.41592653589793




// Two digit after decimal 
Enter the radius of the Cylidner :  
9045.2940
Enter the height of the Cylidner :  
567.23930
Here is the output related to the Cylinder

Radius = 9045.29
Height = 567.24
Lid Area = 257036765.42
Surface Area = 546311588.53
Volume = 145801354892.08
Perimeter = 56833.26

*/

















// Using Two different classes

/*

package pkg11.object.oriented.programming;

import java.util.Scanner;

class Cylinder {
    public double radius;
    public double height;
    
    // Method to calculate the surface area of the cylinder
    public double surfaceArea() {
        return 2*Math.PI*radius*(radius+height);
    }
    
    // Method to calculate the volume of the cylinder
    public double volume() {
        return Math.PI*(radius*radius)*height;
    }
    
    // Method to calculate the perimeter
    public double perimeter() {
        return 2*Math.PI*radius;
    }
}

public class CylinderClass {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Cylinder cyl1 = new Cylinder();
        
        double radius, height;
        
        System.out.println("Enter the radius of the Cylidner :  ");
        radius = sc.nextDouble();
        System.out.println("Enter the height of the Cylidner :  ");
        height = sc.nextDouble();
        
        
        // Now, assign the value of the radius, height to the Cylinder object
        cyl1.radius = radius;
        cyl1.height = height;
        
        
        System.out.println("Display output related to the Cylinder\n");
        
        System.out.println("Radius = " + radius);
        System.out.println("Height = " + height);
        
        System.out.println("Surface Area = " + cyl1.surfaceArea());
        System.out.println("Volume = " + cyl1.volume());
        System.out.println("Perimeter = " + cyl1.perimeter());
        
    }
}


*/



/*
Output:-
----------

Enter the radius of the Cylidner :  
5
Enter the height of the Cylidner :  
4
Display output related to the Cylinder

Radius = 5.0
Height = 4.0
Surface Area = 282.7433388230814
Volume = 314.1592653589793
Perimeter = 31.41592653589793


*/





















// Using single class

/*


package pkg11.object.oriented.programming;

import java.util.Scanner;


public class CylinderClass {
    
    public double radius;
    public double height;
    
    // Method to calculate the surface area of the cylinder
    public double surfaceArea() {
        return 2*Math.PI*radius*(radius+height);
    }
    
    // Method to calculate the volume of the cylinder
    public double volume() {
        return Math.PI*(radius*radius)*height;
    }
    
    // Method to calculate the perimeter
    public double perimeter() {
        return 2*Math.PI*radius;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        CylinderClass cyl1 = new CylinderClass();
        
        double radius, height;
        
        System.out.println("Enter the radius of the Cylidner :  ");
        radius = sc.nextDouble();
        System.out.println("Enter the height of the Cylidner :  ");
        height = sc.nextDouble();
        
        
        // Now, assign the value of the radius, height to the Cylinder object
        cyl1.radius = radius;
        cyl1.height = height;
        
        
        System.out.println("Display output related to the Cylinder\n");
        
        System.out.println("Radius = " + radius);
        System.out.println("Height = " + height);
        
        System.out.println("Surface Area = " + cyl1.surfaceArea());
        System.out.println("Volume = " + cyl1.volume());
        System.out.println("Perimeter = " + cyl1.perimeter());
        
    }
}



*/



/*
Output:-
----------

Enter the radius of the Cylidner :  
5
Enter the height of the Cylidner :  
4
Display output related to the Cylinder

Radius = 5.0
Height = 4.0
Surface Area = 282.7433388230814
Volume = 314.1592653589793
Perimeter = 31.41592653589793


*/

















