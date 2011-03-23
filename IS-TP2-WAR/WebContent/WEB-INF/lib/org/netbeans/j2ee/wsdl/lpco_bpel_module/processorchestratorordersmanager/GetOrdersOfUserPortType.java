
package org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorordersmanager;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "GetOrdersOfUserPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorOrdersManager")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface GetOrdersOfUserPortType {


    /**
     * 
     * @param userID
     * @return
     *     returns org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorordersmanager.GetOrdersOfUserResponse
     * @throws GetOrdersOfUserOperationFault
     */
    @WebMethod(operationName = "GetOrdersOfUserOperation")
    @WebResult(name = "GetOrdersOfUserOperationResponse", partName = "GetOrdersOfUserOperationResponse")
    public GetOrdersOfUserResponse getOrdersOfUserOperation(
        @WebParam(name = "userID", partName = "userID")
        int userID)
        throws GetOrdersOfUserOperationFault
    ;

}