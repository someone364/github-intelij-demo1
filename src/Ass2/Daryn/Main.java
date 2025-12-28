package Ass2.Daryn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Human empAsHuman = new Employee(32, "Aidar Kenzhebek", false, "Developer", 150000f);

        IWorkable worker = new Employee(28, "Ainur Mukhamadi", true, "HR Manager", 120000f);

        ILearnable learner = new Student(20, "Dana Talgat", false, "Computer Science", 4.8f, "STU001");

        Employee regularEmp = new Employee(35, "Baurzhan Ali", true, "Team Lead", 200000f);
        Student regularStudent = new Student(22, "Kamila Nur", false, "Economics", 4.5f, "STU002");

        System.out.println("\n=== Demonstration of all methods ===\n");

        empAsHuman.printBasicInfo();
        empAsHuman.introduce();
        empAsHuman.displayRoleInfo();

        worker.work();
        worker.takeBreak();

        learner.study();
        learner.passExam("Java Programming");

        regularEmp.work();
        regularEmp.study();
        regularEmp.passExam("Project Management");

        regularStudent.printBasicInfo();
        regularStudent.displayRoleInfo();
        regularStudent.study();
        regularStudent.passExam("Statistics");
        regularStudent.graduate(); 

        System.out.println("\nTotal employees created: " + Employee.getEmployeeCount());

        scanner.close();
    }
}
