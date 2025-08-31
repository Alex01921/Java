import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int num, rev, org_num, rem;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		num = sc.nextInt();
		org_num = num;
		rev = 0;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (org_num == rev) {
			System.out.println(org_num + " is a palindrome.");
		} else {
			System.out.println(org_num + " is not a palindrome.");
		}
	}
}
