package is.sharedObjects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorordersmanager.OrderItem;

public class Cart implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	List<OrderItem> orderItems;
	int clientID;
	
	public Cart(){ }
	
	public Cart(int clientID)
	{
		this.clientID = clientID;
		this.orderItems = new ArrayList<OrderItem>();
	}
	
	public void addCamera(int cameraID, String cameraName, float price)
	{
		addCamera(cameraID,cameraName, 1, price);
	}
	
	public void addCamera(int cameraID, String cameraName, int qtd, float price)
	{
		for (OrderItem itr : orderItems)
			if (itr.getCameraID() == cameraID)
			{
				itr.setQtd(itr.getQtd() + qtd);
				return;
			}
		OrderItem tmp = new OrderItem();
		tmp.setCameraID(cameraID);
		tmp.setCameraName(cameraName);
		tmp.setPrice(price);
		tmp.setQtd(qtd);
		this.orderItems.add(tmp);
	}
	
	public void removeCamera(String cameraName){
		int i=0;
		for(i=0;i<orderItems.size();i++){
			if(orderItems.get(i).getCameraName().equals(cameraName)){
				orderItems.remove(i);
				i--;
			}
		}
	}
	
	public List<OrderItem> getOrderItems()
	{
		return this.orderItems;
	}
	
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	/**
	 * @return the clientID
	 */
	public int getClientID() {
		return clientID;
	}

	/**
	 * @param clientID the clientID to set
	 */
	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	

}
