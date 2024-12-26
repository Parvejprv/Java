/*
Student Challenge: -
---------------------------
- Student 
- Account
- Customer





// Roll :- 
// Univ-2020-1
// Univ-2020-2
// Univ-2020-3
// Univ-2020-4 ......



*/
package methodpractice;
import java.util.*;

// class Student
class Students {
    
    private String roll;
    private String name;
    private int age;
    private String major;
    private double cgpa;
    
    private static int count = 1;
    
    private String generateRollNumber(){
        Date d = new Date();
        String rollNumber = "Univ-"+(d.getYear() + 1900)+"-"+count;
        count++;
        return rollNumber;
    }
    
    // Create a constructor 
    public Students(String name, int age, String major) {
        roll = generateRollNumber();
        this.name = name;
        this.age = age;
        this.major = major;
        // Initialize cgpa to default value as - 0.0
        this.cgpa = 0.0;
    }
    
    
    // Getter and Setter methods
    // Getter 
    public String getRollNumber() {
        return roll;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getMajor() {
        return major;
    }
    // Setter
    public void setRollNumber(String roll) {
        this.roll = roll;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public void setGrade(double cgpa) {
        this.cgpa = cgpa;
    }
    
    
    // Display the student information
    public void displayInfo() {
        System.out.println("Student Roll : " + roll);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Major : " + major);
        System.out.println("Grade/CGPA : " + cgpa);
    }
    
}


// Let create a class for the customer
class Customer {
    private String name;
    private long mobile;
    private String address;
    private String regular;
    
    
    
}



public class StudentChallenge {
    public static void main(String[] args) {
        // Create an object of the Student class
        Students s1 = new Students("John Doe", 28, "Computer Science");
        s1.setGrade(7.4);
        s1.displayInfo();
        
        Students s2 = new Students("Samrat", 29, "Computer Science");
        s2.setGrade(8.4);
        s2.displayInfo();
        
        Students s3 = new Students("Krish", 30, "IT");
        s3.setGrade(9.4);
        s3.displayInfo();
        
        Students s4 = new Students("Adi", 23, "Computer Science");
        s4.setGrade(9.5);
        s4.displayInfo();
        
        Students s5 = new Students("Shivam", 27, "Computer Science");
        s5.setGrade(6.4);
        s5.displayInfo();
        
        Students s6 = new Students("Minakshi Mishra", 28, "IT");
        s6.setGrade(7.6);
        s6.displayInfo();
        
    }
}




/*
Output:-
------------
Student Roll : Univ-2024-1
Name : John Doe
AgStudent Roll : Univ-2024-1
Name : John Doe
Age : 28
Major : Computer Science
Grade/CGPA : 7.4
Student Roll : Univ-2024-2
Name : Samrat
Age : 29
Major : Computer Science
Grade/CGPA : 8.4
Student Roll : Univ-2024-3
Name : Krish
Age : 30
Major : IT
Grade/CGPA : 9.4
Student Roll : Univ-2024-4
Name : Adi
Age : 23
Major : Computer Science
Grade/CGPA : 9.5
Student Roll : Univ-2024-5
Name : Shivam
Age : 27
Major : Computer Science
Grade/CGPA : 6.4
Student Roll : Univ-2024-6
Name : Minakshi Mishra
Age : 28
Major : IT
Grade/CGPA : 7.6



*/