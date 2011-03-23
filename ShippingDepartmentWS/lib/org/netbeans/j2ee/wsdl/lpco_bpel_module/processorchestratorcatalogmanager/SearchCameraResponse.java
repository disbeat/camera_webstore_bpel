
package org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorcatalogmanager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCameraResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCameraResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Camera" type="{http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorCatalogManager}camera" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCameraResponse", propOrder = {
    "camera"
})
public class SearchCameraResponse {

    @XmlElement(name = "Camera")
    protected Camera camera;

    /**
     * Gets the value of the camera property.
     * 
     * @return
     *     possible object is
     *     {@link Camera }
     *     
     */
    public Camera getCamera() {
        return camera;
    }

    /**
     * Sets the value of the camera property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camera }
     *     
     */
    public void setCamera(Camera value) {
        this.camera = value;
    }

}
