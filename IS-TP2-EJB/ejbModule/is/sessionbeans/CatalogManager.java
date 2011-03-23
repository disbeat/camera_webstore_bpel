package is.sessionbeans;

import is.entities.CameraEntity;
import is.sessionbeans.interfaces.remote.CatalogManagerRemote;
import is.sharedObjects.Camera;

import java.util.LinkedList;
import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class CatalogManager
 */

@Stateless
@WebService(targetNamespace="www.catalogmanagerws.com")
public class CatalogManager implements CatalogManagerRemote {

	@PersistenceContext( unitName="IS_TP2_DB" )
	EntityManager em;
	
    /**
     * Default constructor. 
     */
    public CatalogManager() {
    }

    public CatalogManager(EntityManager em) {
    	this.em = em;
    }
    
    public CameraEntity addCamera(CameraEntity cam){
    	if (existsCamera(cam.getName())){
    		return getCameraEntity(cam.getName());
    	}
    	
    	em.persist(cam);
    	em.flush();
    	return cam;
    }
    
    @WebMethod
    public Camera getCamera(Integer id){
    	Query q = em.createQuery("SELECT c FROM CameraEntity c WHERE c.id = ?");
    	q.setParameter(1, id);
    	try {
    		return convertEntityToSharedObject((CameraEntity) q.getSingleResult());
    	} catch(NoResultException nr){
    		return null;
    	}
    }
    
    public CameraEntity getCameraEntity(Integer id){
    	Query q = em.createQuery("SELECT c FROM CameraEntity c WHERE c.id = ?");
    	q.setParameter(1, id);
    	try {
    		return (CameraEntity) q.getSingleResult();
    	} catch(NoResultException nr){
    		return null;
    	}
    }
    
    public CameraEntity getCameraEntity(String model){
    	Query q = em.createQuery("SELECT c FROM CameraEntity c WHERE c.name = ?");
    	q.setParameter(1, model);
    	try {
    		return (CameraEntity) q.getSingleResult();
    	} catch(NoResultException nr){
    		return null;
    	}
    }
    
    public boolean existsCamera(String model){
    	Query q = em.createQuery("SELECT c FROM CameraEntity c WHERE c.name = ?");
    	q.setParameter(1, model);
    	try {
    		return q.getResultList().size() > 0;
    	} catch(NoResultException nr){
    		return false;
    	}
    }
    
    @WebMethod
    @SuppressWarnings("unchecked")
	public List<String> getAllBrands(){
    	Query q = em.createQuery("SELECT DISTINCT c.brand FROM CameraEntity c");
    	try {
    		return (List<String>) q.getResultList();
    	} catch(NoResultException nr){
    		return null;
    	}
    }
    
    public Camera convertEntityToSharedObject(CameraEntity entity){
    	if (entity == null)
    		return null;
    	
    	Camera cam = new Camera();
    	cam.setBrand(entity.getBrand());
    	cam.setDescription(entity.getDescription());
    	cam.setEffectivePixels(entity.getEffectivePixels());
    	if (entity.getId() != null)
    		cam.setIdCamera(Integer.toString(entity.getId()));
    	cam.setImageRatio(entity.getImageRatio());
    	cam.setISOrating(entity.getISOrating());
    	cam.setLinkInDepthReview(entity.getLinkInDepthReview());
    	cam.setLinkPicture(entity.getLinkPicture());
    	cam.setLowResolution(entity.getLowResolution());
    	cam.setMaxResolution(entity.getMaxResolution());
    	cam.setMaxShutter(entity.getMaxShutter());
    	cam.setMinShutter(entity.getMinShutter());
    	cam.setName(entity.getName());
    	cam.setSensorSize(entity.getSensorSize());
    	cam.setSummary(entity.getSummary());
    	if (entity.getPrice() != null)
    		cam.setPrice(entity.getPrice().floatValue());

    	return cam;
    }

    @WebMethod
	@Override
	public List<Camera> getCameras(String brand) {
		Query q = em.createQuery("SELECT c FROM CameraEntity c WHERE c.brand = ?");
		q.setParameter(1, brand);
    	try {
    		List<CameraEntity> entities = q.getResultList();
    		List<Camera> cameras = new LinkedList<Camera>();
    		for (CameraEntity entity: entities){
    			cameras.add(convertEntityToSharedObject(entity));
    		}
    		return cameras;
    	} catch(NoResultException nr){
    		return null;
    	}
	}
    
    @WebMethod
    public is.sharedObjects.Camera addSearchedCamera(com.camerasupplierws.Camera cam){
    	if (cam == null)
			return null;
		
		CameraEntity camEntity = new CameraEntity(cam); 
		camEntity = addCamera(camEntity);
		
		return convertEntityToSharedObject(camEntity);

    }
    
}
