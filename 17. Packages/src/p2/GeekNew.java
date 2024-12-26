/*
package p2:-
--------------

*/
package p2;

import p1.Geek;

public class GeekNew {
    public static void main(String[] args) {
        // Create an object of non sub-class another package
        Geek g = new Geek();
//        g.display();    // it would get compile time error : Geek is not visible here
    }
}
