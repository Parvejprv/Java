/*
Abstract class for Shape

*/


package abstractclass;

abstract class Shape {
    abstract public double area();
    abstract public double perimeter();
}

class Circle extends Shape {
    public double radius;
    
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    public double length;
    public double breadth;
    
    public double perimeter() {
        return 2 * (length + breadth);
    }
    
    public double area() {
        return length*breadth;
    }
}

public class SCAbstract1 {
    
    public static void main(String[] args) {
        
        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 5;
        
        Shape s = r;
        System.out.println("area = " + s.area());
    }
    
}


/*
Output:
---------
area = 50.0


*/

