/*
Static Practice:-
--------------------



*/


package pkg16.pkgstatic.and.pkgfinal;


class Test1 {
    static int x = 10;
    int y = 20;
    
    void show() {
        System.out.println(x + " " + y);
    }
    
    static void display() {
        // System.out.println(x+ " " + y);     // non-static variable y can not be reference from the static context
        System.out.println(x + " "); 
    }
}

public class StaticPractice {
   
    public static void main(String[] args) {
        
//        Test1 t = new Test1();
//        t.show();       // 10 20
//        t.display();    // 10



        Test1 t1 = new Test1();
        t1.x = 30;
        t1.y = 50;
        t1.show();
        
        Test1 t2 = new Test1();
        t2.show();
        
    }
    
}


/*
Output:-
---------
10 20
10 


// Before changing the value
10 20
10 20



// After setting value 
30 50
30 20

*/