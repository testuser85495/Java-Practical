/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-07-14 07:53:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	.bttnStyle\r\n");
      out.write("	{\r\n");
      out.write("		background-color: lightblue;\r\n");
      out.write("		border-radius: 0.50rem;\r\n");
      out.write("		border:1px solid transperent;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	var xhttp=new XMLHttpRequest();\r\n");
      out.write("	var RazorpayOrderId;\r\n");
      out.write("	function CreateOrderID()\r\n");
      out.write("	{\r\n");
      out.write("		/*  alert(\"1\");  */\r\n");
      out.write("		var number=document.getElementById(\"amount\").value;\r\n");
      out.write("		var cid=document.getElementById(\"cid\").value;\r\n");
      out.write("		xhttp.open(\"GET\",\"http://localhost:8080/Project_Demo/OrderCreation?amount=\"+number+\"&id=\"+cid,false);\r\n");
      out.write("		/* alert(\"2\"); */\r\n");
      out.write("		xhttp.send();\r\n");
      out.write("		RazorpayOrderId=xhttp.responseText;\r\n");
      out.write("		  \r\n");
      out.write("		alert(number);  \r\n");
      out.write("		OpenCheckOut(number); \r\n");
      out.write("		OpenCheckOut();\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"https://checkout.razorpay.com/v1/checkout.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	function OpenCheckOut()\r\n");
      out.write("	{\r\n");
      out.write("		/* alert(\"3\");  */\r\n");
      out.write("		var number=document.getElementById(\"amount\").value;\r\n");
      out.write("		/* alert(number); */\r\n");
      out.write("		var options={\r\n");
      out.write("				\"key\":\"rzp_test_L8oMPzGm1Bj2cF\",\r\n");
      out.write("				\"amount\":number,\r\n");
      out.write("				\"currency\":\"INR\",\r\n");
      out.write("				\"name\":\"Sarthak\",	\r\n");
      out.write("				\"description\":\"Test\",\r\n");
      out.write("				\"order_id\":RazorpayOrderId,\r\n");
      out.write("				\r\n");
      out.write("				\"callback_url\":\"http://localhost:8080/Project_Demo/thankyou.jsp\",\r\n");
      out.write("				\"prefill\":{\r\n");
      out.write("					\"name\":\"Sarthak Thakor\",\r\n");
      out.write("					\"email\":\"thakorsarthak618@gmail.com\",\r\n");
      out.write("					\"contact\":\"9408014329\"\r\n");
      out.write("				},\r\n");
      out.write("				\"notes\":{\r\n");
      out.write("					\"address\":\"Ahmedabad\"\r\n");
      out.write("				},\r\n");
      out.write("				\"theme\":{\r\n");
      out.write("					\"color\":\"#3399cc\"\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				\r\n");
      out.write("		};\r\n");
      out.write("		var rzp1=new Razorpay(options);\r\n");
      out.write("		rzp1.on('payment.failed',function (response){\r\n");
      out.write("			alert(response.error.code);\r\n");
      out.write("	        alert(response.error.description);\r\n");
      out.write("	        alert(response.error.source);\r\n");
      out.write("	        alert(response.error.step);\r\n");
      out.write("	        alert(response.error.reason);\r\n");
      out.write("	        alert(response.error.metadata.order_id);\r\n");
      out.write("	        alert(response.error.metadata.payment_id);\r\n");
      out.write("		});\r\n");
      out.write("		rzp1.open();\r\n");
      out.write("	    /* e.preventDefault(); */\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"order_id\">\r\n");
      out.write("	\r\n");
      out.write("</div>\r\n");
int am = Integer.parseInt(request.getParameter("amount")); 
      out.write('\r');
      out.write('\n');
int cid = Integer.parseInt(request.getParameter("cid")); 
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<center> \r\n");
      out.write("	<input type=\"hidden\" id=\"amount\" value=\"");
      out.print(am);
      out.write("\">\r\n");
      out.write("	 <input type=\"hidden\" id=\"cid\" value=\"");
      out.print(cid);
      out.write("\"> \r\n");
      out.write("	<button id=\"payButton\" onclick=\"CreateOrderID()\" class=\"bttnStyle\">Pay Now</button>\r\n");
      out.write("</center>\r\n");
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
