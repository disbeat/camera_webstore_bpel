package is.sessionbeans.interfaces.remote;
import is.exceptions.CreditCardException;
import is.sharedObjects.Cart;

import java.util.List;

import javax.ejb.Remote;

import com.shippingdepartmentws.Order;

@Remote
public interface OrdersManagerRemote {
	public Order checkOut(Cart cart) throws CreditCardException;
	public List<is.sharedObjects.Order> getOrdersOfUser(Integer userID);
	public boolean orderReady(int orderID, int delivering_days);
}
