package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      <head>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <title>Bootstrap</title>\n");
      out.write("      \n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"container\">\n");
      out.write("　\n");
      out.write("　　<div class=\"row\">\n");
      out.write("　　　　<div class=\"col-xs-6 col-sm-4\" style=\"background-color: green\">.col-xs-6 .col-sm-4</div>\n");
      out.write("　　　　<div class=\"col-xs-6 col-sm-4\" style=\"background-color: gray\">.col-xs-6 .col-sm-4</div>\n");
      out.write("　　　　<div class=\"col-xs-6 col-sm-4\" style=\"background-color: goldenrod\">.col-xs-6 .col-sm-4</div>\n");
      out.write("　　</div>\n");
      out.write("  \n");
      out.write("     <div class=\"row\">\n");
      out.write("　　　  <div class=\"col-md-4\" style=\"background-color: gray\">1</div>\n");
      out.write("        <div class=\"col-md-4\" style=\"background-color: blue\">2</div>\n");
      out.write("        <div class=\"col-md-4\" style=\"background-color: yellow\">3</div>\n");
      out.write("     </div>\n");
      out.write("        \n");
      out.write("  \n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("    </body>\n");
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
