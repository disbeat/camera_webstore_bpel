
package com.camerasupplierws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for camera complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="camera">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effectivePixels" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ISOrating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imageRatio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkInDepthReview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkPicture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lowResolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxResolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxShutter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minShutter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="releasedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sensorSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="urlReview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camera", propOrder = {
    "brand",
    "description",
    "effectivePixels",
    "isOrating",
    "imageRatio",
    "linkInDepthReview",
    "linkPicture",
    "lowResolution",
    "maxResolution",
    "maxShutter",
    "minShutter",
    "name",
    "page",
    "price",
    "releasedDate",
    "sensorSize",
    "summary",
    "urlReview"
})
public class Camera {

    protected String brand;
    protected String description;
    protected String effectivePixels;
    @XmlElement(name = "ISOrating")
    protected String isOrating;
    protected String imageRatio;
    protected String linkInDepthReview;
    protected String linkPicture;
    protected String lowResolution;
    protected String maxResolution;
    protected String maxShutter;
    protected String minShutter;
    protected String name;
    protected String page;
    protected String price;
    protected String releasedDate;
    protected String sensorSize;
    protected String summary;
    protected String urlReview;

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the effectivePixels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectivePixels() {
        return effectivePixels;
    }

    /**
     * Sets the value of the effectivePixels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectivePixels(String value) {
        this.effectivePixels = value;
    }

    /**
     * Gets the value of the isOrating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOrating() {
        return isOrating;
    }

    /**
     * Sets the value of the isOrating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOrating(String value) {
        this.isOrating = value;
    }

    /**
     * Gets the value of the imageRatio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageRatio() {
        return imageRatio;
    }

    /**
     * Sets the value of the imageRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageRatio(String value) {
        this.imageRatio = value;
    }

    /**
     * Gets the value of the linkInDepthReview property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkInDepthReview() {
        return linkInDepthReview;
    }

    /**
     * Sets the value of the linkInDepthReview property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkInDepthReview(String value) {
        this.linkInDepthReview = value;
    }

    /**
     * Gets the value of the linkPicture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkPicture() {
        return linkPicture;
    }

    /**
     * Sets the value of the linkPicture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkPicture(String value) {
        this.linkPicture = value;
    }

    /**
     * Gets the value of the lowResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowResolution() {
        return lowResolution;
    }

    /**
     * Sets the value of the lowResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowResolution(String value) {
        this.lowResolution = value;
    }

    /**
     * Gets the value of the maxResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxResolution() {
        return maxResolution;
    }

    /**
     * Sets the value of the maxResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxResolution(String value) {
        this.maxResolution = value;
    }

    /**
     * Gets the value of the maxShutter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxShutter() {
        return maxShutter;
    }

    /**
     * Sets the value of the maxShutter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxShutter(String value) {
        this.maxShutter = value;
    }

    /**
     * Gets the value of the minShutter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinShutter() {
        return minShutter;
    }

    /**
     * Sets the value of the minShutter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinShutter(String value) {
        this.minShutter = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPage(String value) {
        this.page = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

    /**
     * Gets the value of the releasedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleasedDate() {
        return releasedDate;
    }

    /**
     * Sets the value of the releasedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleasedDate(String value) {
        this.releasedDate = value;
    }

    /**
     * Gets the value of the sensorSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorSize() {
        return sensorSize;
    }

    /**
     * Sets the value of the sensorSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorSize(String value) {
        this.sensorSize = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the urlReview property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlReview() {
        return urlReview;
    }

    /**
     * Sets the value of the urlReview property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlReview(String value) {
        this.urlReview = value;
    }

}
