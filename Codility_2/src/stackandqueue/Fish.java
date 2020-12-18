package stackandqueue;

import java.util.Stack;

public class Fish {
	public static int solution(int[] A, int[] B) {
		 int alive=A.length;
		 Stack<Integer> st=new Stack<Integer>();
		 for(int i=0;i<A.length;i++) {
			 if(B[i] == 1)  {
				 st.push(A[i]);}
				
			 if(B[i]==0) {
		 while(!st.isEmpty()) {
			 if(st.peek()>A[i]) {
				 alive--;
				 break;
			 }
		
		 
		 else if (st.peek()<A[i]) {
			 alive--;
			 st.pop();
			// st.push(A[i]);
		}
				
	 }
			 }
}
		 return alive;
	}
	public static void main(String[] args) {
		int[] A = {2,3,1,4,5};
		int[] B = {1,0,0,1,0};
		//int[] A ={4,3,2,1,5};
		//int[] B ={0,1,0,0,0};
		System.out.println(solution(A,B));
}



/*/fishes with 1(downstream) is maintained in the stack
//int[] A= {​​4,3,2,1,5}​​;
//Fishes at last position with downstream is not eaten by previous upstream fishes
//int[] A= {​​3,5,2,1,4}​​;
//int[] B= {​​1,0,0,0,1}​​;
//output=4
//

/*
int[] A= {​​3,5,2,1,4}​​;
int[] B= {​​1,0,0,1,0}​​;
// 5,2,1 are alive

*/



/*
int[] A= {​​4,3,2,1,5}​​;
int[] B= {​​0,1,0,0,0}​​;
//4 and 2 are alive
*
*
*/

/* int[] A= {​​1,3,2,4,5}​​;
int[] B= {​​0,1,0,1,0}​​;
// 2 is removed
// 5 is removed
// 3 is removed
// 1,4 are alive fished
*/

/*
int[] A= {​​1,3,5,4,2}​​;
int[] B= {​​0,1,0,1,0}​​;
//3 is removed
//2 is removed
//1,5,4 are alive
*/

/* int[] A= {​​1,3,5,4,2}​​;
int[] B= {​​1,1,0,1,0}​​;

//3 is removed
//1 is removed
//2 is removed
//5 and 4 is alive*/

/* int[] A= {​​2,3,1,4,5}​​;
int[] B= {​​1,0,0,1,0}​​;
//removed fishes
//alive fishes
*/
/*
int[] A= {​​2,3,1,4,6}​​;
int[] B= {​​1,0,0,1,1}​​;
//removed fishes
//alive fishes
*/

int[] A= {​​6,3,1,4,2}​​;
int[] B= {​​0,0,0,1,1}​​;
//removed fishes
//alive fishes*/
