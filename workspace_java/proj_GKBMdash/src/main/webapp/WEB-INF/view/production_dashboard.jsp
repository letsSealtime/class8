<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<!DOCTYPE html>
<html>
<head>
    <title>생산 실적</title>
</head>
<body>
    <h2>생산 실적 대시보드</h2>
    <form method="get" action="production">
        <select name="unit">
            <option value="week">주별</option>
            <option value="month">월별</option>
            <option value="quarter">분기별</option>
        </select>
        <button type="submit">조회</button>
    </form>
    <table>
        <tr><th>날짜</th><th>생산량</th></tr>
        <c:forEach var="data" items="${productionList}">
            <tr><td>${data.productionDate}</td><td>${data.quantity}</td></tr>
        </c:forEach>
    </table>
</body>
</html>