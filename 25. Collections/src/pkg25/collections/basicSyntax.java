/*
Collections:-
---------------



What is a framework in Java?
-----------------------------
A framework is a set of classes and interfaces which provide a ready-made architecture. In order to implement a new feature or a class, there is no need to define a framework. 

Need for a Seperate Collection Framework in Java
-------------------------------------------------
Before the Collection Framework(or before JDK 1.2) was introduced, the standard methods for grouping Java objects (or collections) were Arrays or Vectors, or Hashtables. All of these collections had no common interface. 



// Java Program to demonstrate
// Why collection framework was needed

import java.io.*;
import java.util.*;

class CollectionDemo {
	public static void main(String[] args) {
		// Creating instances of the array,
		// Vector and hashtable
		int arr[] = new int[] {1, 2, 3, 4 };	
		Vector<integer> v = new Vector();
		Hashtable <Integer, String> h = new Hashtable();
		
		// Adding the elements into the vector
		v.addElement(1);
		v.addElement(2);
		
		// Adding the element into the, hashtable
		h.put("cipher", )
		h.put("code");
		
		// Array instance creation requires [],
		// While Vector and hashtable requires ()
		// Vector element insertion requires addElement(),
		// but hashtable element insertion requires put()
		
		// Accessing the first element of the
		// array, vector and hashtable
		System.out.println(arr[0]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));
		
		
		// Array elements are accessed using [],
		// vector elements using elementAt()
		// and hashtable elements using get()
		
	}
}



Advantages of the Java Collection Framework
---------------------------------------------

1. Consistent API: The API has a basic set of interfaces like Collection, Set, List, or, Map, all the classes (ArrayList, LinkedList, Vector, etc) that implement these interfaces have some common set of methods.

2. Reduces programming effort: A Programmer doesn't have to worry about the design of the Collection but rather he can focus on its best use in his program. Therefore the basic concept of Object-Oriented programming (i.e.) abstraction has been successfully implemented.


3. Increases program speed and quality: Increase performance by providing high performance implementation of useful data structures and algorithm because in this case, the programmer need not think of the best implementation of a specific data structure. He can simply use the best implementation to drastically boost the performance of his algorithm/program.


Hierarchy of the Collection Framework in Java
==============================================

The utility package, (java.util) contains all the classes and interfaces that are required by the collection framework. The collection framework contains an interface named an iterable interface which provide the iterator to iterate through all the collections. This interface is extended by the main collection interface.



- Class: A class is a user-defined blueprint or prototype from which objects are created. It represents the set of propertie or methods that are common to all objects of one type.

- Interface: Like a class, an interface can have methods and variables, but the methods declared in an interface are by default abstract(only method signature, nobody). Interfaces specify what a class must do and not how. It is the blueprint of the class.



Methods of the Collection inteface
=====================================
This interface conatins various methods which can be directly used by all the collections which implement this interface, these are:


Method

Description

add(Object)	This method is used to add an object to the collection.
addAll(Collection c)	This method adds all the elements in the given collection to this collection.
clear()	This method removes all of the elements from this collection.
contains(Object o)	This method returns true if the collection contains the specified element.
containsAll(Collection c)	This method returns true if the collection contains all of the elements in the given collection.
equals(Object o)	This method compares the specified object with this collection for equality.
hashCode()	This method is used to return the hash code value for this collection.
isEmpty()	This method returns true if this collection contains no elements.
iterator()	This method returns an iterator over the elements in this collection.
max() 
 	This method is used to return the maximum value present in the collection.
parallelStream()	This method returns a parallel Stream with this collection as its source.
remove(Object o)	This method is used to remove the given object from the collection. If there are duplicate values, then this method removes the first occurrence of the object.
removeAll(Collection c)	This method is used to remove all the objects mentioned in the given collection from the collection.
removeIf(Predicate filter)	This method is used to remove all the elements of this collection that satisfy the given predicate.
retainAll(Collection c)	This method is used to retain only the elements in this collection that are contained in the specified collection.
size()	This method is used to return the number of elements in the collection.
spliterator()	This method is used to create a Spliterator over the elements in this collection.
stream()	This method is used to return a sequential Stream with this collection as its source.
toArray()	This method is used to return an array containing all of the elements in this collection.




Intefaces that Extend the Java Collection Interface
----------------------------------------------------
The collection fromework contains multiple interfaces where every interface is used to store a specific type of data. The following are the interfaces present in the framework.


1. Iterable Interface
This is the root interface for the entire collection framework. The collection interface extends the iterable interface. Therefore, inherently, all the interfaces and classes implement this interface. The main functionality of this interface is to provide an iterator for the collections. Therefore, this interface contains only one abstract method which is the iterator. It returns the 

Iterator iterator(); 


2. Collection Interface
This interface extends the iterable interface and is implemented by all the classes in the collection framework. This interface contains all the basic methods which every collection has like adding the data into the collection, removing the data, clearing the data, etc. All these methods are implemented in this interface because these methods are implemented by all the classes irrespective of their style of implementation. And also, having these methods in this interface ensures that the names of the methods are universal for all the collections. Therefore, in short, we can say that this interface builds a foundation on which the collection classes are implemented.

3. List Interface
This is a child interface of the collection interface. This interface is dedicated to the data of the list type in which we can store all the ordered collections of the objects. This also allows duplicate data to be present in it. This list interface is implemented by various classes like ArrayList, Vector, Stack, etc. Since all the subclasses implement the list, we can instantiate a list object with any of these classes. 

For example: 

List <T> al = new ArrayList<> (); 
List <T> ll = new LinkedList<> (); 
List <T> v = new Vector<> (); 
Where T is the type of the object 


The classes which implement the List interface are as follows:

i). ArrayList
ArrayList provides us with dynamic arrays in Java. Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed. The size of an ArrayList is increased automatically if the collection grows or shrinks if the objects are removed from the collection. Java ArrayList allows us to randomly access the list. ArrayList can not be used for primitive types, like int, char, etc. We will need a wrapper class for such cases. 


// Java program to demonstrate the 
// working of ArrayList

import java.io;
import java.util.*;

class Test {
	// Main method
	public static void main(String[] args) {
		// Declaring the ArrayList with
		// initial size named
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		// Appending new elements at
		// the end of the list
		for(int i = 1; i <= 5; i++)
			al.add(i);
		
		// Printing elements
		System.out.println(al);
		
		// Remove element at index 3
		al.remove(3);
		
		// Displaying the ArrayList
		// after deletion
		System.out.println();
		
		// Printing elements one by one
		for(int i=0; i<=al.size(); i++) 
			System.out.println(al.get(i) + " ");
		
	}
	
}




Output:-
---------
[1, 2, 3, 4, 5]
[1, 2, 3, 5]
1, 2, 3, 5



*/

package pkg25.collections;

import java.util.Scanner;

public class basicSyntax {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


  }
}
