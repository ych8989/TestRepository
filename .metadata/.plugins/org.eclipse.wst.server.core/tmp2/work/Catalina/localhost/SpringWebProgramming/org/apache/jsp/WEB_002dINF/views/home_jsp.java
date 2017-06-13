/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.43
 * Generated at: 2017-06-13 05:25:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, user-scalable=no\">\r\n");
      out.write("<title>Home</title>\r\n");
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
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\tWebApplication Home\r\n");
      out.write("\t<hr />\r\n");
      out.write("\t<h4>HTML 태그</h4>\r\n");
      out.write("\t<a href=\"html/exam01\" class=\"btn btn-warning\">exam01</a>\r\n");
      out.write("\t<br />\r\n");
      out.write("\r\n");
      out.write("\t<h4>CSS</h4>\r\n");
      out.write("\t<a href=\"css/exam01\" class=\"btn btn-success\">exam01</a>\r\n");
      out.write("\t<a href=\"css/exam02\" class=\"btn btn-success\">exam02</a>\r\n");
      out.write("\t<a href=\"css/exam03\" class=\"btn btn-success\">exam03</a>\r\n");
      out.write("\t<br />\r\n");
      out.write("\r\n");
      out.write("\t<h4>JavaScript</h4>\r\n");
      out.write("\t");

		for (int i = 1; i <= 11; i++) {
			String exam = "exam";
			if (i < 10) {
				exam += "0" + i;
			} else {
				exam += String.valueOf(i);
			}
	
      out.write("\r\n");
      out.write("\t<a href=\"javascript/");
      out.print(exam);
      out.write("\" class=\"btn btn-primary\">");
      out.print(exam);
      out.write("</a>\r\n");
      out.write("\t");

		}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<h4>JQuery</h4>\r\n");
      out.write("\t");

		for (int i = 1; i <= 4; i++) {
			String exam = "exam0" + i;
	
      out.write("\r\n");
      out.write("\t<a href=\"jquery/");
      out.print(exam);
      out.write("\" class=\"btn btn-danger\">");
      out.print(exam);
      out.write("</a>\r\n");
      out.write("\t");

		}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<h4>Bootstrap</h4>\r\n");
      out.write("\t");

		for (int i = 1; i <= 3; i++) {
			String exam = "exam0" + i;
	
      out.write("\r\n");
      out.write("\t<a href=\"bootstrap/");
      out.print(exam);
      out.write("\" class=\"btn btn-info\">");
      out.print(exam);
      out.write("</a>\r\n");
      out.write("\t");

		}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<h4>JSP</h4>\r\n");
      out.write("\t");

		for (int i = 1; i <= 5; i++) {
			String exam = "exam0" + i;
	
      out.write("\r\n");
      out.write("\t<a href=\"jsp/");
      out.print(exam);
      out.write("\" class=\"btn btn-default\">");
      out.print(exam);
      out.write("</a>\r\n");
      out.write("\t");

		}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<h4>HTTP 요청 방식</h4>\r\n");
      out.write("\tGET 방식:\r\n");
      out.write("\t<a href=\"http/exam01\" class=\"btn btn-primary\">exam01</a> POST 방식:\r\n");
      out.write("\t<form method=\"post\" action=\"http/exam01\" style=\"display: inline\">\r\n");
      out.write("\t\t<input type=\"submit\" value=\"exam01\" class=\"btn btn-primary\" />\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\t<h4>요청 HTTP 정보 얻기</h4>\r\n");
      out.write("\t<a href=\"http/exam02?type=freeboard&bno=5&hobby=baseball&hobby=soccer\"\r\n");
      out.write("\t\tclass=\"btn btn-primary\">exam02</a>\r\n");
      out.write("\t<a href=\"http/exam03?type=freeboard&bno=5&hobby=baseball&hobby=soccer\"\r\n");
      out.write("\t\tclass=\"btn btn-primary\">exam03</a>\r\n");
      out.write("\r\n");
      out.write("\t<h4>폼 제출</h4>\r\n");
      out.write("\t<a href=\"form/exam01\" class=\"btn btn-info\">회원 가입 양식 요청</a>\r\n");
      out.write("\r\n");
      out.write("\t<h4>파일 업로드</h4>\r\n");
      out.write("\t<a href=\"form/exam02\" class=\"btn btn-info\">회원 가입 양식 요청</a>\r\n");
      out.write("\r\n");
      out.write("\t<h4>파일 다운로드</h4>\r\n");
      out.write("\t<a href=\"file/exam03\" class=\"btn btn-info\">파일로 저장</a>\r\n");
      out.write("\t<img src=\"file/exam03\" width=\"100px\" height=\"100px\" />\r\n");
      out.write("\r\n");
      out.write("\t<h4>의존성 주입</h4>\r\n");
      out.write("\t<a href=\"di/exam01\" class=\"btn btn-info\">회원 가입</a>\r\n");
      out.write("\t<a href=\"di/exam02\" class=\"btn btn-info\">로그인</a>\r\n");
      out.write("\r\n");
      out.write("\t<h4>리다이렉트(재요청)</h4>\r\n");
      out.write("\t<a href=\"redirect/list\" class=\"btn btn-info\">게시물 목록</a>\r\n");
      out.write("\t<a href=\"redirect/write\" class=\"btn btn-info\">게시물 쓰기</a>\r\n");
      out.write("\r\n");
      out.write("\t<h4>상태 유지</h4>\r\n");
      out.write("\t<a href=\"cookie/exam01\" class=\"btn btn-primary\">클라이언트 쿠키 저장</a>\r\n");
      out.write("\t<a href=\"cookie/exam02\" class=\"btn btn-primary\">클라이언트 쿠키 읽기</a>\r\n");
      out.write("\t<a href=\"cookie/exam03\" class=\"btn btn-primary\">클라이언트 쿠키 제거</a>\r\n");
      out.write("\t<a href=\"session/exam04\" class=\"btn btn-primary\">서버 세션 저장</a>\r\n");
      out.write("\t<a href=\"session/exam05\" class=\"btn btn-primary\">서버 세션 읽기</a>\r\n");
      out.write("\t<a href=\"session/exam06\" class=\"btn btn-primary\">서버 세션 제거</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<h4>JDBC</h4>\r\n");
      out.write("\t<a href=\"jdbc/exam01\" class=\"btn btn-primary\">게시물 쓰기</a>\r\n");
      out.write("\t<a href=\"jdbc/exam02\" class=\"btn btn-primary\">게시물 쓰기</a>\r\n");
      out.write("\t<a href=\"jdbc/exam03\" class=\"btn btn-primary\">회원 가입</a>\r\n");
      out.write("\t<a href=\"jdbc/exam04\" class=\"btn btn-primary\">게시물 목록</a>\r\n");
      out.write("\t<a href=\"jdbc/exam05\" class=\"btn btn-primary\">게시물 페이지 목록</a>\r\n");
      out.write("\r\n");
      out.write("\t<h4>AOP</h4>\r\n");
      out.write("\t<a href=\"jdbc/exam05\" class=\"btn btn-primary\">실행 시간 체크</a>\r\n");
      out.write("<a href=\"aop/exam01\" class=\"btn btn-primary\">로그인하기 </a>\r\n");
      out.write("<a href=\"aop/exam02Write\" class=\"btn btn-primary\">로그인 해야 볼수 있는 내용1 </a>\r\n");
      out.write("<a href=\"aop/exam02Update\" class=\"btn btn-primary\">로그인 해야 볼수 있는 내용2 </a>\r\n");
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
