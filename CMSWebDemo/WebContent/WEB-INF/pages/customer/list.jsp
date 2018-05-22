<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>List Of Customers </h1>


<table border="5">
	<tr>
		<th>ID</th>
		<th>NAME</th>		
	</tr>
	<c:forEach items="${customerList}" var="customer">
		<tr>
			<td>${customer.customerId}</td>
			<td>${customer.name}</td>
		</tr>
	</c:forEach>	
</table>