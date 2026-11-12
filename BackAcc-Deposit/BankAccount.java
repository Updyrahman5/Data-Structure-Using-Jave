public class BankAccount {
    String name;
    double balance;

    BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    void deposit(double amount){
        balance += amount;
        System.out.println("Deposit: " + amount);

    }
    void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdraw: " + amount);
    }
    void showBalence(){
        System.out.println("Balance: " + balance);
    }

}
class SavingAccount extends BankAccount {
    double interestrate = 0.05;
    SavingAccount(String name, double balance){
        super(name, balance);
    }
    void AddInterest(){
        double interest = balance * interestrate;
        balance += interest;
        System.out.println("interest added: " + interest);
    }
}
class CurrentAccount extends BankAccount {
    double overdraftlimit = 500;
    CurrentAccount(String name, double balance){
        super(name, balance);
    }
    @Override
    void withdraw(double amount){
        if (balance - amount >= -overdraftlimit){
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        }
        else {
            System.out.println("overdraft limit exceeded!");
        }

    }
}
