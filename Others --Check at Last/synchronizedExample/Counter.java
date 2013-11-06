package synchronizedExample;

public class Counter {
	public int count = 0;
	public synchronized void add(int value)
	{
		count = count + value;
		
	}
	

}
