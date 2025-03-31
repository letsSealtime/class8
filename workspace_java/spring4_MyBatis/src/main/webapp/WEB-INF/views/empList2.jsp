<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emplist2</title>
</head>
<body>

직원 리스트
<c:forEach items="${list}" var="emp">
<ul>
<li><a href="detailEmp?empno=${dto.empno}">${dto.empno}</a>
${emp.ename}
</li>
<li>EMPNO : ${emp.empno}</li>
</ul>
</c:forEach>

</body>
</html>