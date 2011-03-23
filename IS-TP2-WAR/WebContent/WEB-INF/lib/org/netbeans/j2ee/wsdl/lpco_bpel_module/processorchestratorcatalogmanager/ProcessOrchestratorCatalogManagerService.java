
package org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorcatalogmanager;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "ProcessOrchestratorCatalogManagerService", targetNamespace = "http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorCatalogManager", wsdlLocation = "http://localhost:9080/ProcessOrchestratorCatalogManagerService/SearchCameraPort?wsdl")
public class ProcessOrchestratorCatalogManagerService
    extends Service
{

    private final static URL PROCESSORCHESTRATORCATALOGMANAGERSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorcatalogmanager.ProcessOrchestratorCatalogManagerService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorcatalogmanager.ProcessOrchestratorCatalogManagerService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:9080/ProcessOrchestratorCatalogManagerService/SearchCameraPort?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:9080/ProcessOrchestratorCatalogManagerService/SearchCameraPort?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        PROCESSORCHESTRATORCATALOGMANAGERSERVICE_WSDL_LOCATION = url;
    }

    public ProcessOrchestratorCatalogManagerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProcessOrchestratorCatalogManagerService() {
        super(PROCESSORCHESTRATORCATALOGMANAGERSERVICE_WSDL_LOCATION, new QName("http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorCatalogManager", "ProcessOrchestratorCatalogManagerService"));
    }

    /**
     * 
     * @return
     *     returns GetCamerasPortType
     */
    @WebEndpoint(name = "GetCamerasPort")
    public GetCamerasPortType getGetCamerasPort() {
        return super.getPort(new QName("http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorCatalogManager", "GetCamerasPort"), GetCamerasPortType.class);
    }

    /**
     * 
     * @return
     *     returns SearchCameraPortType
     */
    @WebEndpoint(name = "SearchCameraPort")
    public SearchCameraPortType getSearchCameraPort() {
        return super.getPort(new QName("http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorCatalogManager", "SearchCameraPort"), SearchCameraPortType.class);
    }

    /**
     * 
     * @return
     *     returns GetCameraPortType
     */
    @WebEndpoint(name = "GetCameraPort")
    public GetCameraPortType getGetCameraPort() {
        return super.getPort(new QName("http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorCatalogManager", "GetCameraPort"), GetCameraPortType.class);
    }

    /**
     * 
     * @return
     *     returns GetAllBrandsPortType
     */
    @WebEndpoint(name = "GetAllBrandsPort")
    public GetAllBrandsPortType getGetAllBrandsPort() {
        return super.getPort(new QName("http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorCatalogManager", "GetAllBrandsPort"), GetAllBrandsPortType.class);
    }

}