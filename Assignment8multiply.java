import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		if(num % 3 == 0 && num % 5 == 0) {
			System.out.println("Zoom");
		}
		else if (num % 5 == 0) {
			System.out.println("Zap");
		}
		else if (num % 3 == 0 ) {
			System.out.println("Zip");
		}
		else {
			System.out.println("Invalid");
		}
	}
}
