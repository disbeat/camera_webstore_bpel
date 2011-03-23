package is.ws;

import is.objects.Order;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Session Bean implementation class ShippingBean
 */
@Stateless
@WebService(targetNamespace="www.shippingdepartmentws.com")
public class ShippingBean implements ShippingBeanRemote {

    /**
     * Default constructor. 
     */
    public ShippingBean() {
    }
    
    @WebMethod
    public void shipOrder( Order order ){
    	
    	System.out.println(order.getOrderID());
    	
    	OrderDispatcher dispatcher = new OrderDispatcher(order, (int)(((Math.random()*100)%5)+3));
    	dispatcher.start();
    }

}
