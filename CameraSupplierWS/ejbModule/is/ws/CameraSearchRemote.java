package is.ws;
import is.cameras.Camera;

import javax.ejb.Remote;

@Remote
public interface CameraSearchRemote {
	public Camera searchCamera(String model);
}
