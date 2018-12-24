<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Form</title>
<script type="text/javascript">
	function validate() {
		var uid = document.forms[0].userId.value;
		if (uid.match(/^[0-9]{4}$/)) {
			return true;
		} else {
			window.alert('User Id must a four digit integer!');
			return false;
		}
	}
</script>
</head>
<body>
	<form:form name="loginForm" method="POST" onsubmit="return validate();" action="start">
		<div align="center">
			<table>
				<tr>
					<td>User Id</td>
					<td><input type="text" name="userId" required /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" required /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Login" /></td>
				</tr>
			</table>
			<div style="color: red">${error}
		
			</div>
		</div>
	</form:form>
</body>
</html>