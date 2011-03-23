package is.ws;

import is.objects.Order;

import org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorordersmanager.*;

public class OrderDispatcher extends Thread{
	
	private static final Integer TIMESTEP = 1000;
	Order order;
	Integer timesteps;
	
	public OrderDispatcher(Order order, Integer timesteps){
		this.order = order;
		this.timesteps = timesteps;
	}
	
	public void run(){
		for (int i = 0; i < timesteps; i++){
			try {
				Thread.sleep(TIMESTEP);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		ProcessOrchestratorOrdersManagerService service = new ProcessOrchestratorOrdersManagerService();
		
		OrderReadyPortType port = service.getOrderReadyPort();
		port.orderReadyOperation(this.order.getOrderID(), this.timesteps);
		
				
	}
}
