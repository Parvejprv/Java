/*
Collections 
=============


What are Collection?
-----------------------
Collection in java is a framework that is used for organising, managing, and manipulating the data.



Let understand the concept of collection and interfaces related to the collection interface.

1. Iterable Interface: This is the root of the Collection fromework.

2. Collection Interface
This interface extends the iterable interface and is implemented by all the classes in the collection framework. This interface contains all the basic methods which every collection has like adding the data into the collection, removing the data, clearing the data, etc. All these methods are implemented in this interface because these methods are implemented by all the classes irrespective of their style of implementation. And also, having these methods in this interface ensures that the names of the methods are universal for all the collections. Therefore, in short, we can say that this interface builds a foundation on which the collection classes are implemented.

interface Collection
---------------------
add(E e)
addAll(Colletion<E> c)
remove(Object o)
removeAll(Collection<E> c)
retainAll(Collection<E> c)
clear()
isEmpty()
contains(Object o)
contains(Object o)
containsAll(Collection<E> c)
equals(Object o)
size()
iteraror()
toArray()



3. List Itnerfaces: List represents ordered collection of elements (i.e.) indexing is there, and there may be duplicates also.
- List Interface is extending or inheriting from Collection Interface.

interface List extends Collection {
    add(int index, E e)         // adding at the given index
    addAll(int index, Collection<E> c)  // adding at the given index from another collection
    remove(int index)
    get(int index)
    set(int index, E e)
    subList(int from, int to)
    indexOf(Object o)
    lastIndexOf(Object o)
    Iterator()
    listIterator(int index)
}


4. Set Interface: Set represents un-ordered collection of elements (i.e.) indexing is not there, and it does not contain duplicate values.

interface Set extends Collection {

}


Note:- It (Set) interface has the same methods as Collection interface, and does not have any extra method.



5. Queue Interface: Queue Interface is useful for supporting FIFO (first in first out) mechanism.


interface Queue extends Collection 
{
    add(E e)
    .poll()  - to remove the value from first, if a Queue is empty it will return 'null'
    .remove()   -   to remove the value from FIFO, if a Queue is empty it throws an exception as NoSuchElementException
    .peek() -   to know that what will be the first element, and if the Queue is empty it return null
    .element()  -   to know the first value from Queue, if a Queue is empty it throws an exception as NoSuchElementException
}




Note:- Oracle provides the Java Documentation, 
Here is the link related to the Java Documentation by Oracle,   
link:   https://download.java.net/java/early_access/jdk24/docs/api/java.base/java/util/package-summary.html




Here is the link for the Collection interface:
link:   https://download.java.net/java/early_access/jdk24/docs/api/java.base/java/util/Collections.html 




Here is the link for List Interface:
https://download.java.net/java/early_access/jdk24/docs/api/java.base/java/util/List.html




Here is the link for Set Interface:
https://download.java.net/java/early_access/jdk24/docs/api/java.base/java/util/Set.html




Here is the link for Queue Interface:
https://download.java.net/java/early_access/jdk24/docs/api/java.base/java/util/Queue.html



*/




package pkg25.collections;


public class Collections {

    public static void main(String[] args) {
        
        
        
    }
    
}
