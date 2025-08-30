import  java.util.Scanner;
public class GeometricSeries {
	public static void main(String[] args) {
		int n;
		int a = 1;
		int r = 2;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		n = sc.nextInt();
		System.out.println("Output :");
		for(int i = 1; i <= n; i++) {
			b = a * (int)Math.pow((double)r, (double)(i-1));
			System.out.print(b + "\t");
		}
	}
}
