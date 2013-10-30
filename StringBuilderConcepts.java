
public class StringBuilderConcepts {

	public static void main(String[] args) {
		//consider the following snippet
		String s1 = "hello";
		s1 = s1 + "World";
		System.out.println(s1);
		//it seems like "world is appended to the object s1
		//but it is not 
		//s1 = "hello" is no more pointed and a new pointer to a new memory having the string "helloWorld" is being created
		//memory of s1="hello" remains in the memory n goes for garbage collection 
		//this is can be avoided by using StringBuilder and StringBuffer classes 
		//usually StringBuilder are used in most cases 
		
		//2 methods are present extra , append() and insert() 
		StringBuilder sb = new StringBuilder("hello");
		sb.append("World");
		System.out.println(sb);
		
		//use StringBuilder instead of String class to increase efficiency 
		
		

	}

}
