package j18collection.j03queue;

import java.util.ArrayDeque;

public class j04StackDqueue {

	// It is a stack data structure 
	// FIFO (First In FirstOut)
	// Default Order is natural (Ascending)
	
	public static void main(String[] args) {
		
		 ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
	        //pushing elements into arrayDeque
	        arrayDeque.push("One");
	        arrayDeque.push("Two");
	        arrayDeque.push("Three");
	        arrayDeque.push("Four");
	        arrayDeque.push("Five");

	        System.out.println(arrayDeque);     //Printing the elements of arrayDeque
	        System.out.println("-----------1------------------------");
	 
	        //popping / removing up the elements from arrayDeque
	        System.out.println(arrayDeque.pop());    //Output : Five
	        System.out.println(arrayDeque.pop());    //Output : Four
	        System.out.println(arrayDeque);
	        System.out.println("-----------2------------------------");
	}

}
