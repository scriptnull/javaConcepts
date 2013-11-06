package synchronizedExample;

public class CounterThread extends Thread {
	Counter myCounter = null ;
	public CounterThread(Counter x) {
		myCounter = x ;
		
	}
	public void run()
	{
		myCounter.add(100);
		
	}

}
