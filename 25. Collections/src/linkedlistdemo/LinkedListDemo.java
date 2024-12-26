/*
Linked List :
--------------



Doubly Linked List: 
=====================
- Doubly-linked list implementation of the List and Deque interfaces. Implements all optional list operations, and p
All of the operations perform as could be expected for a doubly-linked list.
- Shifting in linked list deos not necessary, for insertion and deletion of elements.
- We need to modify the link only


*/


package linkedlistdemo;
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Creation of LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        LinkedList<Integer> linkedList2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));
        
        // 3rd LinkedList
        LinkedList<Integer> linkedList3 = new LinkedList<>();
        
        
        linkedList.add(10);
        linkedList.addAll(1, linkedList2);
        linkedList.add(0, 5);
        linkedList.set(6, 100);
        
        
        System.out.println("also display elements before adding, first and last element with the help of LinkedList addFirst() and addLast() methods.");
        linkedList.forEach(n->show(n));     // also display elements before adding, first and last element with the help of LinkedList addFirst() and addLast() methods.
        
        System.out.println("\n\n");
        
        
        System.out.println("Display elements After adding, first and last element with the help of LinkedList addFirst() and addLast() methods.");
        linkedList.addFirst(3);
        linkedList.addLast(500);
        
        // Display the linkedList element using the forEach 
        linkedList.forEach(n->show(n));
        
        
        // Now, similarily addFirst(), addLast() we can also use removeFirst(), removeLast() to remove the elements from the first and last position.
        System.out.println("Now, similarily addFirst(), addLast() we can also use removeFirst(), removeLast() to remove the elements from the first and last position.");
        linkedList.removeFirst();
        linkedList.removeLast();
        
        linkedList.forEach(n->show(n));
        
        
        // retainAll()
        System.out.println("Let use the ratainAll()");
        linkedList.retainAll(linkedList);
        System.out.println("Collection after retailAll(),");
        linkedList.forEach(n->show(n));
        
        
        System.out.println("display the linkedList3 elements after cloning the elements");
        // clone()
        linkedList3 = (LinkedList<Integer>) linkedList.clone();
        // display the linkedList3 elements after cloning the elements
        linkedList.forEach(n->show(n));
        
        
        System.out.println("display the linkedList elements after removing all the elements,");
        // removeAll()
        linkedList.removeAll(linkedList2);
        linkedList.forEach(n->show(n));         // display the linkedList elements after removing all the elements,
        
    }
    
    static void show(int n) {
        // if(n > 60) 
            System.out.println(n);
    }
}

/*
Output:-
----------

5 
10 
50 
60 
70 
80 
100




3
5
10
50
60
70
80
100
500








also display elements before adding, first and last element with the help of LinkedList addFirst() and addLast() methods.
5
10
50
60
70
80
100



Display elements After adding, first and last element with the help of LinkedList addFirst() and addLast() methods.
3
5
10
50
60
70
80
100
500         // last element
Now, similarily addFirst(), addLast() we can also use removeFirst(), removeLast() to remove the elements from the first and last position.
5
10
50
60
70
80
100
Let use the ratainAll()
Collection after retailAll(),
5
10
50
60
70
80
100
display the linkedList3 elements after cloning the elements
5
10
50
60
70
80
100
display the linkedList elements after removing all the elements,
5
10
100



*/