/*


*/
package methodpractice;


public class CommandLineArguments {
    public static void main(String[] args) {
//        for(String s : args){
//            System.out.println(s);
//        }

    // We can also print using the counter control loop as well
    for(int i=0; i<args.length; i++){
        System.out.println(args[i]);
    }

    }
}



/*
Output:-
------------
C:\Users\parve\Desktop>javac CommandLineArguments.java

C:\Users\parve\Desktop>java CommandLineArguments

C:\Users\parve\Desktop>java CommandLineArguments Hello World!
Hello
World!

C:\Users\parve\Desktop>java CommandLineArguments Hello World!, How are you?
Hello
World!,
How
are
you?
*/