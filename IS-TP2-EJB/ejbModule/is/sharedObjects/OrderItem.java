package is.sharedObjects;

import java.io.Serializable;

public class OrderItem implements Serializable{
	int cameraID;
	int qtd;
	float price;
	String cameraName;
	
	public OrderItem(){
		
	}
	
	public OrderItem (int cameraID, String cameraName, int qtd, float price){
		this.cameraID = cameraID;
		this.cameraName = cameraName;
		this.qtd = qtd;
		this.price = price;
	}

	/**
	 * @return the cameraID
	 */
	public int getCameraID() {
		return cameraID;
	}

	/**
	 * @param cameraID the cameraID to set
	 */
	public void setCameraID(int cameraID) {
		this.cameraID = cameraID;
	}

	/**
	 * @return the qtd
	 */
	public int getQtd() {
		return qtd;
	}

	/**
	 * @param qtd the qtd to set
	 */
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	public void setPrice(Float price) {
		if (price != null)
			this.price = price.floatValue();
	}

	
	/**
	 * @return the cameraName
	 */
	public String getCameraName() {
		return cameraName;
	}

	/**
	 * @param cameraName the cameraName to set
	 */
	public void setCameraName(String cameraName) {
		this.cameraName = cameraName;
	}
	
	
}
