<%@ page import="is.frontBeans.SessionBean" %>

<jsp:useBean id="access" scope="session" class="is.frontBeans.SessionBean" />
<jsp:setProperty name="access" property="*" />

<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");

	if(username==null || password==null){
		username = "false";
		password = "false";
		%>{ "login": "false" }<%
	}else{
		access.setUserName(username);
		access.setPassWord(password);
		if(access.login()){
			%>{ "login" : "true" }<%
			access.loadBrands();
		}else{
			%>{ "login": "false" }<%
		}
	}
%>