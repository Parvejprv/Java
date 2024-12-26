/*

Question : Interface Example

*/

package pkg14.interfaces.inheritance;


class Phone {
    public void call() { System.out.println("Phone call"); }
    public void sms() { System.out.println("Phone sending SMS"); }
}

interface ICamera {
    void click();
    void record();
}

interface IMusicPlayer {
    void play();
    void pause();
    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {
    public void videoCall() { System.out.println("Smart Phone video calling."); }
    public void click() { System.out.println("Smart Phone Clicking Photo"); }
    public void record() { System.out.println("Smart Phone recording video"); }
    public void play() { System.out.println("Smart Phone Playing music"); }
    public void pause() { System.out.println("Smart Phone Paused music"); }
    public void stop() { System.out.println("Smart Phone Stopped music"); }
    
}

public class InterfaceExample {
    public static void main(String[] args) {
        
        /* Let's create an object of SmartPhone and reference of SmartPhone and the method that are accessible using the SmartPhone reference given below */
        SmartPhone sp = new SmartPhone();
//        sp.call();
//        sp.sms();
//        sp.videoCall();
//        sp.click();
//        sp.record();
//        sp.play();
//        sp.pause();
//        sp.stop();
//        
        
        
        
        
        
        
        
        
//        Phone p = sp;
//        p.call();
//        p.sms();
        
        
        
//        ICamera c = sp;
//        c.click();
//        c.record();
        
        

        IMusicPlayer mp = sp;
        mp.play();
        mp.pause();
        mp.stop();
        
        








// See the beauty of Obejct Oriented Programming, is that I am using the SmartPhone as an object but some time I am treating this object like a phone, and some time as a ICamera, and some time IMusicPlayer.
// That means at that time I am achieving runtime polymorphism, and using dynamic method dispatch.

//SmartPhone sp = new SmartPhone();       // at this time this is an SmartPhone

//Phone ph = new SmartPhone();        // This time I am using SmartPhone just as a Phone

//ICamera c = new SmartPhone();           // This time as a Camera

//IMusicPlayer mp = new SmartPhone();         // This time treating as an Music Player









        
    }
}



/*
Output:-
-----------


// Let create the SmartPhone class and the methods that are accessible using the SmartPhone class reference are -
Phone call
Phone sending SMS
Smart Phone video calling.
Smart Phone Clicking Photo
Smart Phone recording video
Smart Phone Playing music
Smart Phone Paused music
Smart Phone Stopped music






// Let use the Phone class reference 
Phone call
Phone sending SMS




// Let use the ICamera reference
Smart Phone Clicking Photo
Smart Phone recording video





// Let use the IMusicPlayer reference
Smart Phone Playing music
Smart Phone Paused music
Smart Phone Stopped music



*/