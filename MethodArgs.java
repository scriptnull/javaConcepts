
public class MethodArgs {

	public static void main(String[] args) {
		/*
		 * Arguments are passed into method in 2 types
		 * pass by copy
		 * pass by reference 
		 * in java , pass by copy is general in most cases 
		 * primitives like int,byte,double... are sent as pass by copy
		 * complex datatypes are sent as pass by reference 
		 * however String is passed by copy
		 * 
		 */
		
		//pass by copy
		int original = 5;
		System.out.println("original values is " +original);
		mymethod(original);
		System.out.println("original values is " +original);
		
		String originalString = "hello";
		System.out.println("original values is " +originalString);
		mymethod(originalString);
		System.out.println("original values is " +originalString);
		
		//pass by reference
		int[] array = {1,2,3};
		System.out.println("array[0] = "+ array[0]);
		mymethod(array);
		System.out.println("array[0] = "+ array[0]);
		
	
	}

	private static void mymethod(int[] inMethod) {
		inMethod[0]++;
		System.out.println("inMethod[0] = " + inMethod[0]);
		
		
	}

	private static void mymethod(String inMethod) {
		inMethod = "hi";
		System.out.println("original values is " + inMethod);
			
	}

	private static void mymethod(int inMethod) {
		inMethod++;
		System.out.println("inMethod value is " + inMethod);
		
	}

}
