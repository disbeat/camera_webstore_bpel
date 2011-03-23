<%@ page import="is.frontBeans.SessionBean" %>


<jsp:useBean id="access" scope="session" class="is.frontBeans.SessionBean" />
<jsp:setProperty name="access" property="*" />

<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String address = request.getParameter("address");
	String email = request.getParameter("email");

	if(username==null || password==null){
		username= "false";
		password = "false";
		%>{ "register": "false" }<%
	}else{
		access.setUserName(username);
		access.setPassWord(password);
		access.setEmail(email);
		access.setAddress(address);
		if(access.register()){
			%>{ "register" : "true" }<%
		}else{
			%>{ "register": "false" }<%
		}
	}
%>