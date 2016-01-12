package assignment3;
import java.util.*;
public class StacksAndQueues {
	
	//our two data structures with integers to test with
	public static Queue<Integer> Q = new ArrayDeque<Integer>();
	public static Stack<Integer> myStack = new Stack<Integer>();
	
	
	
	public static void main(String[] args) {
		/*	
		 * 		Test Main Method
		 * 
			Q.add(1);
			Q.add(4);
			Q.add(5);
			Q.add(9);
			Q.add(7);
			
			System.out.println(Q);
			reverseQueue(Q);
			System.out.println(Q);
			
			myStack.push(1);
			myStack.push(2);
			myStack.push(3);
			myStack.push(4);
			myStack.push(5);
			
			Stack<Integer> CopiedStack = CopyStack(myStack);
			System.out.println(myStack);
			System.out.println(CopiedStack);
			
		*/	
			
	}

	public static Queue<Integer> reverseQueue (Queue<Integer> Q){
		//first put all but the last element of the queue into the stack
		while(Q.size() >1 ){
			myStack.add(Q.remove());
		}

		//then place all of the elements in the stack back into the queue
		while(!myStack.empty()){
			Q.add(myStack.pop());
		}
		return Q;
	}
	
	
	
	
	public static Stack<Integer> CopyStack(Stack<Integer> Original){
		//create our new stack
		Stack<Integer> Copy = new Stack<Integer>();
		
		//create our new queue
		Queue<Integer> StoreQ = new ArrayDeque<Integer>();
		
		while(!Original.empty()){
			//place all of our items in the original stack into our Queue
			StoreQ.add(Original.pop());
		}
			
		//reverse this queue
		reverseQueue(StoreQ);
		
		//place this Queue into our stacks copy AND our original
		while(!StoreQ.isEmpty()){
			//peek into the Queue
			Original.add(StoreQ.peek());
			Copy.add(StoreQ.remove());
		}
		
		//then return our copy
		return Copy;
	}
	
	
	
	
	
}
