/*
Rules for Overriding method:-
-----------------------------------
1). Signature of the methods should be exactly same that means Super class method signature and Sub class method signature should be exactly same.
2). If we pass param to the any of the method then it would not be same, it means in such case these method are differents.
3). Overrided method should be annotated with the @Override keyword, otherwise it indicates to add annotation.
4). To Override the method, method should be inside parent class as well as Child class also.
5). If a Super class method of a class return a Super class object then, Another Method of the Sub class return the object of the another Sub class. 
6). Overrided method should not be annotated with final, it means overrided method should not be final.
7). Similarily we can not override the static method.


Note -
=========


Access modifier heirarchy
---------------------------

private     
protected
public



*/


package inheritance;


//class X {}
//class Y extends X {}
//
//class SuperZ  {
//    public X display() {
//        System.out.println("Super Display");
//        return new X();
//    }
//}
//
//class SubZ extends SuperZ {
//    public Y display() {
//        System.out.println("Sub Display");
//        return new Y();
//    }
//}



/*

class Super11  {
    private void display() {
        System.out.println("Super11 Display");
    }
}

class Sub11 extends Super11 {
    protected void display() {
        System.out.println("Sub11 Display");
    }
}



// ------------------------------------------------

class Super11  {
    protected void display() {
        System.out.println("Super11 Display");
    }
}

class Sub11 extends Super11 {
    protected void display() {
        System.out.println("Sub11 Display");
    }
}





// --------------------------------------------------

class Super11  {
    private void display() {
        System.out.println("Super11 Display");
    }
}

class Sub11 extends Super11 {
    public void display() {
        System.out.println("Sub11 Display");
    }
}




*/










class Super  {
    public void display() {
        System.out.println("Super Display");
    }
}

class Sub extends Super {
    public void display() {
        System.out.println("Sub Display");
    }
}

public class OverrideRules {
    
    public static void main(String[] args) {
        
    }
}


/*
Output:-
--------


*/