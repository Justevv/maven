<%--
  Created by IntelliJ IDEA.
  User: Alexander_Tychkov
  Date: 01.08.2019
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View</title>
    <c:forEach items="${testData}" var="testData">
        <p>
                ${testData}
        </p>
    </c:forEach>

</head>
<body>

</body>
</html>
