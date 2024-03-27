import java.util.Scanner;
class BankAccount {


    double balance;

    BankAccount() {
        this.balance = 0;
    }

    BankAccount(double bal) {
        this.balance = bal;
    }


    void deposit(double amount) {
        this.balance += amount; //
        System.out.println("Aount deposited successfully\nAvailable balance is "+this.balance);
    }

    void withDraw(double amount) {
        if (amount > this.balance)
            System.out.println("Insufficience Balance");
        else {
            this.balance -= amount;
            System.out.println("Withdrawal successful\nAvailable balance is "+this.balance);
        }
    }

    void printBalance() {
        System.out.println("Current Balance " + (this.balance));
    }

    void transferBalance(int targetAccount, double amount) {

        System.out.println("The amount" + amount + " Transfer request raised to account number " + targetAccount + "\n Press Y to confirm or N to decline");
        while (true) {
            Scanner input = new Scanner(System.in);
            char confirm = Character.toUpperCase(input.next().charAt(0));
            if (confirm == 'Y') {
                if (amount <= this.balance) {
                    this.balance -= amount;
                    System.out.println("Amount of " + amount + " transferred to " + targetAccount + " successfully \nThe remaining balance is " + this.balance);
                    break;
                } else {
                    System.out.println("Transaction declined due to Insufficience Balance");
                    break;
                }


            } else if (confirm == 'N') {
                System.out.println("Transaction declined successfully by the user");
                break;
            }
            else
                System.out.println("invalid key entered please enter a valid key\n Y to confirm N to decline");

        }
    }
}
