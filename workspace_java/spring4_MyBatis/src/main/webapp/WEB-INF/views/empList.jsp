<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록 | Emp관리시스템</title>
</head>
<body>

	<header>
		Logo
		<nav>Emp관리시스템 > 회원 목록</nav>
	</header>
	<main>
		<a href="joinEmp">등록</a><br>
		<form method="get" action="emp">
			<select name="type">
				<option value="ename">ename</option>
				<option value="sal">sal(이상)</option>
				<option value="ej">ename + job</option>
			</select> <input type="text" id="search" name="keyword" value="${dto.ename }">
			<button type="submit">검색</button>
		</form>
		<section>
			<article>
				<form method="get" action="emp">
					<input type="submit" value="선택된 것만 조회">
					<table border="1">
						<thead>
							<tr>
								<th>선택</th>
								<th>empno</th>
								<th>ename</th>
								<th>sal</th>
							</tr>
						</thead>
						<tbody>
							<c:if test="${ not empty list }">
								<c:forEach var="dto" items="${list}" varStatus="loop">
									<tr>
										<td><input type="checkbox" id="empnos"
											value="${dto.empno}"></td>

										<td>${dto.empno}</td>
										<td><a href="detailEmp?empno=${dto.empno}">${dto.ename}</a></td>
									</tr>
								</c:forEach>
							</c:if>
							<c:if test="${ empty list }">
								<tr>
									<td colspan=2>조회 내용이 없습니다</td>
								</tr>
							</c:if>

						</tbody>
					</table>
				</form>

				<button>
					<a href="insertEmp">입력</a>
				</button>
</body>
</html>