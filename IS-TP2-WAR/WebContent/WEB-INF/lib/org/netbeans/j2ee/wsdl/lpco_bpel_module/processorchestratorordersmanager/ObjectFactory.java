
package org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorordersmanager;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorordersmanager package. 
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

    private final static QName _CreditCardExceptionMessage_QNAME = new QName("http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorOrdersManager", "CreditCardExceptionMessage");
    private final static QName _GetOrdersOfUserResponse_QNAME = new QName("http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorOrdersManager", "GetOrdersOfUserResponse");
    private final static QName _ShipOrderRequest_QNAME = new QName("http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorOrdersManager", "ShipOrderRequest");
    private final static QName _CheckOutResponse_QNAME = new QName("http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorOrdersManager", "CheckOutResponse");
    private final static QName _CheckOutRequest_QNAME = new QName("http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorOrdersManager", "CheckOutRequest");
    private final static QName _ShipOrderResponse_QNAME = new QName("http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorOrdersManager", "ShipOrderResponse");
    private final static QName _NoOrdersExceptionMessage_QNAME = new QName("http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorOrdersManager", "NoOrdersExceptionMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorordersmanager
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link Cart }
     * 
     */
    public Cart createCart() {
        return new Cart();
    }

    /**
     * Create an instance of {@link OrderToShip }
     * 
     */
    public OrderToShip createOrderToShip() {
        return new OrderToShip();
    }

    /**
     * Create an instance of {@link GetOrdersOfUserResponse }
     * 
     */
    public GetOrdersOfUserResponse createGetOrdersOfUserResponse() {
        return new GetOrdersOfUserResponse();
    }

    /**
     * Create an instance of {@link OrderItem }
     * 
     */
    public OrderItem createOrderItem() {
        return new OrderItem();
    }

    /**
     * Create an instance of {@link ShipOrderResponseType }
     * 
     */
    public ShipOrderResponseType createShipOrderResponseType() {
        return new ShipOrderResponseType();
    }

    /**
     * Create an instance of {@link OrderItemList }
     * 
     */
    public OrderItemList createOrderItemList() {
        return new OrderItemList();
    }

    /**
     * Create an instance of {@link CheckOutResponseType }
     * 
     */
    public CheckOutResponseType createCheckOutResponseType() {
        return new CheckOutResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorOrdersManager", name = "CreditCardExceptionMessage")
    public JAXBElement<String> createCreditCardExceptionMessage(String value) {
        return new JAXBElement<String>(_CreditCardExceptionMessage_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersOfUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorOrdersManager", name = "GetOrdersOfUserResponse")
    public JAXBElement<GetOrdersOfUserResponse> createGetOrdersOfUserResponse(GetOrdersOfUserResponse value) {
        return new JAXBElement<GetOrdersOfUserResponse>(_GetOrdersOfUserResponse_QNAME, GetOrdersOfUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderToShip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorOrdersManager", name = "ShipOrderRequest")
    public JAXBElement<OrderToShip> createShipOrderRequest(OrderToShip value) {
        return new JAXBElement<OrderToShip>(_ShipOrderRequest_QNAME, OrderToShip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOutResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorOrdersManager", name = "CheckOutResponse")
    public JAXBElement<CheckOutResponseType> createCheckOutResponse(CheckOutResponseType value) {
        return new JAXBElement<CheckOutResponseType>(_CheckOutResponse_QNAME, CheckOutResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorOrdersManager", name = "CheckOutRequest")
    public JAXBElement<Cart> createCheckOutRequest(Cart value) {
        return new JAXBElement<Cart>(_CheckOutRequest_QNAME, Cart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipOrderResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorOrdersManager", name = "ShipOrderResponse")
    public JAXBElement<ShipOrderResponseType> createShipOrderResponse(ShipOrderResponseType value) {
        return new JAXBElement<ShipOrderResponseType>(_ShipOrderResponse_QNAME, ShipOrderResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j2ee.netbeans.org/wsdl/LPCO_BPEL_MODULE/ProcessOrchestratorOrdersManager", name = "NoOrdersExceptionMessage")
    public JAXBElement<String> createNoOrdersExceptionMessage(String value) {
        return new JAXBElement<String>(_NoOrdersExceptionMessage_QNAME, String.class, null, value);
    }

}
