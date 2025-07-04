//Weekdays

import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        String[] days = {
                "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day index (0-6): ");

        try {
            int index = scanner.nextInt();
            System.out.println("Day is: " + days[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please enter a valid index between 0 and 6.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a number.");
        } finally {
            scanner.close();
        }
    }
}


//input
Enter day index (0-6): 7
  //output
Error: Please enter a valid index between 0 and 6.
