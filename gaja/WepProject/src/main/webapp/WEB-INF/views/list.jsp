<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "gaja.project.domain.*" %>
 <%@page import="java.util.List"%>

    <% 
    List<ShopVO> shoplist = (List<ShopVO>)request.getAttribute("shoplist"); //상품리스트 가져오기 
    String result = (String)request.getAttribute("result"); //메세지값 가져오기    
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
    
    <!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>    
    
    <script>
  
    var result = "<%=result%>"
    if(result=="null"|| result==null){ } else {alert(result);}
    
    </script>
</head>


<body style="padding-top:60px; background-color:#2c3338;">

<script>  

function search(){
	var keyword = $("#keyword").val();
	var cate = "<%=shoplist.get(0).getCate()%>";
	location.href= "search?cate="+cate+"&keyword="+keyword;

}

</script>

<jsp:include page= "include/navi.jsp"/>
     
 	<div class="container-fluid">
 	
    <div class="row">
		<%if(shoplist.get(0).getCate().equals("top")) {%> <p align="center" style="text-align: center;">
	 <font color="white" size="4px">TOP LIST</font>
	 </p>
	<%} else if(shoplist.get(0).getCate().equals("pants")) { %> 
	
	 <p align="center" style="text-align: center;">
	 <font color="white" size="4px">BOTTOM LIST</font>
	 </p>
	<%} else if(shoplist.get(0).getCate().equals("shoes")) { %> 
	
	 <p align="center" style="text-align: center;">
	 <font color="white" size="4px">SHOES LIST</font>
	 </p>
	<%} else if(shoplist.get(0).getCate().equals("atc")) { %> 
	
	 <p align="center" style="text-align: center;">
	 <font color="white" size="4px">ETC  LIST</font>
	 </p>
	<%} else{ %> 
	
	 <p align="center" style="text-align: center;">
	 <font color="white" size="4px">ALL list</font>
	 </p>
	
	<%} %>
	
	 <br>
	 <br>
<!-- 여기서부터 옷 시작 -->

		<div class= "col-md-12">

		<%if(shoplist.size()>0) { 
	
			for(int i=0; i<shoplist.size(); i++)
			{%>
	
			<div class="col-md-3" style="height:400px;cursor: pointer;" onclick="location.href='detail?snum=<%=shoplist.get(i).getSnum()%>';">
	
				<p align="center" style="text-align: center;">
				<img src ="<%=shoplist.get(i).getMainimage()%>" height ="300" width="300">
				</p>

				<p align="center" style="text-align: center;">
	 			<font color="white"><%=shoplist.get(i).getSname() %></font>
		 		</p>
	 
				<p align="center" style="text-align: center;">
	 			<font color="white"><%=shoplist.get(i).getPrice() %>원</font>
	 			</p>
	
	 			<p align="center" style="text-align: center;">
	 			<font color="white"><%=shoplist.get(i).getScontent()%></font>
	 			</p>
	
			</div>

			<%}	
		}%>

		</div>


   
	</div>
</div>      
    <!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
    <script src="/resources/bootstrap/js/bootstrap.min.js"></script>
         
</body>
</html>
