package is.test;
import java.rmi.RemoteException;

import javax.ejb.Remote;



@Remote
public interface AccountBeanRemote {
	
	void setUsername(String username) throws RemoteException;
	void setPassword(String username) throws RemoteException;
	String getUsername() throws RemoteException;
	String getPassword() throws RemoteException;
}
