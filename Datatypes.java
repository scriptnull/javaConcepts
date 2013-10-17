import java.math.BigDecimal;


public class Datatypes {

	/**
	 * @param args
	 * @see http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html 
	 */
	public static void main(String[] args) {
		
	   
		
		byte myByte = 1;		
		Byte myByteObj = new Byte(myByte);  //instantiated with only byte primitives 
		//Byte myByteObj = new Byte(2);  //wrong usage of arguments -- int val is not accepted directly 
			
		short myShort = 30000;	
		Short myShortObj = new Short(myShort);
							
		int myInt = 5;			
		Integer x = new Integer(0); //Helper class For int differs from other 
		System.out.println("The Default Value of x is " + x);
		
		float myFloat = 10.8984f;		//f is suffixed for float type variables
		Float myFloatObj = new Float(myFloat);
		
		long myLong = 112L;  //capital L is used as a suffix to avoid confusions with 1
		Long myLongObj = new Long(myLong);
				
		double myDouble = 10.08d;   //appreciated
		double myDoubleWithoutd = 10.08;
		Double myDoubleObj = new Double(10.67);
		System.out.println("myDouble = " + myDouble + "\n" + "myDoubleWithoutd = " + myDoubleWithoutd );
		
		
			
		//dealing with big decimal numbers
		//eg.working with currency values
		BigDecimal bigVal = new BigDecimal(1000.57);
		System.out.println("bigVal is " + bigVal.toString() );  //returns really a big fractional part
		//in order to reduce the accuracy as per requirement
		//Snippet to maintain accuracy 
		Double money = 1000.57;
		String myS = money.toString();
		BigDecimal accuratemoney = new BigDecimal(myS);
		System.out.println(money);
		
		
		
		
		
		
	}

}
