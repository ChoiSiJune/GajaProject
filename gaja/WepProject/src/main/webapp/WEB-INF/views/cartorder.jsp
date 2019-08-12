<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "gaja.project.domain.*" %>
 <%@page import="java.util.List"%>

    <%
      
    List<CartVO> list = (List<CartVO>)request.getAttribute("orderlist"); //상품리스트 가져오기
    MemberVO member = (MemberVO)request.getAttribute("orderinfo"); //상품리스트 가져오기
   

    int allprice = 0;

    String mess = (String)request.getAttribute("mess");  //알림 메세지

    //Integer.parseInt(order.getPrice()) * //Integer.parseInt(order.getOcount())
    
     
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
 
 <jsp:include page= "include/navi.jsp"/>

<body style="padding-top:60px; background-color:#2c3338;">

 <div class="container-fluid">
    <div class="row">  <!-- 상품 페이지 -->
   
  
<!-- 여기서부터 옷 시작 -->

<div class= "col-md-12" style="text-align:center;">



<div style="text-align: center;">&nbsp;</div>
<!-- 이미지 -->


    <form method="post" action="cartorder">
<div style="text-align:center;">
<span style="font-size: 20px;"><span style="font-family: arial,helvetica,sans-serif;float:left;"><strong>&nbsp;상품 목록</strong></span></span>



<br>
<br>

<hr>
  
<br>
<br>

<table class="table table-hover" border="3" style="width:100%;margin-left: auto; margin-right: auto;text-align:center;">

<tr>

<td width="10%" colspan="2">

</td>



<td width="70%">

<font size="2px">상품</font>
</td>

<td>

<font size="2px">수량</font>
</td>

<td>
<font size="2px">단가</font>
</td>

<td>
<font size="2px">합계</font>
</td>


</tr>



<%for(int i =0; i<list.size();i++){

	CartVO vo = list.get(i);

%>

<tr> <!-- 상품에 대한 정보 -->

<td width="10%" colspan="2"  >
<img src="<%=vo.getMainimage()%>" style="width:100%">

</td>


<td width="70%">
<br>
 <font size="3px"><%=vo.getSname()%></font>
  <br>
<font size="3px"><%=vo.getColor() %></font>
<br>
<font size="3px"><%=vo.getSize() %></font>


</td>

<td>
<br>
<br>
<br>

<%=vo.getOcount()%>
</td>

<td>
<br>
<br>
<br>

<%=vo.getPrice() %>
</td>

<td>
<br>
<br>
<br>

<%=Integer.parseInt(vo.getPrice()) * Integer.parseInt(vo.getOcount())%>
</td>


</tr>

<%   
allprice += Integer.parseInt(vo.getPrice()) * Integer.parseInt(vo.getOcount()); 
}%>

</table>
 
    
         

<br>
<br>
<br>
<br>
<br>

<span style="font-size: 20px;"><span style="font-family: arial,helvetica,sans-serif;float:left;"><strong>&nbsp;주문자 정보</strong></span></span>



<br>
<br>

<hr>
  
<br>
<br>

<table class="table table-hover" border="3" style="width:100%;margin-left: auto; margin-right: auto;text-align:center;">

<tr>

<th width="20%">
<font size="3px">이름</font>
</th>

<td>
<font size="3px"><%=member.getName() %></font>
</td>


</tr>

<tr>

<th>
<font size="3px">주소</font>
</th>



<td>

<input type="text" style="background-color:transparent;width:100%;text-align:center;border-style:none;﻿" value="<%=member.getAddress() %>">
</td>


</tr>

<tr>

<th>
<font size="3px">전화번호</font>
</th>

<td>
<font size="3px"><%=member.getPhone() %></font>
</td>


</tr>

<tr>

<th>
<font size="3px">배달메세지</font>
</th>

<td>
<input type="text" name="message" style="background-color:transparent;width:100%;text-align:center;border-style:none;﻿" value="-">
</td>


</tr>


</table>



<br>
<br>
<br>
<br>
<br>

<span style="font-size: 20px;"><span style="font-family: arial,helvetica,sans-serif;float:left;"><strong>&nbsp;결제 방식</strong></span></span>



<br>
<br>

<hr>
  
<br>
<br>


<table class="table table-hover" border="3" style="width:100%;margin-left: auto; margin-right: auto;text-align:center;">


<tr>
<th width="20%">
무통장 입금 
</th>
<td>
우리은행
</td>

</tr>



<tr>
<th>
계좌번호 
</th>
<td>
23124-2312-525
</td>

</tr>


</table>
<br>
<br>
<br>
<br>
<br>
<span style="font-size: 20px;"><span style="font-family: arial,helvetica,sans-serif;float:left;"><strong>&nbsp;금액 확인</strong></span></span>



<br>
<br>

<hr>
  
<br>
<br>
<table class="table table-hover" border="1" style="width:100%;margin-left: auto; margin-right: auto;text-align:center;">


<tr>
<th width="20%">
<font size = 5px>상품 총금액</font>
</th> 
<td>
<font size = "5px"><%=allprice%>원</font>
</td>

</tr>



</table>



</div>

<%for(int k=0;k<list.size();k++)  {

	CartVO vo = list.get(k);%>
	
	

 
     <input type="hidden" name="mnum" value=<%=member.getMnum()%>>
     <input type="hidden" name="snum" value=<%=vo.getSnum()%>>
     <input type="hidden" name="sname" value="<%=vo.getSname()%>">
     <input type="hidden" name="price" value="<%=vo.getPrice()%>">
     <input type="hidden" name="size" value="<%=vo.getSize()%>">
     <input type="hidden" name="color" value="<%=vo.getColor()%>">
     <input type="hidden" name="ocount" value="<%=vo.getOcount()%>">
     <input type="hidden" name="address" value="<%=member.getAddress()%>">
     <input type="hidden" name="phone" value="<%=member.getPhone()%>">
     
   <%} %>
   
   
   
   <%for(int m=1;m<list.size();m++)  { %>

	
	

 
     <input type="hidden" name="message" value="-">
   
   <%} %>
   <br>
   <br>
     
     <input id="btn_payment" type="image" alt="결제하기" src="http://img.echosting.cafe24.com/design/skin/default/order/btn_payment.gif">
    &nbsp;&nbsp;&nbsp;
     <input id="btn_payment" type="image" alt="비우기" onclick="location.href='cartdelete'; return false" src="/resources/file/delete.png">
 

 
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
