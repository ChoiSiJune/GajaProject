<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="text-center">





<!-- 하단 페이지 번호 처리  -->
<ul class = "pagination">
<c:if test="${pagecri.prev}">
	<li><a href="board${pagecri.makeQuery(pagecri.startPage - 1)}">&laquo;</a></li>  <!-- 이전페이지 계산값이 true면 버튼 생성 (prev부분)-->
</c:if>


<c:forEach begin="${pagecri.startPage}" end="${pagecri.endPage}" var ="idx">  <!-- step 생략시 기본값으로 1 상승 -->
	<li
	 <c:out value ="${pagecri.page.page == idx?'class = active':''}"/>> <!-- 현재 클릭한 페이지가 idx넘버랑 같으면 해당 idx부분을 css로 강조처리 -->
	 <a href="board${pagecri.makeQuery(idx)}">${idx}</a>
	
</c:forEach>


<c:if test = "${pagecri.next && pagecri.endPage > 0}">  <!--  next페이지값과 끝페이지 값이 ture이면 next버튼 표시 (next부분) --> 
	<li><a href = "board${pagecri.makeQuery(pagecri.endPage+1)}">&raquo;</a></li>
</c:if>


 <li class = active ><a href="BoardReg">글쓰기</a></li>


</ul> 	




</div>

</body>
</html>