/*
Interfaces:-


*/


package pkg14.interfaces.inheritance;


interface Test1 {
    void meth1();
    void meth2();
}

class Test2 implements Test1 {
    @Override
    public void meth1() {
        System.out.println("meth1 from Test2");
    }
    @Override
    public void meth2() {
        System.out.println("meth2 from Test2");
    }
}

public class Interfaces {
    
    public static void main(String[] args) {
        
        Test2 t2 = new Test2();
        t2.meth1();
        t2.meth2();
        
        
    }
    
}


/*
Output:-
----------


*/