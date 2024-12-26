/*
Array Deque:-
--------------
- A linear collection that supports element insertion and removal at both ends.
- In Deque means double ended queue, and insertion and deletion of the element can be done from both end.



1). 
insert  -   FRONT
delete  -   REAR

2). 
insert  -   REAR
delete  -   FRONT

3).  (Top)
insert  -   REAR
delete  -   REAR

4).
insert  -   FRONT
delete  -   FRONT


Note:-
- The name deque is short for "double ended queue" and is usually pronounced "deck". 
- This interface defines methods to access the elements at both ends of the deque. 
Methods are provided to insert, remove, and examine the element. Each of these methods exists in two forms: one throws an exception if the operation fails, the other returns a special value (either null or false, depending on the operation). 


The tweleve methods described above are summarized in the following table:


Summary of Deque methods
            First Element (Head)                    Last Element (Tail)
      Throws exception	Special value	Throws exception	Special value
Insert	addFirst(e)	offerFirst(e)	addLast(e)	offerLast(e)
Remove	removeFirst()	pollFirst()	removeLast()	pollLast()
Examine	getFirst()	peekFirst()	getLast()	peekLast()


*/


package dequedemo;
import java.util.*;


public class ArrayDequeDemo {
    public static void main(String[] args) {
        // Creation of ArrayDeque
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        
        
        // Here Deque, is also treating as  stack
        // inserting from last
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        
//        dq.forEach((x) -> System.out.println(x));       // 10, 20, 30, 40
        
       
        // deleting from first
        dq.pollFirst();
        
        
        
        /*
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);*/
        
        dq.forEach((x) -> System.out.println(x));
    }
}


/*
Output:-
----------
10
20
30
40






4
3
2
1
10
20
30
40

*/