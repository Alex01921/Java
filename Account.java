// Account.java and Bank.java
import java.util.Scanner;

class Account {
    // Instance Variable
    int accno;
    String name;
    long phone_no;
    float balance_amt;

    // Methods
    public void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to NMIT Bank");
        System.out.println("Enter the following details:");
        System.out.println("Account Number:");
        // accno = scanner.nextInt();
        accno = Integer.parseInt(scanner.next());
        // whatever user enters will be converted to integer
        System.out.println("Account holder Name:");
        name = scanner.next();
        System.out.println("Phone number:");
        phone_no = Long.parseLong(scanner.next());
        System.out.println("Opening balance:");
        balance_amt = Float.parseFloat(scanner.next());
    }

    public void deposit(float amt) {
        balance_amt = balance_amt + amt;
        printAccount();
    }

    public void withDraw(float amt) {
        if (amt > balance_amt) {
            System.out.println("No sufficient balance");
        } else {
            balance_amt = balance_amt - amt;
        }
    }

    public void printAccount() {
        System.out.println("*****************************");
        System.out.println("Account No:" + accno);
        System.out.println("Name:" + name);
        System.out.println("Phone no:" + phone_no);
        System.out.println("Balance Amount:" + balance_amt);
        System.out.println("*****************************");
    }
}
