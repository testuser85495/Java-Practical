/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-04-26 05:43:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import doa.ProductDAO;
import model.Product;
import model.seller;

public final class sell_002dEditProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/sell-header.jsp", Long.valueOf(1713941349758L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(4);
    _jspx_imports_classes.add("model.Product");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("doa.ProductDAO");
    _jspx_imports_classes.add("model.seller");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/tiny-slider.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery -->\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Popper.js -->\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap JavaScript -->\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<title></title>\r\n");
      out.write("<style>\r\n");
      out.write(".tblset {\r\n");
      out.write("	overflow-x: scroll;\r\n");
      out.write("	font: -webkit-control;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown:hover .dropdown-content {\r\n");
      out.write("	display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content {\r\n");
      out.write("	display: none;\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	background-color: #3b5d50;\r\n");
      out.write("	min-width: max-content; /* 200px; */\r\n");
      out.write("	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);\r\n");
      out.write("	padding: 11px;\r\n");
      out.write("	z-index: 10;\r\n");
      out.write("	/* margin-left: 0px; */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown {\r\n");
      out.write("	position: relative;\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		$('#myModal').on('shown.bs.modal', function() {\r\n");
      out.write("			$('#myInput').trigger('focus');\r\n");
      out.write("		});\r\n");
      out.write("	</script>\r\n");
      out.write("	");

	seller s = null;
	if (session.getAttribute("data") != null) {
		s = (seller) session.getAttribute("data");
	} else {
		response.sendRedirect("sell-login.jsp");
	}
	
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Start Header/Navigation -->\r\n");
      out.write("	<nav class=\"custom-navbar navbar navbar navbar-expand-md navbar-dark\"\r\n");
      out.write("		arial-label=\"Furni navigation bar\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<a class=\"navbar-brand\" href=\"sell-home.jsp\">Furni<span>.</span></a>\r\n");
      out.write("			<button class=\"navbar-toggler\" type=\"button\"\r\n");
      out.write("				data-bs-toggle=\"collapse\" data-bs-target=\"#navbarsFurni\"\r\n");
      out.write("				aria-controls=\"navbarsFurni\" aria-expanded=\"false\"\r\n");
      out.write("				aria-label=\"Toggle navigation\">\r\n");
      out.write("				<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("			</button>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"navbarsFurni\">\r\n");
      out.write("				<ul class=\"custom-navbar-nav navbar-nav ms-auto mb-2 mb-md-0\">\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"sell-home.jsp\">Home</a></li>\r\n");
      out.write("					<!-- <li><a href=\"#\">Register <i class=\"fas fa-angle-down\"></i></a>\r\n");
      out.write("										<ul class=\"submenu\">\r\n");
      out.write("											<li><a href=\"seller-registration.jsp\">As Seller</a></li>\r\n");
      out.write("											<li><a href=\"customer-registration.jsp\">As Customer</a></li>\r\n");
      out.write("										</ul></li> -->\r\n");
      out.write("					<div class=\"dropdown\">\r\n");
      out.write("						<li><a class=\"nav-link\" href=\"#\">Product</a></li>\r\n");
      out.write("						<div class=\"dropdown-content\">\r\n");
      out.write("							<ul type=\"none\">\r\n");
      out.write("								<li><a href=\"sell-uploadproduct.jsp\" style=\"text-decoration: none;\">Upload Product</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("							<ul type=\"none\">\r\n");
      out.write("								<li><a href=\"#\" style=\"text-decoration: none;\">product</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<li><a class=\"nav-link\" href=\"#\">About us</a></li>\r\n");
      out.write("					<!-- <div class=\"dropdown\">\r\n");
      out.write("						<li><a class=\"nav-link\" href=\"about.html\">other</a>\r\n");
      out.write("							<div class=\"dropdown-content\">\r\n");
      out.write("								<ul type=\"none\">\r\n");
      out.write("									<li style=\"margin-left: 0px;\"><a href=\"#\" style=\"text-decoration: none;\">cust-login</a></li>\r\n");
      out.write("								</ul>\r\n");
      out.write("								<ul type=\"none\">\r\n");
      out.write("									<li style=\"margin-left: 0px;\"><a href=\"#\"\r\n");
      out.write("										style=\"text-decoration: none;\">sell-login</a></li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div></li>\r\n");
      out.write("					</div> -->\r\n");
      out.write("					<!-- <li><a class=\"nav-link\" href=\"services.html\">Services</a></li> -->\r\n");
      out.write("					");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					");
      out.write("\r\n");
      out.write("					<li><a class=\"nav-link\" href=\"sell-logout.jsp\">Logout</a></li>\r\n");
      out.write("					");
      out.write("\r\n");
      out.write("				</ul>\r\n");
      out.write("\r\n");
      out.write("				<ul class=\"custom-navbar-cta navbar-nav mb-2 mb-md-0 ms-5\">\r\n");
      out.write("					");
      out.write("\r\n");
      out.write("					<li><a class=\"nav-link\" data-toggle=\"modal\"\r\n");
      out.write("						data-target=\"#exampleModal\" href=\"#\"><img\r\n");
      out.write("							src=\"images/user.svg\"></a>\r\n");
      out.write("						<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\"\r\n");
      out.write("							role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\r\n");
      out.write("							aria-hidden=\"true\">\r\n");
      out.write("							<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("								<div class=\"modal-content\">\r\n");
      out.write("									<div class=\"modal-header\">\r\n");
      out.write("										<h5 class=\"modal-title\" id=\"exampleModalLabel\">\r\n");
      out.write("											Welcome :\r\n");
      out.write("											");
      out.print(s.getName());
      out.write("\r\n");
      out.write("										</h5>\r\n");
      out.write("										<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("											aria-label=\"Close\">\r\n");
      out.write("											<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("										</button>\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"modal-body tblset\">\r\n");
      out.write("										<table class=\"table\">\r\n");
      out.write("											<thead>\r\n");
      out.write("												<tr>\r\n");
      out.write("													<th scope=\"col\">Id</th>\r\n");
      out.write("													<th scope=\"col\">Name</th>\r\n");
      out.write("													<th scope=\"col\">Email</th>\r\n");
      out.write("													<th scope=\"col\">Contact</th>\r\n");
      out.write("													<th scope=\"col\">Address</th>\r\n");
      out.write("												</tr>\r\n");
      out.write("											</thead>\r\n");
      out.write("											<tbody>\r\n");
      out.write("												<tr>\r\n");
      out.write("													<!-- <th scope=\"row\">1</th> -->\r\n");
      out.write("													<td>");
      out.print(s.getId());
      out.write("</td>\r\n");
      out.write("													<td>");
      out.print(s.getName());
      out.write("</td>\r\n");
      out.write("													<td>");
      out.print(s.getEmail());
      out.write("</td>\r\n");
      out.write("													<td>");
      out.print(s.getContact());
      out.write("</td>\r\n");
      out.write("													<td>");
      out.print(s.getAddress());
      out.write("</td>\r\n");
      out.write("												</tr>\r\n");
      out.write("											</tbody>\r\n");
      out.write("										</table>\r\n");
      out.write("\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"modal-footer\">\r\n");
      out.write("										<div class=\"\">\r\n");
      out.write("											<div class=\"btn btn-secondary\">\r\n");
      out.write("												<a href=\"sell-changepassword.jsp\"\r\n");
      out.write("													style=\"text-decoration: none;\">Change password</a>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("										<form action=\"Customercontroller\" method=\"post\">\r\n");
      out.write("											<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("												data-dismiss=\"modal\">Close</button>\r\n");
      out.write("											<a href=\"sell-update.jsp\" class=\"btn btn-primary\">Edit</a>\r\n");
      out.write("										</form>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div></li>\r\n");
      out.write("					");
      out.write("\r\n");
      out.write("					<li><a class=\"nav-link\" href=\"cart.html\"><img\r\n");
      out.write("							src=\"images/cart.svg\"></a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</nav>\r\n");
      out.write("	<!-- End Header/Navigation -->\r\n");
      out.write("	<script src=\"js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("	<script src=\"js/tiny-slider.js\"></script>\r\n");
      out.write("	<script src=\"js/custom.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Edit Product</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write(".btn {\r\n");
      out.write("	margin-top: 20px;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-control {\r\n");
      out.write("	height: 35px;\r\n");
      out.write("	border-radius: 10px;\r\n");
      out.write("	font-family: \"Inter\", sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".contain {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("	height: 500px;\r\n");
      out.write("	width: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".reg {\r\n");
      out.write("	margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown:hover .dropdown-content {\r\n");
      out.write("	display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content {\r\n");
      out.write("	display: none;\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	background-color: #3b5d50;\r\n");
      out.write("	min-width: 200px;\r\n");
      out.write("	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);\r\n");
      out.write("	padding: 11px;\r\n");
      out.write("	z-index: 10;\r\n");
      out.write("	/* margin-left: 0px; */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown {\r\n");
      out.write("	position: relative;\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
int id = Integer.parseInt(request.getParameter("id")); 
      out.write('\r');
      out.write('\n');
Product  p = ProductDAO.GetProductById(id); 
      out.write("\r\n");
      out.write("	<form action=\"Productcontroller\" method=\"post\"\r\n");
      out.write("		enctype=\"multipart/form-data\">\r\n");
      out.write("		<div class=\"main\">\r\n");
      out.write("			<div class=\"contain\">\r\n");
      out.write("				<div class=\"\">\r\n");
      out.write("					<div class=\"\">\r\n");
      out.write("						<h2 style=\"text-align: center;\">Update Product</h2>\r\n");
      out.write("						<input type=\"hidden\" name=\"sid\" value=\"");
      out.print(p.getPid());
      out.write("\">\r\n");
      out.write("						<div class=\"form-group\">\r\n");
      out.write("						<img src=\"image/");
      out.print(p.getPimage());
      out.write("\" height=\"200\" width=\"200\">\r\n");
      out.write("							<label class=\"text-black\" for=\"fname\">Image</label> <input\r\n");
      out.write("								type=\"file\" class=\"form-control\" name=\"image\" id=\"fname\"");
      out.write(">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"\">\r\n");
      out.write("						<div class=\"form-group\">\r\n");
      out.write("							<label class=\"text-black\" for=\"lname\">Name</label> <input\r\n");
      out.write("								type=\"text\" class=\"form-control\" name=\"name\" id=\"lname\" value=\"");
      out.print(p.getPname());
      out.write("\"/>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"\">\r\n");
      out.write("						<div class=\"form-group\">\r\n");
      out.write("							<label class=\"text-black\" for=\"lname\">Price</label> <input\r\n");
      out.write("								type=\"text\" class=\"form-control\" name=\"price\" id=\"lname\" value=\"");
      out.print(p.getPprice());
      out.write("\" >\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"\">\r\n");
      out.write("						<div class=\"form-group\">\r\n");
      out.write("							<label class=\"text-black\" for=\"lname\">Category</label> <input\r\n");
      out.write("								type=\"text\" class=\"form-control\" name=\"category\" id=\"lname\" value=\"");
      out.print(p.getPcategory());
      out.write("\" >\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"\">\r\n");
      out.write("						<div class=\"form-group\">\r\n");
      out.write("							<label class=\"text-black\" for=\"lname\">Description</label> <input\r\n");
      out.write("								type=\"text\" class=\"form-control\" name=\"desc\" id=\"lname\" value=\"");
      out.print(p.getPdesc());
      out.write("\" >\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<input type=\"submit\" class=\"btn btn-primary-hover-outline\"\r\n");
      out.write("						name=\"action\" value=\"update product\">\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</form>\r\n");
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
