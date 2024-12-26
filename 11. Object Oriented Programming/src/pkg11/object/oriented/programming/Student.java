/*
Question: Write the class for the object Student,
------------------------------



*/
package pkg11.object.oriented.programming;

class StudentTest {
    public int roll;
    public String name;
    public String branch;
    public String course;
    public int m1, m2, m3;
    
    public int total() {
        return (m1+m2+m3);
    }
    public float average() {
        return (float) total()/3;
    }
    public char grade() {
        if(average() >  70) {
            return 'A';
        } else if(average() > 60 && average() <= 70) {
            return 'B';
        } else if(average() > 50 && average() <= 60) {
            return 'C';
        } else if(average() > 40 && average() <= 50) {
            return 'D';
        } else if(average() > 33 && average() <= 40) {
            return 'E';
        } else {
            return 'F';
        }
    }
}

public class Student {
    
}


/*
Output:-
----------



*/