/*
Overriding 2 for TV and SmartTV

 
*/

package inheritance;

class TV {
    public void switchON() { System.out.println("TV is switched ON."); }
    public void changeChannel() { System.out.println("TV Channgel is Changed."); } 
    public void changeVolume () { System.out.println("TV Voluem got Changed."); }
    public void switchOFF() { System.out.println("TV is switched OFF."); }
}

class SmartTV extends TV {
    @Override
    public void switchON() { System.out.println("Smart TV is switched ON."); }
    @Override
    public void changeChannel() { System.out.println("Smart TV Channgel is Changed."); } 
    @Override
    public void changeVolume () { System.out.println("Smart TV Voluem got Changed."); }
    @Override
    public void switchOFF() { System.out.println("Smart TV is switched OFF."); }
    
    public void browse() { System.out.println("Smart TV Browsing"); }
}

public class Overriding2 {
    
    public static void main(String[] args) {
        
        // Lets try to create the object using dynamic dispatch mechanism
//        TV st = new SmartTV();
//        SmartTV smt = new TV();     // TV cannot be converted to SmartTV (now allowed)
        
        
        
        
//        // Create an Object of the TV class
//        TV t = new TV();
//        t.switchON();
//        t.changeChannel();
//        t.changeVolume();
//        t.switchOFF();
        
        
////         Create an Object of the SmartTV class
//        SmartTV st = new SmartTV();
//        st.switchON();
//        st.changeChannel();
//        st.changeVolume();
//        st.browse();
//        st.switchOFF();
        





           // Using dynamic method dispatch, here we are using the reference of the TV and object of the SmartTV, so that we can not get the SmartTV browse() method because we are using the reference of the Old TV.
           TV t = new SmartTV();
           t.switchON();
           t.changeChannel();
           t.changeVolume();
//           t.browse();  (Not accessible)    
           t.switchOFF();



        
        
    }
    
}


/*
Output:-
-----------
TV is switched ON.
TV Channgel is Changed.
TV Voluem got Changed.
TV is switched OFF.




Smart TV is switched ON.
Smart TV Channgel is Changed.
Smart TV Voluem got Changed.
Smart TV Browsing
Smart TV is switched OFF.

*/