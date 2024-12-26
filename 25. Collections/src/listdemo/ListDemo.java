/*
ArrayList and Iterator:-
--------------------------



*/


package listdemo;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        
        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));
        
        al1.add(10);        // 10 will be added
        al1.add(0, 5);      // 5 will be added at index 0, and 10 will be shift to next
//        al1.addAll(al2);    // al2 will be added to the al1
        al1.addAll(1, al2);     // added the al2 from index 1 till the elements inside al2, and 10 will be shifted at the end
        
        System.out.println("al1 50 contains or not: " + al1.contains(50) );        // to check whether al1 contains 50 or not, if yes --> true, otherwise --> false
        
        System.out.println("al1 25 contains or not: " + al1.contains(25));
        System.out.println("al1 contains al2 or not: " + al1.containsAll(al2));
        
        System.out.println(al1.get(5));         // get the value of the 5th index
        
        System.out.println(al1.indexOf(70));    // to find out index of 70 --> 3
        al1.add(6, 70);         // let add duplicate element to the list
        System.out.println(al1);
        
        
        al1.set(5, 100);            // set the element of 5th index as 100
        System.out.println(al1);
        
        // index of 70  i.e. it will find first occurance 
        System.out.println("index of element 70 (first occurance): " + al1.indexOf(70));
        System.out.println(al1);
        
        // last index of 70
        System.out.println("last index of element 70 (last occurance): " + al1.lastIndexOf(70));
        System.out.println(al1);
        
        
        al1.remove(6);         // this will remove 70, whether first occurance
        System.out.println(al1);
        
        
        // Iterate and print the element one by one from ArrayList
//        for(int i=0; i<al1.size(); i++)
//            System.out.print(al1.get(i) + "\t");

        // Using for each loop
//        System.out.println("ArrayList Elements one by one using for each loop, ");
//        for(Integer x:al1) {
//            System.out.print(x + " ");
//        }


         // Using Iterator, It allows only to move forward direction only.
         Iterator<Integer> it = al1.iterator();
         
         System.out.println("Let's Iterate the element using the Iterator,");
         while(it.hasNext()) {
             System.out.print(it.next() + "\t");
         }
         
         System.out.println("");
         
         // Using ListIterator, It allows to access bi-directional access means it can move either direction, forward and backward direction. it has methods such as, next(), previous, hasNext(), hasPrevious, nextIndex(), previousIndex etc for moving both directional.
         ListIterator<Integer> lit = al1.listIterator();
         
         System.out.println("Let's Iterate the element of an ArrayList using ListIterator,");
         while(lit.hasNext()) {
             System.out.print(lit.next() + " ");
         }

         // Lets convert the same above iterator as for loop
         System.out.println("\nIterator using for loop,");
         for(ListIterator<Integer> lit2 = al1.listIterator(); lit2.hasNext();) {
             System.out.print(lit2.next() + " ");
         }
         
         
         // forEach
         System.out.println("\nUsing forEach,");
         al1.forEach(n->System.out.print(n + " "));
         
        
         // Using scope resolution
         System.out.println("\nUsing a scope resolution operator,");
         al1.forEach(System.out::print);
         
         
         // function inside forEach
         System.out.println("\nfunction calling with the help of forEach..");
         al1.forEach(n->show(n));
         
    }
    
    // Let print the element greater than 60
    static void show(int n) {
        if(n > 60) {
            System.out.println(n);
        }
    }
}



/*
Output:
---------

// Let print the array list after adding the al2 to al1 without specifying the starting index
[5, 10, 50, 60, 70, 80, 90]


// 50 contains or not
true

// 25 contains or not
false

// al1 contains al2 or not
true


// value of the 5th index
90
// index of value 70 is,
3

// Let print the array list after adding the al2 to the al1 with specifying the starting index
[5, 50, 60, 70, 80, 90, 10]










*/