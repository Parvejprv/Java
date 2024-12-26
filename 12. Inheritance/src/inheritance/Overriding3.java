/*
 Overriding example practice
-------------------------------

Let suppose we have to write the class for Car and LuxuryCar and also introduced method overriding with them


*/

package inheritance;

class Car {
    public void start() {
        System.out.println("Car started.");
    }
    public void accelerate() {
        System.out.println("Car is accelerated.");
    }
    public void changeGear() {
        System.out.println("Car gear is changed.");
    }
}

class LuxuryCar extends Car {
//    @Override
//    public void start() {
//        System.out.println("Luxury Car started.");
//    }
//    @Override
//    public void accelerate() {
//        System.out.println("Luxury Car is accelerated.");
//    }
    @Override
    public void changeGear() {
        System.out.println("Luxury Car gear is changed Automatically.");
    }
    
    public void openRoof() {
        System.out.println("Luxury Car roof is opened.");
    }
    public void closeRoof() {
        System.out.println("Luxury Car roof is closed.");
    }
}

public class Overriding3 {
    public static void main(String[] args) {
        
//        // Create a Car Object
//        Car c = new Car();
//        c.start();
//        c.accelerate();
//        c.changeGear();
        
        
        // Create Object of the Luxury class
        LuxuryCar luxCar = new LuxuryCar();
        luxCar.start();
        luxCar.accelerate();
        luxCar.changeGear();
        
        luxCar.openRoof();
        luxCar.closeRoof();
        
    }
}


/*
Output:-
----------
Car started.
Car is accelerated.
Car gear is changed.




Luxury Car started.
Luxury Car is accelerated.
Luxury Car gear is changed Automatically.
Luxury Car roof is opened.
Luxury Car roof is closed.






Car started.
Car is accelerated.
Luxury Car gear is changed Automatically.
Luxury Car roof is opened.
Luxury Car roof is closed.

*/