package classconcept;

 /* 
  * Check:  http://www.xyzws.com/Javafaq/what-does-classforname-method-do/17
  */
public class FirstClass {
	static
	{
		System.out.println("Static Block of First Class");
	}
	public FirstClass() {
		System.out.println("Constructor of First Class");
	}
	public static void main(String[] args) {
		System.out.println("Main Function of FirstClass");

	}

}
