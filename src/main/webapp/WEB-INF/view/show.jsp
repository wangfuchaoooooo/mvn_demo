<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/2
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table align="center">
      <thead>
          <td>品牌</td>
          <td>销售量</td>
      </thead>
        <c:forEach items="${showPhoneList}" var="phone" varStatus="status">
            <tr>
                <td>${phone.phoneType}</td>
                <td>${phone.num}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
