package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0\">\n");
      out.write("    <title>bootstrap demo</title>\n");
      out.write("    <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-1\">1</div>\n");
      out.write("        <div class=\"col-md-1\">2</div>\n");
      out.write("        <div class=\"col-md-1\">3</div>\n");
      out.write("        <div class=\"col-md-1\">4</div>\n");
      out.write("        <div class=\"col-md-1\">5</div>\n");
      out.write("        <div class=\"col-md-1\">6</div>\n");
      out.write("        <div class=\"col-md-1\">7</div>\n");
      out.write("        <div class=\"col-md-1\">8</div>\n");
      out.write("        <div class=\"col-md-1\">9</div>\n");
      out.write("        <div class=\"col-md-1\">10</div>\n");
      out.write("        <div class=\"col-md-1\">11</div>\n");
      out.write("        <div class=\"col-md-1\">12</div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-4\">1</div>\n");
      out.write("        <div class=\"col-md-4\">2</div>\n");
      out.write("        <div class=\"col-md-4\">3</div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-6\">divide into 2 parts</div>\n");
      out.write("        <div class=\"col-md-6\">this is second part</div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-2\">col-md-2</div>\n");
      out.write("        <div class=\"col-md-3\">col-md-3</div>\n");
      out.write("        <div class=\"col-md-4\">col-md-4</div>\n");
      out.write("        <div class=\"col-md-3\">col-md-3</div>\n");
      out.write("      </div>\n");
      out.write("</div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
