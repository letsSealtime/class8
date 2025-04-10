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

	<form
		method="post"
		action="uploads"
		enctype="multipart/form-data"
		accept-charset="utf-8"
		>
	
		제목 : <input type="text" name="title"><br>
		내용 : <input type="text" name="title"><br>
		첨부파일 : <input type="file" name="file1" multiple="multiple"><br>
		<input type="submit" value="등록">
	
	</form>


</body>
</html>