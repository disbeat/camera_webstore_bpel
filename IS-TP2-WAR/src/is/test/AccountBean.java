package is.test;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.Remote;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class AccountBean
 * 
 * @author msimoes
 */

@Stateless
@Remote(AccountBeanRemote.class)
public class AccountBean {

	private static final long serialVersionUID = 1L;
	
	
	private String username;
	private String password;
    
	/**
     * constructor. 
     */
	public AccountBean() {

    }
    
    
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	
	
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

    
}
