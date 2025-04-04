<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="kr.or.human.dto.*" %>
<!-- 패키지는 적어줘야 한다.  -->
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
				<option value="ej">Ename + Job</option>
				<!-- 'e'name+'j'ob -->
			</select> <input type="text" id="search" name="keyword"
				value="${dto.keyword }">
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
							<c:if test="${ not empty map.list }">
								<c:forEach var="dto" items="${map.list}" varStatus="loop">
									<tr>
										<td><input type="checkbox" name="empnos"
											value="${dto.empno}"></td>
										<td>${dto.empno}</td>
										<td><a href="detailEmp?empno=${dto.empno}">${dto.ename}</a></td>
										<td>${dto.sal}</td>
									</tr>
								</c:forEach>
							</c:if>
							<c:if test="${ empty map.list }">
								<tr>
									<td colspan=2>조회 내용이 없습니다</td>
								</tr>
							</c:if>

						</tbody>
					</table>
				</form>
			</article>
		</section>
		<section>
			<div>
			
				<%
					// model은 리퀘스트와 동급 (페이지, 리퀘스트, 세션 복습)
					// model에 담은 것은 request에서 꺼낼 수 있다.
					Map map = (Map)request.getAttribute("map");
					int total = (Integer)map.get("total");
					EmpDTO empDTO = (EmpDTO)request.getAttribute("dto");
					int pageNo = empDTO.getPage();
				 	int viewCount = empDTO.getViewCount();
				 	
				 	// 1401 / 10 = 140.1 올림해서 141 ceil			 	
				 	double lastPage = Math.ceil((double)total / viewCount);
				 	
				 	int groupCount = 5; // 한 번에 보여줄 페이지 개수
				 	int groupPosition = (int)Math.ceil((double)pageNo / groupCount);
				 	int begin = ((groupPosition-1) * groupCount)+1;
				 	int end = groupPosition * groupCount;
				 	
				 	
				%>
				
				<c:forEach var="i" begin="<%= begin %>" end="<%= end %>">
				<c:if test="${i == dto.page}">
					<c:set var="clazz" value="bold" />
				</c:if>
				<c:if test="${not (i == dto.page)}">
					<c:set var="clazz" value="" />
				</c:if>
				
				<c:if test="<%= begin == 1 %>">
					[이전]
				</c:if>
				<c:if test="<%= begin != 1 %>">
				<a href="emp?page=<%= begin -1 %>">[이전]</a>
				</c:if>
				
				
				<a href="emp?page=${ i }" class="${clazz}">${ i }</a>
				
				</c:forEach>
			</div>
		</section>
	</main>
</body>
</html>