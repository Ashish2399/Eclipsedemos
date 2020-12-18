package casestudy.bugfixing;

import java.util.Arrays;

//return the minimal value that occurs in both the arrays
//if no match found return -1
public class bugfixing2 {

	int solution(int[] A, int[] B) {
		int n = A.length;
		int m = B.length;
		Arrays.sort(A);
		Arrays.sort(B);
		int i = 0;
		for (int k = 0; k < n;k++) {
			if (A[k] == B[i])
				return A[k];
			while(i < m - 1 && B[i] < A[k])
				i += 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] A = { 2, 4, 3, 7 };
		int[] B = { 2, 1, 5, 8 };
		System.out.println(new bugfixing2().solution(A, B));
	}
}
