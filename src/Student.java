
import java.util.Scanner;
import java.util.ArrayList;
public class Student {
    String name;
    int admissionNo;
    int rollNo;
    String college;

    public Student(String name, int admissionNo, int rollNo, String college) {
        this.name = name;
        this.admissionNo = admissionNo;
        this.rollNo = rollNo;
        this.college = college;
    }
    public String toString() {
        return "\nStudent Details :" + "\nName: " + this.name + "\nAdmission Number: " + this.admissionNo + "\nRoll Number: " +
                this.rollNo + "\nCollege: " + this.college ;
    }
    static void display(ArrayList<Student> al) {
        System.out.println("\nStudent Details\n");
        for (Student e : al) {
            System.out.println((e.name));
            System.out.println((e.admissionNo));
            System.out.println((e.rollNo));
            System.out.println((e.college));

            System.out.println("   ");
        }
    }
    static void search(ArrayList<Student> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student admission number to search :");
        int id = sc.nextInt();
        int i = 0;
        for (Student e : al) {
            if (id == e.admissionNo) {
                System.out.println(e + "\n");
                i++;
            }
        }
        if (i == 0) {
            System.out.println("\nStudent Details are not available, Please enter a valid ID!");
        }
    }
    static void delete(ArrayList<Student> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Student Admission Number to DELETE");
        int id = sc.nextInt();
        int k = 0;
        for (Student e : al) {
            if (id == e.admissionNo) {
                al.remove(e);
                Student.display(al);
                k++;
            }
        }
        if (k == 0) {
            System.out.println("\nStudent Details are not available, Please enter a valid ID!!");
        }
    }
    static void add(ArrayList<Student> al) {

            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter the following details to ADD Student list:\n");
            System.out.println("Enter Name :");
            String name = sc.next();
            System.out.println("Enter Admission Number :");
            int admissionNo = sc.nextInt();
            System.out.println("Enter Roll Number :");
            int rollNo = sc.nextInt();
            System.out.println("Enter College :");
            String college = sc.next();

            al.add(new Student(name, admissionNo, rollNo, college));
        }



    }






