package is.sharedObjects;

import java.util.Date;
import java.util.List;

public class Order {
	
	public static final int ERROR = 0;
	public static final int SHIPPING = 1;
	public static final int DELIVERED = 2;
	
	Integer id;
	List<OrderItem> orderItems;
	Date time;
	Integer status;
	Integer deliveringDays;
	
	public Order(){
		
	}

	/**
	 * @return the id
	 */
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
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	/**
	 * @param orderItems the orderItems to set
	 */
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	/**
	 * @return the time
	 */
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
