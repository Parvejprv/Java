/*
Question: Practice for callback method inside an iterface

*/

package pkg14.interfaces.inheritance;

interface Member {
    void callback();
}

class Store {
    Member mem[] = new Member[100];
    int count = 0;
    
    void register(Member m) {
        mem[count++] = m;
    }
    
    void inviteSale() {
        for(int i=0; i<count; i++) {
            mem[i].callback();
        }
    }
}

class Customer implements Member {
    String name;
    
    public Customer (String n) {
        name = n;
    }
    
    @Override
    public void callback() {
        System.out.println("Ok, I will visit " + name);
    }
}


public class CallbackMethod {
    
    public static void main(String[] args) {
        
        Store s = new Store();
        
        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("John");
        s.register(c1);
        s.register(c2);
        
        s.inviteSale();
        
        
    }
    
}



/*
Output:-
------------
Ok, I will visit Alice
Ok, I will visit John


*/