<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="is.frontBeans.SessionBean" %>
<%@ page import="java.util.List" %>
<%@ page import="org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorcatalogmanager.Camera" %>

<jsp:include page="sessionVerify.jsp"/>

<jsp:useBean id="access" scope="session" class="is.frontBeans.SessionBean" />
<jsp:setProperty name="access" property="*" />
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" href="css/styles.css" rel="stylesheet">
<title>Insert title here</title>
<script type="text/javascript" src="scripts/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("td.brand_cell").click(function(){
			location.href="cameras.jsp?brand="+$(this).attr('id');
		});

		$("#bsearch").click(function(){
			$.post("ajax/search.jsp",{
				model: $("#search").val()
			}, function(data){
				if(data.valid==="true"){
					location.href="camera.jsp?id="+data.id_;
				}
			}, "json");
		});

		$("td.camera_cell").click(function(){
			location.href="camera.jsp?id="+$(this).attr('id');
		});

		$(".addToCart").click(function(){
			$.post("ajax/myCart.jsp",{
				function_ : "add",
				id : $(this).parent().attr("id"),
				qtd : $(this).parent().find("#qtd").val()
			}, function(data){
				window.parent.CART.document.location = "cart.jsp" ;			
			}, "json")
		});
	});
</script>
</head>
<body>
<%
	List<String> brands = access.getBrands();
	int maxBrandsPerLine = 5;
%>

<div id="search_div">
	<input type="text" id="search"></input> <input id="bsearch" type="button" value="Search cameras"></input>
</div>
<div id="BrandList">
	<table id="brand_table">
		<tr>
		<%
			for(int i=0;i<brands.size();i++){
				
				out.println("<td id=\""+i+"\" class=\"brand_cell clickable\">"+brands.get(i)+"</td>");
				if(i%5==0 && i!=0){
					out.println("</tr><tr>");
				}
			}
		%>
		</tr>
	</table>
</div>
<div class="mainTable">
<table class="qwe" >
	<% 
	for (int i=0;i<brands.size();i++)
	{
		
		String brand = brands.get(i);
		List<Camera> cameras = access.getCameras(brand);
		
		out.println("<tr><td colspan=\""+3+"\" bgcolor=\"#CCCCFF\">"+brand+"</td></tr>");
		for (int k=0;k<cameras.size();k += 3)
		{
			out.println("<tr>");
			for (int j=k;j<(k+3) && j<cameras.size();j++)
			{
				out.println("<td id=\""+cameras.get(j).getIdCamera()+"\"  class=\"clickable camera_cell\" align=\"center\" bgcolor=\"#767676\" width=\"33%\" height=\"150px\">");
				out.println("<img align=\"center\" src=\""+cameras.get(j).getLinkPicture()+"\" alt=\""+cameras.get(j).getName()+"\" /></td>");

			}
			for (int complete = cameras.size(); complete < (k+3); complete++){
				out.print("<td></td>");
			}
			
			out.println("<tr>");
			for (int j=k;j<(k+3) && j<cameras.size();j++)
			{
				out.println("<td id=\""+cameras.get(j).getIdCamera()+"\" align=\"center\" bgcolor=\"#969696\"><br>"+cameras.get(j).getName());
				out.println("<br> &euro; "+cameras.get(j).getPrice()+" <input type=\"text\" id=\"qtd\" value=\"1\"></input> <img height=\"25\" class=\"addToCart\" width=\"25\" src=\"icons/cart.png\" /></td>");
			}
			for (int complete = cameras.size(); complete < (k+3); complete++){
				out.print("<td></td>");
			}
			out.println("<tr height=\"10px\"></tr>");
		}
		
		out.println("</tr><tr height=\"20px\"></tr>");
		
	}
	%>
</table>
</div>
<jsp:include page="orders.jsp" />
</body>
</html>