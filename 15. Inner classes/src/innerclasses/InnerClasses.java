/*
Innr classes:-
-------------------


What is Inner class?
-----------------------

Inner class:-
------------------
- A class that is inside another class is known as inner class.
- Class inside another class is known as Inner class.
- Why we use the inner classes ? Ans - to reduce the complexity of the classes, and programs.
- If anything repeating inside a class that made application complex, we use concept of inner class.
- Inner class can access the member of the outer class directly, But outer class can not access the members of the inner class directly,
unless we deos not have the object of that inner class. 

Ex


Types of Inner classes:-
--------------------------
1. Nested Inner class
2. Local Inner class
3. Anonymous Inner class
4. Static Inner class



1. Nested Inner class:-
--------------------------
- A Class that is written inside another class is known as inner class.
- Inner class can access the member of the outer class directly, But outer class can not access the members of the inner class directly,
unless we deos not have the object of that inner class. 

    Ex:-

    class Outer {
        int x = 10;

        class Inner {
            int y = 20;

            public void innerDisplay() {
                System.out.println("x = " + x);
                System.out.println("y = " + y);
            }
        }


        void outerDisplay() {
            // Create an object of Inner class
            Inner i = new Inner();

            // we can access the member of outer class directly
            i.innerDisplay();
            System.out.println(i.y);
        }
    }


    public class InnerClasses {
        public static void main(String[] args) {

    //        // Create an Object of Outer class
    //        Outer o = new Outer();
    //        o.outerDisplay();
    //        System.out.println("x: " + o.x);




            // It is possible to create the object of Inner class but outside the Outer class
            // Ans - Yes, possible (first we need to create object of the Outer class then we need to create Object Of Inner class.)

            Outer.Inner i = new Outer().new Inner();        // Object of Outer, then Object of Inner
            i.innerDisplay();       // direct call the inner display method
            System.out.println("y:: " + i.y); 

        }
    }





*/



package innerclasses;

class Outer {
    int x = 10;
    
    class Inner {
        int y = 20;
        
        public void innerDisplay() {
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
    
    
    void outerDisplay() {
        // Create an object of Inner class
        Inner i = new Inner();
        
        // we can access the member of outer class directly
        i.innerDisplay();
        System.out.println(i.y);
    }
}


public class InnerClasses {
    public static void main(String[] args) {
        
//        // Create an Object of Outer class
//        Outer o = new Outer();
//        o.outerDisplay();
//        System.out.println("x: " + o.x);




        // It is possible to create the object of Inner class but outside the Outer class
        // Ans - Yes, possible (first we need to create object of the Outer class then we need to create Object Of Inner class.)
        
        Outer.Inner i = new Outer().new Inner();        // Object of Outer, then Object of Inner
        i.innerDisplay();       // direct call the inner display method
        System.out.println("y:: " + i.y); 
        
    }
}



/*
Output:-
----------
x = 10
y = 20
20
x: 10




x = 10
y = 20
y:: 20




Note:-
--------

- Inside Java for each java class file a seperate class file is generated
Outer.class
Outer $Inner.class      (for inner class)



*/
































































/*

// Second time practice


package innerclasses;

class Outer {
    int x = 10;
    
    class Inner {
        int y = 20;
        
        void innerDisplay() {
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
    }
    
    void outerDisplay() {
        // Create an object of the inner class
        Inner i = new Inner();
        i.innerDisplay();       // innerDisplay()
        System.out.println(i.y);
        
    }
    
}

public class InnerClasses {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();
        
        
        
        
        
        
        // It is possible to create the object of the inner class but outside the Inner class.
        // Ans - Yes, but it is useless
        // How ? Firstly we need to create the object of an Outer class then we create an Object of the Inner class.
        
        
        Outer.Inner i = new Outer().new Inner();
        System.out.println("This is display using an object of the inner class");
        i.innerDisplay();
        System.out.println("inner (object) y: " + i.y);
        
        
        
    }
}


*/





/*
Output:-
-----------
x: 10
y: 20
20




This is display using an object of the inner class
x: 10
y: 20
inner (object) y: 20






*/