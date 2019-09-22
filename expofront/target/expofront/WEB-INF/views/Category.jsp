<%@include file="Commonheader.jsp" %>
     <a href="login"></a>
     <h3 align="center">Manage Category</h3>
     
	<form action="InsertCategory" method="post">
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