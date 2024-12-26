/*
Dynamic Method Dispatch:-
--------------------------
Dynamic method dispatch:-
--------------------------------
- If a Super class has the reference of the super class but having the object of the sub class, is known as the Dynamic method dispatch.


*/
package pkg12.inheritance;


class TV {
    public void switchOn() { System.out.println("TV is switched ON"); }
    public void changeChannel() { System.out.println("TV Channel is Changed"); }
}
class SmartTV extends TV {
    @Override
    public void switchOn() { System.out.println("SmartTV is switched ON"); }
    @Override
    public void changeChannel() { System.out.println("SmartTV Channel is Changed"); }
    public void browse() { System.out.println("SmartTV is Browing"); }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Let's create a TV (Parent class object)
//        TV t = new TV();
//        t.switchOn();
//        t.changeChannel();
        
        
        
        // Let create a child class object
        SmartTV sTV = new SmartTV();
        sTV.switchOn();
        sTV.changeChannel();
        sTV.browse();
        
        
        // Using Dynamic Method Dispatch, here we can not call the browse method
        TV t1 = new SmartTV();
        t1.switchOn();
        t1.changeChannel();
        

    }
}
