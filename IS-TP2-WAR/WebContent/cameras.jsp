<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:include page="sessionVerify.jsp"/>
    
<%@ page import="is.frontBeans.SessionBean" %>
<%@ page import="org.netbeans.j2ee.wsdl.lpco_bpel_module.processorchestratorcatalogmanager.*" %>
<%@ page import="java.util.List" %>
<%@ page import="java.lang.NumberFormatException" %>

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
		$("td.camera_cell").click(function(){
			location.href="camera.jsp?id="+$(this).attr('id');
		});
	});
</script>
</head>
<body>
<%
	String id = request.getParameter("brand");
	String brand;
	List<Camera> cameras;
	if(id==null){
		id="0";
	}
	try { 
		brand = access.getBrands().get(Integer.parseInt(id));
	} catch (NumberFormatException e){
		brand = id;
	}
	  
	cameras = access.getCameras(brand);
	 
%>
<div id="path">
<a href="main.jsp">Brand List</a> &gt; <a href="cameras.jsp?brand=<%= brand %>"><%= brand %></a>
</div>
<br/><br/>
<table>
	<tr>
	<%
		for(int i=0;i<cameras.size();i++){
			out.println("<td id=\""+cameras.get(i).getIdCamera()+"\" class=\"clickable camera_cell\">"+cameras.get(i).getName()+"</td>");
			out.println("</tr><tr>");
		}
	%>
	</tr>
</table>
</body>
</html>