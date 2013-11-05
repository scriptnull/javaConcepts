package classconcept;

/* 
 * Check:  http://www.xyzws.com/Javafaq/what-does-classforname-method-do/17
 */

import java.lang.reflect.Method;

public class MainClass {

	public static void main(String[] args) {
		
		 try {
			Class.forName("classconcept.FirstClass");	//static Block of First class will be executed
			
			Class obj = Class.forName("classconcept.FirstClass");
		/*
			note that when Class.forName(classconcept.FirstClass) is called second time ,
			Static Block of First Class is not executed 
			Reason :
			The class loader loads the class FirstClass during the first call itself ,
			so there is no need for loading it second time 
			
				
			*/
			
			Method[] methodarr = obj.getMethods();	
			//getting the method names that are present in the class
			System.out.println(obj.toString());
			for(Method x : methodarr)
			{
				System.out.println(x.toString());
			}
			
			Method my = methodarr[0];
			System.out.println(my.getName());
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		

	}

}
