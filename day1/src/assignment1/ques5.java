package assignment1;
import java.util.Scanner;

public class ques5 {
	public static Boolean validateDate(int d, int m, int y) {
		if(m<1 || m>12 || d<1 || d>31) {
			return false;
		}
		int[] monthDays = {-1, 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31};
		if(m==2 && (y%400==0 || ((y%4==0 && y%100!=0)))) {
			return d <= 29;
		}
		return d <= monthDays[m];
	}
	public static void main(String[] args) {
		int d, m, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day, month and year: ");
		d = sc.nextInt();
		m = sc.nextInt();
		y = sc.nextInt();
		sc.close();
		if(!validateDate(d, m, y)) {
			System.out.println("Invalid Date.");
		}
		else {
			System.out.println("Valid Date");
		}
	}
}
