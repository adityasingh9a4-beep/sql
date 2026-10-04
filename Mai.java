class Account {
    int acNumber;
    String holderName;
    double balance;

    Account(int acNumber, String holderName, double balance) {
        this.acNumber = acNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void balanceEnquiry() {
        System.out.println("Balance: " + balance);
    }

    void displayAccount() {
        System.out.println("Account Number: " + acNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}   

class SavingsAccount extends Account {
    double interestRate = 5;

    SavingsAccount(int acNumber, String holderName, double balance) {
        super(acNumber, holderName, balance);
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest: " + interest);
    }
}

class CurrentAccount extends Account {
    double overdraftLimit = 10000;

    CurrentAccount(int acNumber, String holderName, double balance) {
        super(acNumber, holderName, balance);
    }

    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft Limit Exceeded");
        }
    }
}

public class Mai {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(101, "Aditya", 10000);

        System.out.println("SAVINGS ACCOUNT");
        s.displayAccount();
        s.deposit(2000);
        s.withdraw(1000);
        s.calculateInterest();
        s.balanceEnquiry();

        System.out.println();

        CurrentAccount c = new CurrentAccount(102, "Rahul", 5000);

        System.out.println("CURRENT ACCOUNT");
        c.displayAccount();
        c.deposit(2000);
        c.withdraw(12000);
        c.balanceEnquiry();
    }
}