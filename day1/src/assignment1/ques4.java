package assignment1;
import java.util.Scanner;
import java.util.Arrays;


public class ques4 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		int[][] arr = new int[n][n];
		for(int i=1; i<=n; i++) {
			int[] row = new int[i];
			for(int j=1; j<=i; j++) {
				row[j-1] = j;
			}
			arr[i-1] = row;
		}
		for(int i=0; i<n; i++) {
			System.out.println(Arrays.toString(arr[i]) + " ");
		}
	}
}
