import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double one;
		double five;
		double purchaseAmount;
		System.out.println("Enter $1 notes available: ");
		one = sc.nextDouble();
		System.out.println("Enter $5 notes available: ");
		five = sc.nextDouble();
		System.out.println("Enter purchase amount: ");
		purchaseAmount = sc.nextDouble();
		double remainder = purchaseAmount % 5;
		int quotient = (int) (purchaseAmount / 5);
		if (remainder > one || quotient > five) {
			System.out.println("Insufficient funds");
			System.out.println("-1");
		} 
		else {
			System.out.println("Transaction successful");
			System.out.println("$1 notes needed: " + remainder);
			System.out.println("$5 notes needed: " + quotient);
		}
	}
}
