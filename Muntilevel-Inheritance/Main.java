import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LinkedStack stack = new LinkedStack();

        int choice;

        do {
            System.out.println("\n===== LINKED STACK =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Print");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number: ");
                    int number = input.nextInt();
                    stack.push(number);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.print();
                    break;

                case 4:
                    System.out.println("Program Ended!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        input.close();
    }
}