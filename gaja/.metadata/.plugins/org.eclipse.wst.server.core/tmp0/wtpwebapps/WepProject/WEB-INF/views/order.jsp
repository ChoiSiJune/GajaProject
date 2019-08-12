<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "gaja.project.domain.*" %>
 <%@page import="java.util.List"%>

    <%   
    SelectVO order = (SelectVO)request.getAttribute("order"); //상품리스트 가져오기
    MemberVO member = (MemberVO)request.getAttribute("orderinfo"); //상품리스트 가져오기
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
    

    
    
  </head>


<body style="padding-top:60px; background-color:#2c3338;">

<jsp:include page= "include/navi.jsp"/>

	<div class="container-fluid">
 		
 		<div class="row"> 
			
			<div class= "col-md-12" style="text-align:center;">
			
    			<form method="post" action="order">
					<div style="text-align:center;">
					<span style="font-size: 20px;"><span style="font-family: arial,helvetica,sans-serif;float:left;">
					<strong>&nbsp;상품 정보</strong></span></span>


<br><br><hr> <br><br>

  
					<table class="table table-hover" border="1" style="width:100%;margin-left: auto; margin-right: auto;text-align:center;">

					<tr>
					<td width="10%" colspan="2"></td>
					<td width="70%"><font size="2px">상품</font></td>
					<td><font size="2px">수량</font></td>
					<td><font size="2px">단가</font></td>
					<td><font size="2px">합계</font></td>
					</tr>



					<tr> 
					
					<td width="10%" colspan="2"  >
					<img src="/resources/file/<%=order.getMainimage()%>" style="width:100%">
					</td>


					<td width="70%"><br>
 					<font size="3px"><%=order.getSname()%></font><br>
					<font size="3px"><%=order.getColor() %></font><br>
					<font size="3px"><%=order.getSize() %></font>
					</td>

				<td><br><br><br><%=order.getOcount()%></td>
				<td><br><br><br><%=order.getPrice() %></td>
				<td><br><br><br><%=Integer.parseInt(order.getPrice()) * Integer.parseInt(order.getOcount())%></td>


					</tr>

				</table>
 
				<br><br><br><br><br>

				<span style="font-size: 20px;"><span style="font-family: arial,helvetica,sans-serif;float:left;">
				<strong>&nbsp;주문자 정보</strong></span></span>

<br><br><hr><br><br>


				<table class="table table-hover" border="1" style="width:100%;margin-left: auto; margin-right: auto;text-align:center;">

					<tr>

						<th width="20%"><font size="3px">이름</font></th>
						<td><font size="3px"><%=member.getName() %></font></td>
					
			  	 </tr>

					<tr>
				
						<th><font size="3px">주소</font></th>
						<td><input type="text" style="background-color:transparent;width:100%;text-align:center;
						border-style:none;﻿" value="<%=member.getAddress() %>"></td>
				
					</tr>

					<tr>

						<th><font size="3px">전화번호</font></th>
						<td><font size="3px"><%=member.getPhone() %></font></td>
					
					</tr>
				
					<tr>
						<th><font size="3px">배달메세지</font></th>
						<td><input type="text" name="message" style="background-color:transparent;width:100%;text-align:center;border-style:none;﻿" value="-"></td>
					</tr>


				</table>

<br><br><br><br><br>

				<span style="font-size: 20px;"><span style="font-family: arial,helvetica,sans-serif;float:left;"><strong>&nbsp;결제 방식</strong></span></span>

<br><br><hr> <br><br>


				<table class="table table-hover" border="1" style="width:100%;margin-left: auto; margin-right: auto;text-align:center;">
					<tr>
						<th width="20%">무통장 입금 </th>
						<td>우리은행</td>	
					</tr>


					<tr>
						<th>계좌번호 </th>
						<td>23124-2312-525</td>

					</tr>
				</table>
				
<br><br><br><br><br>

				<span style="font-size: 20px;"><span style="font-family: arial,helvetica,sans-serif;float:left;"><strong>&nbsp;금액</strong></span></span>



<br><br><hr><br><br>

					<table class="table table-hover" border="1" style="width:100%;margin-left: auto; margin-right: auto;text-align:center;">
						<tr>
							<th width="20%">상품 총금액</th>
							<td><%=Integer.parseInt(order.getPrice()) * Integer.parseInt(order.getOcount())%>원</td>
						</tr>
					</table>



				</div>

 
    		<input type="hidden" name="mnum" value=<%=member.getMnum()%>>
     		<input type="hidden" name="snum" value=<%=order.getSnum()%>>
     		<input type="hidden" name="sname" value="<%=order.getSname()%>">
     		<input type="hidden" name="price" value="<%=order.getPrice()%>">
     		<input type="hidden" name="size" value="<%=order.getSize()%>">
     		<input type="hidden" name="color" value="<%=order.getColor()%>">
     		<input type="hidden" name="ocount" value="<%=order.getOcount()%>">
     		<input type="hidden" name="address" value="<%=member.getAddress()%>">
     		<input type="hidden" name="phone" value="<%=member.getPhone()%>">
   
     		<input id="btn_payment" type="image" alt="결제하기" src="http://img.echosting.cafe24.com/design/skin/default/order/btn_payment.gif">
 
     		</form>

		</div>

	</div>
         
   
 </div>
     
    
        <!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->
    <script src="/resources/bootstrap/js/bootstrap.min.js"></script>
        
</body>

</html>
