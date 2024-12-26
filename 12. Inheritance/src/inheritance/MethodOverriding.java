/*
Method Overriding?
====================

1. What is  method Overriding?
2. Why we use method Overriding?
3. Dynamic Method Dispatch in Java
4. Rules (for overriding)
5. Overloading vs Overriding.



What is method Overriding?
----------------------------
Method Overriding means re-definding the method of the super class into sub class is called method overriding.


Example:

class Super {
    public void display() {
        System.out.println("Hello");
    }
}

class Sub extends Super {
    public void display() {
        System.out.println("Hello! Welcome to Java Learning.");
    }
}



public class MethodOverriding {
    public static void main(String[] args) {
        
        Super su = new Super();
        su.display();           // Hello
        
        Sub sb = new Sub();
        sb.display();       // Hello! Welcome to Java Learning.
    }
}





Note:-
----------- 
Here Method Super class get inherited from the Sub class so that it inherit all the properties and method inside Sub class.
But here we redefined the method display() again so that it gonna shadowed or hide.
And Only child class method will be visible that is its own method.




Dynamic method Dispatch:-
-------------------------------

A Super class reference(su) holding the object of the Sub class(new Sub()), and overrided method will be called.
then method of an object will be called not the reference's method.
That is called dynamic method dispatch.






*/




package inheritance;


class Super {
    public void display() {
        System.out.println("Hello");
    }
}

class Sub extends Super {
    @Override
    public void display() {
        System.out.println("Hello! Welcome");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        
//        Super su = new Super();
//        su.display();           // Hello
        
        Sub sb = new Sub();
        sb.display();       // Hello! Welcome to Java Learning.
        
        
    }
}


/*
Output:-
-----------
Hello! Welcome to Java Learning.


*/
