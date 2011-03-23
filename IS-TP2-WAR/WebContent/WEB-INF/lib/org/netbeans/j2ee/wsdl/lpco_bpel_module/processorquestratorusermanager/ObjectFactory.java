
package org.netbeans.j2ee.wsdl.lpco_bpel_module.processorquestratorusermanager;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.netbeans.j2ee.wsdl.lpco_bpel_module.processorquestratorusermanager package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoginUserRequest_QNAME = new QName("http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrquestratorUserManager", "LoginUserRequest");
    private final static QName _UserExistsResponse_QNAME = new QName("http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrquestratorUserManager", "UserExistsResponse");
    private final static QName _AddUserResponse_QNAME = new QName("http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrquestratorUserManager", "AddUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.netbeans.j2ee.wsdl.lpco_bpel_module.processorquestratorusermanager
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserExistsResponseType }
     * 
     */
    public UserExistsResponseType createUserExistsResponseType() {
        return new UserExistsResponseType();
    }

    /**
     * Create an instance of {@link AddUserResponseType }
     * 
     */
    public AddUserResponseType createAddUserResponseType() {
        return new AddUserResponseType();
    }

    /**
     * Create an instance of {@link AddUserRequestType }
     * 
     */
    public AddUserRequestType createAddUserRequestType() {
        return new AddUserRequestType();
    }

    /**
     * Create an instance of {@link LoginUserRequestType }
     * 
     */
    public LoginUserRequestType createLoginUserRequestType() {
        return new LoginUserRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginUserRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrquestratorUserManager", name = "LoginUserRequest")
    public JAXBElement<LoginUserRequestType> createLoginUserRequest(LoginUserRequestType value) {
        return new JAXBElement<LoginUserRequestType>(_LoginUserRequest_QNAME, LoginUserRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserExistsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrquestratorUserManager", name = "UserExistsResponse")
    public JAXBElement<UserExistsResponseType> createUserExistsResponse(UserExistsResponseType value) {
        return new JAXBElement<UserExistsResponseType>(_UserExistsResponse_QNAME, UserExistsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrquestratorUserManager", name = "AddUserResponse")
    public JAXBElement<AddUserResponseType> createAddUserResponse(AddUserResponseType value) {
        return new JAXBElement<AddUserResponseType>(_AddUserResponse_QNAME, AddUserResponseType.class, null, value);
    }

}
