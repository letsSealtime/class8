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
<body style="background-color: #f8f9fa;">


<form method="post" action="todo">
	할일 : <input type="text" name="todo">
	<input type = "submit" value="추가" style="border-radius: 4px; background-color: #28a745; color: white; border: none">
</form>

<hr>
	<table>
	<tbody id="content"></tbody>
	
		<c:forEach var="dto" items="${resultList}">
			<tr>
				<form method="post" action="todo">
				<td><input type=checkbox name="done" value="Y"></td>
				<td>${dto.todo_id}</td>
				<td>${dto.todo}</td>
				<td>${dto.create_date}</td>
				<td>${dto.modify_date}</td>
				<td>${dto.done}</td>
				<td>
				<input type="hidden" name="command" value="update">
				<input type="submit" value="수정" style="border-radius: 4px; background-color: #28a745; color: white; border: none" >
				</td>
				</form>
			</tr>
			
		</c:forEach>
		</table>
		
		<script>
		drawList()
		
		function drawList(){
			
			const xhr = new XMLHttpRequest()
			xhr.open('get', 'json')
			xhr.send()
			xhr.onload = function(){
				console.log(xhr.responseText)
				
				const list = JSON.parse(xhr.responseText)
				console.log(list);
				
			}
			
		}
		
		</script>
		
</body>
</html>