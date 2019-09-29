<%@include file="Commonheader.jsp" %>
  <a href="login"></a>
     <h3 align="center">Manage Category</h3>
    <c:url value="/UpdateCategory" var="url"></c:url>
	<form action="${url }" method="post">
     <table align="center">
		<tr>
			<td colspan="2"></td>
		</tr>
		<tr>
			<td>Category Id</td>
			<td><input type="text" name="catid" value="${category.categoryId}(READ ONLY!!)"></td>
		</tr>
		<tr>
			<td>Category Name</td>
			<td><input type="text" name="catName" value="${category.categoryName}"></td>
		</tr>
		<tr>
			<td>Category Description</td>
			<td><textarea cols="40" rows="5" name="catdesc">${category.categoryDesc}</textarea></td>
		</tr>
		<tr>
			<td colspan="2"><br>
			  <center><input type="submit" value="Update Category"></center>
			</td>
		</tr>
	</table>
	

</body>
</html>