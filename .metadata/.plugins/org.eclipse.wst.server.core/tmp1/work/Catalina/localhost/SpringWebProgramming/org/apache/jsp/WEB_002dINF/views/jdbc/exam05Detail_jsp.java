/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.43
 * Generated at: 2017-06-01 07:02:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.jdbc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class exam05Detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/Users/Administrator/Documents/GitHub/TestRepository/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/SpringWebProgramming/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1495423233587L));
    _jspx_dependants.put("jar:file:/C:/Users/Administrator/Documents/GitHub/TestRepository/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/SpringWebProgramming/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, user-scalable=no\">\r\n");
      out.write("<title>JSP Page</title>\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.print(application.getContextPath());
      out.write("/resources/bootstrap-3.3.7/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.print(application.getContextPath());
      out.write("/resources/jquery/jquery-3.2.1.min.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.print(application.getContextPath());
      out.write("/resources/bootstrap-3.3.7/js/bootstrap.min.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction handleBtnUpdate() {\r\n");
      out.write("\t\tvar bpassword = $(\"#bpassword\").val();\r\n");
      out.write("\t\tif (bpassword == \"\") {\r\n");
      out.write("\t\t\t$(\"#bpassword\").attr(\"placeholder\", \"비밀번호를 입력하셔야 합니다.\");\r\n");
      out.write("\t\t\t$(\"#bpassword\").css(\"border-color\", \"red\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : \"exam05CheckBpassword\",\r\n");
      out.write("\t\t\tmethod : \"post\",\r\n");
      out.write("\t\t\t//data:\"bno=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&bpassword=\"+bpassword\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\"bno\" : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\",\r\n");
      out.write("\t\t\t\t\"bpassword\" : bpassword\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\tif (data.result == \"success\") {\r\n");
      out.write("\t\t\t\t\tconsole.log(\"success\");\r\n");
      out.write("\t\t\t\t\tlocation.href = \"exam05Update?bno=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$(\"#bpassword\").val(\"\");\r\n");
      out.write("\t\t\t\t\t$(\"#bpassword\").attr(\"placeholder\", \"비밀번호가 다릅니다.\");\r\n");
      out.write("\t\t\t\t\t$(\"#bpassword\").css(\"border-color\", \"red\");\r\n");
      out.write("\t\t\t\t\tconsole.log(\"fail\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction handleBtnDelete() {\r\n");
      out.write("\t\tconsole.log(\"handleBtnDelete()\");\r\n");
      out.write("\t\tvar bpassword = $(\"#bpassword\").val();\r\n");
      out.write("\t\tif (bpassword == \"\") {\r\n");
      out.write("\t\t\t$(\"#bpassword\").attr(\"placeholder\", \"비밀번호를 입력하셔야 합니다.\");\r\n");
      out.write("\t\t\t$(\"#bpassword\").css(\"border-color\", \"red\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : \"exam05CheckBpassword\",\r\n");
      out.write("\t\t\tmethod : \"post\",\r\n");
      out.write("\t\t\tdata:\"bno=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&bpassword=\"+bpassword,\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\tif (data.result == \"success\") {\r\n");
      out.write("\t\t\t\t\tconsole.log(\"success\");\r\n");
      out.write("\t\t\t\t\tlocation.href = \"exam05Delete?bno=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$(\"#bpassword\").val(\"\");\r\n");
      out.write("\t\t\t\t\t$(\"#bpassword\").attr(\"placeholder\", \"비밀번호가 다릅니다.\");\r\n");
      out.write("\t\t\t\t\t$(\"#bpassword\").css(\"border-color\", \"red\");\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<h4>게시물 상세 보기</h4>\r\n");
      out.write("\t<form method=\"post\" style=\"padding: 0px 20px\"\r\n");
      out.write("\t\tenctype=\"multipart/form-data\">\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t<span class=\"input-group-addon\"> <span\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-user\"></span>\r\n");
      out.write("\t\t\t\t</span> <input type=\"text\" class=\"form-control\" placeholder=\"번호\" name=\"bno\"\r\n");
      out.write("\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" disabled />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t<span class=\"input-group-addon\"> <span\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-user\"></span>\r\n");
      out.write("\t\t\t\t</span> <input type=\"text\" class=\"form-control\" placeholder=\"제목\"\r\n");
      out.write("\t\t\t\t\tname=\"btitle\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.btitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" disabled />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t<span class=\"input-group-addon\"> <span\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-tag\"></span>\r\n");
      out.write("\t\t\t\t</span> <input type=\"text\" class=\"form-control\" placeholder=\"글쓴이\"\r\n");
      out.write("\t\t\t\t\tname=\"bwriter\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.bwriter}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" disabled />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t<span class=\"input-group-addon\"> <span\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-lock\"></span>\r\n");
      out.write("\t\t\t\t</span> <input type=\"date\" class=\"form-control\" placeholder=\"작성 일시\"\r\n");
      out.write("\t\t\t\t\tname=\"bdate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.bdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" disabled />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t<span class=\"input-group-addon\"> <span\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-lock\"></span>\r\n");
      out.write("\t\t\t\t</span> <input type=\"number\" class=\"form-control\" placeholder=\"조회수\"\r\n");
      out.write("\t\t\t\t\tname=\"bhitcount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.bhitcount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" disabled />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t<span class=\"input-group-addon\"> <span\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-lock\"></span>\r\n");
      out.write("\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t<textarea class=\"form-control\" rows=\"5\" cols=\"30\" placeholder=\"내용\"\r\n");
      out.write("\t\t\t\t\tname=\"bcontent\" disabled>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.bcontent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t<span class=\"input-group-addon\"> <span\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-camera\"></span>\r\n");
      out.write("\t\t\t\t</span> <a class=\"form-control\" href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${board.boriginalfilename}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t<span class=\"input-group-addon\"> <span\r\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-lock\"></span>\r\n");
      out.write("\t\t\t\t</span> <input id=\"bpassword\" type=\"password\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"비밀번호\" name=\"bpassword\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<a href=\"exam05\" class=\"btn btn-success\">목록</a> <input\r\n");
      out.write("\t\t\tonclick=\"handleBtnUpdate()\" type=\"button\" class=\"btn btn-warning\"\r\n");
      out.write("\t\t\tvalue=\"수정\" /> <input onclick=\"handleBtnDelete()\" type=\"button\"\r\n");
      out.write("\t\t\tclass=\"btn btn-danger\" value=\"삭제\" />\r\n");
      out.write("\t\t<!--  \r\n");
      out.write("            <button>버튼</button>                  //submit 기능\r\n");
      out.write("            <input type=\"button\"value=\"버튼\"/>\r\n");
      out.write("            <input type=\"submit\"value=\"버튼\"/>     //submit 기능\r\n");
      out.write("            <input type=\"cancel\"value=\"버튼\"/>\r\n");
      out.write("            \r\n");
      out.write("            <input type=\"image\" src=\"버튼.ong\"/>    //submit 기능\r\n");
      out.write("       \t\t<img src=\"버튼.png/>\r\n");
      out.write("       \t\t -->\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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