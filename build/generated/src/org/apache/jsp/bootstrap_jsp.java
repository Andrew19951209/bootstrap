package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bootstrap_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("      <title>Bootstrap 模板</title>\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("      <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("      <!-- 引入 Bootstrap -->\n");
      out.write("      <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("      <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("      <link href=\"css/bootstrap-theme.css\" rel=\"stylesheet\">\n");
      out.write("      <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("   </head>\n");
      out.write("   <body  style=\"margin:20px 50px 25px 50px;\">\n");
      out.write("<ul class=\"nav nav-pills\">\n");
      out.write("    <li role=\"presentation\"  class=\"active\"><a href=\"#\"><h4>Home</h4></a></li>\n");
      out.write("  <li role=\"presentation\"><a href=\"#\"><h4>Profile</h4></a></li>\n");
      out.write("  <li role=\"presentation\"><a href=\"#\"><h4>Messages</h4></a></li>\n");
      out.write("  <li role=\"presentation\"><a href=\"#\"><h4>Ha</h4></a></li>\n");
      out.write("  <li role=\"presentation\"><a href=\"#\"><h4>Hello</h4></a></li>\n");
      out.write("  <li role=\"presentation\"><a href=\"#\"><h4>World</h4></a></li>\n");
      out.write("</ul>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("<div class=\"jumbotron\">\n");
      out.write("     <div class=\"container\">\n");
      out.write("  <h1>HaHaHaHaHaHaHaHa</h1>\n");
      out.write("  <p>hahahahahahahahhahahahahahahahah!</p>\n");
      out.write("  <p><a class=\"btn btn-primary btn-lg\" href=\"#\" role=\"button\">Learn more</a></p>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("  <div class=\"col-sm-6 col-md-4\">\n");
      out.write("    <div class=\"thumbnail\">\n");
      out.write("      <img src=\"images/1.jpg\" alt=\"\">\n");
      out.write("      <div class=\"caption\">\n");
      out.write("        <h3>Thumbnail label</h3>\n");
      out.write("        <p>hahahahahahahahahaha</p>\n");
      out.write("        <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Button</a> <a href=\"#\" class=\"btn btn-default\" role=\"button\">Button</a></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        \n");
      out.write("    <div class=\"col-sm-6 col-md-4\">\n");
      out.write("    <div class=\"thumbnail\">\n");
      out.write("      <img src=\"images/2.jpg\" alt=\"\">\n");
      out.write("      <div class=\"caption\">\n");
      out.write("        <h3>Thumbnail label</h3>\n");
      out.write("        <p>hahahahahahahahahaha</p>\n");
      out.write("        <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Button</a> <a href=\"#\" class=\"btn btn-default\" role=\"button\">Button</a></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>    \n");
      out.write("        \n");
      out.write("            <div class=\"col-sm-6 col-md-4\">\n");
      out.write("    <div class=\"thumbnail\">\n");
      out.write("      <img src=\"images/3.jpg\" alt=\"\">\n");
      out.write("      <div class=\"caption\">\n");
      out.write("        <h3>Thumbnail label</h3>\n");
      out.write("        <p>hahahahahahahahahaha</p>\n");
      out.write("        <p><a href=\"#\" class=\"btn btn-primary\" role=\"button\">Button</a> <a href=\"#\" class=\"btn btn-default\" role=\"button\">Button</a></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>    \n");
      out.write("        \n");
      out.write("</div>\n");
      out.write("<div class=\"panel panel-default\">\n");
      out.write("  <!-- Default panel contents -->\n");
      out.write("  <div class=\"panel-heading\">Panel heading</div>\n");
      out.write("\n");
      out.write("  <!-- Table -->\n");
      out.write("  <table class=\"table\">\n");
      out.write("     <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th>产品</th>\n");
      out.write("      <th>付款日期</th>\n");
      out.write("      <th>状态</th></tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("    <tr class=\"active\">\n");
      out.write("      <td>产品1</td>\n");
      out.write("      <td>23/11/2013</td>\n");
      out.write("      <td>待发货</td></tr>\n");
      out.write("    <tr class=\"success\">\n");
      out.write("      <td>产品2</td>\n");
      out.write("      <td>10/11/2013</td>\n");
      out.write("      <td>发货中</td></tr>\n");
      out.write("    <tr class=\"warning\">\n");
      out.write("      <td>产品3</td>\n");
      out.write("      <td>20/10/2013</td>\n");
      out.write("      <td>待确认</td></tr>\n");
      out.write("    <tr class=\"danger\">\n");
      out.write("      <td>产品4</td>\n");
      out.write("      <td>20/10/2013</td>\n");
      out.write("      <td>已退货</td></tr>\n");
      out.write("  </tbody>\n");
      out.write("  </table>\n");
      out.write("</div>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("   </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
