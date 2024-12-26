/*
Dynamic method Dispatch:
-----------------------------
If a Super class reference using the Sub class object and it called a overrided method that is called dynamic method dispatch.
- In dynamic method dispatch method of the object will called. Not the method of the reference will called.



*/


package inheritance;


class Super {
    public void meth1() {
        System.out.println("Super meth1()");
    }
    public void meth2() {
        System.out.println("Super meth2()");
    }
}

class Sub extends Super {
    @Override
    public void meth2() {
        System.out.println("Sub meth2()");
    }
    public void meth3() {
        System.out.println("Sub meth3()");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        
        // Dynamic method dispatch, here Super class reference has only meth1() and meth2() in the Super class , it means method of the object get called, so that cannot access the meth3() of the Sub class
        Super s = new Sub();
        s.meth1();
        s.meth2();
        

        
        

//        Sub sb = new Sub();
//        sb.meth1();     // Super meth1()    
//        sb.meth2();     // Sub meth2()
//        sb.meth3();     // Sub meth3()
        
        
    }
}


/*
Output:-
----------
Super meth1()
Sub meth2()



// after creating an object of the Sub class
Super meth1()
Sub meth2()
Sub meth3()

*/