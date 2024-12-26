/*
Try with resources:-
----------------------
We are trying to read the data from the file and try to read the data using a file with the help of the fileInputStream
Here, We are performing the input taking with the help of the resource i.e. file

*/


package pkg18.exception.handling;
import java.io.*;
import java.util.*;


// If I use FileInputStream inside the try block it means taking care and closing the file will be done by the try only, so there is no need to use the finally block here,


public class ResourcesDemo {
    // Take a FileInputStream object 
    
    static void Devide() throws Exception {
        try (FileInputStream fi = new FileInputStream("C:/Users/parve/OneDrive/Desktop/Test.txt"); Scanner sc = new Scanner(fi)){
            // trying to read the data from the file with the help of FileInputResource i.e. we are using the Try block with resources
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
    //        System.out.println(a/b);
            System.out.println(a/c);
        }
    }
    public static void main(String[] args) throws Exception {
        try {
            Devide();
        } catch (Exception e) {
            System.out.println(e);
        }
        
//        int d = sc.nextInt();
//        System.out.println("value of d : " + d);
    }
    
}

/*
Output:-
----------
// it believed that the resources will closed,

java.lang.ArithmeticException: / by zero


*/













/*
public class ResourcesDemo {
    // Take a FileInputStream object 
    static FileInputStream fi;
    static Scanner sc;
    
    static void Devide() throws Exception {
        try {
        fi = new FileInputStream("C:/Users/parve/OneDrive/Desktop/Test.txt");
        // trying to read the data from the file
        sc = new Scanner(fi);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        System.out.println(a/b);
        System.out.println(a/c);
        }
        finally {       // these finally block will definitely get rexecuted if there any exception or there is no exception
        fi.close();
        sc.close();       
        }
        
    }
    public static void main(String[] args) throws Exception {
        try {
            Devide();
        } catch (Exception e) {
            System.out.println(e);
        }
        int d = sc.nextInt();
        System.out.println("value of d : " + d);
    }
    
}

*/

/*
Output:-
----------
java.lang.ArithmeticException: / by zero
Exception in thread "main" java.lang.IllegalStateException: Scanner closed
	at java.base/java.util.Scanner.ensureOpen(Scanner.java:1175)
	at java.base/java.util.Scanner.next(Scanner.java:1598)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2284)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2238)
	at pkg18.exception.handling.ResourcesDemo.main(ResourcesDemo.java:43)
C:\Users\parve\AppData\Local\NetBeans\Cache\22\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\parve\AppData\Local\NetBeans\Cache\22\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 0 seconds)





*/


























/*


public class ResourcesDemo {
    // Take a FileInputStream object 
    static FileInputStream fi;
    static Scanner sc;
    
    static void Devide() throws Exception {
        try {
        fi = new FileInputStream("C:/Users/parve/OneDrive/Desktop/Test.txt");
        // trying to read the data from the file
        sc = new Scanner(fi);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        System.out.println(a/b);
        System.out.println(a/c);
        }
        finally {
        fi.close();
//        sc.close();       // scanner is closed so that it can not read the data any more from the file
        }
        
    }
    public static void main(String[] args) throws Exception {
        try {
            Devide();
        } catch (Exception e) {
            System.out.println(e);
        }
        int d = sc.nextInt();
        System.out.println("value of d : " + d);
    }
    
}


*/


/*
Output:-
----------
java.lang.ArithmeticException: / by zero
value of d : 30




*/
































/*


public class ResourcesDemo {
    // Take a FileInputStream object 
    static FileInputStream fi;
    static Scanner sc;
    
    static void Devide() throws Exception {
        
        fi = new FileInputStream("C:/Users/parve/OneDrive/Desktop/Test.txt");
        // trying to read the data from the file
        sc = new Scanner(fi);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a/b);
        
        fi.close();
//        sc.close();
    }
    
    public static void main(String[] args) throws Exception {
        Devide();
        int d = sc.nextInt();
        System.out.println("value of d : " + d);
    }
    
}

*/


/*
Output:-
------------
1
value of d : 30


*/
























/*

// Using FileInputOutputStream, and does not found the 
public class ResourcesDemo {
    // Take a FileInputStream object 
    static FileInputStream fi;
    static Scanner sc;
    
    static void Devide() throws Exception {
        
        fi = new FileInputStream("C:/Users/parve/OneDrive/Desktop/Test.txt");
        sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.println("Enter the value of c : ");
        int c = sc.nextInt();
        System.out.println(a/b);
        
        fi.close();
        sc.close();         // here scanner is closed so that it can not read the data anymore
    }
    
    public static void main(String[] args) throws Exception {
        Devide();
        System.out.println("Enter the value of d : ");
        int d = sc.nextInt();
        System.out.println("value of d : " + d);
    }
    
}
*/


/*
Output:-
----------
Enter the value of a : 
100
Enter the value of b : 
0
Enter the value of c : 
10
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at pkg18.exception.handling.ResourcesDemo.Devide(ResourcesDemo.java:29)
	at pkg18.exception.handling.ResourcesDemo.main(ResourcesDemo.java:36)
C:\Users\parve\AppData\Local\NetBeans\Cache\22\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\parve\AppData\Local\NetBeans\Cache\22\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 20 seconds)

*/