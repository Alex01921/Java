import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, sum, rem, div, org_num;
		System.out.print("Enter a number:");
		num = sc.nextInt();
		org_num = num;
		sum = 0;
		while (num > 0) {
			rem = num % 10;
			sum += rem;
			num = num / 10;
		}
		System.out.println("Sum of digits: " + sum);
		div = org_num / sum;
		System.out.println("Division of number by sum of digits: " + div);
		if(org_num % sum == 0) {
			System.out.println("The number is divisible by the sum of its digits.");
		}
		else {
			System.out.println("The number is not divisible by the sum of its digits.");
		}
	}
}
