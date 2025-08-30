import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day;
		int month;
		int year;
		int max1;
		System.out.println("Enter day: ");
		day = sc.nextInt();
		System.out.println("Enter month: ");
		month = sc.nextInt();
		System.out.println("Enter year: ");
		year = sc.nextInt();
	    if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
	    	max1 = 31;
	    } 
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
	    	max1 = 30;
	    } 
		else {
	    	if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	    		max1 = 29;
	    	} else {
	    		max1 = 28;
	    	}
	    }
		if (month < 1 || month > 12 || day < 1 || day > max1) {
			System.out.println("Invalid date");
		} 
		else if (day == max1 && month < 12) {
			day = 1;
			month += 1;
			System.out.println("Next date is: " + day + "/" + month + "/" + year);
		} 
		else if (day == max1 && month == 12) {
			day = 1;
			month = 1;
			year += 1;
			System.out.println("Next date is: " + day + "/" + month + "/" + year);
		} 
		else {
			day += 1;
			System.out.println("Next date is: " + day + "/" + month + "/" + year);
		}
	}
}
