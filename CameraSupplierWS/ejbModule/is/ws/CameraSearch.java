package is.ws;

import is.cameras.Camera;
import is.cameras.CameraListReader;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Session Bean implementation class CameraSearch
 */

@Stateless
@WebService(targetNamespace="www.camerasupplierws.com")
public class CameraSearch implements CameraSearchRemote {

	public CameraSearch() {
	}

	@WebMethod
	public Camera searchCamera(String model){
		return CameraListReader.findCamera(model);
	}
	
}
