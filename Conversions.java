
public class Conversions {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* byte
		 * short
		 * int
		 * long
		 * float
		 * double
		 * 
		 * datatypes arranged from low to high
		 */
		
		//low to high datatype conversion is performed implicitly 
		byte a = 1;
		int b = a ;
		System.out.print("byte value = " + a + "\n" + "int value = " + b);
		
		//high to low datatype conversion should be done manually
		int c = 3;
		byte d = (byte) c;  //note the casting done manually with help of (...)
		System.out.print( "\nint value = " + c + "\nbyte value = " + d) ;
		
		//casting in case of Helper classes 
		Double myDouble = new Double(38.78);
		int myInt = myDouble.intValue();
		byte myByte = myDouble.byteValue();
		System.out.print("\nmyDouble value = " + myDouble + "\nmyInt value = " + myInt + "\nmyByte value = " + myByte) ;
		
		//high to low datatype conversion may lead to data loss and data change 
		int x = 128;
		byte y = (byte)x;
		System.out.print("\nint value is "+ x + " and the equivalent byte value is "+ y);  //produces negative values because range of byte is -128 to 127
		
		
		
		
		

	}

}
