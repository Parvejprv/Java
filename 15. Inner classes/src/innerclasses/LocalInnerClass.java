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


    Example:-


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






2). Local Inner class:-
---------------------------
- A class that is written inside the method only that class is local inner class for those method. That is called Local Inner class.

Example:-

class Outer {

    void Display() {
        // Local Inner class
        class Inner {
            void innerDisplay() {
                System.out.println("Hello");
            }
        }

        // Create Inner class Object inside Display() method

        Inner i = new Inner();

        i.innerDisplay();
    
    }

}












*/

package innerclasses;

// Outer class
class Outer {
    
    void Display() {
        // Local Inner class
        class Inner {
            void innerDisplay() {
                System.out.println("Hello");
            }
        }
        
        // Create Object of Local Inner class, that is inside a method
        Inner i = new Inner();
        i.innerDisplay();
        
    }
    
}

public class LocalInnerClass {
    public static void main(String[] args) {
        
        Outer ol = new Outer();
        ol.Display();           // Hello   
        
    }
}



/*
Output:-
----------
Hello


*/