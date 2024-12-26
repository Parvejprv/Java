/*
 Singleton class:-
--------------------
- The class for which we can write only single copy of object that is called singleton class.
- 
*/
package pkg16.pkgstatic.and.pkgfinal;


class CoffeeMachine{
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;
    
    static private CoffeeMachine my = null;
    
    private CoffeeMachine() 
    {
        coffeeQty = 1;
        milkQty = 1;
        waterQty = 1;
        sugarQty = 1;
    }
    
    public void fillWater(float qty) {
        waterQty = qty;
    }
    public void fillSugar(float qty) {
        sugarQty = qty;
    }
    public float getMilk(float milkQty) {
        return milkQty;
    }
    public float getCoffee(float coffeeQty) {
        return 0.23f;
    }
    
    static CoffeeMachine getInstance() {
        if(my == null) {
            my = new CoffeeMachine();
        }
        return my;
    }
}

public class SingleTonClasses {
    public static void main(String[] args) {
        
        CoffeeMachine m1 = CoffeeMachine.getInstance();
        CoffeeMachine m2 = CoffeeMachine.getInstance();
        CoffeeMachine m3 = CoffeeMachine.getInstance();
        
        System.out.println(m1 + "\t" + m2 + "\t" + m3);
        if(m1 == m2 && m2 == m3) {
            System.out.println("Same");
        }
        
    }
}


/*
Output:-
---------
pkg16.pkgstatic.and.pkgfinal.CoffeeMachine@5f184fc6	pkg16.pkgstatic.and.pkgfinal.CoffeeMachine@5f184fc6	pkg16.pkgstatic.and.pkgfinal.CoffeeMachine@5f184fc6
Same


*/