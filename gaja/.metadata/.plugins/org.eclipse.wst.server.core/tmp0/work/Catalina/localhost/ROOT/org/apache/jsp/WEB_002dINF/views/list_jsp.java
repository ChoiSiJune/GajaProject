/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.6
 * Generated at: 2019-08-09 00:55:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import gaja.project.domain.*;
import java.util.List;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("gaja.project.domain");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("    ");
 
    List<ShopVO> shoplist = (List<ShopVO>)request.getAttribute("shoplist"); //상품리스트 가져오기 
    String result = (String)request.getAttribute("result"); //메세지값 가져오기    
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write(" <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- 위 3개의 메타 태그는 *반드시* head 태그의 처음에 와야합니다; 어떤 다른 콘텐츠들은 반드시 이 태그들 *다음에* 와야 합니다 -->\r\n");
      out.write("    <title>클라우스</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- 부트스트랩 -->\r\n");
      out.write("    <link href=\"/resources/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- 메인css -->\r\n");
      out.write("    <link href=\"/resources/css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- IE8 에서 HTML5 요소와 미디어 쿼리를 위한 HTML5 shim 와 Respond.js -->\r\n");
      out.write("    <!-- WARNING: Respond.js 는 당신이 file:// 을 통해 페이지를 볼 때는 동작하지 않습니다. -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    \r\n");
      out.write("    <!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요합니다) -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>    \r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("  \r\n");
      out.write("    var result = \"");
      out.print(result);
      out.write("\"\r\n");
      out.write("    if(result==\"null\"|| result==null){ } else {alert(result);}\r\n");
      out.write("    \r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body style=\"padding-top:60px; background-color:#2c3338;\">\r\n");
      out.write("\r\n");
      out.write("<script>  \r\n");
      out.write("\r\n");
      out.write("function search(){\r\n");
      out.write("\tvar keyword = $(\"#keyword\").val();\r\n");
      out.write("\tvar cate = \"");
      out.print(shoplist.get(0).getCate());
      out.write("\";\r\n");
      out.write("\tlocation.href= \"search?cate=\"+cate+\"&keyword=\"+keyword;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/navi.jsp", out, false);
      out.write("\r\n");
      out.write("     \r\n");
      out.write(" \t<div class=\"container-fluid\">\r\n");
      out.write(" \t\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("\t\t");
if(shoplist.get(0).getCate().equals("top")) {
      out.write(" <p align=\"center\" style=\"text-align: center;\">\r\n");
      out.write("\t <font color=\"white\" size=\"4px\">TOP LIST</font>\r\n");
      out.write("\t </p>\r\n");
      out.write("\t");
} else if(shoplist.get(0).getCate().equals("pants")) { 
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("\t <p align=\"center\" style=\"text-align: center;\">\r\n");
      out.write("\t <font color=\"white\" size=\"4px\">BOTTOM LIST</font>\r\n");
      out.write("\t </p>\r\n");
      out.write("\t");
} else if(shoplist.get(0).getCate().equals("shoes")) { 
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("\t <p align=\"center\" style=\"text-align: center;\">\r\n");
      out.write("\t <font color=\"white\" size=\"4px\">SHOES LIST</font>\r\n");
      out.write("\t </p>\r\n");
      out.write("\t");
} else if(shoplist.get(0).getCate().equals("atc")) { 
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("\t <p align=\"center\" style=\"text-align: center;\">\r\n");
      out.write("\t <font color=\"white\" size=\"4px\">ETC  LIST</font>\r\n");
      out.write("\t </p>\r\n");
      out.write("\t");
} else{ 
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("\t <p align=\"center\" style=\"text-align: center;\">\r\n");
      out.write("\t <font color=\"white\" size=\"4px\">ALL list</font>\r\n");
      out.write("\t </p>\r\n");
      out.write("\t\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t <br>\r\n");
      out.write("\t <br>\r\n");
      out.write("<!-- 여기서부터 옷 시작 -->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class= \"col-md-12\">\r\n");
      out.write("\r\n");
      out.write("\t\t");
if(shoplist.size()>0) { 
	
			for(int i=0; i<shoplist.size(); i++)
			{
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<div class=\"col-md-3\" style=\"height:400px;cursor: pointer;\" onclick=\"location.href='detail?snum=");
      out.print(shoplist.get(i).getSnum());
      out.write("';\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t<p align=\"center\" style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t<img src =\"");
      out.print(shoplist.get(i).getMainimage());
      out.write("\" height =\"300\" width=\"300\">\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<p align=\"center\" style=\"text-align: center;\">\r\n");
      out.write("\t \t\t\t<font color=\"white\">");
      out.print(shoplist.get(i).getSname() );
      out.write("</font>\r\n");
      out.write("\t\t \t\t</p>\r\n");
      out.write("\t \r\n");
      out.write("\t\t\t\t<p align=\"center\" style=\"text-align: center;\">\r\n");
      out.write("\t \t\t\t<font color=\"white\">");
      out.print(shoplist.get(i).getPrice() );
      out.write("원</font>\r\n");
      out.write("\t \t\t\t</p>\r\n");
      out.write("\t\r\n");
      out.write("\t \t\t\t<p align=\"center\" style=\"text-align: center;\">\r\n");
      out.write("\t \t\t\t<font color=\"white\">");
      out.print(shoplist.get(i).getScontent());
      out.write("</font>\r\n");
      out.write("\t \t\t\t</p>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
}	
		}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("\t</div>\r\n");
      out.write("</div>      \r\n");
      out.write("    <!-- 모든 컴파일된 플러그인을 포함합니다 (아래), 원하지 않는다면 필요한 각각의 파일을 포함하세요 -->\r\n");
      out.write("    <script src=\"/resources/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("         \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
