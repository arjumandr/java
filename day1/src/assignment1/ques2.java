package assignment1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ques2 {
	public static void main(String[] args) {
		int n, i=1, avg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Students: ");
		try {
			n = sc.nextInt();
			int[] marks = new int[n];
			while(i<=n) {
				System.out.println("Enter marks for student "+ i);
				int m = sc.nextInt();
				if(m<0 || m>100) {
					System.out.println("Invalid score. Try again.");
					continue;
				}
				marks[i] = m;
				avg += m;
				i++;
			}
			System.out.println("Average marks: "+avg);
		}
		catch (InputMismatchException e) {
			System.out.println("Please enter integer only.");
		}
		finally {
			sc.close();
		}
	}
}
