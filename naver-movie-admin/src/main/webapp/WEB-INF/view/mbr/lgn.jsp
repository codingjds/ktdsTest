<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="context" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${context}/css/common.css">
<script type="text/javascript" src="${context}/js/jquery-3.6.4.min.js"></script>
<script type="text/javascript">

	$().ready(function(){
		
		$("#login_btn").click(function(){
			
			var data = {
				mbrId: $("#mbrId").val(),
				pwd: $("#pwd").val()
			}
			
			$.post("${context}/api/mbr/lgn", data, function(response){
				//Response Spec
				
				
				if(response.status == "200 OK") {
					if(response.redirectURL){
						location.href = "${context}" + response.redirectURL;					
					}
				}
				else if(response.status == "400"){
					//파라미터를 전달을 하지 않은 경우
					alert(response.message);
				}
				else {
					console.log(data)
					alert(response.errorCode + " /" + response.message);
				}
			});
		});
	});
</script>  
</head> 
<body>

	<div class="fullscreen item-align-center bg-gray">
		
		<div class="login-group">
		<h1>Ktds Movie System</h1>
			<div class="input-group">
				<label for="mbrId">ID</label>
				<input type="text" id="mbrId" placeholder="Id" name="mbrId">
			</div>
			<div class="input-group">
				<label for="pwd">PWD</label>
				<input type="password" id="pwd" placeholder="Password" name="pwd">
			</div>
			<div class="align-right">
				<button class="btn-primary" id="login_btn">로그인</button>
			</div>
		</div>
	</div>

</body>
</html>