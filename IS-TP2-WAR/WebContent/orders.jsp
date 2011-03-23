<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:include page="sessionVerify.jsp"/>

<%@ page import="org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorordersmanager.*" %>
<%@ page import="java.util.List" %>


    
<jsp:useBean id="access" scope="session" class="is.frontBeans.SessionBean" />
<jsp:setProperty name="access" property="*" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Orders</title>
<link type="text/css" href="css/styles.css" rel="stylesheet">
<script type="text/javascript" src="scripts/jquery.js"></script>
</head>
<body>

<h1 align="center">Your Orders</h1>


<div id="orders"">

<%
	List<Order> orders = access.getOrders();
	for(int i=0;i<orders.size();i++){
		Order tmp = orders.get(i);
		%>
		<table class="order">			
			<tr>
					<td>
						Order Date: 
					</td>
					<td><%= tmp.getTime() %></td>
				</tr>
			<tr>
			<td>Status</td><td><%= (tmp.getStatus()==2 ? "Delivered" : "Delivering..." ) %></td>
			</tr>
				<tr>
					<td> Total delivering days:</td><td><%= tmp.getDeliveringDays() %></td>
				</tr>
				<tr >
					<td height="30" colspan="2" style="border:0"> Cameras:</td>
				</tr> 
				<tr>
					<td>MODEL</td><td>QUANTITY</td>
				</tr>
				<% 
					float price = 0;
					if (tmp.getOrderItems() != null){
						for(int j=tmp.getOrderItems().size()-1;j>=0;j--){
							price+=tmp.getOrderItems().get(j).getPrice();
							OrderItem order = tmp.getOrderItems().get(j);
							%>
							<tr >
								<td><%= order.getCameraName() %></td> <td><%= order.getQtd() %></td>
							</tr>
							<%
						}
					}
				%>	
		</table>
		<%
		
	}
%>
	
</div>
</body>