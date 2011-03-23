<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="is.frontBeans.SessionBean" %>
<%@ page import="is.sharedObjects.Cart" %>
<%@ page import="java.util.List" %>
<%@ page import="java.lang.NumberFormatException" %>

<jsp:useBean id="access" scope="session" class="is.frontBeans.SessionBean" />
<jsp:setProperty name="access" property="*" />

<%
	String cameraId = request.getParameter("id");
	String quantity = request.getParameter("qtd");
	String function = request.getParameter("function_");
	boolean valid=false;
	if(function.equals("add") && cameraId!=null && function!=null && quantity != null){
		try{
			access.addToCart(access.getCamera(Integer.parseInt(cameraId)), Integer.parseInt(quantity));
			valid = true;
		} catch (NumberFormatException e){
		
		}
	} else if(function.equals("remove") && cameraId!=null && function!=null){
			access.removeCameraFromCart(cameraId);
			valid = true;
	}
%>
{ "function": "<%= function %>", "valid": "<%= valid %>", "camerasInCart": [<%
	Cart cart = access.getCart();
	for(int i=0;i<cart.getOrderItems().size();i++){
		if(i!=0){
			out.print(",");
		}
		out.print("\""+ cart.getOrderItems().get(i).getCameraName() +"\"");
	} %>] }