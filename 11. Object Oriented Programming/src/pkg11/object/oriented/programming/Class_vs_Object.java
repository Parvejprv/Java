/*
Topic:
----------
class vs object


*/
package pkg11.object.oriented.programming;



class Television  {
    private int channel;
    private int volume;
    
    // Cosntructor
    public Television() {
        this.channel = 1;    // Default channel
        this.volume = 10;    // Default Volume
    }
    
    // Getter for channel
    public int getChannel() {
        return channel;
    }
    
    // Setter for channel
    public void setChannel(int channel) {
        this.channel = channel;
    }
        
    // Getter for volume
    public int getVolume() {
        return volume;
    }
    
    // Setter for volume
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    
    // Method to change the channel
    public void changeChannel(int newChannel) {
        setChannel(newChannel);
        System.out.println("Channel changed to: " + newChannel);
    }
    
    // Method to change the volume
    public void changeVolume(int newVolume) {
        setVolume(newVolume);
        System.out.println("Volume changed to: " + newVolume);
    }
        
}



public class Class_vs_Object {
    public static void main(String[] args) {
        
        Television t = new Television();
        t.changeChannel(5);
        t.changeVolume(50);
        
    }
}


/*
Output:-
----------
Channel changed to: 5
Volume changed to: 50


*/
















/*

class Television {
    private int channel;
    private int volume;
    
    public void changeChannel() {
        
    }
    
    public void changeVolume() {
        
    }
}

public class Class_vs_Object {
    public static void main(String[] args) {
        Television t = new Television();
    }
}

*/



/*
Output:-
---------


*/