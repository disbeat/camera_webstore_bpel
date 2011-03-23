<jsp:useBean id="access" scope="session" class="is.frontBeans.SessionBean" />
<jsp:setProperty name="access" property="*" />
<%
	if(!access.isLogged()){
		//<jsp:forward page="index.jsp"></jsp:forward>
	%>
	<script type="text/javascript">
		window.parent.document.location= "index.jsp";
		window.document.location = "index.jsp";
	</script>
	<%	
	}
%>