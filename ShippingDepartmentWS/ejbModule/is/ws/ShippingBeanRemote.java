package is.ws;
import is.objects.Order;

import javax.ejb.Remote;

@Remote
public interface ShippingBeanRemote {
	public void shipOrder( Order order );
}
