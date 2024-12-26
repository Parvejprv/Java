/*
 - Polymorphism  in inheritance
*/




/*


// Method overloading (within the same class, method having the same name with different parameter)

package pkg12.inheritance;

class Test {
    public int max(int a, int b){
        return a>b ? a : b;
    }
//    public int max(int a, int b, int c){
//        if(a>b && a>c) return a;
//        else if (b > c) return b;
//        else return c;
//    }
    
    public int max(int a, int b, int c){
        return (a>b && a>c) ? a : ( (b>c) ? b : c);
    }
}

public class PlymorphismInInheritance {
    public static void main(String[] args) {
        Test t = new Test();
        
        int maxBet2Numbers = t.max(10, 50);
        System.out.println("Maximum between two integer : " + maxBet2Numbers);
        
        
        int maxBet3Numbers = t.max(10, 500, 354);
        System.out.println("Maximum between three integer : " + maxBet3Numbers);
    
    
    }
}


*/


/*
Output:-
---------
Maximum between two integer : 50
Maximum between three integer : 500

*/






















// Method overriding (outside the same class, method having the same name with same signature and parameters)

package pkg12.inheritance;

class Super {
    public void display() {
        System.out.println("Super display");
    }
    public int max(int a, int b){
        return a>b ? a : b;
    }
//    public int max(int a, int b, int c){
//        if(a>b && a>c) return a;
//        else if (b > c) return b;
//        else return c;
//    }
    
    public int max(int a, int b, int c){
        return (a>b && a>c) ? a : ( (b>c) ? b : c);
    }
}

class Sub extends Super {
    @Override
    public void display() {
        System.out.println("Super display");
    }
    @Override
    public int max(int a, int b){
        return a>b ? a : b;
    }
}

public class PlymorphismInInheritance {
    public static void main(String[] args) {
        Sub t = new Sub();
        
        int maxBet2Numbers = t.max(10, 50);
        System.out.println("Maximum between two integer : " + maxBet2Numbers);
        
        
        int maxBet3Numbers = t.max(10, 500, 354);
        System.out.println("Maximum between three integer : " + maxBet3Numbers);
    
    
    }
}






