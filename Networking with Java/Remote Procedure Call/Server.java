

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server {

	Server() throws RemoteException
	{
		try
		{
			Hello h = new Hello();
			Naming.rebind("rmi://127.0.0.1:1099/HelloService", h);	
		}
		catch(MalformedURLException e)
		{
			System.out.println(e);
			
		}
		
		
	}
	public static void main(String[] args) throws RemoteException {
	 new Server();
	 

	}

}
