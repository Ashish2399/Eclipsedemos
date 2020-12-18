import java.util.Stack;

public class wallbuilding {		​​
	public static int solution(int[] H) {​​ 
	
	Stack<Integer> st = new Stack<>();
	int numBlock =0;

	for(int i=0; i< H.length; i++){​​
	
	while( st.isEmpty()==false && st.peek() > H[i] ){​​
	st.pop();
	}​​
	
	if(st.isEmpty()){​​
	numBlock++; // add a block
	st.push(H[i]); // push the height
	}​​
	
	else if( st.peek() == H[i] ){
	}		
	else if( st.peek() < H[i] ){​​
	numBlock++;        // add a block
	st.push(H[i]);           // push the height
	}​​​​
	return numBlock;
	}​​
	public static void main(String[] args) {​​
	int[] H= {​​8,8,5,7,9,8,7,4,8}​​;
	System.out.println(solution(H));
	}​​
	}
}

	// main idea: need to use "stack" to check when we need a new block
	//i=0...8
	// note: H[i] is the ith height of the wall
	// step 1: "stack is not empty" AND "from high to low"
		// then, "pop" (it is the key point, be careful)
	// step 2: if the stack is empty
	// step 3: the height is the same: do nothing
	​​//no   in block
	​​
		// step 4: from low to high