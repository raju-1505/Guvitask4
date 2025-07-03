//create voter exception;

import java.util.Scanner;

class InvalidVoterAgeException extends RuntimeException {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}

class Voter {
    int voterId;
    String name;
    int age;

    public Voter(int voterId, String name, int age) {
        if (age < 18) {
            throw new InvalidVoterAgeException("invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Voter Details:");
        System.out.println("Voter ID: " + voterId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}



import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Voter ID: ");
            int voterId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            
            System.out.println("Voter Details:");
            System.out.println("Voter ID: " + voterId);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

            
            Voter voter = new Voter(voterId, name, age);

        } catch (InvalidVoterAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

//input
Enter Voter ID: 123
Enter Name: raju
Enter Age: 16
//output  
Voter Details:
Voter ID: 123
Name: raju
Age: 16
Exception: invalid age for voter
