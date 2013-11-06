import java.util.Stack;


public class StackConcept {

	public static void main(String[] args) {
		Stack myStack = new Stack();			// can accept different types of Objects 
		myStack.add(1);	//add element to stack
		myStack.add(2);
		myStack.add("hello");
		System.out.println(myStack);
		myStack.remove("hello");	//removing by specifying the element 
		System.out.println(myStack);
		myStack.remove(0);			//removing element by specifying index value
		System.out.println(myStack);
		
		// System.out.println(myStack.capacity());	//get Stack's inital capacity ; capacity is auto incremented , further see documentation
		boolean testEmpty = myStack.empty();
		System.out.println("Stack is Empty : " + testEmpty);
		
		Stack<Integer> intStack = new Stack<Integer>();	
		intStack.addElement(1);
		intStack.add(2);
	//	intStack.add("my string");	//not possible
		
		System.out.println(intStack);
		
		intStack.remove(1);
	
		System.out.println(intStack);
		
		

	}

}
