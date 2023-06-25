import java.util.Scanner;

public class BankManag{
    public static void main(String[] args) {

        BankAccount client1 = new BankAccount("Abhi","32FAC0021");
        client1.showMenu();
    }
}

class BankAccount{
    
    int balance;
    int lasTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cid) {
        customerName = cname;
        customerId = cid;
    }

    void deposit (int amount)
    {
        if (amount != 0)
        {
            balance = balance+amount;
            lasTransaction = amount;
        }
    }

    void withdraw(int amount)
    {
        if (amount != 0);
        {
            balance = balance-amount;
            lasTransaction= -amount;
        }
    }

    void getLasTransaction()
    {
        if(lasTransaction>0)
        {
            System.out.println("Deposited: "+lasTransaction);
        }
        else if(lasTransaction<0)
        {
            System.out.println("Withdraw:" +Math.abs(lasTransaction));
        }
        else  {
            System.out.println("No transaction occurred");
        }
    }

    void showMenu()
    {
        char option= '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome back!RANA bank is ready to serve you the best banking option with the great Responsibility");
        System.out.println("\n");
        System.out.println("Welcome"+customerName);
        System.out.println("Your ID is "+customerId);
        System.out.println("\n");
        System.out.println("A. Check balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Last Transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("===================================================");
            System.out.println("Enter an option");
            System.out.println("===================================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch(option)
            {
                case 'A':
                System.out.println("--------------------------------------------------");
                System.out.println("Balance = "+balance);
                System.out.println("--------------------------------------------------");
                System.out.println("\n");
                break;

                case 'B':
                System.out.println("--------------------------------------------------");
                System.out.println("Enter the amount you want to Deposit");
                System.out.println("--------------------------------------------------");
                int amount = scanner.nextInt();
                deposit(amount);
                System.out.println("\n");
                break;

                case 'C':
                System.out.println("--------------------------------------------------");
                System.out.println("Enter the amount you want to Withdraw");
                System.out.println("--------------------------------------------------");
                int amount2 = scanner.nextInt();
                withdraw(amount2);
                System.out.println("\n");
                break;

                case 'D':
                System.out.println("--------------------------------------------------");
                getLasTransaction();
                System.out.println("--------------------------------------------------");
                System.out.println("\n");
                break;

                case 'E':
                System.out.println("***************************************************");
                break;

                default:

                System.out.println("Invalid Option!, please read and enter again");
                break;
            }
        }while(option !='E');

        System.out.println("ThankYou for using our service");

    }


}