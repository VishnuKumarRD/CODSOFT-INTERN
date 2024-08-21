import java.util.*;
public class ATM {

    double balance;
    int user_pin = 1234;

    public void initial_amt(double amt) {
        this.balance = amt;
    }

    public void pincheck() {
        System.out.print("Enter your PIN : ");
        Scanner vk = new Scanner(System.in);
        int Entered_pin = vk.nextInt();
        if (Entered_pin == user_pin) {
            System.out.println("*****WELCOME *****");
            menubar();
        } else {
            System.out.print("Not Matched");
            System.out.println("Enter your valid pin number");
            pincheck();
        }
    }

    public void menubar() {

        System.out.println("...CHOOSE OPTION YOU WANT...");
        System.out.println("1.Check bank balance");
        System.out.println("2.Cash Deposit");
        System.out.println("3.Cash Withdrawal");
        System.out.println("4.EXIT");

        Scanner n = new Scanner(System.in);
        System.out.println("Press any one key between 1 to 4!");
        int option = n.nextInt();

        if (option == 1) {
            balance();
        } else if (option == 2) {
            cashdeposit();
        } else if (option == 3) {
            cashwithdraw();
        } else if (option == 4) {
            System.out.println("Thankyou for visited our ATM");
            System.out.println("Come and Visited our ATM again!!!");
            System.exit(0);
        }
    }

    public void balance() {
        System.out.println("Account balance:" + balance);
        menubar();

    }

    public void cashwithdraw() {
        System.out.println("Enter your withdrawal Amount:");
        Scanner am = new Scanner(System.in);
        int with_amt = am.nextInt();
        if (with_amt < balance) {
            balance = balance - with_amt;
            System.out.println("CASH Withdrawal Successfully...");
            System.out.println("your Current balance is :" + balance);
            menubar();
        } else {
            System.out.println("Oops...!Sorry,Your Balance is Insufficient");
        }
    }

    public void cashdeposit() {
        System.out.println("Enter your Deposite amount");
        Scanner d = new Scanner(System.in);
        double dep_amt = d.nextInt();
        balance = balance + dep_amt;
        System.out.println("CASH Deposited Successfully");
        System.out.println("your current balance is : " + balance);
        menubar();
    }

    public static void main(String[] args) {
        ATM s = new ATM();
        Scanner i = new Scanner(System.in);
        System.out.println("Initial Bank balance Amount: ");
        int amt = i.nextInt();
        s.initial_amt(amt);
        s.pincheck();
    }
}
