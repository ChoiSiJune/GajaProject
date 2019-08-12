<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>GAJA.shoppingmall</title>
    <link rel="stylesheet" href="/resources/css/add_product.css">
    <link href="https://netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
</head>
<body style="background-color:#EAEAEA;">


<div class="container" >  
      <div class="panel panel-default">
        <div class="panel-heading div--center" style="background-color:#2c3338;">
         <a href="main"><img src="https://image-logo.alba.kr/data_image2/jobimg/201806/2018060619472176849_0.png" alt="Title Image"></a>
        </div>
        <div class="panel-body" style="background-color:#EAEAEA">
          <form class="form-horizontal" enctype="multipart/form-data" method="post" action="upload">
            <fieldset>
               <!-- File Button -->
              <div class="form-group">
                <label class="col-md-4 control-label" for="filebutton">메인 제품 이미지</label>
                <div class="col-md-4">
                  <div id="image-preview-div" class="div--center" style="display:none;">
                    <img id="preview-img" class="preview--image" src="noimage">
                  </div>
                  <input id="main-image" name="mainimage2" class="input-file" type="file" required>
                </div>
              </div>
              <!-- File Button -->
              <div class="form-group">
                <label class="col-md-4 control-label" for="filebutton">상세 페이지 이미지</label>
                <div class="col-md-4">
                <input id="detail-image" name="subimage2" class="input-file" type="file" required>
                </div>
              </div>

              <div class="form-group">
                <label class="col-md-4 control-label" for="product_categorie">상품 카테고리</label>
                <div class="col-md-4">
                <select id="product_categorie" name="cate" class="form-control">
                  <option value="top">상의</option>
                  <option value="bottom">하의</option>
                  <option value="shoes">신발</option>
                  <option value="etc">기타</option>
                </select>
                </div>
              </div>

              <div class="form-group">
                <label class="col-md-4 control-label" for="product_name">상품 이름</label>
                <div class="col-md-4">
                <input id="product_name" name="sname" placeholder="상품 이름" class="form-control input-md" required="" type="text">
                </div>
              </div>

              <div class="form-group">
                <label class="col-md-4 control-label" for="product_price">판매가</label>
                <div class="col-md-4">
                <input id="product_price" name="price" placeholder="ex) 35000" class="form-control input-md" required="" type="text">
                </div>
              </div>

              <div class="form-group">
                <label class="col-md-4 control-label" for="product_color">색깔</label>
                <div class="col-md-4">
                <div class="col-md-7">
           
                <input type = "text" class="form-control" id="color"  value="">
                </div>
               
                     <div class="col-md-5">
           
                <input type = "button" class="form-control" onclick = "coloradd(); return false" value="색상 추가">
                </div>
                <div class="col-md-12">
                    <input type = "text" class="form-control" id="color2" name="color"   value="" readonly>
                </div>
                </div>
              </div>

              <div class="form-group">
                <label class="col-md-4 control-label" for="product_size">사이즈</label>
                <div class="col-md-4">
                
                <div class="col-md-7">
           
                <input type = "text" class="form-control" id="size"   value="">
                </div>
               
                     <div class="col-md-5">
           
                <input type = "button" class="form-control" onclick="sizeadd(); return false"   value="사이즈 추가">
                </div>
                
                <div class="col-md-12">
                <input type = "text" class="form-control" id="size2" name="size"  value="" readonly>
               </div>
                
                             
                </div>
              </div>

              <div class="form-group">
                <label class="col-md-4 control-label" for="available_quantity">수량</label>
                <div class="col-md-4">
                <input id="available_quantity" name="amount" placeholder="수량" class="form-control input-md" required="" type="text">
                </div>
              </div>

              <div class="form-group">
                <label class="col-md-4 control-label" for="product_description">상세설명</label>
                <div class="col-md-4">
                <textarea class="form-control" id="product_description" name="scontent"></textarea>
                </div>
              </div>

              <div class="form-group div--center">
                <button id="singlebutton" type="submit" class="btn-default btn-lg btn--size" value="Submit Button">등록</button>
                <button type="button" class="btn-default btn-lg btn--size" value="Cancel Button" onClick="history.go(-1)"> 취소 </button>
              </div>
            </fieldset>
          </form>
        </div>
      </div>
    </div>

    <script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="https://netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <script src="/resources/js/upload-image.js"></script>

<script>

function sizeadd(){
	
	var size= $("#size2").val();

	

    size += $("#size").val()+",";
    

    
    $("#size2").val(size);
    
    $("#size").val("");
    
   	
}

function coloradd(){
	
	var size= $("#color2").val();
    size += $("#color").val()+",";   
     
    $("#color2").val(size);   
    $("#color").val("");
    	
}


function colordelet(){
	
	
	
	
	
}





</script>


</body>
</html>