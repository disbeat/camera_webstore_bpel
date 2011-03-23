<%@ page import="is.sharedObjects.*" %>
<%@ page import="org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorordersmanager.OrderItem" %>

<jsp:include page="sessionVerify.jsp"/>

<jsp:useBean id="access" scope="session" class="is.frontBeans.SessionBean" />
<jsp:setProperty name="access" property="*" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="scripts/jquery.js"></script>
<title>LPCO Cart</title>
</head> 
<body bgcolor="#66f">
	<script type="text/javascript">
	$(document).ready(function(){
		$("#loading").hide();
		$("#checkout").click(function(){
			var easter = false;
			$("#cameraList").hide();
			$("#loading").show();
			$.post("ajax/checkout.jsp", {
				checkout: "true"
			}, function(data){
				if(data.valid==="true"){
					if(easter===false){
						alert("Parabens acabou de adquirir umas fantasticas máquinas");
					} else {
						alert("Nao sei como fez, mas ainda ao bocado nao tinha dinheiro e agora ja tem! conta-me o segredo? pls pls?");
						easter=false;
					}
					window.document.location = "cart.jsp";
				}else if(data.valid==="false"){
					alert("Desculpe! Não tem dinheiro!");
					easter=true;
					$("#cameraList").show();
					$("div#loading").hide();
				}
			}, "json");
		});


		$("a.delete").live("click",function(){
			
			$.ajax({
				type: "POST",
				url: "ajax/myCart.jsp",
				data: ({function_: "remove", id: $(this).attr('id')}),
				success: function(data){
						window.document.location = "cart.jsp";
				},
				error: function(msg) {alert(msg);}, 
				dataType: "json"
				
				});
			
			return false;
		});
		
	});
	</script>
<div id="cameraListDiv">
<h2 align="center">Cart</h2>	
<table id="cameraList">
<tr>
<th colspan="2"><p align="center"><font color="#BFB">Items</font></p></th></tr> 
	<%
		Cart cart = access.getCart();
		float total = 0;
		for(OrderItem item : cart.getOrderItems()){
	%>
			<tr><td>Model</td><td><%= item.getCameraName()%></td></tr>
			<tr><td>Quantity:</td><td> <%=item.getQtd() %></td></tr>
			<tr><td>Price:</td><td>&euro; <%=item.getPrice()%></td></tr>
			<tr><td colspan="2"><p align="center">
			<a href="#" class="delete" id="<%=item.getCameraID() %>">
			<font color="#F00">Remove</font></a></p></td></tr>
	<%
			total+=item.getPrice();
		}
	%>
		
		<tr></tr><tr><td><p><b>Total:</b></td><td>&euro; <%=total%></td></tr>

	<tr><td><input id="checkout" type="button" value="CheckOut"></input></td></tr>
</table>
<div id="loading">Loading...
</div>
</div>
</body>