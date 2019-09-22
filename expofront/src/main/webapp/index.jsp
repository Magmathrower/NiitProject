<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
      <title>Main page</title>
   
</head>
   <body>
           <h3 align="center">Main Page</h3>
           
           <jsp:forward page="/WEB-INF/views/Homepage.jsp"></jsp:forward>
      <!--  <a href="<c:url value="/login" ></c:url>"> Login </a>
        <a href="<c:url value="/register" ></c:url>"> Register </a>
        <a href="<c:url value="/contactUs" ></c:url>"> ContactUs </a> --> 
   </body>
</html>	