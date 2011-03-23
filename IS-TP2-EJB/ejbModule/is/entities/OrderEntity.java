/**
 * This file was created by Marco Simões
 *
 * The copy, distribution or replication of this code
 * MUST be requested to msimoes@student.dei.uc.pt
 */
package is.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Class that registers the orders and keep info about its state 
 * 
 * @author Marco Simões <msimoes@student.dei.uc.pt>
 */
@Entity
@Table(name="ORDERS")
public class OrderEntity implements Serializable{
	
	public static final int ERROR = 0;
	public static final int SHIPPING = 1;
	public static final int DELIVERED = 2;
	
	
	Integer id;
	List<OrderItemEntity> orderItems;
	UserAccountEntity user;
	Date time;
	Integer status;
	Integer deliveringDays;
	
	public OrderEntity(){
		
	}

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_ID")
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
	 * @return the orderItems
	 */
	@OneToMany(targetEntity=OrderItemEntity.class, fetch=FetchType.EAGER)
	public List<OrderItemEntity> getOrderItems() {
		return orderItems;
	}

	/**
	 * @param orderItems the orderItems to set
	 */
	public void setOrderItems(List<OrderItemEntity> orderItems) {
		this.orderItems = orderItems;
	}

	/**
	 * @return the user
	 */
	@ManyToOne(targetEntity=UserAccountEntity.class, fetch=FetchType.EAGER)
	public UserAccountEntity getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(UserAccountEntity user) {
		this.user = user;
	}

	/**
	 * @return the time
	 */
	@Column(name="TIME")
	public Date getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * @return the status
	 */
	@Column(name="STATUS")
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * @return the deliveringDays
	 */
	@Column(name="DELIVERING_DAYS")
	public Integer getDeliveringDays() {
		return deliveringDays;
	}

	/**
	 * @param deliveringDays the deliveringDays to set
	 */
	public void setDeliveringDays(Integer deliveringDays) {
		this.deliveringDays = deliveringDays;
	}
	
	
	
	

}
