/*
 
Example for Interface?

*/
package pkg14.interfaces;

class Phone {
    void call() {
        System.out.println("Phone calling ...");
    }
    void sms() {
        System.out.println("Phone sending a sms ...");
    }
}

interface Camera{
    void click();   // to click a picture
    void record();  // to record video functionality
}
interface MusicPlayer {
    void play();
    void pause();
    void stop();
}

class SmartPhone extends Phone implements Camera, MusicPlayer
{
    // having an extra method with the inherited previous one also,
    public void videoCall() {
        System.out.println("Smart Phone calling through video call");
    }
    @Override
    public void click() {
        System.out.println("Smart Phone clicking photo");
    }
    @Override
    public void record() {
        System.out.println("Smart Phone recording video");
    }
    @Override
    public void play() {
        System.out.println("Smart Phone playing music");
    }
    @Override
    public void pause() {
        System.out.println("Smart Phone pause the music");
    }
    @Override
    public void stop() {
        System.out.println("Smart Phone stopped the playing music");
    }
}

public class InterfacesExamples {
    public static void main(String[] args) {
        // Create a object of the SmartPhone class
        SmartPhone s = new SmartPhone();
//        Camera c;       // reference of an interface
//        MusicPlayer m;      // reference of an interface
        
//        s.videoCall();
//        s.call();   // method from Parent class
//        s.sms();    // method from Parent class
//        s.click();
//        s.record();
//        s.play();
//        s.play();
//        s.stop();
        
        
        
        
        // Can I change the reference, Yes. But here we can call the method that is related to the Phone class | Parent class only.
        Phone ph = new SmartPhone();
        ph.call();
        ph.sms();
        
        
        
        
        System.out.println("\n\n\n");
        // Reference of the Music
        Camera c = new SmartPhone();
        c.click();
        c.record();
        
        
        System.out.println("\n\n\n");
        // Reference of the MusicPlayer
        MusicPlayer m = new SmartPhone();
        m.play();
        m.pause();
        m.stop();
        
        
        
        
    }
 
}





/*
Output:-
-----------
Phone calling ...
Phone sending a sms ...




Smart Phone clicking photo
Smart Phone recording video




Smart Phone playing music
Smart Phone pause the music
Smart Phone stopped the playing music


*/


