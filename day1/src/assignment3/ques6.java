package assignment3;

import java.lang.Exception;
import java.util.Scanner;


class InvalidAgeException extends Exception {

	private static final long serialVersionUID = 1L; // why?

	public InvalidAgeException() {
		super("InvalidAgeException: Age must be between 18 and 59");
	}
}
public class ques6 {
	public static void check(String name, int age) throws InvalidAgeException{
		if(age <18 || age>60) {
			throw new InvalidAgeException();
		}else {
			System.out.println("Name: "+name+" , Age: "+age);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.close();
		try {
			check(name, age);
		}catch(InvalidAgeException e) {
			e.printStackTrace();
		}
	}
}
