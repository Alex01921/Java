import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b; 
        double c;
        double x1;
        double x2;
        double discriminant;
        System.out.print("Enter a:");
        a = sc.nextDouble();
        System.out.print("Enter b:");
        b = sc.nextDouble();
        System.out.print("Enter c:");
        c = sc.nextDouble();
        discriminant = (b*b)-(4*a*c);
        
        if (discriminant == 0) {
            x1 = (-b + discriminant)/(2*a);
            x2 = (-b - discriminant)/(2*a);
            System.out.println("The roots are: "+ x1+"\t"+x2);
        }
        else if (discriminant > 0) {
            x1 = (-b + discriminant)/(2*a);
            x2 = (-b - discriminant)/(2*a);
            System.out.println("The roots are: "+ x1+"\t"+x2);
        }
        else {
            System.out.println("The equation has no real roots");
        }
    }
}
