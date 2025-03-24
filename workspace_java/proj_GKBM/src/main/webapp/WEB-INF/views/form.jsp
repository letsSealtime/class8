<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title><c:out value="{{boardDTO != null ? '게시글 수정' : '새 글 작성'}}"/></title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }
        body {
            display: flex;
            flex-direction: column;
            align-items: center;
            background-color: #f5f5f5;
            padding: 20px;
        }
        .container {
            width: 80%;
            max-width: 800px;
            background: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        .form-group input,
        .form-group textarea {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .form-group img {
            max-width: 200px;
            display: block;
            margin-top: 10px;
        }
        button {
            padding: 10px 20px;
            background-color: #007BFF;
            border: none;
            color: white;
            border-radius: 4px;
            cursor: pointer;
        }
    </style>
</head>
<body>

<div class="container">
    <h2><c:out value="${boardDTO != null ? '게시글 수정' : '새 글 작성'}"/></h2>

    <form method="post" action="board" enctype="multipart/form-data">
        <c:if test="${boardDTO != null}">
            <input type="hidden" name="command" value="update">
            <input type="hidden" name="boardId" value="${boardDTO.boardId}">
        </c:if>

        <c:if test="${boardDTO == null}">
            <input type="hidden" name="command" value="insert">
        </c:if>

        <div class="form-group">
            <label>사원번호</label>
            <input type="text" name="empNo" value="${boardDTO.empNo}" <c:if test="${boardDTO != null}">readonly</c:if>>
        </div>

        <div class="form-group">
            <label>이름</label>
            <input type="text" name="empName" value="${boardDTO.empName}" <c:if test="${boardDTO != null}">readonly</c:if>>
        </div>

        
        <div class="form-group">
            <label>공지사항</label>
            <select name="notice">
                <option value="0" ${boardDTO.notice == 0 ? 'selected' : ''}>일반</option>
                <option value="1" ${boardDTO.notice == 1 ? 'selected' : ''}>공지</option>
            </select>
        </div>

        <div class="form-group">
            <label>제목</label>
            <input type="text" name="title" value="${boardDTO.title}">
        </div>

        <div class="form-group">
            <label>내용</label>
            <textarea name="content" rows="5">${boardDTO.content}</textarea>
        </div>

        <div class="form-group">
            <label>첨부 파일</label>
            <input type="file" name="uploadFile">
            <c:if test="${boardDTO != null && boardDTO.fileName != null}">
                <div>
                    현재 파일: <a href="upload/${boardDTO.fileName}">${boardDTO.fileName}</a>
                </div>
            </c:if>
        </div>

        <button type="submit">저장</button>
    </form>
</div>

</body>
</html>
