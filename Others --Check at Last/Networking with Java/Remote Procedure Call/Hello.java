
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class Hello extends UnicastRemoteObject implements HelloInterface {
	Hello() throws RemoteException
	{
	
	}

	@Override
	public void sayhello() throws RemoteException {
		System.out.println("Hello");
		
	}
	
}
