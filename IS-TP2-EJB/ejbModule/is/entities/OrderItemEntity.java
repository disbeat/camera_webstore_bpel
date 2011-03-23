/**
 * This file was created by Marco Simões
 *
 * The copy, distribution or replication of this code
 * MUST be requested to msimoes@student.dei.uc.pt
 */
package is.entities;

import java.io.Serializable;

import javax.jws.Oneway;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

/**
 * @author Marco Simões <msimoes@student.dei.uc.pt>
 *
 */
@Entity
@Table(name="ORDER_ITEMS")
public class OrderItemEntity implements Serializable{

	Integer id;
	CameraEntity cam;
	Integer quantity;
	OrderEntity order;
	
	public OrderItemEntity(){
		
	}

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ITEM_ID")
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
	 * @return the cam
	 */
	@ManyToOne(targetEntity=CameraEntity.class, fetch=FetchType.EAGER)
	public CameraEntity getCam() {
		return cam;
	}

	/**
	 * @param cam the cam to set
	 */
	public void setCam(CameraEntity cam) {
		this.cam = cam;
	}

	
	/**
	 * @return the quantity
	 */
	@Column(name="QUANTITY")
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the order
	 */
	@ManyToOne(targetEntity=OrderEntity.class, fetch=FetchType.EAGER)
	public OrderEntity getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(OrderEntity order) {
		this.order = order;
	}
	

	
	
}
