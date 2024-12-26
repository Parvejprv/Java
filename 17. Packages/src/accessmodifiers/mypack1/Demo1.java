/*
Access Modifiers in Java:
--------------------------
Access Modifiers in Java is used to control the visibility, of the classes, methods and the variables and constructors within our code.
Here is the places where we can get the visibility to the our class.
- Same class
- Same class Sub packages
- Same class Non Sub packages
- Different class Sub packages
- Different class Non Sub packages


- There are four types of the access modifiers in java-
    1). private
    2). public
    3). default
    4). protected


1). private:-
---------------
It is accessible within the same class only.

2). public :-
----------------
It is accessible to all of the above mentions.

3). default :-
-----------------
Default is accessible within the same packages only, it is not accessible to the outside the packages or different packages.

4). Protected :-
------------------
It is accessible Different packages non sub-class only.





*/

package accessmodifiers.mypack1;





public class Demo1 {
    // variables
    int x;
    // Methods
    void show() {
        System.out.println("x");
    }
    // Inner class
    class inner {
        void meth1() {
            System.out.println("Inner class display.");
        }
    }
    
    public static void main(String[] args) {
        
    }
}
