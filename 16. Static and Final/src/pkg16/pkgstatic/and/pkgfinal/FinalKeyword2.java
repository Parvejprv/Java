/*
 Final Keyword
---------------------

Final Variable:-
------------------------
- A Final Variable can not be modified, it is acting just like a constant.
- Final variable can be written in capital letter
- Here are the way of initializing final variable,
    Ex-
    
    class My {
    
        final int MIN = 1;
        final int NORMAL;
        final int MAX;

        static {
            NORMAL = 5;
        }

        My (MAX = 10) {

        }
    
    }




*/
package pkg16.pkgstatic.and.pkgfinal;

// Final Methods, Can not be override, i.e. it can not be redefined
class Super {
    final void meth1() {
        System.out.println("Final Method from Final Methods");
    }
}

class Sub extends Super {
    // Final method can not be override,
//    void meth1(){
//        System.out.println("Final Method from Child class.");
//    }
    
    
    // It can have its own method but final method can not be override
    void meth2() {
        System.out.println("Display from meth2, from Child class");
    } 
}



class My {
    // 1. We can directly initialize a final variable
    final int MIN = 1;
    final static int NORMAL;
    final int MAX;
    
    // 2. We can also initialize the final variable using static block
    static {
        NORMAL = 5;
    }
    
    
    // 3. We can initialize the Final variable inside the constructor
    public My() {
        MAX  = 50;
    }
    
    
    
}

public class FinalKeyword2 {
    public static void main(String[] args) {
        
    }
}
