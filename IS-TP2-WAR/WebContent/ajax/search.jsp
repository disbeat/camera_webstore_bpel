<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="is.frontBeans.SessionBean" %>
<%@ page import="org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorcatalogmanager.*" %>
<jsp:useBean id="access" scope="session" class="is.frontBeans.SessionBean" />
<jsp:setProperty name="access" property="*" />

<%

	String model = request.getParameter("model");
	Camera tmp = access.search(model);
	if(tmp!=null){	
		%>
{
	"valid": "true",
	"brand": "<%= tmp.getBrand() %>",
	"name": "<%= tmp.getName() %>",
	"id_": "<%= tmp.getIdCamera() %>"
}<% } else { %>
	"valid" : "false"
<% }%>
