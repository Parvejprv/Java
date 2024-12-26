/*
AbstractClassPracticeExample#2

*/


package abstractclass;

abstract class KFC {
    public KFC() {
        System.out.println("KFC Constructor");
    }
    
    public void makeItem() {
        System.out.println("makeItem() of KFC");
    }
    
    // Abstract method
    abstract void billing();
    abstract void offer();
}

class MyKFC extends KFC {
    
    public MyKFC() {
        System.out.println("Welcome to MyKFC:)");
    }
    
    @Override
    public void billing() {
        System.out.println("MyKFC billing()");
    }
    @Override
    public void offer() {
        System.out.println("MyKFC offer()");
    }
    
    
    public void festivalOffer() {
        System.out.println("Festival offer of MyKFC");
    }
    
}


public class AbstractClassPractice2 {
    
    public static void main(String[] args) {
        
        MyKFC  mykfc = new MyKFC();
        mykfc.billing();
        mykfc.offer();
        mykfc.festivalOffer();
        
    }
    
}


/*
Output:-
----------
KFC Constructor
Welcome to MyKFC:)
MyKFC billing()
MyKFC offer()
Festival offer of MyKFC



*/