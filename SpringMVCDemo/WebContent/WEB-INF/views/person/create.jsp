<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<style>
	.error{
		color:red;
	}
</style>
<h1>Create Person</h1>
<p>${successMsg}</p>
<form:form method="POST" modelAttribute="person" action="save.htm">
	<table align=center border=5 border-color=green>
		<tr>
			<td align="right">Name:</td>
			<td><form:input path="name" type="text" name="name" id="name" /></td>
			<td><form:errors path="name" cssClass="error"/></td>
		</tr>
		<tr>
			<td align="right">City:</td>
			<td><form:input path="city" type="text" name="name" id="city" /></td>
			 <td><form:errors path="city" cssClass="error"/></td>
		</tr>
		<tr>
			<td align="right">MobileNo:</td>
			<td><form:input path="mobileNo" type="text" name="mobileNo" id="mobileNo" /></td>
			 <td><form:errors path="mobileNo" cssClass="error"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type=submit name=action value="Save" />
			</td>
		</tr>
	</table>
</form:form>
${personList}