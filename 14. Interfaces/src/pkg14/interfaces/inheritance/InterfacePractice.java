/*
Question: Interface Practice


*/


package pkg14.interfaces.inheritance;

// Let's create an interface Test that has two method (abstract methods) inside it
interface Test {
    void meth1();
    void meth2();
}

// Let's implements a class My
class My implements Test {
    @Override
    public void meth1() {
        System.out.println("meth1() of My");
    }
    @Override
    public void meth2() {
        System.out.println("meth2() of My");
    }
    
    public void meth3() {
        System.out.println("meth3 of My");
    }
}


public class InterfacePractice {
    
    public static void main(String[] args) {
        
        // Can a Super refernce holds the Object of Sub class
//        Test t = new My();          // (Yes! it can hold)
//        t.meth1();
//        t.meth2();
        
        
        
        My my = new My();   
        my.meth1();
        my.meth2();
        my.meth3();
        
        
    }
    
}

/*
Output:-
----------
meth1() of My
meth2() of My



meth1() of My
meth2() of My
meth3 of My

*/