import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int heads, legs, chickens, rabbits;
		System.out.print("Enter the number of heads: ");
		heads = sc.nextInt();
		System.out.print("Enter the number of legs: ");
		legs = sc.nextInt();
		if (legs < 2 * heads || legs > 4 * heads || legs % 2 != 0) {
			System.out.println("No solution");
		}
		else {
			rabbits = (legs - 2 * heads) / 2;
			chickens = heads - rabbits;
			System.out.println("Chickens: " + chickens);
			System.out.println("Rabbits: " + rabbits);
		}
	}
}
