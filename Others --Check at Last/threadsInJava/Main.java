package threadsInJava;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Athread aThreadClassObj = new Athread();
		Thread aThreadObj = new Thread(aThreadClassObj);
		BThread bThreadObj = new BThread();
		aThreadObj.start();
		Thread.sleep(2000);	//static Method to make the process to go to sleep
		System.out.println("Eecuted after 2000 ms");
		bThreadObj.start();
		Thread.sleep(1000);
		System.out.println("Eecuted after 3000 ms");
		
	}

}
