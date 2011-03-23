/**
 * This file was created by Marco Simões
 *
 * The copy, distribution or replication of this code
 * MUST be requested to msimoes@student.dei.uc.pt
 */

package is.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class responsible for the users' accounts
 * 
 * @author Marco Simões <msimoes@student.dei.uc.pt>
 */

@Entity
@Table(name="USERS")
public class UserAccountEntity {
	private Integer id;
	private String username;
	private String password;
	private String email;
	private String address;
	
	
	public UserAccountEntity(String username, String password, String email, String address) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
	}


	
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	public Integer getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @return the username
	 */
	@Column(name="USERNAME")
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
	@Column(name="PASSWORD")
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the email
	 */
	@Column(name="EMAIL")
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



	/**
	 * @return the address
	 */
	@Column(name="ADDRESS")
	public String getAddress() {
		return address;
	}



	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	
	
	

}
