/*
Generalization :-
---------------------
- Generalizaion means grouping or refering the objects with a single or general term, is known as generalization.
Like:-

Students
    - CSE students
    - IT students
    - CE students
    - EE students
    - ME students


Performers
    - Salsa Dance performers
    - Belly Dance Performers
    - Hip-hop Dance Performers
    - Kathak Dance Performers
    - Bharat Natyam Dance Performers

Television
    - LG television
    - Sony television
    - Samsung television
    - Jio television

Smartphone
    - Xiaomi
    - Vivo
    - Oppo
    - Samsung
    - Iphone




Specialization:-
------------------
- Specialization means , enhancement of the previous object's class with some extra features.

Iphone
    - Iphone 7
    - Iphone X
    - Iphone XR
    - Iphone 11
    - Iphone 11 pro
    - Iphone 12
    - Iphone 12 pro


    


*/


/* 
Note:- 
Generalization:-
-------------------
Generalization can be achieve using the Interfaces (used 'implements' keyword).

Specialization:-
-------------------
Specialization can be achieve using the Inheritance (used 'extends' keyword).

*/
package pkg12.inheritance;

class Father {
    public void work() {
        System.out.println("Earning Father");
    }
}
class Son extends Father {
    public void play() {
        System.out.println("Enjoying Son");
    }
}

public class Generalization {
    public static void main(String[] args) {
        // Create an object of the Child class but reference of a parent class
        Father father;
        father = new Son();     // Upcasting (Generalization)
        father.work();
    }
}


/*
Output:-
----------
Earning Father

*/