
package org.netbeans.j2ee.wsdl.lpco_bpel_module.processorquestratorusermanager;

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
@WebService(name = "AddUserPortType", targetNamespace = "http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrquestratorUserManager")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface AddUserPortType {


    /**
     * 
     * @param username
     * @param address
     * @param email
     * @param password
     * @return
     *     returns org.netbeans.j2ee.wsdl.lpco_bpel_module.processorquestratorusermanager.AddUserResponseType
     */
    @WebMethod(operationName = "AddUserOperation")
    @WebResult(name = "AddUserOperationResponse", partName = "AddUserOperationResponse")
    public AddUserResponseType addUserOperation(
        @WebParam(name = "username", partName = "username")
        String username,
        @WebParam(name = "password", partName = "password")
        String password,
        @WebParam(name = "email", partName = "email")
        String email,
        @WebParam(name = "address", partName = "address")
        String address);

}
