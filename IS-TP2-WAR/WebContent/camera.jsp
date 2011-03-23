<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="sessionVerify.jsp"/>
    
<%@ page import="is.frontBeans.SessionBean" %>
<%@ page import="org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorcatalogmanager.*" %>
<%@ page import="java.util.List" %>
<%@ page import="java.lang.NumberFormatException" %>

<jsp:useBean id="access" scope="session" class="is.frontBeans.SessionBean" />
<jsp:setProperty name="access" property="*" />


<%
	String id = request.getParameter("id");
	if(id==null){
		id="0";
	}
	Camera camera = access.getCamera(Integer.parseInt(id));
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Camera <%= camera.getName() %> detail</title>
<link type="text/css" href="css/styles.css" rel="stylesheet">
<script type="text/javascript" src="scripts/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#add").click(function(){
			$.post("ajax/myCart.jsp",{
				function_ : "add",
				id : <% out.print("\""+camera.getIdCamera()+"\""); %>,
				qtd : $("#qtd").val()
			}, function(data){
				window.parent.CART.document.location = "cart.jsp" ;			
			}, "json")
		});

		$("td.camera_in_cart").click(function(){
			$.post("myCart.jsp", {
				function_ : "remove",
				id: $(this).html
			}, function(data){
				if(data.valid==="true"){
					$(this).parent().remove;
				}
			}, "json");
		});
	});
</script>
</head>

<body>
<div id="path">
<a href="main.jsp">Brand List</a> > <a href="cameras.jsp?brand=<%= camera.getBrand() %>"><%= camera.getBrand() %></a> > <u><%= camera.getName() %></u>
</div>
<div>
<br> <br>
	<table id="camera" align="center">
    	<tr class="b"><td></td><td align="center"> <%= camera.getName() %> </td></tr>
    	<tr class="b"><td>Image </td><td align="center" height="150px"> <img align="center" src="<%= camera.getLinkPicture() %>" /></td></tr>
        <tr class="b"><td>Price: </td><td align="center"> &euro; <%= camera.getPrice() %> &nbsp;&nbsp;&nbsp;<input type="text" id="qtd" value="1"></input>&nbsp; <img height="20px" width="25px" src="icons/cart.png"  id="add"/></td></tr>
		
		<tr class="a"><td>Summary: </td><td> <%= camera.getSummary() %> </td></tr>
		<tr class="b"><td>Brand: </td><td> <%= camera.getBrand() %> </td></tr>
		<tr class="a"><td>Effective Pixels: </td><td> <%= camera.getEffectivePixels() %> </td></tr>
		<tr class="b"><td>Image ratio: </td><td> <%= camera.getImageRatio() %> </td></tr>
		<tr class="a"><td>ISO Rating: </td><td> <%= camera.getISOrating() %> </td></tr>
		<tr class="b"><td>In depth review: </td><td> <%= camera.getLinkInDepthReview() %> </td></tr>
		<tr class="a"><td>Minimum resolution: </td><td> <%= camera.getLowResolution() %> </td></tr>
		<tr class="b"><td>Maximum resolution: </td><td> <%= camera.getMaxResolution() %> </td></tr>
		<tr class="a"><td>Minimum shutter speed: </td><td> <%= camera.getMinShutter() %> </td></tr>
		<tr class="b"><td>Maximum shutter speed: </td><td> <%= camera.getMaxShutter() %> </td></tr>
		<tr class="a"><td>Sensor size: </td><td> <%= camera.getSensorSize() %> </td></tr>
		
	</table>
</div>

</body>
</html>