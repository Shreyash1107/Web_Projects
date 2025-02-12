/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-08-05 06:49:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.techhub.service.*;
import org.techhub.model.*;
import java.util.*;

public final class Viewalumni_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(6);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("org.techhub.service");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("org.techhub.model");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>View Alumni</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("	<link rel=\"stylesheet\" href=\"CSS/view.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"container mt-5\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-md-3\">\r\n");
      out.write("				<div class=\"nav flex-column nav-pills menubar bg-light\" id=\"v-pills-tab\"\r\n");
      out.write("					role=\"tablist\" aria-orientation=\"vertical\">\r\n");
      out.write("					<a class=\"nav-link\" href=\"index.jsp\">Batch Master</a>\r\n");
      out.write("					 <a class=\"nav-link\" href=\"Alumnimaster.jsp\">Alumni Master</a> \r\n");
      out.write("					 <a class=\"nav-link\" href=\"#v-pills-messages\">Event Master</a> \r\n");
      out.write("					 <a class=\"nav-link\" href=\"#v-pills-attendance\">Attendance Master</a> \r\n");
      out.write("					 <a class=\"nav-link\" href=\"#v-pills-feedback\">Feedback Master</a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-md-9 content\">\r\n");
      out.write("				<div class=\"tab-content\" id=\"v-pills-tabContent\">\r\n");
      out.write("					<div class=\"tab-pane fade show active\" id=\"v-pills-home\"\r\n");
      out.write("						role=\"tabpanel\" aria-labelledby=\"v-pills-home-tab\">\r\n");
      out.write("						<div class=\"form-container mt-5\">\r\n");
      out.write("						<center>\r\n");
      out.write("							<h3 class=\"heading\">\r\n");
      out.write("								Alumni Details	\r\n");
      out.write("							</h3>\r\n");
      out.write("						</center>\r\n");
      out.write("							<table class=\"table table-striped table-dark\">\r\n");
      out.write("								<thead>\r\n");
      out.write("									<tr>\r\n");
      out.write("										<th scope=\"col\">Aid</th>\r\n");
      out.write("										<th scope=\"col\">Name</th>\r\n");
      out.write("										<th scope=\"col\">Email</th>\r\n");
      out.write("										<th scope=\"col\">Contact</th>\r\n");
      out.write("										<th scope=\"col\">Age</th>\r\n");
      out.write("										<th scope=\"col\">Company</th>\r\n");
      out.write("										<th scope=\"col\">Bid</th>\r\n");
      out.write("									</tr>\r\n");
      out.write("								</thead>\r\n");
      out.write("								<tbody>\r\n");
      out.write("									");

									Alumnimasterservice amservice = new AlumniMasterServiceImpl();
									Vector<AlumniMasterModel> vect = amservice.getalumni();
									if (vect != null) {
										for (AlumniMasterModel amodel : vect) {
									
      out.write("\r\n");
      out.write("									<tr>\r\n");
      out.write("										<td>");
      out.print(amodel.getid());
      out.write("</td>\r\n");
      out.write("										<td>");
      out.print(amodel.getname());
      out.write("</td>\r\n");
      out.write("										<td>");
      out.print(amodel.getEmail());
      out.write("</td>\r\n");
      out.write("										<td>");
      out.print(amodel.getContact());
      out.write("</td>\r\n");
      out.write("										<td>");
      out.print(amodel.getAge());
      out.write("</td>\r\n");
      out.write("										<td>");
      out.print(amodel.getCompany());
      out.write("</td>\r\n");
      out.write("										<td>");
      out.print(amodel.getBid());
      out.write("</td>\r\n");
      out.write("									</tr>\r\n");
      out.write("									");

									}
									}
									
      out.write("\r\n");
      out.write("								</tbody>\r\n");
      out.write("							</table>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"tab-pane fade\" id=\"v-pills-profile\" role=\"tabpanel\"\r\n");
      out.write("						aria-labelledby=\"v-pills-profile-tab\"></div>\r\n");
      out.write("					<div class=\"tab-pane fade\" id=\"v-pills-messages\" role=\"tabpanel\"\r\n");
      out.write("						aria-labelledby=\"v-pills-messages-tab\"></div>\r\n");
      out.write("					<div class=\"tab-pane fade\" id=\"v-pills-settings\" role=\"tabpanel\"\r\n");
      out.write("						aria-labelledby=\"v-pills-settings-tab\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
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
