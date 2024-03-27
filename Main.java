import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int key;
        BankAccount acc1 = new BankAccount(5000);
        while(true) {
            System.out.println("welcome to our bank \tPress 1 to Check the balance\t2 to Withdraw \t3 to deposit \t4 to transfer the balance \t0 to exit");
            switch(key = input.nextInt()){

                case 1 : acc1.printBalance();
                        break;
                case 2 :
                        System.out.println("enter withdrawal amount ");
                        acc1.withDraw(input.nextDouble());
                        break;
                case 3 :
                    System.out.println("enter amount to depsit");
                    acc1.deposit(input.nextDouble());
                    break;
                case 4  :
                    System.out.println("enter target account number (4-8 digits)");
                    int number = input.nextInt();
                    System.out.println("enter amount to transfer");
                    acc1.transferBalance(number,input.nextDouble());
                    break;
                case 0 :
                    break;
                default :
                    System.out.println("enter a valid key");
            }

            if(key == 0)
                break;
        }

        }
    }
