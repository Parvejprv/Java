/*
Hospital Management System
---------------------------


*/


package hospitalManagement;

import java.util.ArrayList;
import java.util.Scanner;


abstract class Hospital {
    abstract void emergency();
    abstract void appointment(Scanner sc);
    abstract void admit(Scanner sc);
    abstract void billing(Scanner sc);
}

// Patient class to store the patient details
class Patient {
    private String name;
    private int age;
    private String gender;
    private String ailment;
    private String address;
    private boolean admitted;
    
    public Patient(String name, int age, String gender, String ailment, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ailment = ailment;
        this.address = address;
        this.admitted = false;
    } 
        

    public void admit() {
        this.admitted = true;
    }
      
    public String getName() {
        return name;
    }
    
    public String getAilment() {
        return ailment;
    }
    
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getAddress() {
        return address;
    }
    
    public boolean isAdmitted() {
        return admitted;
    }
    
    @Override
    public String toString() {
        return "Patient Name: " + name + ", Age: " + age + ", Sex: " + gender + ", \nAilment: " + ailment + ", Admitted: " + (admitted ? "Yes" : "No");
    }
}

// Doctor class to store doctor details
class Doctor {
    private String name;
    private String specialty;
    private int experience;
    
    
    public Doctor(String name, String specialty, int age) {
        this.name = name;
        this.specialty = specialty;
        this.experience = experience;
    }
    
    public String getName() { return name; }
    public String getSpeciality() { return specialty; }
    
    @Override
    public String toString() {
        return "Doctor Name: " + name + ", Speciality: " + specialty + ", Experience: " + experience + " years";
    }
    
}

class MyHospital extends Hospital {
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();
    
    public MyHospital() {
        System.out.println("Welcome to MyHospital Management System!");
    }
    
    // Emergency service
    @Override
    public void emergency() {
        System.out.println("Emergency services initiated. Bringing patient into the emergency ward... ");
    }
    
    
    // Schedule an appointment
    @Override
    void appointment(Scanner sc) {
//        Scanner sc = new Scanner(System.in);
        
        System.out.println("Scheduling an appointment...");
        System.out.println("Enter Patient Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();      // Consume newline
        System.out.println("Enter Gender: ");
        String gender = sc.nextLine();
        System.out.println("Enter Ailment: ");
        String ailment = sc.nextLine();
        System.out.println("Enter Address: ");
        String address = sc.nextLine();
        
        Patient newPatient = new Patient(name, age, gender, ailment, address);      // create a new Patient
        patients.add(newPatient);
        
        System.out.println("Appointment scheduled for " + name + ". Our staff will contact you shortly.");
    }
    
    // Admit a patient 
    @Override
    public void admit(Scanner sc) {
//        Scanner sc = new Scanner(System.in);
        System.out.println("Admitting a patient...");
        System.out.println("Enter Patient Name: ");
        String name = sc.nextLine();
        
        for(Patient patient : patients) {
            if(patient.getName().equalsIgnoreCase(name) && patient.isAdmitted()) {
                patient.admit();
                System.out.println("Patient " + name + " has been admitted successfully.");
                return;
            }
        }
        System.out.println("Patient not found or already admitted.");
    }
    
    // Billing service
    
    @Override
    void billing(Scanner sc) {
//        Scanner sc = new Scanner(System.in);
        System.out.println("Processing billing...");
        System.out.println("Enter Patient Name for billing: ");
        String name = sc.nextLine();
        
        for(Patient patient : patients) {
            if(patient.getName().equalsIgnoreCase(name)) {
                double billAmount = Math.random() * 1000 + 500;     // Get random billing amount
                System.out.println("Billing completed for " + name + ". Total Amount: $" + String.format("%.2f", billAmount));
                return;
            }
        }
        System.out.println("Patient not found.");
    }
    
    
    // Add a doctor to the hospital's list
    public void addDoctor(String name, String specialty, int experience) {
        Doctor newDoctor = new Doctor(name, specialty, experience);
        doctors.add(newDoctor);
        System.out.println("Doctor " + name + " added successfully.");
    }
    
    // Show list of all doctors
    public void showDoctors() {
        System.out.println("List of Doctors:");
        for(Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }
    
    // Show list of all patients
    public void showPatients() {
        System.out.println("List of Patients:");
        for(Patient patient : patients) {
            System.out.println(patient);
        }
    }   
}


public class HospitalManagementSystem {
    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        
        MyHospital hospital = new MyHospital();
        
        // Adding sample docts to the hospital
        hospital.addDoctor("Dr. Smith", "Cardiology", 10);
        hospital.addDoctor("Dr. Emma", "Neurology", 8);
        
        while(true) {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Emergency Service");
            System.out.println("2. Schedule Appointment");
            System.out.println("3. Admit Patient");
            System.out.println("4. Billing");
            System.out.println("5. Show Doctors");
            System.out.println("6. Show Patients");
            System.out.println("7. Exit");
            
            System.out.println("Choose an option: ");
           
            int choice = sc.nextInt();
            sc.nextLine();
            
            
            switch(choice) {
                case 1:
                    hospital.emergency();
                    break;
                case 2:
                    hospital.appointment(sc);
                    break;
                case 3:
                    hospital.admit(sc);
                    break;
                case 4:
                    hospital.billing(sc);
                    break;
                case 5:
                    hospital.showDoctors();
                    break;
                case 6:
                    hospital.showPatients();
                    break;
                case 7:
                    System.out.println("Exiting the system. Goodbye!");
                    sc.close();
                    System.exit(0);
                default :
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


/*
Output:-
----------

*/