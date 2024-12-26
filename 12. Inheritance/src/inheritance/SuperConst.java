/*
Super Keyword in Java:-
--------------------------
Super keyword refers to the super class, that is used to call the super class constructor.

- Let suppose I want to call the 'Super class' constructor into the 'Sub class' so we use very first line as super(x)



*/


package inheritance;

class Rectangle {
    int length;
    int breadth;
    
    Rectangle() {       // Default and Non-parameterized constructor
        length = breadth = 1;
    }
    Rectangle(int l, int b) {       // parameterized constructor
        length = l;
        breadth = b;
    }
}

class Cuboid extends Rectangle {
    int height;
    
    // Non-Parameterized Constructor
    Cuboid() {
        height =  1;
    }
    // Parameterized Constructor
    Cuboid(int h) {
        height = h;
    }
    
    Cuboid(int l, int b, int h) {
        super(l, b);        // to call the super class constructor
        height = h;
    }
    
    public int volume() {
        return length*breadth*height;
    }
}

public class SuperConst {
    
    public static void main(String[] args) {
        
        Cuboid c = new Cuboid();
        System.out.println("Cuboid volume = " + c.volume());        // volume =  1, because it uses non-parameterised constructor
        
        
        
        Cuboid c1 = new Cuboid(10);
        System.out.println("Cuboid volume = " + c1.volume());       // volume =  1*1*10=10
        
        
        
        Cuboid c2 = new Cuboid(5, 3, 10);
        System.out.println("Cuboid volume = " + c2.volume());       // volume = 5*3*10 = 150
        
    }
 
}


/*
Output
----------
Cuboid volume = 1

Cuboid volume = 10

Cuboid volume = 150



*/