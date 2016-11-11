<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<body>
	<h1 id="banner">Mukul Login</h1>
	<form name="f" action="<c:url value='j_spring_security_check'/>"
		method="POST">

		<c:if test="${not empty fail}">
			<div style="color: red">
				Your fake login attempt was bursted, dare again !!<br /> Caused :
				${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
			</div>
		</c:if>
		
		<c:if test="${not empty logout}">
			<div style="color: red">
				You Logged Out SuccessFully!!!!
				${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
			</div>
		</c:if>
		
		<table>
			<tr>
				<td>User Name:</td>
				<td><input type='text' name='j_username' /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='j_password'></td>
			</tr>
			<tr>
				<td colspan="2">&nbsp;</td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit">&nbsp;<input
					name="reset" type="reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>