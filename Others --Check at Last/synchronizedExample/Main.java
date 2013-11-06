package synchronizedExample;


public class Main {

	public static void main(String[] args) {
	Counter x = new Counter();
	CounterThread t1 = new CounterThread(x);
	CounterThread t2 = new CounterThread(x);
	t1.start();	//allowed 	
	t2.start();	//blocked 
	
	System.out.println(x.count);	//only first 100 is added 	

	}

}

// The above program is developed by extracting the concepts discussed in the below link
// check : http://tutorials.jenkov.com/java-concurrency/synchronized.html
