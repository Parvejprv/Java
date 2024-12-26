// package mypack1;         // Single package creation
package mypack2.innerpackages;			// package inside another package creation


public class Demo2 {
    public static void main(String[] args) {
       System.out.println("Hello");
    }
}

















/*
Note: Here we can simply compile the java program via only using the java compiler but it is not responsible for creating the packages that we mention in the java program.

simple command to compile the code only: javac Demo.java (fileName.extension)


while mention a package to create and compile : javac -d . Demo.java (fileName.extension)

C:\Users\parve\OneDrive\Desktop\My Java>javac -d . Demo.java
C:\Users\parve\OneDrive\Desktop\My Java>java mypack1/Demo
Hello World! Testing package Creation.

Here . is the current directory path.



*/