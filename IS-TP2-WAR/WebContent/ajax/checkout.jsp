<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="is.frontBeans.SessionBean" %>
<%@ page import="java.util.List" %>
<%@ page import="java.lang.NumberFormatException" %>
<%@ page import="java.lang.NumberFormatException" %>

<jsp:useBean id="access" scope="session" class="is.frontBeans.SessionBean" />
<jsp:setProperty name="access" property="*" />

<%
	if(access.getCart().getOrderItems().size()<=0){
		%> { "valid": "empty" } <%
	}else if(access.checkout()){
		%>{"valid": "true"}<%
	}else{
		%>{"valid": "false"}<%
	}

%>