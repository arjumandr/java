package assignment1;
import java.util.Arrays;

public class ques1 {
	public static void main(String args[]) {
		int[] arr = new int[20];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2; i<20; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		int avg = 0;
		System.out.println("The first 20 Fibonacci numbers: ");
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<20; i++) {
			avg += arr[i];
		}
		System.out.println("Average of Fibonacci numbers: "+ avg/20);
	}
}
