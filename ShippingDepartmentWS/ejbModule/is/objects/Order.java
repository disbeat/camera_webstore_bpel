package is.objects;

import java.util.List;

public class Order {
	
	List <String> cameras;
	List <Integer> quantities;
	String clientName, clientAddress;
	int orderID;
	
	public Order(int orderID, List<String> cameras, List<Integer> quantities, String clientName, String clientAddress)
	{
		this.cameras = cameras;
		this.quantities = quantities;
		this.clientName = clientName;
		this.clientAddress = clientAddress;
		this.orderID = orderID;
	}
	
	public Order(){
		
	}

	/**
	 * @return the cameras
	 */
	public List<String> getCameras() {
		return cameras;
	}

	/**
	 * @param cameras the cameras to set
	 */
	public void setCameras(List<String> cameras) {
		this.cameras = cameras;
	}

	/**
	 * @return the quantities
	 */
	public List<Integer> getQuantities() {
		return quantities;
	}

	/**
	 * @param quantities the quantities to set
	 */
	public void setQuantities(List<Integer> quantities) {
		this.quantities = quantities;
	}

	/**
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}

	/**
	 * @param clientName the clientName to set
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * @return the clientAddress
	 */
	public String getClientAddress() {
		return clientAddress;
	}

	/**
	 * @param clientAddress the clientAddress to set
	 */
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	/**
	 * @return the orderID
	 */
	public int getOrderID() {
		return orderID;
	}

	/**
	 * @param orderID the orderID to set
	 */
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	
	
}
