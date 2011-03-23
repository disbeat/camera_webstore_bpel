<jsp:useBean id="access" scope="session" class="is.frontBeans.SessionBean" />
<jsp:setProperty name="access" property="*" />
<%
	access.logout();
	%>
	<jsp:forward page="index.jsp"></jsp:forward>
