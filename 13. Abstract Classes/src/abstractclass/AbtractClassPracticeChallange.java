/*
Student Challange- Example#1 | Abstract class
--------------------------------------

Question : Write an abstract class related to the Hospital also inherited that class for making your own Hosptial class

 
*/

package abstractclass;

abstract class Hospital {
    abstract void emergency();
    abstract void appointment();
    abstract void admit();
    abstract void billing();
}

class MyHospital extends Hospital {
    MyHospital() {
        System.out.println("Welcome to MyHospital!");
    }
    
    @Override
    void emergency() {
        System.out.println("Emergency care provided. Doctor and nurse are on standby!");
    }
    @Override
    void appointment() {
        System.out.println("Appointment scheduled. Please check your email for more details.");
    }
    @Override
    void admit() {
        System.out.println("Patient admitted to the hospital. Room and bed assigned.");
    }
    
    @Override
    void billing() {
        System.out.println("Billing completed. Payment options: Cash, Credit, or Insurance.");
    }
}

public class AbtractClassPracticeChallange {
    
    public static void main(String[] args) {
        
        MyHospital myHospital = new MyHospital();
        
        System.out.println("\n--- Hospital Services ---");
        myHospital.emergency();
        myHospital.appointment();
        myHospital.admit();
        myHospital.billing();
        
    }
}

/*
Output:-
---------
Welcome to MyHospital!

--- Hospital Services ---
Emergency care provided. Doctor and nurse are on standby!
Appointment scheduled. Please check your email for more details.
Patient admitted to the hospital. Room and bed assigned.
Billing completed. Payment options: Cash, Credit, or Insurance.

*/