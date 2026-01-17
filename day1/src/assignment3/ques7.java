package assignment3;

import java.util.Scanner;

public class ques7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			System.out.println("The quotient of "+a+"/"+b+" is: "+a/b);
		}
		catch(ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("Division by zero exception caught.");
		}
		finally {
			System.out.println("Inside finally block.");
		}
	}
}
