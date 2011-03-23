package is.sharedObjects;

public class Camera {
	
	private String idCamera;
	
	private String brand, name, description, effectivePixels, minShutter, maxShutter,
    linkInDepthReview, linkPicture, summary;

	//XMLGregorianCalendar releasedDate;
	private String maxResolution;
	
	private String lowResolution, imageRatio;
	private String ISOrating;
	
	private String sensorSize;
	private float price;
	
	public Camera(){
		
	}
	

	public void setMinShutter(String minShutter) {
		this.minShutter = minShutter;
	}

	public String getMinShutter() {
		if(minShutter==null){
			return "";
		}
		return minShutter;
	}

	public void setMaxShutter(String maxShutter) {
		this.maxShutter = maxShutter;
	}

	public String getMaxShutter() {
		if(maxShutter==null){
			return "";
		}
		return maxShutter;
	}

	public void setLinkInDepthReview(String linkInDepthReview) {
		this.linkInDepthReview = linkInDepthReview;
	}

	public String getLinkInDepthReview() {
		if(linkInDepthReview==null){
			return "";
		}
		return linkInDepthReview;
	}

	public void setLinkPicture(String linkPicture) {
		this.linkPicture = linkPicture;
	}

	public String getLinkPicture() {
		if(linkPicture==null){
			return "";
		}
		return linkPicture;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSummary() {
		if(summary==null){
			return "";
		}
		return summary;
	}

	public void setLowResolution(String lowResolution) {
		this.lowResolution = lowResolution;
	}

	public String getLowResolution() {
		if(lowResolution==null){
			return "";
		}
		return lowResolution;
	}

	public void setImageRatio(String imageRatio) {
		this.imageRatio = imageRatio;
	}

	public String getImageRatio() {
		if(imageRatio==null){
			return "";
		}
		return imageRatio;
	}

	public void setISOrating(String iSOrating) {
		ISOrating = iSOrating;
	}

	public String getISOrating() {
		if(ISOrating==null){
			return "";
		}
		return ISOrating;
	}

	public void setSensorSize(String sensorSize) {
		this.sensorSize = sensorSize;
	}

	public String getSensorSize() {
		if(sensorSize==null){
			return "";
		}
		return sensorSize;
	}

	public void setMaxResolution(String maxResolution) {
		this.maxResolution = maxResolution;
	}

	public String getMaxResolution() {
		if(maxResolution==null){
			return "";
		}
		return maxResolution;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getBrand() {
		if(brand==null){
			return "";
		}
		return brand;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getName() {
		if(name==null){
			return "";
		}
		return name;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getDescription() {
		if(description==null){
			return "";
		}
		return description;
	}



	public void setEffectivePixels(String effectivePixels) {
		this.effectivePixels = effectivePixels;
	}



	public String getEffectivePixels() {
		if(effectivePixels==null){
			return "";
		}
		return effectivePixels;
	}


	public void setIdCamera(String idCamera) {
		this.idCamera = idCamera;
	}


	public String getIdCamera() {
		return idCamera;
	}


	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
