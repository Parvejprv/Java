/*
Static 
============

1). static variable
2). static method
3). static class
4). static block



- static kwyword is used for representing meta data. Meta data means data about data.
- static variables are belongs to the class, and it is shared for all common objects.
- Static methods are belongs to the class, and it is shared for all common objects. Static methods can access the static members only, it can not access the non-static member of the class.
- To Access the static member of the class, we can directly access them by using the class name and without creating the object also.
- But we can also access them with the help of the object, i.e. by creating the object of the class.
- Non-static member can access the static member of the class.
- we can not use the this & super keyword, because it points to the same object.



static variables:-
----------------------
static varibles is used to share the data relate to the class.


static methods:
-------------------
If data needs some processing and needs computation then we use static method.

static nested class:
---------------------
If you have a lot of data group together and make them as a class.





*/


package pkg16.pkgstatic.and.pkgfinal;

class  Test {
    static int x = 20;          // static varaible
    int y = 10;
    
    void display() {
        System.out.println("x : " + x + " y: " + y);
    }
    
    // static method
    static void show() {
        System.out.println("x : " + x);     
    }
    
}


public class StaticKeyword {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        
        t1.display();
        
        t1.display();
        t1.x = 100;
        t2.y = 500;
        
        System.out.println("\n");
        t2.display();
        
        
        // Now, call the static methods of the Test class
        t1.show();
        
    }
}


/*
Output:-
----------
x : 20 y: 10
x : 20 y: 10

x : 100 y: 500
*/ 

