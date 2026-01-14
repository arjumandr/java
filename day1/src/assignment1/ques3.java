package assignment1;

public class ques3 {

	public static void main(String[] args) {
		// given array
		int[] original = {-1, 25, 2, 11, 4};
		int[] copied;
		int n = original.length;
		copied = new int[n];
		for(int i=0; i<n; i++) {
			copied[i] = original[i];
		}
	}
}
