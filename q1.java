// student management system for a university.

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}


class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}
class Student {
    int rollNo;
    String name;
    int age;
    String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;


        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("NameNotValidException: Name contains invalid characters.");
        }
        this.name = name;

        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("AgeNotWithinRangeException: Age should be between 15 and 21.");
        }
        this.age = age;

        this.course = course;
    }


    public void display() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Course: ");
            String course = scanner.nextLine();


            Student student = new Student(rollNo, name, age, course);
            student.display();

        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e);
        }
    }
}

//input
Enter Roll No: 1
Enter Name: raju
Enter Age: 25
Enter Course: jfsd
//output
AgeNotWithinRangeException: Age should be between 15 and 21.
