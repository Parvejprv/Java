/*
Callback method():-
---------------------


*/
package pkg14.interfaces;

interface Member {
    void callback();
}

class Store{
    Member mem[] = new Member[100];     // create a member array
    int count = 0;
    
    void register(Member m) {
        mem[count++] = m;
    }
    void inviteSale() {
        for(int i=0; i<count; i++){
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
    public void callback(){
        System.out.println("Ok, I will visit " + name);
    }
}

public class Callback {
    public static void main(String[] args) {
        Store s = new Store();
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Smith");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
}



/*
Output:-
---------
Ok, I will visit John
Ok, I will visit Smith

*/