<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book List</title>
</head>
<body>

	<div>상단</div>
	<div>내 북마크</div>


	<c:forEach items="${list}" var="dto">
		<div class="bookBox">
			<div class="bookCover">
				<img src="${dto.cover}">
			</div>
			<div class="bookText">
				<div class="bookTitle">${dto.title}</div>
				<div class="bookInfo">${dto.author},
					${dto.publisher} <br>
					${dto.price}
				</div>
			</div>
		</div>
	</c:forEach>

</body>
</html>