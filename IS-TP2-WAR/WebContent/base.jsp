<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:include page="sessionVerify.jsp"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="scripts/jquery.js"></script>
<title>LPCO main page</title>
</head>
<frameset rows="150,*" border="0" frameborder="no" framespacing="10">
	<frame src="header.html" name="HEADER" id="HEADER" title="LPCO header" />
	<frameset cols="*,200" border="0" frameborder="no" framespacing="10">
		<frame src="main.jsp" name="BODY" id="BODY" title="LPCO" />
		<frame src="cart.jsp" name="CART" id="CART" title="LPCO Cart" />
	</frameset>
</frameset>
</html>