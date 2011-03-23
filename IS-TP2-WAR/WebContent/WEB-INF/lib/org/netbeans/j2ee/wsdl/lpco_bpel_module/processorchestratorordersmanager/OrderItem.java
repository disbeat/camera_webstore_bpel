
package org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorordersmanager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cameraID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cameraName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="qtd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderItem", propOrder = {
    "cameraID",
    "cameraName",
    "price",
    "qtd"
})
public class OrderItem {

    protected int cameraID;
    protected String cameraName;
    protected float price;
    protected int qtd;

    /**
     * Gets the value of the cameraID property.
     * 
     */
    public int getCameraID() {
        return cameraID;
    }

    /**
     * Sets the value of the cameraID property.
     * 
     */
    public void setCameraID(int value) {
        this.cameraID = value;
    }

    /**
     * Gets the value of the cameraName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCameraName() {
        return cameraName;
    }

    /**
     * Sets the value of the cameraName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraName(String value) {
        this.cameraName = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public float getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(float value) {
        this.price = value;
    }

    /**
     * Gets the value of the qtd property.
     * 
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * Sets the value of the qtd property.
     * 
     */
    public void setQtd(int value) {
        this.qtd = value;
    }

}
