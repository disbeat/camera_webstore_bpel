package is.sessionbeans.interfaces.remote;
import is.sharedObjects.Camera;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface CatalogManagerRemote {
	public Camera getCamera(Integer id);
	public List<String> getAllBrands();
	public List<Camera> getCameras(String brand);
	public is.sharedObjects.Camera addSearchedCamera(com.camerasupplierws.Camera cam);
	
}
