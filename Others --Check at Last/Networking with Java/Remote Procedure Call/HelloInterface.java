
import java.rmi.*;
public interface HelloInterface extends Remote {
	//All remote methods should throw a RemoteException
	public void sayhello() throws RemoteException ;
	
}
