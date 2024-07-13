/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-03-22 15:50:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      out.write("<title>Registation</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".container {\r\n");
      out.write("	height: 350px;\r\n");
      out.write("	border: 1px solid black;\r\n");
      out.write("	border-radius: 3%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".reghead {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inputfield {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div>\r\n");
      out.write("		<input type=\"hidden\" id=\"status\"\r\n");
      out.write("			value=\"");
      out.print(request.getAttribute("status"));
      out.write("\" />\r\n");
      out.write("\r\n");
      out.write("		<form method=\"post\" action=\"Registation\">\r\n");
      out.write("\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<div class=\"reghead\">\r\n");
      out.write("					<h1>Register</h1>\r\n");
      out.write("					<p>Please fill in this form to create an account.</p>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"inputfield\">\r\n");
      out.write("					<div>\r\n");
      out.write("						<label for=\"name\"><b>name</b></label> <input type=\"text\"\r\n");
      out.write("							placeholder=\"Enter name\" name=\"name\" id=\"name\" required>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div>\r\n");
      out.write("						<label for=\"email\"><b>Email</b></label> <input type=\"text\"\r\n");
      out.write("							placeholder=\"Enter Email\" name=\"email\" id=\"email\" required>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div>\r\n");
      out.write("						<label for=\"psw\"><b>Password</b></label> <input type=\"password\"\r\n");
      out.write("							placeholder=\"Enter Password\" name=\"psw\" id=\"psw\" required>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div>\r\n");
      out.write("						<label for=\"mobile\"><b>mobile</b></label> <input type=\"mobile\"\r\n");
      out.write("							placeholder=\"Enter mobile\" name=\"mobile\" id=\"mobile\" required>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<p>\r\n");
      out.write("						By creating an account you agree to our <a href=\"#\">Terms &\r\n");
      out.write("							Privacy</a>.\r\n");
      out.write("					</p>\r\n");
      out.write("\r\n");
      out.write("					<button type=\"submit\" class=\"registerbtn\">Register</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<div class=\" signin\">\r\n");
      out.write("						<p>\r\n");
      out.write("							Already have an account? <a href=\"index.jsp\">Sign in</a>.\r\n");
      out.write("						</p>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"alert/dist/sweetalert.css\">\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		var status = document.getElementById(\"status\").value;\r\n");
      out.write("		if (status == \"SUCCESS\") {\r\n");
      out.write("			swal(\"congrate\", \"Account create successfully\", \"success\");\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
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