
package org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorcatalogmanager;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorcatalogmanager package. 
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

    private final static QName _GetCamerasResponse_QNAME = new QName("http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorCatalogManager", "GetCamerasResponse");
    private final static QName _ErrorMessage_QNAME = new QName("http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorCatalogManager", "ErrorMessage");
    private final static QName _GetCameraResponse_QNAME = new QName("http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorCatalogManager", "GetCameraResponse");
    private final static QName _SearchCameraResponse_QNAME = new QName("http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorCatalogManager", "SearchCameraResponse");
    private final static QName _GetAllBrandsResponse_QNAME = new QName("http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorCatalogManager", "GetAllBrandsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorcatalogmanager
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CamerasList }
     * 
     */
    public CamerasList createCamerasList() {
        return new CamerasList();
    }

    /**
     * Create an instance of {@link ErrorMessage }
     * 
     */
    public ErrorMessage createErrorMessage() {
        return new ErrorMessage();
    }

    /**
     * Create an instance of {@link Camera }
     * 
     */
    public Camera createCamera() {
        return new Camera();
    }

    /**
     * Create an instance of {@link SearchCameraResponse }
     * 
     */
    public SearchCameraResponse createSearchCameraResponse() {
        return new SearchCameraResponse();
    }

    /**
     * Create an instance of {@link BrandList }
     * 
     */
    public BrandList createBrandList() {
        return new BrandList();
    }

    /**
     * Create an instance of {@link GetAllBrandsRequestType }
     * 
     */
    public GetAllBrandsRequestType createGetAllBrandsRequestType() {
        return new GetAllBrandsRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CamerasList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorCatalogManager", name = "GetCamerasResponse")
    public JAXBElement<CamerasList> createGetCamerasResponse(CamerasList value) {
        return new JAXBElement<CamerasList>(_GetCamerasResponse_QNAME, CamerasList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorCatalogManager", name = "ErrorMessage")
    public JAXBElement<ErrorMessage> createErrorMessage(ErrorMessage value) {
        return new JAXBElement<ErrorMessage>(_ErrorMessage_QNAME, ErrorMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Camera }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorCatalogManager", name = "GetCameraResponse")
    public JAXBElement<Camera> createGetCameraResponse(Camera value) {
        return new JAXBElement<Camera>(_GetCameraResponse_QNAME, Camera.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCameraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorCatalogManager", name = "SearchCameraResponse")
    public JAXBElement<SearchCameraResponse> createSearchCameraResponse(SearchCameraResponse value) {
        return new JAXBElement<SearchCameraResponse>(_SearchCameraResponse_QNAME, SearchCameraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BrandList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorCatalogManager", name = "GetAllBrandsResponse")
    public JAXBElement<BrandList> createGetAllBrandsResponse(BrandList value) {
        return new JAXBElement<BrandList>(_GetAllBrandsResponse_QNAME, BrandList.class, null, value);
    }

}
