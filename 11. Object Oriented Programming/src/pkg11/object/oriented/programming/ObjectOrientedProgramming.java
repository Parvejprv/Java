/*
11. Object Oriented Programming:-
-----------------------------------
Abstraction :-
----------------
- Hiding internal details and showing only require features with some extra features.


2. Encapsulation :-
---------------------
- Wrapping or binding the complete code into a single package is known as Encapsulation.


3.  Inheritance :- Inheritance means Specialization
---------------------
- If a Sub class inherit all the propety and members of the Super class is known as a Inheritance.
- During Inheritance we use the extends keyword to inherit the property and members of the Super class.
- reusing the code.

4. Plymorphism :-
----------------------
    a). Specialization -  
    b). Generalization -  You can refer a group of object with a single name that is called general term, and Generalization is achieved using the polymorphism.
        Television - Samsung TV, LG TV, Sony TV.

*/
package pkg11.object.oriented.programming;



class Television {
    
    // Private instance variable
    private int channel;
    private int volume;
    
    // Cosntructor optional, but useful for initializing values
    Television() {
        this.channel = 1;        // Default channel
        this.volume = 50;       // Default volume
    }
    
    // Getter and Setter methods
    // Getter
    public int getChannel() {
        return channel;
    }
    public int getVolume() {
        return volume;
    }
    
    // Setter
    public void setChannel(int channel) {
        if(channel > 0) {
            this.channel = channel;
        } else {
            System.out.println("Invalid channel number. Channel must be positive.");
        }
    }
    public void setVolume(int volume) {
        if(volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println("Invalid volume level. Volume must be between 0 and 100.");
        }
    }
    
    // Behaviour methods
    public void increaseVolume() {
        // if volume is less than 100, then only we will increase the volume
        if(volume < 100) {
            volume++;
            System.out.println("Volume increased to " + volume);
        } else {
            System.out.println("Volume is already maximum.");
        }
    }
    public void decreaseVolume() {
        // if volume is positive, then only we will decrease the volume
        if(volume > 0) {
            volume--;
            System.out.println("Volume decreased to " + volume);
        } else {
            System.out.println("Volume is already muted.");
        }
    }
    
    public void changeChannel (int newChannel) {
        if(newChannel > 0) {
            // asing newChannel to original channel
            channel = newChannel;
            System.out.println("Channel changed to " + channel);
        } else {
            System.out.println("Invalid channel number. Channel must be positive.");
        }
    }
    
    
    // Override the toString() for better representation
    @Override
    public String toString() {
        return "Television: Channel " + channel + ", Volume " + volume ;
    }
    
    
}


public class ObjectOrientedProgramming {

    public static void main(String[] args) {
      
       Television myTV = new Television(); 
        System.out.println(myTV);       // Default state
        
        
        myTV.setChannel(5);
//        myTV.increaseVolume();
        myTV.changeChannel(10);
        
        System.out.println(myTV);       // Updated State
    }
    
}
