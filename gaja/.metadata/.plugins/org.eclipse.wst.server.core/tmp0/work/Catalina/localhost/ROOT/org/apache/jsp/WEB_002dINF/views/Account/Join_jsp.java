/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.6
 * Generated at: 2019-08-09 04:56:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.Account;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/FORTUNE/Desktop/gaja/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/WepProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1523436183202L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head> \r\n");
      out.write("   <meta charset=\"UTF-8\">\r\n");
      out.write("   <title> GAJA.shoppingmall </title>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" sype=\"text/css\" href = \"/resources/css/join.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body class=\"align\">\r\n");
      out.write("\r\n");
      out.write("  <div class=\"site__container\">\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"grid__container\">\r\n");
      out.write("\t\r\n");
      out.write("\t<form action=\"join\" method=\"post\" class=\"form form--login\" onsubmit=\"return joincheck();\">\r\n");
      out.write("\r\n");
      out.write("<div style=\"text-align: center;\"><span style=\"color: rgb(238, 130, 238);\"><strong><span style=\"font-size: 24px;\">JOIN US </span></strong></span></div>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form__field\">\r\n");
      out.write("          <label class=\"fontawesome-user\" for=\"login__username\"><span class=\"hidden\">이름</span></label>\r\n");
      out.write("          <input id=\"uname\" type=\"text\" class=\"form__input\" name=\"name\" placeholder=\"Username\" required>\r\n");
      out.write("        </div>\r\n");
      out.write(" \t\t<div class=\"form__field\">\r\n");
      out.write("          <label class=\"fontawesome-user\" for=\"login__username\"><span class=\"hidden\">아이디</span></label>\r\n");
      out.write("          <input id=\"uid\" type=\"text\" class=\"form__input\" placeholder=\"id\" name=\"id\" onchange=\"idchange();\" required>\r\n");
      out.write("           <input type =\"button\" value=\"중복확인\"  onclick=\"idcheck(); return false;\">\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"form__field\">\r\n");
      out.write("          <label class=\"fontawesome-lock\" for=\"login__password\"><span class=\"hidden\">비밀번호</span></label>\r\n");
      out.write("          <input id=\"upw\" type=\"password\" class=\"form__input\" name=\"pw\" onkeyup = \"pwcheck()\" placeholder=\"password\" required>  \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("  \t\t<div class=\"form__field\">\r\n");
      out.write("          <label class=\"fontawesome-lock\" for=\"login__password\"><span class=\"hidden\">비밀번호확인</span></label>\r\n");
      out.write("          <input id=\"upw2\" type=\"password\" class=\"form__input\" placeholder=\"passwordcheck\" onkeyup = \"pwcheck()\" required>   \r\n");
      out.write("        </div>\r\n");
      out.write(" \r\n");
      out.write(" <p align=\"center\" style=\"text-align: center;\"><input type =\"text\" id = \"pwname\" value = \"\" style=\"width:100%;border:0px solid white; background-color:transparent;\" placeholder=\"비밀번호를 동일하게 입력하세요\" disabled></input></p>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("  \t\t<div class=\"form__field\">\r\n");
      out.write("          <label class=\"fontawesome-user\" for=\"login__username\"><span class=\"hidden\">핸드폰번호</span></label>\r\n");
      out.write("          <input id=\"uphone\" type=\"text\" class=\"form__input\" name=\"phone\" placeholder=\"phone-number\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \t\t<div class=\"form__field\">\r\n");
      out.write("          <label class=\"fontawesome-user\" for=\"login__username\"><span class=\"hidden\">주소</span></label>\r\n");
      out.write("          <input id=\"uaddress\" type=\"text\" class=\"form__input \" name=\"address\" placeholder=\"address\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"form__field\">\r\n");
      out.write("          <input type=\"submit\" value=\"Join\"> &nbsp;\r\n");
      out.write("          <input type=\"submit\" value=\"Cencel\" onclick=\"location.href='login'; return false;\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>  \r\n");
      out.write("var idok = \"false\";\r\n");
      out.write("var passwordcheck = \"false\";\r\n");
      out.write("\r\n");
      out.write("function idcheck() {\r\n");
      out.write("\t\r\n");
      out.write("\tvar id = $(\"#uid\").val();\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tif(id==\"\" || null){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\talert(\"빈칸은 허용하지않습니다.\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t$.ajax({\t\r\n");
      out.write("\t\turl : \"idchecked\",\r\n");
      out.write("\t\tdata : {id : id },\t\r\n");
      out.write("\t\tdatatype : \"text\",\r\n");
      out.write("\t\tsuccess : function(data){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar result = data;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(result == null || result == \"\"){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t    alert(\"중복되는 아이디가 없습니다.\");\r\n");
      out.write("\t\t\t    idok = \"ok\";\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t} \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\telse {alert(\"아이디가 중복됩니다.\"); $(\"#uid\").val(\"\"); idok = \"false\"; }\r\n");
      out.write("\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\r\n");
      out.write("\t\terror: function(xhr , status){\r\n");
      out.write("\t\t\talert(xhr + \" : \" + status)\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function idchange(){\r\n");
      out.write("\t\r\n");
      out.write("\tidok=\"false\";\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function joincheck(){  //id 및 비밀번호 확인후 회원가입 처리페이지로 이동\r\n");
      out.write("\t  \t \r\n");
      out.write("\tif(idok == \"false\"){\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  alert(\"ID체크를 하세요\");\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  return false;\r\n");
      out.write("\t } \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\tif(passwordcheck == \"false\"){\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  alert(\"비밀번호 체크를 하세요\");\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  return false;\r\n");
      out.write("\t } \r\n");
      out.write("\t  \r\n");
      out.write("\t  return true;\t  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function pwcheck(){  //비밀번호 재입력 확인 메소드\r\n");
      out.write("\t  \t  \r\n");
      out.write("\t  var pw1 = \"\";\r\n");
      out.write("\t  var pw2 = \"\";\r\n");
      out.write("\t  \r\n");
      out.write("\t  pw1 = $(\"#upw\").val();\t  \r\n");
      out.write("\t  pw2 = $(\"#upw2\").val();\r\n");
      out.write("\r\n");
      out.write("\t  if(pw1 == pw2 &&  pw1 != \"\"){\r\n");
      out.write("   $(\"#pwname\").val(\"비밀번호가 일치합니다\").css(\"color\",\"blue\");\t  \r\n");
      out.write("\t\t  passwordcheck= \"true\";\r\n");
      out.write("  \t\t  } \r\n");
      out.write("\t  \r\n");
      out.write("\t  else  \r\n");
      out.write("\t  {  $(\"#pwname\").val(\"비밀번호가 불일치합니다\").css(\"color\",\"red\");\r\n");
      out.write("\t  passwordcheck= \"false\";\r\n");
      out.write("\t  }    \t  \r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
