/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-07-24 17:33:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Home Page</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("    href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("    integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("    crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"styles.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n");
      out.write("    integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n");
      out.write("    crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("    src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"\r\n");
      out.write("    integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("    crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("    src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"\r\n");
      out.write("    integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("    crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container mt-5\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-3\">\r\n");
      out.write("                <div class=\"nav flex-column nav-pills menubar\" id=\"v-pills-tab\"\r\n");
      out.write("                    role=\"tablist\" aria-orientation=\"vertical\">\r\n");
      out.write("                    <a class=\"nav-link active\" id=\"v-pills-home-tab\" data-toggle=\"pill\"\r\n");
      out.write("                        href=\"#v-pills-home\" role=\"tab\" aria-controls=\"v-pills-home\"\r\n");
      out.write("                        aria-selected=\"true\">Batch Master</a>\r\n");
      out.write("                    <a class=\"nav-link\" id=\"v-pills-profile-tab\" data-toggle=\"pill\" href=\"Alumnimaster.jsp\"\r\n");
      out.write("                        role=\"tab\" aria-controls=\"v-pills-profile\" aria-selected=\"false\">Alumni Master</a>\r\n");
      out.write("                    <a class=\"nav-link\" id=\"v-pills-messages-tab\" data-toggle=\"pill\" href=\"#v-pills-messages\"\r\n");
      out.write("                        role=\"tab\" aria-controls=\"v-pills-messages\" aria-selected=\"false\">Event Master</a>\r\n");
      out.write("                    <a class=\"nav-link\" id=\"v-pills-settings-tab\" data-toggle=\"pill\" href=\"#v-pills-settings\"\r\n");
      out.write("                        role=\"tab\" aria-controls=\"v-pills-settings\" aria-selected=\"false\">Feedback Master</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-9 content\">\r\n");
      out.write("                <div class=\"tab-content\" id=\"v-pills-tabContent\">\r\n");
      out.write("                    <div class=\"tab-pane fade show active\" id=\"v-pills-home\"\r\n");
      out.write("                        role=\"tabpanel\" aria-labelledby=\"v-pills-home-tab\">\r\n");
      out.write("                        <div class=\"form-container mt-5\">\r\n");
      out.write("                            <h3 class=\"text-center\">Add New Batch</h3>\r\n");
      out.write("                            <form name='frm' id=\"frm\" action='batch' method='POST'\r\n");
      out.write("                                onsubmit=\"validateName()\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label for=\"txtBatch\">Batch Name</label>\r\n");
      out.write("                                    <input type=\"text\" name=\"batchName\" id=\"txtBatch\"\r\n");
      out.write("                                        class=\"form-control\" placeholder=\"Enter Batch Name\"\r\n");
      out.write("                                        onkeyup=\"validateBatch()\" autocomplete=\"off\">\r\n");
      out.write("                                    <span id=\"s\"></span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-group d-flex justify-content-center\">\r\n");
      out.write("                                    <input type='submit' name='s' id=\"btn\" value='Add New Batch'\r\n");
      out.write("                                        class=\"btn btn-primary\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"tab-pane fade\" id=\"v-pills-profile\" role=\"tabpanel\"\r\n");
      out.write("                        aria-labelledby=\"v-pills-profile-tab\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"tab-pane fade\" id=\"v-pills-messages\" role=\"tabpanel\"\r\n");
      out.write("                        aria-labelledby=\"v-pills-messages-tab\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"tab-pane fade\" id=\"v-pills-settings\" role=\"tabpanel\"\r\n");
      out.write("                        aria-labelledby=\"v-pills-settings-tab\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
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
