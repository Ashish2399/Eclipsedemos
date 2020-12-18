package Bugfixing;
import java.util.Arrays;
public class fixing1 {
	int solution(int[] A, int[] B) {
//commit and push this time
	int n = A.length;

	int m= B.length;

	Arrays.sort(A);
	Arrays.sort(B);
//pull change1
<<<<<<< HEAD
	//pushing next here
=======
	//pushing first here
>>>>>>> branch 'master' of https://github.com/Ashish2399/Eclipsedemos.git
	int i = 0;

	for (int k = 0; k < n && i<m;) {
		if (A[k]==B[i]) return A[k];

	if (B[i] < A[k])
		i += 1;
	else
	k+=1;
	}
	return -1;
	}
	
	public static void main(String[] args) {

	int[] A = {2, 4, 6, 7);

	int[] B= {2, 1, 1, 8};

	System.out.println(new fixing1().so int[] A2 = {0, 1, 2, 3); int() 12 = (2, 1, 3, 4,5}
}
