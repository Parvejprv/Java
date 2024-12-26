/*
Overriding rules:-
---------------------
- Overrided method should be same as the sub class as they declared in the super class, means with the same argument list and signature.
- If a method that is written as static then we can not overrided that method.
- Same as static, If a method that is written as final then we can not overrided that method also if a method is declared as final.



*/
package pkg12.inheritance;

/*
class A {  }
class B extends A {  }

class Super {
    public A display () {
        System.out.println("Super display with return type of class 'A'");
        return new A();
    }
}
class Sub extends Super {
    public A display() {
        System.out.println("Sub display with return type A.");
        return new A();
    }
}
*/




class Super {
    public void display() {
        System.out.println("Super Display");
    }
    public static void display2() {
        System.out.println("Super Display");
    }
    public final void display3() {
        System.out.println("Super Display");
    }
}
class Sub extends Super {
//    @Override
    public void display() {
        System.out.println("Sub Display");
    }
    // We can not override the static method
//    public void display2() {
//        System.out.println("Super Display with static keyword");
//    }
    
    // If a method that is declared as the final we can not override that method, if a method that is declared as final keyword.
//    public void display3() {
//        System.out.println("Super Display with final method()");
//    }
}

public class OverridingRules {
    public static void main(String[] args) {
        Sub sb = new Sub();
        sb.display();
    }
}


/*
Output:-
------------
Sub Display

*/