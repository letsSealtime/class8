<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Emp One</title>
</head>
<body>
<ul>
<li>ENAME : ${dto.ename}</li>
<li>EMPNO : ${dto.empno}</li>
<li>JOB : ${dto.job}</li>
<li>MGR : ${dto.mgr}</li>
<li>HIREDATE : ${dto.hiredate}</li>
<li>SAL : ${dto.sal}</li>
<li>COMM : ${dto.comm}</li>
<li>DEPTNO : ${dto.deptno}</li>
</ul>

</body>
</html>