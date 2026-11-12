import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Saving Account
        System.out.println("===== SAVING ACCOUNT =====");

        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = input.nextDouble();

        SavingAccount saving = new SavingAccount(name, balance);

        saving.deposit(200);
        saving.AddInterest();
        saving.showBalence();

        // Current Account
        System.out.println("\n===== CURRENT ACCOUNT =====");

        input.nextLine(); // Clear input

        System.out.print("Enter Name: ");
        String name2 = input.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance2 = input.nextDouble();

        CurrentAccount current = new CurrentAccount(name2, balance2);

        current.deposit(300);

        System.out.print("Enter Withdraw Amount: ");
        double amount = input.nextDouble();

        current.withdraw(amount);
        current.showBalence();

        input.close();
    }
}