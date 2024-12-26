/*
 

*/
package pkg12.inheritance;

class Father {
    public void work() {
        System.out.println("Working Father");
    }
}
class Son extends Father {
    @Override
    public void work() {
        System.out.println("Working Son");
    }
}

public class Specialization {
    public static void main(String[] args) {
        
        Father father;
        father = new Son(); 
        father.work();      // Output:- Earning Son (due to method overrided)
        
    }
 
}
