<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Random"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="context" value="${pageContext.request.contextPath}" />
<c:set var="date" value="<%= new Random().nextInt() %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="../include/stylescript.jsp" />
<script type="text/javascript">
	$().ready(function(){
		
		$("#addGnrBtn").click(function(){
			var gnr = window.open("${context}/gnr/search", "장르검색", "width=500,height=500")	
		});
		
		
		$("#addDirectorBtn, #addScripterBtn, #addProducerBtn, #addMainActorBtn, #addSupportActorBtn, #addExtraBtn").click(function(){
			var gnr = window.open("${context}/mvppl/search", "영화인검색", "width=500,height=500")	
		});
	
	});
	
</script>
</head>
<body>
	<div class="main-layout">
		<jsp:include page="../include/header.jsp" />
		<div>
			<jsp:include page="../include/mvMgntSidemenu.jsp" />
			<jsp:include page="../include/content.jsp" />
			
				<div class="path">영화 > 영화관리 </div>
				<h1>영화 정보 등록</h1>
				
				<div>
					<div class="create-group">
						<label for="mvTtl">포스터</label>
						<img class="profile" src="" />
						<input type="file" id="mvTtl" name="mvTtl" />
					</div>
				</div>
				<div>
					<div class="create-group">
						<label for="pstr">영화제목</label>
						<input type="text" id="pstr" name="pstr" />
					</div>
				</div>
				<div>
					<div class="create-group">
						<label for="engTtl">영화제목(영어)</label>
						<input type="text" id="engTtl" name="engTtl" />
					</div>
				</div>
				<div>
					<div class="create-group">
						<label for="scrnStt">상영상태</label>
						<select id="scrnStt" name="scrnStt">
							<option>선택</option>
							<option value="상영중">상영중</option>
							<option value="상영예정">상영예정</option>
							<option value="상영종료">상영종료</option>
						</select>
					</div>
					<div class="create-group">
						<label for="scrnTm">상영상태</label>
						<input type="number" id="scrnTm" name="scrnStt" value="0" />
					</div>
					<div class="create-group">
						<label for="openDt">개봉일</label>
						<input type="date" id="openDt" name="openDt" />
					</div>
					<div class="create-group">
						<label for="grd">관람등급</label>
						<select id="grd" name="grd" >
							<option>선택</option>						
							<option value="전체관람가">전체관람가</option>						
							<option value="7">7세이상 관람가</option>						
							<option value="12">12세이상 관람가</option>						
							<option value="15">15세이상 관람가</option>						
							<option value="19">청소년관람불가</option>						
						</select>
					</div>
					<div class="create-group">
						<label for="smr">줄거리</label>
						<textarea id="smr" name="smr"></textarea>
					</div>
					<div class="create-group">
						<label for="useYn">게시여부</label>
						<input type="checkbox" id="useYn" name="useYn" value="Y" />
					</div>
					<div class="create-group">
						<label for="addGnrBtn">장르</label>
						<div>
							<button id="addGnrBtn" class="btn-primary">등록</button>
							<div class="items"></div>
						</div>
					</div>
					</div>
					<div class="create-group">
						<label for="addDirectorBtn">감독</label>
						<div>
							<button id="addDirectorBtn" class="btn-primary">등록</button>
							<div class="items"></div>
						</div>
					</div>
					<div class="create-group">
						<label for="addScripterBtn">각본</label>
						<div>
							<button id="addScripterBtn" class="btn-primary">등록</button>
							<div class="items">
								
							</div>
						</div>
						
					</div>
					<div class="create-group">
						<label for="addProducerBtn"s>연출</label>
						<div>
							<button id="addProducerBtn" class="btn-primary">등록</button>
							<div class="items">
								
							</div>
						</div>
					</div>
					
					<div class="create-group">
						<label for="addMainActorBtn">주연</label>
						<div>
							<button id="addMainActorBtn" class="btn-primary">등록</button>
							<div class="items">
								
							</div>
						</div>
					</div>
					<div class="create-group">
						<label for="addSupportActorBtn">조연</label>
						<div>
							<button id="addSupportActorBtn" class="btn-primary">등록</button>
							<div class="items">
								
							</div>
						</div>
					</div>
					<div class="create-group">
						<label for="addExtraBtn">기타</label>
						<div>
							<button id="addExtraBtn" class="btn-primary">등록</button>
							<div class="items">
								
							</div>
						</div>
					</div>
					<div class="align-right">
						<button id="new_btn" class="btn-primary">등록</button>
						<button id="delete_btn" class="btn-delete">삭제</button>
					</div>		
				</div>
			<jsp:include page="../include/footer.jsp" />
		</div>
	</div>
</body>
</html>