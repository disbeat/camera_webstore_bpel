package is.entities;

import com.camerasupplierws.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CATALOG")
public class CameraEntity {
	
	Integer id;
	
	String brand, name, description, effectivePixels, minShutter, maxShutter,
    linkInDepthReview, linkPicture, summary;

	String releasedDate;
	String maxResolution;
	
	String lowResolution, imageRatio;
	String ISOrating;
	Float price;
	
	String sensorSize;

	/**
	 * Empty constructor
	 */
	public CameraEntity(){
		
	}

	/**
	 * Get all values of the camera
	 * 
	 * @param cam
	 */
	public CameraEntity(Camera cam){
		if (cam == null)
			return;
		
		this.brand = cam.getBrand();
		this.description = cam.getDescription();
		this.effectivePixels = cam.getEffectivePixels();
		this.imageRatio = cam.getImageRatio();
		this.ISOrating = cam.getISOrating();
		this.linkInDepthReview = cam.getLinkInDepthReview();
		this.linkPicture = cam.getLinkPicture();
		this.lowResolution = cam.getLowResolution();
		this.maxResolution = cam.getMaxResolution();
		this.maxShutter = cam.getMaxShutter();
		this.minShutter = cam.getMinShutter();
		this.name = cam.getName();
		this.releasedDate = cam.getReleasedDate();
		this.sensorSize = cam.getSensorSize();
		this.summary = cam.getSummary();
		setPrice(cam.getPrice());
		
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CAMERA_ID")
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	/**
	 * @return the brand
	 */
	@Column(name="BRAND")
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
	 * @return the name
	 */
	@Column(name="MODEL")
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	@Column(name="DESCRIPTION")
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the effectivePixels
	 */
	@Column(name="PIXELS")
	public String getEffectivePixels() {
		return effectivePixels;
	}

	/**
	 * @param effectivePixels the effectivePixels to set
	 */
	public void setEffectivePixels(String effectivePixels) {
		this.effectivePixels = effectivePixels;
	}

	/**
	 * @return the minShutter
	 */
	@Column(name="MIN_SHUTTER")
	public String getMinShutter() {
		return minShutter;
	}

	/**
	 * @param minShutter the minShutter to set
	 */
	public void setMinShutter(String minShutter) {
		this.minShutter = minShutter;
	}

	/**
	 * @return the maxShutter
	 */
	@Column(name="MAX_SHUTTER")
	public String getMaxShutter() {
		return maxShutter;
	}

	/**
	 * @param maxShutter the maxShutter to set
	 */
	public void setMaxShutter(String maxShutter) {
		this.maxShutter = maxShutter;
	}

	/**
	 * @return the linkInDepthReview
	 */
	@Column(name="REVIEW")
	public String getLinkInDepthReview() {
		return linkInDepthReview;
	}

	/**
	 * @param linkInDepthReview the linkInDepthReview to set
	 */
	public void setLinkInDepthReview(String linkInDepthReview) {
		this.linkInDepthReview = linkInDepthReview;
	}

	/**
	 * @return the linkPicture
	 */
	@Column(name="PICTURE")
	public String getLinkPicture() {
		return linkPicture;
	}

	/**
	 * @param linkPicture the linkPicture to set
	 */
	public void setLinkPicture(String linkPicture) {
		this.linkPicture = linkPicture;
	}

	/**
	 * @return the summary
	 */
	@Column(name="SUMMARY")
	public String getSummary() {
		return summary;
	}

	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 * @return the releasedDate
	 */
	//@Column(name="DATE")
/*	public XMLGregorianCalendar getReleasedDate() {
		return releasedDate;
	}

*/	/**
	 * @param releasedDate the releasedDate to set
	 */
/*	public void setReleasedDate(XMLGregorianCalendar releasedDate) {
		this.releasedDate = releasedDate;
	}
*/
	/**
	 * @return the maxResolution
	 */
	@Column(name="MAX_RESOLUTION")
	public String getMaxResolution() {
		return maxResolution;
	}

	/**
	 * @param maxResolution the maxResolution to set
	 */
	public void setMaxResolution(String maxResolution) {
		this.maxResolution = maxResolution;
	}

	/**
	 * @return the lowResolution
	 */
	@Column(name="LOW_RESOLUTION")
	public String getLowResolution() {
		return lowResolution;
	}

	/**
	 * @param lowResolution the lowResolution to set
	 */
	public void setLowResolution(String lowResolution) {
		this.lowResolution = lowResolution;
	}

	/**
	 * @return the imageRatio
	 */
	@Column(name="IMAGE_RATIO")
	public String getImageRatio() {
		return imageRatio;
	}

	/**
	 * @param imageRatio the imageRatio to set
	 */
	public void setImageRatio(String imageRatio) {
		this.imageRatio = imageRatio;
	}

	/**
	 * @return the iSOrating
	 */
	@Column(name="ISO_RATING")
	public String getISOrating() {
		return ISOrating;
	}

	/**
	 * @param iSOrating the iSOrating to set
	 */
	public void setISOrating(String iSOrating) {
		ISOrating = iSOrating;
	}

	/**
	 * @return the sensorSize
	 */
	@Column(name="SENSOR")
	public String getSensorSize() {
		return sensorSize;
	}

	/**
	 * @param sensorSize the sensorSize to set
	 */
	public void setSensorSize(String sensorSize) {
		this.sensorSize = sensorSize;
	}

	/**
	 * @return the price
	 */
	public Float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	@Column(name="PRICE")
	public void setPrice(Float price) {
		this.price = price;
	}

	public void setPrice(String price) {
		this.price = Float.parseFloat( price.substring(0, price.length() - 1) );
	}
	
	
}
