/*
 Static & Final
===================

Static:-
-----------
- static keyword is used for representing the metadata i.e. data about data.
- Static variable belnoging to a class. It is used to share the resources common to all the object.




Here are the property and behavior where we can use the static keyword.
1. Static variables
2. Static methods
3. Static nested class
4. Static Blocks

*/
package pkg16.pkgstatic.and.pkgfinal;

class HondaCity {
    static long price = 10;
    int a, b;
    
    static double onRoadPrice(String city) {
        switch(city){
            case "delhi" :
                return (price + price*0.01);
            case "mumbai" :
                return (price + price*0.09);
            case "lucknow" :
                return (price + price*0.05);
            default :
                return price + price*0.02;
        }
    }
}

public class StaticAndFinal {
    
    public static void main(String[] args) {
        // Create the object of the HondaCity class
        HondaCity h1 = new HondaCity();
        HondaCity h2 = new HondaCity();
        
        // Ecample: Calculate the on-road price for Lucknow
        String city = "lucknow";
        double onRoadPriceH1 = h1.onRoadPrice(city);
        double onRoadPriceH2 = h2.onRoadPrice(city);
        
        
        
        
        System.out.println("On-road price for the city lucknow-");
        System.out.println("On-road price for h1 in " + city + ": " + onRoadPriceH1);
        System.out.println("On-road price for h2 in " + city + ": " + onRoadPriceH2);
        
    }
    
}
