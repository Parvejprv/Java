/*
Student Challenges:-
-------------------------
You have been given two challanges related to the inheritance practice-
------------------------

1). You have to Write the class Account 
 
*/






package inheritance;

import java.util.Scanner;

class CellPhone{
    
    public String ph_no;
    public String imie;
    
    // Constructor
    public CellPhone(String ph_no, String imie) {
        this.ph_no = ph_no;
        this.imie = imie;
    }
    
    // Methods of CellPhone
    public void call(String number){
        System.out.println("Calling " + number + " from " + ph_no);
    }
    
    public void sms(String number, String message) {
        System.out.println("Sending SMS to " + number + ": " + message);
    }
    
    public void saveCotnact(String name, String number) {
        System.out.println("Saving contact : " + name + " - " + number);
    }
    
    public void deleteContact(String name) {
        System.out.println("Deleting contact : " + name);
    }
}

class SmartPhone extends CellPhone {
    public String MAC;
    
    // Constructor
    public SmartPhone(String ph_no, String imie, String MAC) {
        super(ph_no, imie);
        this.MAC = MAC;
    }
    
    public void clickPicture() {
        System.out.println("Clicking picture...");
    }
    public void capturingVideo() {
        System.out.println("Capturing video...");
    }
    public void videoCall(String number) {
        System.out.println("Making a video call to " + number);
    }
    
    public void playingVideo(String videoName){
        System.out.println("Playing video : " + videoName);
    }
    
    public void playingMusic(String trackName){
        System.out.println("Playing music : " + trackName);
    }
}

public class StudentChallenge1_CellPhone_SmartPhone {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        // Enter the SmartPhone Details
        System.out.println("Enter phone number: ");
        String ph_no = sc.nextLine();
        
        System.out.println("Enter IMEI number: ");
        String imie = sc.nextLine();
        
        System.out.println("Enter the MAC Address: ");
        String MAC = sc.nextLine();
        
        // Create an object of SmartPhone
        SmartPhone smartphone = new SmartPhone(ph_no, imie, MAC);
        
        // Perfrom all methods
        System.out.println("CellPhone Functionalities:");
        
        System.out.println("Enter a number to call: ");
        String number = sc.nextLine();
        smartphone.call(number);
        
        System.out.println("Enter another number to send the sms: ");
        String number2 = sc.nextLine();
        System.out.println("Enter message details to send in sms: ");
        String message = sc.nextLine();
        smartphone.sms(number2, message);
        
        System.out.println("Enter name to save contact: ");
        String name = sc.nextLine();
        
        smartphone.saveCotnact(name, number);
        
        smartphone.deleteContact(name);
        
        
        System.out.println("\nSmartPhone Additional Functionalities:");
        smartphone.clickPicture();
        smartphone.capturingVideo();
        smartphone.videoCall("987-765-5431");
        smartphone.playingVideo("Vacation.mp4");
        smartphone.playingMusic("Favorite song.mp3");
    }
    
}





























/*



package inheritance;

class CellPhone{
    
    public String ph_no;
    public String imie;
    
    // Constructor
    public CellPhone(String ph_no, String imie) {
        this.ph_no = ph_no;
        this.imie = imie;
    }
    
    // Methods of CellPhone
    public void call(String number){
        System.out.println("Calling " + number + " from " + ph_no);
    }
    
    public void sms(String number, String message) {
        System.out.println("Sending SMS to " + number + ": " + message);
    }
    
    public void saveCotnact(String name, String number) {
        System.out.println("Saving contact : " + name + " - " + number);
    }
    
    public void deleteContact(String name) {
        System.out.println("Deleting contact : " + name);
    }
}

class SmartPhone extends CellPhone {
    public String MAC;
    
    // Constructor
    public SmartPhone(String ph_no, String imie, String MAC) {
        super(ph_no, imie);
        this.MAC = MAC;
    }
    
    public void clickPicture() {
        System.out.println("Clicking picture...");
    }
    public void capturingVideo() {
        System.out.println("Capturing video...");
    }
    public void videoCall(String number) {
        System.out.println("Making a video call to " + number);
    }
    
    public void playingVideo(String videoName){
        System.out.println("Playing video : " + videoName);
    }
    
    public void playingMusic(String trackName){
        System.out.println("Playing music : " + trackName);
    }
}

public class StudentChallenge1_CellPhone_SmartPhone {
    
    public static void main(String[] args) {
        
        // Create an object of SmartPhone
        SmartPhone smartphone = new SmartPhone("123-456-7890", "IMEI123456789", "MAC00:1A:2B:3C:4D:5E");
        
        // Perfrom all methods
        System.out.println("CellPhone Functionalities:");
        smartphone.call("987-654-3210");
        smartphone.sms("987-654-3210", "Hello!");
        smartphone.saveCotnact("Alice", "987-654-3210");
        smartphone.deleteContact("Alice");
        
        
        System.out.println("\nSmartPhone Additional Functionalities:");
        smartphone.clickPicture();
        smartphone.capturingVideo();
        smartphone.videoCall("987-765-5431");
        smartphone.playingVideo("Vacation.mp4");
        smartphone.playingMusic("Favorite song.mp3");
    }
    
}

*/


/*
Output:-
-----------
CellPhone Functionalities:
Calling 987-654-3210 from 123-456-7890
Sending SMS to 987-654-3210: Hello!
Saving contact : Alice - 987-654-3210
Deleting contact : Alice

SmartPhone Additional Functionalities:
Clicking picture...
Capturing video...
Making a video call to 987-765-5431
Playing video : Vacation.mp4
Playing music : Favorite song.mp3


*/