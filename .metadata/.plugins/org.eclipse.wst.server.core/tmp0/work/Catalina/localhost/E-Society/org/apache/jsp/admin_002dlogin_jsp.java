/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-05-12 12:27:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_002dlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1715143674293L));
    _jspx_dependants.put("/admin-main-header.jsp", Long.valueOf(1715487996959L));
  }

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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("<title>Minimalista - New Amazing HTML5 Template</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/components.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/icons.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/responsee.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"owl-carousel/owl.carousel.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"owl-carousel/owl.theme.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/lightcase.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css\">\r\n");
      out.write("<!-- CUSTOM STYLE -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/template-style.css\">\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css?family=Work+Sans:100,400,600,900&subset=latin-ext\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-ui.min.js\"></script>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<style>\r\n");
      out.write(".msgalert {\r\n");
      out.write("	max-width: 35%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"size-1140\">\r\n");
      out.write("	<!-- HEADER -->\r\n");
      out.write("	<div id=\"page-wrapper\">\r\n");
      out.write("		<header role=\"banner\"\r\n");
      out.write("			class=\"position-absolute margin-top-30 margin-m-top-0 margin-s-top-0\">\r\n");
      out.write("			<!-- Top Navigation -->\r\n");
      out.write("			<nav\r\n");
      out.write("				class=\"background-transparent background-transparent-hightlight full-width sticky\">\r\n");
      out.write("				<div class=\"s-12 l-2\">\r\n");
      out.write("					<a href=\"admin-index.jsp\" class=\"logo\"> <!-- Logo version before sticky nav -->\r\n");
      out.write("						<img class=\"logo-before\" src=\"img/e-society.png\" alt=\"img\" > <!-- Logo version after sticky nav -->\r\n");
      out.write("						<img class=\"logo-after\" src=\"img/e-society.png\" alt=\"\">\r\n");
      out.write("					</a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"s-12 l-10\">\r\n");
      out.write("					<div class=\"top-nav right\">\r\n");
      out.write("						<p class=\"nav-text\"></p>\r\n");
      out.write("						<ul class=\"right chevron\">\r\n");
      out.write("							<li><a href=\"admin-index.jsp\">Home</a></li>\r\n");
      out.write("							<li><a href=\"admin-login.jsp\">Sign in <i class=\"fa-solid fa-right-to-bracket fa-xs\"></i></a></li>\r\n");
      out.write("							<li><a href=\"admin-register.jsp\">Sing up <i class=\"fa-solid fa-user-plus fa-xs\"></i></a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</nav>\r\n");
      out.write("		</header>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		window.setTimeout(function() {\r\n");
      out.write("			$(\".alert\").fadeTo(500, 0).slideUp(500, function() {\r\n");
      out.write("				$(this).remove();\r\n");
      out.write("			});\r\n");
      out.write("		}, 4000);\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Admin Login</title>\r\n");
      out.write("</head>\r\n");
      out.write("<!-- <script\r\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\r\n");
      out.write("	integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("	integrity=\"sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script> -->\r\n");
      out.write("<!-- <link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\"> -->\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".msgalert {\r\n");
      out.write("	width: 35%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("	");

	String msg = (String) request.getAttribute("msg");
	String msg1 = (String) request.getAttribute("msg1");
	String msg2 = (String) request.getAttribute("msg2");
	
      out.write("\r\n");
      out.write("	<section class=\"section background-white\">\r\n");
      out.write("<!-- msg for success register -->\r\n");
      out.write("		");

		if (msg != null) {
		
      out.write("\r\n");
      out.write("		<div class=\"alert alert-success msgalert\" role=\"alert\">\r\n");
      out.write("\r\n");
      out.write("			<strong>Success!</strong>\r\n");
      out.write("			");

			out.print(msg);
			}
			
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<!--Msg for worng email  -->\r\n");
      out.write("		");

		if (msg1 != null) {
		
      out.write("\r\n");
      out.write("		<div class=\"alert alert-warning msgalert\" role=\"alert\">\r\n");
      out.write("\r\n");
      out.write("			<strong>Warning!</strong>\r\n");
      out.write("			");

			out.print(msg1);
			}
			
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<!--Msg for worng password  -->\r\n");
      out.write("		");

		if (msg2 != null) {
		
      out.write("\r\n");
      out.write("		<div class=\"alert alert-warning msgalert\" role=\"alert\">\r\n");
      out.write("\r\n");
      out.write("			<strong>Warning!</strong>\r\n");
      out.write("			");

			out.print(msg2);
			}
			
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"s-12 m-12 l-4 center\">\r\n");
      out.write("			<h4 class=\"text-size-20 margin-bottom-20 text-dark text-center\">Admin Login</h4>\r\n");
      out.write("			<form action=\"AdminController\" class=\"customform\" method=\"post\">\r\n");
      out.write("				<div class=\"s-12\">\r\n");
      out.write("					<input name=\"email\" class=\"subject\" placeholder=\"Your e-mail\"\r\n");
      out.write("						title=\"your e-mail\" type=\"email\">\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"s-12\">\r\n");
      out.write("					<input name=\"password\" class=\"subject\" placeholder=\"Enter Password\"\r\n");
      out.write("						title=\"your password\" type=\"password\">\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"s-12\">\r\n");
      out.write("					<a href=\"admin-forgotpassword.jsp\">Forgot Password?</a>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"s-12\">\r\n");
      out.write("					<button name=\"action\" value=\"login\" class=\"s-12 submit-form button background-primary text-white\" type=\"submit\">Login</button>\r\n");
      out.write("				</div>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<!-- <script type=\"text/javascript\">\r\n");
      out.write("		window.setTimeout(function() {\r\n");
      out.write("			$(\".alert\").fadeTo(500, 0).slideUp(500, function() {\r\n");
      out.write("				$(this).remove();\r\n");
      out.write("			});\r\n");
      out.write("		}, 4000);\r\n");
      out.write("	</script> -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("<title>Minimalista - New Amazing HTML5 Template</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/components.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/icons.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/responsee.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"owl-carousel/owl.carousel.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"owl-carousel/owl.theme.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/lightcase.css\">\r\n");
      out.write("<!-- CUSTOM STYLE -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/template-style.css\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css?family=Work+Sans:100,400,600,900&subset=latin-ext\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-ui.min.js\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- FOOTER -->\r\n");
      out.write("      <footer>\r\n");
      out.write("        <!-- Contact Us -->\r\n");
      out.write("        <div class=\"background-dark padding text-center footer-social\">\r\n");
      out.write("          <a class=\"margin-right-10\" target=\"_blank\" href=\"https://www.facebook.com\"><i class=\"icon-facebook_circle text-size-30\"></i> <span class=\"text-strong text-white hide-s hide-m\">FACEBOOK</span></a>\r\n");
      out.write("          <a class=\"margin-right-10\" target=\"_blank\" href=\"https://www.twitter.com\"><i class=\"icon-twitter_circle text-size-30\"></i> <span class=\"text-strong text-white hide-s hide-m\">TWITTER</span></a>\r\n");
      out.write("          <a class=\"margin-right-10\" target=\"_blank\" href=\"https://www.instagram.com\"><i class=\"icon-instagram_circle text-size-30\"></i> <span class=\"text-strong text-white hide-s hide-m\">INSTAGRAM</span></a>\r\n");
      out.write("          <a target=\"_blank\" href=\"https://www.linkedin.com\"><i class=\"icon-linked_in_circle text-size-30\"></i> <span class=\"text-strong text-white hide-s hide-m\">LINKEDIN</span></a>                                                                         \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Main Footer -->\r\n");
      out.write("        <section class=\"section-small-padding text-center background-dark full-width\">\r\n");
      out.write("          <div class=\"line\">\r\n");
      out.write("            <div class=\"margin\">\r\n");
      out.write("              <!-- Collumn 1 -->              \r\n");
      out.write("              <div class=\"s-12 m-12 l-4 margin-m-bottom-30\">\r\n");
      out.write("                <h3 class=\"text-size-16\">Company Address</h3>\r\n");
      out.write("                <p class=\"text-size-14\">\r\n");
      out.write("                   Responsive Street 7<br>\r\n");
      out.write("                   London - United Kingdom<br> \r\n");
      out.write("                   Europe\r\n");
      out.write("                </p>               \r\n");
      out.write("              </div>\r\n");
      out.write("              <!-- Collumn 2 -->\r\n");
      out.write("              <div class=\"s-12 m-12 l-4 margin-m-bottom-30\">\r\n");
      out.write("                <h3 class=\"text-size-16\">E-mail</h3>\r\n");
      out.write("                <p class=\"text-size-14\">\r\n");
      out.write("                   contact@sampledomain.com<br>\r\n");
      out.write("                   office@sampledomain.com\r\n");
      out.write("                </p>              \r\n");
      out.write("              </div>\r\n");
      out.write("              <!-- Collumn 3 -->\r\n");
      out.write("              <div class=\"s-12 m-12 l-4 \">\r\n");
      out.write("                <h3 class=\"text-size-16\">Phone Numbers</h3>\r\n");
      out.write("                <p class=\"text-size-14\">\r\n");
      out.write("                   0800 4521 800 50<br>\r\n");
      out.write("                   0450 5896 625 16<br>\r\n");
      out.write("                   0798 6546 465 15\r\n");
      out.write("                </p>             \r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>  \r\n");
      out.write("        </section>\r\n");
      out.write("        <hr class=\"break margin-top-bottom-0\" style=\"border-color: rgba(0, 0, 0, 0.80);\">\r\n");
      out.write("        \r\n");
      out.write("        <!-- Bottom Footer -->\r\n");
      out.write("        <section class=\"padding background-dark full-width\">\r\n");
      out.write("          <div class=\"text-center\">\r\n");
      out.write("            <p class=\"text-size-12\">Copyright 2019, Vision Design - graphic zoo</p>\r\n");
      out.write("            <p class=\"text-size-12\">All images is purchased from Bigstock. Do not use the images in your website.</p>\r\n");
      out.write("          </div>\r\n");
      out.write("        </section>\r\n");
      out.write("      </footer>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/responsee.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.events.touch.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"owl-carousel/owl.carousel.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/template-scripts.js\"></script> \r\n");
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