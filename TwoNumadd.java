import java.util.Scanner;
public class TwoNumadd {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		a = sc.nextInt();
		System.out.print("Enter second number: ");
		b = sc.nextInt();
		System.out.println("Output :");
		if (a != b) {
			c = (a+b) * 2;
			System.out.println(c);
		}
		else {
			c = a+b;
			System.out.println(c);
		}
	}
}
