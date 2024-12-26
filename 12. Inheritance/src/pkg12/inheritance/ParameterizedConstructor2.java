/*
Parameterized constructor 2:-
-------------------------------


*/
package pkg12.inheritance;

class Rectangle {
    int length;;
    int breadth;
    
    Rectangle() {
        length = breadth = 1;
    }
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
}
class Cuboid extends Rectangle {
    int height;
    
    Cuboid() {
        height = 1;
    }
    Cuboid(int h) {
        height = h;
    }
    Cuboid(int l, int b, int h){
        super(l, b);
        height = h;
    }
    
    int volume() {
        return length*breadth*height;
    }
}

public class ParameterizedConstructor2 {
    
    public static void main(String[] args) {
        
//        Cuboid  c = new Cuboid();
//        System.out.println("Area = " + c.volume());



        
        


            
        
    }
    
}
