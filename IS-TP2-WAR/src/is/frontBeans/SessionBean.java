package is.frontBeans;

import is.sharedObjects.Cart;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorcatalogmanager.Camera;
import org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorcatalogmanager.GetAllBrandsRequestType;
import org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorcatalogmanager.ProcessOrchestratorCatalogManagerService;
import org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorcatalogmanager.SearchCameraOperationFault;
import org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorordersmanager.CheckOutOperationFault;
import org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorordersmanager.GetOrdersOfUserOperationFault;
import org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorordersmanager.Order;
import org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorordersmanager.OrderItem;
import org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorordersmanager.OrderItemList;
import org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorordersmanager.ProcessOrchestratorOrdersManagerService;
import org.netbeans.j2ee.wsdl.lpco_bpel_module.processorquestratorusermanager.AddUserPortType;
import org.netbeans.j2ee.wsdl.lpco_bpel_module.processorquestratorusermanager.ProcessOrquestratorUserManagerService;
import org.netbeans.j2ee.wsdl.lpco_bpel_module.processorquestratorusermanager.UserExistsPortType;

public class SessionBean {
	private String username = "";
	private String password = "";
	private String email;
	private String address;
	private int id_user = -1;
	
	List<String> brandList = null;
	
	
	Cart cart=null;
	
	ProcessOrquestratorUserManagerService userManagerservice;
	ProcessOrchestratorOrdersManagerService ordersManagerService;
	ProcessOrchestratorCatalogManagerService catalogManagerService;
	
	
	public SessionBean(){
		userManagerservice = new ProcessOrquestratorUserManagerService();
		ordersManagerService = new ProcessOrchestratorOrdersManagerService();
		catalogManagerService = new ProcessOrchestratorCatalogManagerService();
	}
	
	public void setUserName(String username){
		this.username = username;
	}
	
	public void setPassWord(String password){
		this.password = password;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setAddress(String address){
		this.address=address;
	}
	
	
	public boolean login(){
		
			this.id_user = userManagerservice.getLoginUserPort().loginUserOperation(username, password);
			
			cart = new Cart(id_user);
		
		return id_user > 0;
	}
	
	public boolean register(){
		
			UserExistsPortType existsPort = userManagerservice.getUserExistsPort();
			if (existsPort.userExistsOperation(username).isUserExistsResponse()){
				return false;
			} 
			AddUserPortType addUserPort = userManagerservice.getAddUserPort();
			addUserPort.addUserOperation(username, password, email, address);
			return true;
	}
	
	public void loadBrands(){
		GetAllBrandsRequestType request = new GetAllBrandsRequestType();
		this.brandList = catalogManagerService.getGetAllBrandsPort().getAllBrandsOperation(request).getBrand();	
	}
	
	public List<String> getBrands(){

		loadBrands();

		return brandList;
	}

	public List<Camera> getCameras(String brand){
		
			return catalogManagerService.getGetCamerasPort().getCamerasOperation(brand).getCameras();
	}
	
	public Camera getCamera(Integer id){
		return catalogManagerService.getGetCameraPort().getCameraOperation(id);
	}

	public void removeCameraFromCart(String cameraid){
		cart.removeCamera(cameraid);
	}
	
	public void addToCart(Camera camera, int quantity){
		cart.addCamera(Integer.parseInt(camera.getIdCamera()), camera.getName(), quantity, camera.getPrice());
	}
	
	public Cart getCart(){
		return cart;
	}
	
	public boolean isLogged(){
		return id_user>0;
	}
	
	public boolean checkout(){
		
		OrderItemList itemsList = new OrderItemList();
		List<OrderItem> orderItemsList = itemsList.getOrderItem();
		orderItemsList.addAll(cart.getOrderItems());		
		
		try {
				
			ordersManagerService.getCheckOutPort().checkOutOperation(id_user, itemsList);

			cart = new Cart(id_user);
			return true;
		}catch(CheckOutOperationFault creditCardException){
			System.out.println(creditCardException.getMessage());
		}
		
		return false;
	}
	
	
	public Camera search(String model){
		
		try {
			return catalogManagerService.getSearchCameraPort().searchCameraOperation(model).getCamera();
		} catch (SearchCameraOperationFault e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}
	
	public List<Order> getOrders(){
		try{
			return ordersManagerService.getGetOrdersOfUserPort().getOrdersOfUserOperation(id_user).getOrders();
		}catch(GetOrdersOfUserOperationFault e){
			System.out.println(e.getMessage());
			return new ArrayList<Order>();
		}
		

	}
	
	public void logout(){
		id_user = -1;
	}
	
}
