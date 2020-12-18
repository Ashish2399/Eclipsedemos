package stackandqueue;

import java.util.Stack;

public class cubicwall {

public static int solution(int[] H) {​​ 
Stack<Integer> st = new Stack<>();
int numBlock =0;
for(int i=0; i< H.length; i++){​​
	while( st.isEmpty()==false && st.peek() > H[i] )
	{​​
	st.pop();
	}​​
		if(st.isEmpty() ){​​
	numBlock++; 
	st.push(H[i]); 
		}​​
		else if( st.peek() == H[i] ){
	}		
		else if( st.peek() < H[i] )
	{​​
		numBlock++;        
	st.push(H[i]);           
	}​​​​
	}
	return numBlock;
	}​ ​

	public static void main(String[] args) {​​
		int[] H= {​​8,8,5,7,9,8,7,4,8}​​;
		System.out.println(solution(H));
		}​ ​
}
