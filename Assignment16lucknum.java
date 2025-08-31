import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp, count = 0, pos, sum = 0;
        temp = num;
        while(temp > 0) {
            count++;
            temp /= 10;
        }
        temp = num;
        for(pos = count; pos >= 1; pos-- ) {
            int digit = temp % 10;
            temp /= 10;
            
            if(pos%2==0) {
                sum += (digit * digit);
            }
        }
        System.out.println("Sum of square of even positioned digit: "+ sum);
        if(sum % 9 == 0) {
            System.out.println("The number "+num+ " is a lucky number");
        }
        else {
            System.out.println("The number "+num+ " is not a lucky number");
        }
    }
}
