/*
 

*/
package pkg12.inheritance;


class Rectangle {
    int length;
    int breadth;
    int x = 10;
    
    Rectangle (int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Cuboid extends Rectangle {
    int height;
    int x = 20;
    
    Cuboid(int l, int b, int h){
        super(l, b);    // this will gone call the parent class constructor
        height = h;
    }
    
    void display() {
        System.out.println(super.x);
        System.out.println(x);
    }
}


public class thisAndSuper {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(10, 30, 40);
        c.display();
        
        System.out.println("");
        
        System.out.println("Length : " + c.length);
        System.out.println("Breadth : " + c.breadth);
        System.out.println("x (from super class) : " + ((Rectangle)c).x);       // this is the x from super class how, may I access here it is
        
        System.out.println("Height : " + c.height);      
        System.out.println("x (from sub class) : " + c.x);
    
    }
}


/*
Output:-
------------
10
20



Length : 10
Breadth : 30
x (from super class) : 10
Height : 40
x (from sub class) : 20

*/