
public class LoopsInJava {

	public static void main(String[] args) {
		//loops in java are mostly similar to C style languages 
		
		//for loop
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);	
		}
		
		//foreach in java 
		String[] strArr = {"one","two","three","four"};	
		for (String temp : strArr ) {
			System.out.println(temp);
		}
		
		//While loop in java 
		int init =0 ;
		while(init<5)	//while( /*Expression that returns boolean value*/ )
		{
		System.out.println(init);
		init++;	
		}
		
		/*
		while(true)
		{
			
			//this is a infinite loop 
		}
		*/
		
		//do while in java 
		init=0;
		do {
			System.out.println(init);
			init++;
		} while (init<5);        //while is followed by a semicolon in do while statement
		
		
		

	}

}
