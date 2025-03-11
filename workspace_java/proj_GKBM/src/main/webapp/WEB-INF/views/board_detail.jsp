<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>게시글 상세보기</title>
</head>
<body var="dto">

<h2>게시글 상세보기</h2>
<hr>

<table border="1">
    <tr><th>번호</th><td>${dto.boardId}</td></tr>
    <tr><th>작성자(사원번호)</th><td>${dto.empno}</td></tr>
    <tr><th>제목</th><td>${dto.title}</td></tr>
    <tr><th>내용</th><td>${dto.boardContent}</td></tr>
    <tr><th>공지사항 여부</th><td>${dto.notice == 1 ? "공지" : "-"}</td></tr>
    <tr><th>작성일</th><td>${dto.createDate}</td></tr>
    <tr><th>조회수</th><td>${dto.views}</td></tr>
</table>

<br>
<a href="board?action=form&boardId=${dto.boardId}">수정하기</a>
<a href="board">목록으로</a>

</body>
</html>
