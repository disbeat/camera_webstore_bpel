package is.cameras;


import java.util.Date;
import java.util.LinkedList;

/**
 *
 * Camera object for internal representation.
 *
 * @author lopes and msimoes
 */
public class Camera{


    String brand, name, description, effectivePixels, minShutter, maxShutter,
                linkInDepthReview, linkPicture, summary;

	String releasedDate;
    String maxResolution;

    String lowResolution, imageRatio;
    String ISOrating, price;

    String sensorSize;
    String page = null, urlReview = null, base_url = "http://www.dpreview.com";




    public Camera()
    {
    }


 
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEffectivePixels() {
        return effectivePixels;
    }

    public void setEffectivePixels(String effectivePixels) {
        this.effectivePixels = effectivePixels;
    }

    public String getLinkPicture() {
        return linkPicture;
    }

    public void setLinkPicture(String linkPicture) {
        this.linkPicture = linkPicture;
    }

    public String getLinkInDepthReview() {
        return linkInDepthReview;
    }

    public void setLinkInDepthReview(String linkReview) {
        this.linkInDepthReview = linkReview;
    }

    public String getMaxShutter() {
        return maxShutter;
    }

    public void setMaxShutter(String maxShutter) {
        this.maxShutter = maxShutter;
    }

    public String getMinShutter() {
        return minShutter;
    }

    public void setMinShutter(String minShutter) {
        this.minShutter = minShutter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(String releasedDate) {
        this.releasedDate = releasedDate;
    }

    public String getMaxResolution() {
        return maxResolution;
    }

    public void setMaxResolution(Integer[] resolution) {
        this.maxResolution = resolution[0] + " x " + resolution[1];
    }

    public String getSensorSize() {
        return sensorSize;
    }

    public void setSensorSize(Float[] sensorSize) {
        this.sensorSize = sensorSize[0] + " x " + sensorSize[1] + " cm";
    }

    public String getUrlReview() {
        return urlReview;
    }

    public void setUrlReview(String urlReview) {
        this.urlReview = urlReview;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImageRatio() {
        return imageRatio;
    }

    public void setImageRatio(LinkedList<Integer[]> imageRatio) {
    	StringBuilder sb = new StringBuilder();
    	for (Integer[] ratio : imageRatio ){
    		sb.append(ratio[0]+":"+ratio[1]+", ");
    	}
        this.imageRatio = sb.toString();
        this.imageRatio = this.imageRatio.substring(0, this.imageRatio.length() - 2);
    }

    public String getLowResolution() {
        return lowResolution;
    }

    public void setLowResolution(LinkedList<Integer[]> lowResolution) {
    	StringBuilder sb = new StringBuilder();
    	for (Integer[] resolution : lowResolution ){
    		sb.append(resolution[0]+" x "+resolution[1]+", ");
    	}
        this.lowResolution = sb.toString();
        this.lowResolution = this.lowResolution.substring(0, this.lowResolution.length() - 2);
    }

    public String getISOrating() {
        return ISOrating;
    }

    public void setISOrating(LinkedList<String> ISOrating) {
    	StringBuilder sb = new StringBuilder();
    	for (String iso : ISOrating ){
    		sb.append(iso+", ");
    	}
        this.ISOrating = sb.toString();
        this.ISOrating = this.ISOrating.substring(0, this.ISOrating.length() - 2);
    }

	/**
	 * @param maxResolution the maxResolution to set
	 */
	public void setMaxResolution(String maxResolution) {
		this.maxResolution = maxResolution;
	}




	/**
	 * @param lowResolution the lowResolution to set
	 */
	public void setLowResolution(String lowResolution) {
		this.lowResolution = lowResolution;
	}




	/**
	 * @param imageRatio the imageRatio to set
	 */
	public void setImageRatio(String imageRatio) {
		this.imageRatio = imageRatio;
	}




	/**
	 * @param iSOrating the iSOrating to set
	 */
	public void setISOrating(String iSOrating) {
		ISOrating = iSOrating;
	}




	/**
	 * @param sensorSize the sensorSize to set
	 */
	public void setSensorSize(String sensorSize) {
		this.sensorSize = sensorSize;
	}

    /**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}




	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}




	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}
    
	
    
}
