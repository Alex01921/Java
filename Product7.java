import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		System.out.print("Enter a:");
        a = sc.nextInt();
        System.out.print("Enter b:");
        b = sc.nextInt();
        System.out.print("Enter c:");
        c = sc.nextInt();

		if ( a != 7 && b != 7 && c!= 7) {
			d = a * b * c;
			System.out.println("Product: " + d);

		}
		else if (a == 7 ) {
			d = b * c;
			System.out.println("Product: " + d);
		}
		else if ( b == 7) {
			d =  c;
			System.out.println("Product: " + d);
		}
		else if (c == 7) {
			d = -1;
			System.out.println("Product: " + d);
		}
	}
}
