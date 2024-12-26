/*
Parameterized Constructor:-
-----------------------------


*/

package pkg12.inheritance;

class Parent {
    Parent () {
        System.out.println("Non-Param of Parent");
    }
    Parent (int x) {
        System.out.println("Param of Parent x : " + x);
    }
}
class Child extends Parent {
    Child () {
        System.out.println("Non-Param of Child");
    }
    Child (int y) {
        System.out.println("Param of Child, y : " + y);
    }
    Child(int x, int y) {
        super(x);   // to call the super class constructor
        System.out.println("Two Param of Child.");
    }
}

public class ParameterizedConstructors {
    public static void main(String[] args) {
//        Child c = new Child();
//        Child c = new Child(20);

          // to call the parameterized constructor of the parent class
          Child c = new Child(10, 20);
    }
}




/*
Output:-
------------
Non-Param of Parent
Non-Param of Child


Non-Param of Parent
Param of Child, y : 20



*/