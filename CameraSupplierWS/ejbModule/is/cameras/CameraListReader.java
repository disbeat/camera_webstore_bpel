
package is.cameras;


import is.utils.XMLFileIO;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;


/**
 *
 * Parses de XML to retreive the camera with the correspondent model
 * 
 * @author msimoes
 */
public class CameraListReader{

	final private static String NAME = "name";
	final private static String DESCRIPTION = "description";
	final private static String SUMMARY = "summary";
	final private static String EFFECTIVE_PIXELS = "effectivePixels";
	final private static String SHUTTER_TIME = "shutterTime";
	final private static String MIN = "min";
	final private static String MAX = "max";
	final private static String LINKS = "links";
	final private static String IN_DEPTH_REVIEW = "inDepthReview";
	final private static String PICTURE = "picture";
	final private static String RELEASED_DATE = "releasedDate";
	final private static String RESOLUTIONS = "resolutions";
	final private static String MAX_RESOLUTION = "max_resolution";
	final private static String LOWER_RESOLUTION = "lower_resolution";
	final private static String WIDTH = "width";
	final private static String HEIGHT = "height";
	final private static String IMAGE_RATIOS = "imageRatios";
	final private static String ISO_RATINGS = "ISOratings";
	final private static String SENSOR_SIZE = "sensorSize";
	final private static String PRICE = "price";
	final private static String CURRENCY = "currency";

	final private static String PATH = "xml";
	final private static String EXTENSION = ".xml";
	
	final private static String[] brands = {"agfa","canon","casio","contax","epson","fujifilm","hp","kodak","konica_minolta",
		"kyocera","leica","nikon","olympus","panasonic",
		"pentax","ricoh","samsung","sanyo","sigma","sony","toshiba"};

    
	public static Camera findCamera(String searchModel){
    	Camera camera = null;
    	
    	for (String brand : brands){
    	
    		try {
				camera = findCameraOfBrand(searchModel, brand);
				
				if (camera != null)
					break;
				
			} catch (JDOMException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
    		
        }
    	
    	return camera;
    }
    
	
	@SuppressWarnings("unchecked")
    public static Camera findCameraOfBrand(String searchModel, String brand) throws JDOMException, IOException{
    	
    	Document doc = XMLFileIO.readFromFile(PATH + File.separator + brand + EXTENSION);
    	Element base = doc.getRootElement();
    	Camera camera = null;

        String[] modelParts = searchModel.split(" ");

		List<Element> list = base.getChildren();
		
		Iterator <Element> it = list.iterator();
		
		Element element = null;
		String model = null;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		
		while (it.hasNext()){
            element = it.next();

            model = element.getChildText(NAME);
            if (model == null)
            	  continue;
        	  
            boolean notFound = false;
            for (String part: modelParts){
            	if (!model.toLowerCase().contains(part.toLowerCase())){
        			notFound = true;
        			break;
            	}
        	}
           
            if (notFound)
            	continue;
            
            camera = new Camera();
            
            camera.setBrand(brand);
            camera.setName(model);
            
            String description = element.getChildText(DESCRIPTION);
            if (description != null)
            	camera.setDescription(description);
            
            String summary = element.getChildText(SUMMARY);
            if (summary != null)
            	camera.setSummary(summary);
            
            String effectivePixels = element.getChildText(EFFECTIVE_PIXELS);
            if (effectivePixels != null)
            	camera.setEffectivePixels(effectivePixels);
            
            Element child = element.getChild(SHUTTER_TIME);
            if (child != null){
            	String minShutter = child.getAttributeValue(MIN);
            	if (minShutter != null)
            		camera.setMinShutter(minShutter);
            	
            	String maxShutter = child.getAttributeValue(MAX);
            	if (maxShutter != null)
            		camera.setMinShutter(maxShutter);
            }

            child = element.getChild(LINKS);
            if (child != null){
            	String inDepthReview = child.getChildText(IN_DEPTH_REVIEW);
            	if (inDepthReview != null)
            		camera.setLinkInDepthReview(inDepthReview);
            	
            	String pictureLink = child.getChildText(PICTURE);
            	if (pictureLink != null)
            		camera.setLinkPicture(pictureLink);
            }
            
            String releasedDate = element.getChildText(RELEASED_DATE);
            if (releasedDate != null){
        		camera.setReleasedDate(releasedDate);
            }
            
            
            child = element.getChild(RESOLUTIONS);
            if (child != null){
            	
            	Element maxRes = child.getChild(MAX_RESOLUTION);
            	
           		Integer[] res = parseResolution(maxRes);
           		
           		if (res != null)
           			camera.setMaxResolution(res);
            		
           
            	
            	Element lowRes = child.getChild(LOWER_RESOLUTION);
            	if (lowRes != null){
            		List<Element> childs = lowRes.getChildren();
            		LinkedList<Integer[]> lowerResolutions = new LinkedList<Integer[]>();
            		if (childs != null){
            			for (Element r : childs){
            				res = parseResolution(r);
                       		
            				lowerResolutions.add(res);
            			}
            			
            			camera.setLowResolution(lowerResolutions);
            		}
            	}
            	
            }
            
            
            child = element.getChild(IMAGE_RATIOS);
            if (child != null){
            	Integer[] ratio;
        		List<Element> childs = child.getChildren();
        		LinkedList<Integer[]> imageRatios= new LinkedList<Integer[]>();
        		if (childs != null){
        			for (Element r : childs){
        				ratio = parseResolution(r);
                   		
        				imageRatios.add(ratio);
        			}
        			
        			camera.setLowResolution(imageRatios);
        		}
        	}
            
            child = element.getChild(ISO_RATINGS);
            if (child != null){
            	String rating;
            	LinkedList<String> ISORatingsList = new LinkedList<String>();
            	List<Element> childs = child.getChildren();
            	if (childs != null){
        			for (Element r : childs){
        				rating = r.getText();
        				if (rating != null)
        					ISORatingsList.add(rating);
        			}
            	}
            	
            	camera.setISOrating(ISORatingsList);
            }
            	
            
            
            child = element.getChild(SENSOR_SIZE);
            
            Float[] size = null;
    		
        	if (child != null){
        		size = new Float[2];
    		
        		String width = child.getAttributeValue(WIDTH);
    			if (width != null)
    				size[0] = Float.parseFloat(width);
    			
    			String height = child.getAttributeValue(HEIGHT);
    			if (height != null)
    				size[1] = Float.parseFloat(height);
    			
    			camera.setSensorSize(size);
        	}
            
            
        	child = element.getChild(PRICE);
        	if (child != null){
        		String price = child.getText();
        		String currency = child.getAttributeValue(CURRENCY);
        		
        		camera.setPrice(price+currency);
        	}
            
        	break;
            	  
              
		}
        return camera;
    }


    private static Integer[] parseResolution(Element e){
    	Integer[] resolution = null;
    		
    	if (e != null){
    		resolution = new Integer[2];
		
			String width = e.getAttributeValue(WIDTH);
			if (width != null)
				resolution[0] = Integer.parseInt(width);
			
			String height = e.getAttributeValue(HEIGHT);
			if (height != null)
				resolution[1] = Integer.parseInt(height);
    	}
    	
    	return resolution;
    }

    
}
