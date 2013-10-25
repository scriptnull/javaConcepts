class SwitchCaseConcept{
	public static void main(String[] args) {
		int key = 1;

		switch(key)   //key must be a integer or an enum 
		{  			  //key can accept String ,if we are working with java 7
			case 1:
			System.out.println("case 1 is executed !");
				break;
			default:
			System.out.println("default is executed !");
				break;
		}
	}
}