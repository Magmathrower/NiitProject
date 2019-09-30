<%@include file="Commonheader.jsp" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
     <h3 align="center">Manage Product</h3>
    
<form:form action="/Insertproduct" method="post" modelAttribute="product">

<table align="center" border="1">
  <tr>
    <td>Product Name</td>
    <td><form:input path="productName"/></td>
  </tr>
  <tr>
    <td>Product Price</td>
    <td><form:input path="price"/></td>
  </tr>
  <tr>
    <td>Stock</td>
    <td><form:input path="stock"/></td>
  </tr>
  <tr>
    <td>Category</td>
    <td><form:select path="categoryId">
        <form:option value="0" label="---Select List---"/>
        <form:options items="${categorylist}"/>
        </form:select></td>
  </tr>
  <tr>
    <td>Supplier Id</td>
    <td><form:input path="supplierId"/></td>
  </tr>
  <tr>
    <td>Product Desc</td>
    <td><form:input path="productDesc"/></td>
  </tr>
  <tr>
    <td colspan="2">
        <center><input type="submit" value="Insert Product"></center>
    </td>

  </tr>
</table>

</form:form>    

<br>
  <table align="center" border="1">
     
     <tr>
        <td>Product ID</td>
        <td>Product Name</td>
        <td>Category</td>
        <td>Price</td>
        <td>Supplier</td>
        <td>Operation</td>
     </tr>
     <c:forEach items="${productlist}" var="product">
          <tr>
             <td>${product.productId}</td>
             <td>${product.productName}</td>
             <td>${product.categoryId}</td>
             <td>${product.price}</td>
             <td>${product.supplierId}</td>
             <td>
             <a href="<c:url value="/editproduct/{product.productId}"/>">EDIT</a>
             <a href="<c:url value="/deleteproduct/{product.productId}"/>">DELETE</a>
             </td>
          </tr>
     </c:forEach>
  </table>

</body>
</html>