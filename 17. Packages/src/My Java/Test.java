import mypack1.Demo11;
import mypack1.Demo12;
import mypack2.innerpackages.Demo13;



public class Test {
	public void display() {
		System.out.println("Hello From class Test itself");
	}
    public static void main(String[] args) {
       System.out.println("Here we are importing the file from the packages ...");
	   
	   // Create an object of the class Demo11
	   Demo11  d11 = new Demo11();
	   d11.display();
	   // Create an object of the class Demo12
	   Demo12  d12 = new Demo12();
	   d12.display();
	   // Create an object of the class Demo13
	   Demo13  d13 = new Demo13();
	   d13.display();
	   
    }
}






/*
Output:-
------------
// Here is the output what we get,

C:\Users\parve\OneDrive\Desktop\My Java>javac -d . Demo11.java

C:\Users\parve\OneDrive\Desktop\My Java>javac -d . Demo12.java

C:\Users\parve\OneDrive\Desktop\My Java>javac -d . Demo13.java

C:\Users\parve\OneDrive\Desktop\My Java>javac Test.java

C:\Users\parve\OneDrive\Desktop\My Java>dir
 Volume in drive C is ADATA - Win 11
 Volume Serial Number is 82F0-BEF3

 Directory of C:\Users\parve\OneDrive\Desktop\My Java

09/13/2024  04:26 PM    <DIR>          .
09/13/2024  03:22 PM    <DIR>          ..
09/13/2024  03:33 PM             2,211 2. Why Use Methods.txt
09/13/2024  03:27 PM               448 Demo.class
09/13/2024  03:54 PM               883 Demo.java
09/13/2024  04:24 PM               327 Demo11.java
09/13/2024  04:24 PM               327 Demo12.java
09/13/2024  04:24 PM               327 Demo13.java
09/13/2024  03:56 PM               851 Demo2.java
09/13/2024  04:16 PM    <DIR>          mypack1
09/13/2024  03:52 PM    <DIR>          mypack2
09/13/2024  04:26 PM               718 Test.class
09/13/2024  04:25 PM               642 Test.java
               9 File(s)          6,734 bytes
               4 Dir(s)  133,541,470,208 bytes free

C:\Users\parve\OneDrive\Desktop\My Java>java Test
Here we are importing the file from the packages ...
Hello From Demo11
Hello From Demo12
Hello From Demo12


*/