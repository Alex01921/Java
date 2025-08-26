//package 8_26_2025 lab;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account a = new Account();
        a.createAccount();
        int choice = 0;
        float amt = 0;
        while (choice != 4) {
            System.out.println("Enter your choice:");
            System.out.println("1. Deposit \n2. Withdraw \n3. Display \n4. Exit");
            choice = Integer.parseInt(scanner.next());
            switch (choice) {
                case 1:
                    System.out.println("Enter amount:");
                    amt = Float.parseFloat(scanner.next());
                    a.deposit(amt);
                    break;

                case 2:
                    System.out.println("Enter amount:");
                    amt = Float.parseFloat(scanner.next());
                    a.withDraw(amt);
                    break;

                case 3:
                    a.printAccount();
                    break;

                default:
                    System.out.println("Enter choice between 1-4");

            }
        }
    }
}
