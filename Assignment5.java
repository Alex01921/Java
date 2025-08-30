import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double accountNo;
		double balance;
		double salary;
		double loantype;
		double loanamount;
		double noEMIs;
		System.out.print("Enter account no: ");
		accountNo = sc.nextDouble();
		System.out.print("Enter balance: ");
		balance = sc.nextDouble();
		System.out.print("Enter salary: ");
		salary = sc.nextDouble();
		System.out.print("Enter loan type (1 : Car, 2 : House, 3 : Business): ");
		loantype = sc.nextDouble();
		System.out.print("Enter loan amount: ");
		loanamount = sc.nextDouble();
		System.out.print("Enter number of EMIs: ");
		noEMIs = sc.nextDouble();
		if (accountNo < 999 && accountNo > 2000 && balance < 1000) {
			System.out.println(-1);
			return;
		} 
		if (loantype == 1) {
			if (salary > 25000 && loanamount <= 500000 && noEMIs <= 36) {
				System.out.println("Account No: " + accountNo);
				System.out.println("Eligible Loan Amount: " + loanamount);
				System.out.println("Eligible EMIs: " + noEMIs);
			} else {
				System.out.println(-1);
			}
		} else if (loantype == 2) {
			if (salary > 50000 && loanamount <= 6000000 && noEMIs <= 60) {
				System.out.println("Account No: " + accountNo);
				System.out.println("Eligible Loan Amount: " + loanamount);
				System.out.println("Eligible EMIs: " + noEMIs);
			} else {
				System.out.println(-1);
			}
		} else if (loantype == 3) {
			if (salary > 75000 && loanamount <= 7500000 && noEMIs <= 84) {
				System.out.println("Account No: " + accountNo);
				System.out.println("Eligible Loan Amount: " + loanamount);
				System.out.println("Eligible EMIs: " + noEMIs);
			} else {
				System.out.println(-1);
			}
		} else {
			System.out.println(-1);
		}
	}
}
