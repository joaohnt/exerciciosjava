import entities.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student student = new Student();
        student.name = sc.nextLine();
        student.n1 = sc.nextDouble();
        student.n2 = sc.nextDouble();
        student.n3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + student.FinalGrade());

        if(student.FinalGrade() >= 100) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAILED");
            System.out.println("MISSING " + student.RequiredPoints() + " POINTS");
        }

    }
}