<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "gaja.project.domain.*" %>
 <%@page import="java.util.List"%>
  
    <%  
      
    ShopVO shopdetail = (ShopVO)request.getAttribute("productdetail"); //상품리스트 가져오기
   
    String id = (String)session.getAttribute("id");
    
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

if(mess=="null"|| mess==null){
	
	
	
} else {
	
	alert(mess);
	
}



</script>
    
    
  </head>


<body style="padding-top:60px; background-color:#2c3338;">

<script>

function cart() {
	document.frm1.action="cart";
	ocument.frm1.submit();		
	}



function shopdelete() {
	
	location.href="shopdelete?snum=<%=shopdetail.getSnum()%>";
		
}

</script>

<jsp:include page= "include/navi.jsp"/> <!-- 상단바 -->


 <div class="container-fluid">
    
    <div class="row">  <!-- 상품 페이지 -->
  
		<form name="frm1" method="post" action="oneorder">
			<div class= "col-md-12" style="text-align:center;">

				<br><br>


				<div class= "col-md-1" style="text-align:center;">
				<br><br><br>	
				</div>

				
				<div class= "col-md-10"  style="text-align:center;">

				<P><font size="5%" color="white"><%=shopdetail.getSname() %></font> </P>
				<br><br>
				<P><font size="4%" color="white">판매가 : <%=shopdetail.getPrice() %>원</font> </P>



<% 
String[] color = shopdetail.getColor().split(",");
String[] size = shopdetail.getSize().split(","); //콤마 기준으로 스플릿
%>

<br>

					<table  style="wdith:60%;margin-left: auto; margin-right: auto;text-align:center;border: 1px solid #BDBDBD;">
						<tbody>
						<tr>

							<td height="30px">색상 </td>
							
							<td width="80%">
							
							<select style="width:60%" name="color"> 
							<%for(int i =0; i<color.length;i++) { %>
							<option value="<%=color[i]%>"><%=color[i]%></option><%}%>
							</select>

							</td>
							
						</tr>


						<tr>
						
							<td height="30px">사이즈 </td>
							<td>
							<select  style="width:60%" name="size">
							<%for(int i =0; i<size.length;i++) { %>
							<option value="<%=size[i]%>"><%=size[i]%></option><%}%>
							</select>
							</td>
							
						</tr>


						<tr>
							<td height="30px">구매수량</td>
							<td>
							<input type="text" value ="1" style="width:18%" name="ocount"> &nbsp; 
							(잔여수량 : <%=shopdetail.getAmount()%>개)
							</td>
						</tr>
					</tbody>	
					</table>
					
<br><br><br><br><br>

					<div class="form--search" style="text-align:center;width:50%;">

					<%if(id.equals("admin")){%>
					<input type="submit" value="삭제하기" style="width:40%;" onclick="shopdelete(); return false" />&nbsp; &nbsp;
  					<input type="submit" value="수정하기" style="width:40%" onclick="location.href='update?snum=<%=shopdetail.getSnum()%>'; return false" />
	
	
					<%} else{%>
 					<input type="submit" value="주문하기" style="width:40%;"/>&nbsp; &nbsp;
 	 				<input type="submit" value="장바구니" style="width:40%" onclick="cart(); return false"/>
 	 				<%}%>
 	 				
 					</div>
 					
<br><br><br><br><br><br><hr>

				</div>

					<div class= "col-md-1" style="text-align:center;"><br><br><br></div>
					<br><br><br>
					
					<div class= "col-md-12 " style="text-align:center;">
						<img src ="<%=shopdetail.getMainimage()%>" width="80%">; <!-- 메인이미지 넣을곳 -->
						<img src ="<%=shopdetail.getSubimage()%>" width="80%">; <!-- 서브이미지 넣을곳 -->
					</div>
	
<br><br><br><br><br><br><br><br>
	
				</div>

<input type ="hidden" name ="sname" value="<%=shopdetail.getSname() %>">
<input type ="hidden" name ="price" value="<%=shopdetail.getPrice() %>">
<input type ="hidden" name ="mainimage" value="<%=shopdetail.getMainimage() %>">
<input type ="hidden" name ="snum" value="<%=shopdetail.getSnum()%>">

		</form>


     
	</div>
</div>
     
      
     
        <!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
    <script src="/resources/bootstrap/js/bootstrap.min.js"></script>
        
</body>
</html>
