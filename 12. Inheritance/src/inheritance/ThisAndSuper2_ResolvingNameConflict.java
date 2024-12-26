/*
this vs super keyword:-
-------------------------


*/
package inheritance;


class Rectangle  {
    int length;
    int breadth;
    
    int x =  10;
    
    Rectangle (int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Cuboid extends Rectangle {
    int height;
    int x = 20;
    
    Cuboid(int l, int b, int h) {
        super(l, b);    // here super(l,b) call the super class constructor
        height = h;
    }
    
    void display() {
//        System.out.println(super.x);
//        System.out.println(x);
        
        System.out.println("value of x from super class = " + super.x);
        System.out.println("value of x from its own = " + x);

    }
}

public class ThisAndSuper2_ResolvingNameConflict {
    
    public static void main(String[] args) {
        
        Cuboid c = new Cuboid(10, 5, 15);
        c.display();
        
    }
    
}



/*
Output:-
-----------
10
20

value of x from super class = 10
value of x from its own = 20

*/