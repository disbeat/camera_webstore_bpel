package is.sessionbeans.interfaces.remote;
import is.entities.UserAccountEntity;

import javax.ejb.Remote;

@Remote
public interface UserManagerRemote {
	public void addUser(String username, String password, String email, String address);
	public Integer checkLogin(String name, String pass);
	public UserAccountEntity getUser(Integer id);
	public UserAccountEntity getUser(String name);
	public boolean userExists(String name);
}
