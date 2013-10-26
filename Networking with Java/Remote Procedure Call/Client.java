

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) throws RemoteException {
		try {
			String rmiName = "rmi://127.0.0.1:1099/HelloService";
			HelloInterface hi = (HelloInterface)Naming.lookup(rmiName);
			hi.sayhello();
			
		} catch (MalformedURLException e) {
			System.out.println(e);
			
		}
		 catch (NotBoundException e) {
				System.out.println(e);
				
			}
		

	}

}
