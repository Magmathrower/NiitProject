<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="Commonheader.jsp" %>
     <a href="login"></a>
     <h3 align="center">Manage Category</h3>
    <c:url value="/InsertCategory" var="url"></c:url>
	<form action="${url }" method="post">
     <table align="center">
		<tr>
			<td colspan="2"></td>
		</tr>
		<tr>
			<td>Category Name</td>
			<td><input type="text" name="catName"></td>
		</tr>
		<tr>
			<td>Category Description</td>
			<td><textarea cols="40" rows="5" name="catdesc"></textarea></td>
		</tr>
		<tr>
			<td colspan="2"><br>
			  <center><input type="submit" value="Insert Category"></center>
			</td>
		</tr>
	</table>
     </form>
</body>
</html>