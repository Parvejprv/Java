/*
Method Practice:
---------------------
Note: There are two ways of calling a methods-

1). static method can be referenced using the static member only.
2). Non-static method can be called by creating an object of the class.


*/
package methodpractice;


public class MethodPractice 
{   
    static int max(int x, int y ){
        if(x > y)
            return x;
        else 
            return y;
    }
    
    public static void main(String[] args) {
        int a = 10, b = 5;
     
        // System.out.println("Maximum = " + max(a, b));
        
        
        MethodPractice mp = new MethodPractice();
        System.out.println("Max = " + mp.max(a,b));
        
    }
}


/*
Output:-
----------
Maximum = 10


Max = 10
*/