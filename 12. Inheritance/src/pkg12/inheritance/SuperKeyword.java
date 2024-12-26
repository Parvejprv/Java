/*


*/
package pkg12.inheritance;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    
    @Override
    void makeSound() {
        super.makeSound();  // Calls the super class method
    }
}

public class SuperKeyword {
    
}
