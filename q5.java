//Stack Integer Manager.

import java.util.Scanner;
import java.util.Stack;

public class StackInteger {

    private Stack<Integer> stack = new Stack<>();


    public void pushElement(int element) {
        stack.push(element);
        System.out.println(element + " pushed to the stack.");
    }


    public void popElement() {
        if (!stack.isEmpty()) {
            int removed = stack.pop();
            System.out.println("Popped element: " + removed);
        } else {
            System.out.println("Stack is empty. Nothing to pop.");
        }
    }


    public void checkIfEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is NOT empty.");
        }
    }


    public void displayStack() {
        System.out.println("Current Stack: " + stack);
    }

    public static void main(String[] args) {
        StackInteger manager = new StackInteger();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStack Menu:");
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Check if Stack is Empty");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();

                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter integer to push: ");
                    int value = scanner.nextInt();
                    manager.pushElement(value);
                    break;
                case 2:
                    manager.popElement();
                    break;
                case 3:
                    manager.checkIfEmpty();
                    break;
                case 4:
                    manager.displayStack();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please choose between 1 and 5.");
            }
        }
    }

}



//input //output
Stack Menu:
1. Push Element
2. Pop Element
3. Check if Stack is Empty
4. Display Stack
5. Exit
Enter your choice: 1
Enter integer to push: 5555
5555 pushed to the stack.

Stack Menu:
1. Push Element
2. Pop Element
3. Check if Stack is Empty
4. Display Stack
5. Exit
Enter your choice: 3
Stack is NOT empty.

Stack Menu:
1. Push Element
2. Pop Element
3. Check if Stack is Empty
4. Display Stack
5. Exit
Enter your choice: 4
Current Stack: [5555]

Stack Menu:
1. Push Element
2. Pop Element
3. Check if Stack is Empty
4. Display Stack
5. Exit
Enter your choice: 2
Popped element: 5555

Stack Menu:
1. Push Element
2. Pop Element
3. Check if Stack is Empty
4. Display Stack
5. Exit
Enter your choice: 3
Stack is empty.

Stack Menu:
1. Push Element
2. Pop Element
3. Check if Stack is Empty
4. Display Stack
5. Exit
Enter your choice: 
5
Exiting...
