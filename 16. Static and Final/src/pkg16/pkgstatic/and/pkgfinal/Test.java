/*


static variable
------------------
- static members are shared by all the objects of the class.
- If we want to show the information about the data then we use static variables.
- It can be shared by class and it is shared to all the object of the class.


static method
-----------------
- If you want to perform some processing and computation then write as static method.
- static method can only access the static members of the class they can not access the non-static members of the class.
- static method can be access using the class name and they can be access using the object of the class also.



static class
---------------



static block
---------------

*/







package pkg16.pkgstatic.and.pkgfinal;

class HondaCity {
    static long price = 10;
    int a, b;
    
    static double onRaodPrice(String city) {
        switch(city) {
            case "delhi":
                return price + price * 0.1;
            case "mumbai":
                return price + price * 0.9;
            default:
                return 0;
        }
    }
}

public class Test {
    
    public static void main(String[] args) {
        
//        HondaCity h1 = new HondaCity();
//        HondaCity h2 = new HondaCity();
//        System.out.println(h1.price);
//        System.out.println(h2.price);



        System.out.println(HondaCity.price);
        System.out.println(HondaCity.price);
        
    }
    
}


/*
Output:-
---------
10
10




*/


































































/*


package pkg16.pkgstatic.and.pkgfinal;


class HondaCity {
    static long price = 10;
    int a, b;
    
    static double onRoadPrice(String city) {
        switch(city) {
            case "delhi":
                return price + price*0.1;
            case "mumbai":
                return price + price*0.9;
            case "lucknow":
                return price + price*0.5;
            case "kolkata":
                return price + price*0.7;
            default:
                throw new IllegalArgumentException ("Please provide a valid city name");
        }
    }
}

public class StaticIdentifierAndStaticMethod {
    public static void main(String[] args) {
        
        System.out.println("Delhi: " + HondaCity.onRoadPrice("delhi"));
        System.out.println("Mumbai: " + HondaCity.onRoadPrice("mumbai"));
        System.out.println("Lucknow: " + HondaCity.onRoadPrice("lucknow"));
        System.out.println("Kolkata: " + HondaCity.onRoadPrice("kolkata"));
        
        
        try {
            System.out.println("Invalid City: " + HondaCity.onRoadPrice("paris"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
    }
}

*/



/*
Output:-
------------
Delhi: 11.0
Mumbai: 19.0
Lucknow: 15.0
Kolkata: 17.0
Please provide a valid city name




*/