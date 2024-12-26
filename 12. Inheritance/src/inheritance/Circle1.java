/*
 Practice Question of inheritance in Java
*/


package inheritance;

class Circle1_1 {
    public double radius;
    
    public Circle1_1() {
        radius = 0.0;
    }
    
    public double area() {
        return Math.PI * (radius*radius);
    }
    
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Cylinder1_1 extends Circle1_1 {
    public double height;
    
    public Cylinder1_1() {
        height = 0.0;
    }
    
    public double volume() {
        return area() * height;
    }
}



public class Circle1 {
    public static void main(String[] args) {
        
        Cylinder1_1 c = new Cylinder1_1();
        c.radius = 7;
        c.height = 10;
        
        System.out.println("Volume of Cylinder = " + c.volume());
        System.out.println("Area " + c.area());
        
    }
}



/*
Output:-
---------
Volume of Cylinder = 1539.3804002589986
Area 153.93804002589985



*/