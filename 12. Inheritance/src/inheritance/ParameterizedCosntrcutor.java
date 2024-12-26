/*
Constructor:-
-----------------

Types of Constructor:-
------------------------
1). Non-parameterized Constructor
2). Parameterized Constructor



1). Non-parameterized Constructor
A Constructor Which deos not have any parameter is known as "Non-parameterized Constructor".

Example:-

class Parent {
    Parent() {
        
    }
}





2). Parameterized Constructor

 
*/


package inheritance;

class Parent {
    Parent() {
        System.out.println("Non-Param of Parent");
    }
    Parent(int x) {
        System.out.println("Param of Parent and value of x = " + x);
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Non-Param of Child");
    }
    Child(int y) {
        System.out.println("Param of Child and value of y = " + y);
    }
    
    Child(int x, int y) {
        // To call the parameterized constructor of the super class we use very first line with super keyword and pass param inside it
        super(x);
        System.out.println("2 Param of Child and y = " + y);
    }
}

public class ParameterizedCosntrcutor {
    public static void main(String[] args) {
        
        // Non-Param of Parent
        // Parent p = new Parent();        // This object does not contains any param inside it so that It gonna called 'Non-Param Constructor of Parent'
        
        
        
        
        
        // Param of Parent, Create an object of Parent class (for Parameterized constructor)
        // Parent p = new Parent(10);
        
        
        
        
        
        
        
        // Non-Param of Child
        // Child c = new Child();
        
        
        
        
        // Param of Child
        // Child c = new Child(20);
        
        
        
        
        // 2 Param of Child
        Child c = new Child(10, 20);
        
    }
}


/*
Output:-
----------

// Non-Param of Parent
Non-Param of Parent

// Param of Parent
Param of Parent and value of x = 10




// Non-Param of Child
Non-Param of Parent
Non-Param of Child





// Param of Child
Non-Param of Parent
Param of Child and value of y = 20



// 2 Param of Child class (here I only want to call parameterized const)
Param of Parent and value of x = 10
2 Param of Child and y = 20

*/