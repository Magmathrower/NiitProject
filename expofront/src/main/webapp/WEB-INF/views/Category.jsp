<%@include file="Commonheader.jsp" %>
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
	<table>
	        <tr>
	            <td>Category ID</td>
	            <td>Category Name</td>
	            <td>Category Desc</td>
	            <td>Operations</td>
	        </tr>
	        <c:forEach items="${categorylist}" var="category">
	        <tr>
	            <td>${category.categoryId}</td>
	            <td>${category.categoryName}</td>
	            <td>${category.categoryDesc}</td>
	            <td>
	            <a href="<c:url value="/deleteCategory/${category.categoryId}"></c:url>">DELETE</a>
	            <a href="<c:url value="/editCategory/${category.categoryId}"></c:url>">EDIT</a>
	            </td>  
	        </tr>
	        </c:forEach>
	</table>
     </form>
</body>
</html>