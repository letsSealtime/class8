<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="emp">
	<table border="1">
		<tr>
		    <th>empno</th>
		    <td id="empno">${dto.empno}</td>
		</tr>
		<tr>
		    <th>ename</th>
		    <td><input type="text" name="ename" value="${dto.ename}"></td>
		</tr>
		<tr>
		    <th>sal</th>
		    <td><input type="text" name="sal" value="${dto.sal}"></td>
		</tr>
		<tr>
		    <th>comm</th>
		    <td><input type="text" name="comm" value="${dto.comm}"></td>
		</tr>
		<tr>
		    <th>hiredate</th>
		    <td><input type="date" name="hiredate" value="${dto.hiredate}"></td>
		</tr>
	</table>
	<input type="hidden" name="empno" value="${dto.empno}">
	<input type="submit" value="수정하기">
<!-- 	<input type="button" id="modify" value="수정하기"> -->
</form>
</body>
</html>