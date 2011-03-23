<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" href="css/styles.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="scripts/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#login").click(function(){
			$("div#loading").show();
			$.post("ajax/login.jsp",{
				username: $("#username").val(),
				password: $("#password").val()
			}, function(data){
				if(data.login==="true"){
						location.href="base.jsp";
						$("#loading").hide();
				}else{
					alert("Username ou Password inválidos.");
					$("#loading").hide();
				}
				
			}, "json");
		});

		$("#register").click(function(){
			$("div#loading").show();
			$.post("ajax/register.jsp",{
				username: $("#rusername").val(),
				password: $("#rpassword").val(),
				email: $("#remail").val(),
				address: $("#raddress").val()
			}, function(data){
				if(data.register==="true"){
						alert("Utilizador registado");
						$("#loading").hide();
						$("#registerForm").slideUp("fast");
						toggle=false;
				}else{
					alert("O username fornecido já existe. Volte a tentar com um username diferente.");
					$("#loading").hide();
				}
			}, "json");
		});
		var toggle = false;
		$("#registerHere").click(function(){
			if(toggle===false){
				$("#registerForm").slideDown("slow");
				toggle=true;
			}else{
				$("#registerForm").slideUp("fast");
				toggle=false;
			}
		});
	});
</script>
</head>
<body>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<h1 align="center">Low-Price Cameras Online</h1>

<div id="loading">Loading...</div>

<p>Welcome to Low-Price Cameras Online. Here you can find top cameras at low prices.</p>
<p>Enjoy our site, reference it to your friends, and be happy!</p>

<p>
<div id="loginDiv">
	<h2>LOGIN</h2>
	<input id="username" type="text"></input><br/>
	<input id="password" type="password"></input><br/>
	<input id="login" type="button" value="Login" ></input>
</div>



<div id="registration">
	<div id="registerHere">To register click here:</div>
	<div id="registerForm">
	<table id="tregister">
		<tr><td class="right">Username:</td><td> <input id="rusername" type="text"></input><br/></td></tr>
		<tr><td class="right">Password:</td><td> <input id="rpassword" type="password"></input><br/></td></tr>
		<tr><td class="right">Address:</td><td> <input id="raddress" type="text"></input><br/></td></tr>
		<tr><td class="right">Email:</td><td> <input id="remail" type="text"></input><br/></td></tr>
	</table>
		<input id="register" type="button" value="Register"></input>
	
	</div>
</div>
</body>
</html>