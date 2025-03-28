<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title><c:out value="${boardDTO != null ? '게시글 수정' : '새 글 작성'}"/></title>
</head>
<body>

<h2><c:out value="${boardDTO != null ? '게시글 수정' : '새 글 작성'}"/></h2>



<form method="post" action="board" enctype="multipart/form-data">

    <c:if test="${boardDTO != null}">
        <input type="hidden" name="command" value="update">
        <input type="hidden" name="boardId" value="${boardDTO.boardId}">
    </c:if>
    
    <c:if test="${boardDTO == null}">
        <input type="hidden" name="command" value="insert">
    </c:if>

		<table border="1">
			<c:if test="${boardDTO == null}">
				<tr>
					<th>사원번호</th>
					<td><input type="text" name="empno"></td>
				</tr>
			</c:if>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" value="${boardDTO.title}"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="content">${boardDTO.boardContent}</textarea></td>
			</tr>
			<tr>
				<th>공지사항</th>
				<td><select name="notice">
						<option value="0" ${boardDTO.notice == 0 ? 'selected' : ''}>일반</option>
						<option value="1" ${boardDTO.notice == 1 ? 'selected' : ''}>공지</option>
				</select></td>
			</tr>
			<tr>
				<th>파일첨부</th>
				<td><input type="file" name="files" multiple></td>
			</tr>

		</table>

		<br>
    <input type="submit" value="${boardDTO != null ? '수정하기' : '작성하기'}">
    <a href="board">목록으로</a>


	


</form>



	<c:if test="${boardDTO != null}">
    <form action="board" method="post">
        <input type="hidden" name="command" value="delete">
        <input type="hidden" name="boardId" value="${boardDTO.boardId}">
        <input type="submit" value="삭제하기">
    </form>
</c:if>


</body>
</html>
