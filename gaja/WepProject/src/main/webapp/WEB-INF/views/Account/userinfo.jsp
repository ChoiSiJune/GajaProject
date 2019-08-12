<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "gaja.project.domain.*" %>
 <%@page import="java.util.List"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
 
    
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 위 3개의 메타 태그는 *반드시* head 태그의 처음에 와야합니다; 어떤 다른 콘텐츠들은 반드시 이 태그들 *다음에* 와야 합니다 -->
    <title>클라우스</title>

    <!-- 부트스트랩 -->
    <link href="/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">  
    <!-- 메인css -->
    <link href="/resources/css/main.css" rel="stylesheet">

    <!-- IE8 에서 HTML5 요소와 미디어 쿼리를 위한 HTML5 shim 와 Respond.js -->
    <!-- WARNING: Respond.js 는 당신이 file:// 을 통해 페이지를 볼 때는 동작하지 않습니다. -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>



<body style="padding-top:60px; background-color:#2c3338;">

	<jsp:include page= "../include/navi.jsp"/> <!-- 상단바 -->
 	
<div class="container-fluid">
	<div class="row">  <!-- 상품 페이지 -->
    
<!-- 여기서부터 옷 시작 -->

		<div class= "col-md-12" style="text-align:center;">
		<table class="table table-hover">
		
		<tr bgcolor="white">
			<td>이름</td>
			<td>아이디</td>
			<td>휴대폰번호</td>
			<td>주소</td>
		</tr>

		<c:forEach items="${memberall}" var = "memberall">		
			<tr>
			<td>${memberall.name}</td>
			<td>${memberall.id}</td>
			<td>${memberall.phone}</td>
			<td>${memberall.address}</td>
			</tr>		
		</c:forEach>

		</table>
<br>
			 
			<div class="text-center">

			<!-- 하단 페이지 번호 처리  -->
			<ul class = "pagination">
 

			<c:if test="${pagecri.prev}">
			<li><a href="memberinfo${pagecri.makeQuery(pagecri.startPage - 1)}">&laquo;</a></li> <!-- 이전페이지 계산값이 true면 버튼 생성 (prev부분)-->
			</c:if>


			<c:forEach begin="${pagecri.startPage}" end="${pagecri.endPage}" var ="idx">  <!-- step 생략시 기본값으로 1 상승 -->
			<li <c:out value ="${pagecri.page.page == idx?'class = active':''}"/>> <!-- 현재 클릭한 페이지가 idx넘버랑 같으면 해당 idx부분을 css로 강조처리 -->
	 		<a href="memberinfo${pagecri.makeQuery(idx)}">${idx}</a>
			</c:forEach>


			<c:if test = "${pagecri.next && pagecri.endPage > 0}">  <!--  next페이지값과 끝페이지 값이 ture이면 next버튼 표시 (next부분) --> 
			<li><a href = "memberinfo${pagecri.makeQuery(pagecri.endPage+1)}">&raquo;</a></li>
			</c:if>
			
			</ul> 	
			
			</div>
			 
		</div>
	</div>
</div>

<script>

function search(){

	var keyword = $("#keyword").val();
	location.href= "search?cate=all&keyword="+keyword;

}
</script>



 
     
        <!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js">
    <!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
    <script src="/resources/bootstrap/js/bootstrap.min.js"></script>
    
       
</body>

</html>
