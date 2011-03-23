
package org.netbeans.j2ee.wsdl.lpco_bpel_module.processorquestratorusermanager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserExistsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserExistsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserExistsResponse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserExistsResponseType", propOrder = {
    "userExistsResponse"
})
public class UserExistsResponseType {

    @XmlElement(name = "UserExistsResponse")
    protected boolean userExistsResponse;

    /**
     * Gets the value of the userExistsResponse property.
     * 
     */
    public boolean isUserExistsResponse() {
        return userExistsResponse;
    }

    /**
     * Sets the value of the userExistsResponse property.
     * 
     */
    public void setUserExistsResponse(boolean value) {
        this.userExistsResponse = value;
    }

}
