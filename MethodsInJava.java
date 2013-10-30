
public class MethodsInJava {

	public static void main(String[] args) {
		
//		accessing static Methods 
		printPrivate();
		printProtected();
		
//		Classname.staticmethod();  //another way
		MethodsInJava.printDefault();
		MethodsInJava.printPublic();
		
		
		
//		accessing member Methods
//		create an object to acccess them
		MethodsInJava obj = new MethodsInJava();
		obj.memberMethod();


	}

	/* Syntax for method definition of member method
	 * access_specifier  return_type methodname(param list seperated by comma)
	 * {
	 * 
	 *body of the function
	 *	
	 * }
	 */
	/* Syntax for method definition of static method
	 * access_specifier static  return_type methodname(param list seperated by comma)
	 * {
	 * 
	 * body of the method
	 * 
	 * }
	 */
	private static void printPrivate()
	{
		System.out.println("Private");	//private methods are accessible within the class only
	}
	
	public static void printPublic()   //public methods are accessible everywhere 
	{
		
		System.out.println("Public");
		
	}
	
	protected static void printProtected() //accessible within the class and sub-class 
	{
		System.out.println("Protected");
	}
	
	static void printDefault()  //default access specifier is used here . accessible within the current package 
	{
		System.out.println("Default");
	}
	
	private void memberMethod()
	{
		System.out.println("Member Method");
		
	}
	
}
