
public class StringConcept {

	public static void main(String[] args) {
		//creating a String 
		String str1 = "Hello World";	//shortcut method
		String str2 = new String();		//using String class constructor		
		String str3 = new String("Hello World");		//many constructors are available.
		
		//str1 and str3 are equal 
		//use equals function to compare 2 strings 
		//don't use == 
		
		if(str1 == str3 )
		{
			System.out.println("They are same");			
		}
		else
		{
			System.out.println("They are not same");			
		}
	
		//Comparing strings <<Case Sensitive Comparision>>
		if(str1.equals(str3))
		{
			System.out.println("They are same");			
		}
		else
		{
			System.out.println("They are not same");			
		}
				
		//Ignore cases and compare
		if(str1.equalsIgnoreCase(str3))
		{
			System.out.println("They are same");			
		}
		else
		{
			System.out.println("They are not same");			
		}
		
		
		// == checks whether the string objects point to the same memory which can be done by following statements 
		str2 = str1 ;
		//this means str2 points to the memory of str1
		if(str1 == str2 )	//true 
		{
			System.out.println("They are same");				
		}
		else
		{
			System.out.println("They are not same");			
		}
		
		//finding lengths of the string 		
		String bigString  = "This is a really big string";
		String smallString = "this is a small string";
		String oneletter = "a";
		System.out.println("length of bigString is" + bigString.length() );
		System.out.println("length of smallString is" + smallString.length() );
		System.out.println("length of oneletter is" + oneletter.length() );
		// using compareTo function
		//compareTo use unicode values of each character to compare strings
		//check its 
		String a = "a";
		String b = "a" ;
		useCompareToFunc(a, b);
		
		a = "a";
		b = "b";
		useCompareToFunc(a, b);
		
		a = "ab";
		b = "ab";
		useCompareToFunc(a, b);
		
		a = "abc";
		b = "abd";
		useCompareToFunc(a, b);
		
		//converting string value to a byte array is useful in some cases 
		//for example when dealing with some Streams n network programming , it is essential to change strings to byte[] 
		//so getByte is such a function 
		
		byte[] myarr = a.getBytes();
		
		//concatinating Strings 
		String concatStr = a.concat(b);
		System.out.println(concatStr);
		
		//trim() function helps in removing spaces at the end of a string
		String s1 = "Hello World";
		String s2 = "Hello World      ";
		System.out.println("Before Trim() function");
		System.out.println("s1 length = " + s1.length());
		System.out.println("s2 length = " + s2.length());
		System.out.println("After Trim() function");
		System.out.println("s1 length = " + s1.length());
		System.out.println("s2 length = " + s2.length());
		
		//indexOf
		s1 = "find the index position of the first occurence of hello in this string";
		System.out.println(s1.indexOf("hello"));
		
		//subString()
		System.out.println(s1.substring(50));
		System.out.println(s1.substring(50,55));
		
		
	
	}

	private static void useCompareToFunc(String a, String b) {
		int diff = a.compareTo(b);
		System.out.println("diff value is "+ diff);
	}

	

}
