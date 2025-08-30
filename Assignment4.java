import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String foodtype;
		double distance;
		double quantity;
		double veg = 12;
		double nonveg = 15;
		double total = 0;
		double delivery = 0;
		System.out.println("Food Type (V/N):");
		foodtype = sc.nextLine();
		System.out.println("Distance:");
		distance = sc.nextDouble();
		System.out.println("Quantity:");
		quantity = sc.nextDouble();

		if (!(foodtype.equalsIgnoreCase("V") || foodtype.equalsIgnoreCase("N")) 
            || quantity < 1 
            || distance <= 0) {
            System.out.println(-1);
            return;
        }

		if (foodtype.equalsIgnoreCase("V")) {
			if ( distance > 0 && distance <= 3) {
				total = veg * quantity;
				System.out.println("Total: " + total);
			}
			else if ( distance > 3 && distance <= 6) {
				delivery = (distance - 3) * 1;
				total = (veg * quantity) + delivery;
				System.out.println("Total: " + total);
			}
			else if ( distance > 6) {
				delivery = 3 + ((distance - 6) * 2);
				total = (veg * quantity) + delivery;
				System.out.println("Total: " + total);
			}
		}
		else if (foodtype.equalsIgnoreCase("N")) {
			if ( distance > 0 && distance <= 3) {
				total = nonveg * quantity;
				System.out.println("Total: " + total);
			}
			else if ( distance > 3 && distance <= 6) {
				delivery = (distance - 3) * 1;
				total = (nonveg * quantity) + delivery;
				System.out.println("Total: " + total);
			}
			else if ( distance > 6) {
				delivery = 3 + ((distance - 6) * 2);
				total = (nonveg * quantity) + delivery;
				System.out.println("Total: " + total);
			}
			else {
				System.out.println("Invalid Input");
			}
		}
	}
}
