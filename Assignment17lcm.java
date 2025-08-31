import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, nume, deno, rem, gcd, lcm;
        System.out.print("Enter num1: ");
        num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        num2 = sc.nextInt();
        nume = (num1>num2)?num1:num2;
        deno = (num1<num2)?num1:num2;
        System.out.println("Numerator: "+nume+"\nDenominator: "+deno);
        rem = nume % deno;
        while(rem != 0) {
            nume = deno;
            deno = rem;
            rem = nume % deno;
        }
        gcd = deno;
        lcm = num1 * num2 / gcd;
        System.out.println("GCD: "+ gcd);
        System.out.println("LCM: "+ lcm);
    }
}
