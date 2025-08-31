import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, org_num, rem, mul, seed, y;
        System.out.print("Enter a number:");
        num = sc.nextInt();
        System.out.print("Enter seed number:");
        y = sc.nextInt();
        org_num = num;
        mul = 1;
        while (num > 0) {
            rem = num % 10;
            mul *= rem;
            num /= 10;
        }
        seed = org_num * mul;
        if (seed == y) {
            System.out.println(org_num+" is a seed of "+y);
        }
        else {
            System.out.println(org_num+" is not a seed of "+y);
        }
        
    }
}
