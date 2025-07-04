//Student Grade Management

import java.util.HashMap;
import java.util.Scanner;

public class StudentGrade {

    private HashMap<String, Integer> studentGrades = new HashMap<>();

        public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student " + name + " added with grade " + grade);
    }

    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student " + name + " removed.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }


    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            int grade = studentGrades.get(name);
            System.out.println(name + "'s grade: " + grade);
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }


    public static void main(String[] args) {
        StudentGrade manager = new StudentGrade ();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Grade Manager");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = 0;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String nameToAdd = scanner.nextLine();
                    System.out.print("Enter student grade: ");
                    int grade = scanner.nextInt();
                    scanner.nextLine();
                    manager.addStudent(nameToAdd, grade);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String nameToRemove = scanner.nextLine();
                    manager.removeStudent(nameToRemove);
                    break;
                case 3:
                    System.out.print("Enter student name to display grade: ");
                    String nameToDisplay = scanner.nextLine();
                    manager.displayGrade(nameToDisplay);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose between 1 and 4.");
            }
        }
    }
}


//input //output

Student Grade Manager
1. Add Student
2. Remove Student
3. Display Student Grade
4. Exit
Enter your choice: 1
Enter student name: raju
Enter student grade: 75
Student raju added with grade 75

Student Grade Manager
1. Add Student
2. Remove Student
3. Display Student Grade
4. Exit
Enter your choice: 3
Enter student name to display grade: raju
raju's grade: 75

Student Grade Manager
1. Add Student
2. Remove Student
3. Display Student Grade
4. Exit
Enter your choice: 2
Enter student name to remove: raju
Student raju removed.

Student Grade Manager
1. Add Student
2. Remove Student
3. Display Student Grade
4. Exit
Enter your choice: 4
Exiting program.
