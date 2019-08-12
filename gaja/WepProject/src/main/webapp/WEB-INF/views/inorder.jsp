<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "gaja.project.domain.*" %>
 <%@page import="java.util.List"%>

    <%
    
    //통합 작성 부분
      
    List<SelectVO> list = (List<SelectVO>)request.getAttribute("inorder"); //상품리스트 가져오기 
   
    String id = (String)session.getAttribute("id");  //세션 아이디 가져오기 
    
    String mess = (String)request.getAttribute("mess");   
    %>
    
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
    
<script>

var mess = "<%=mess%>";

if(mess=="null"|| mess==null){} 

else {alert(mess);}

</script>

    
</head>


<body style="padding-top:60px; background-color:#2c3338;">

<jsp:include page= "include/navi.jsp"/> <!-- 상단바 -->
 
 <div class="container-fluid">
 	
 	<div class="row">  
   
		<div class= "col-md-12" style="text-align:center;">

			<table class="table table-hover">

				<tr bgcolor="white">
	
					<td>상품명</td>
					<td>가격</td>
					<td>사이즈</td>
					<td>컬러</td>
					<td>구매수량</td>
					<td>배송확인</td>
				
				</tr>

				<%for(int i=0; i<list.size();i++){ %>
				<tr>
				
					<td><%=list.get(i).getSname() %></td>
					<td><%=list.get(i).getPrice() %></td>
					<td><%=list.get(i).getSize()%></td>
					<td><%=list.get(i).getColor() %></td>
					<td><%=list.get(i).getOcount() %></td>
					
					<td><%if(list.get(i).getOrdercheck().equals("0")){%><a>배송전</a><%}

					else {%><a>배송완료</a><%}%>
					</td>

				</tr>
				
				<%}%>

			</table>

		</div>

	</div>
	
</div>
     
      
     
    <!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
    <script src="/resources/bootstrap/js/bootstrap.min.js"></script>
        
     
</body>
</html>
