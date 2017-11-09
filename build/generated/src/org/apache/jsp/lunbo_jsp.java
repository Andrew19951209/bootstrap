package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lunbo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\"> \n");
      out.write("\t<title>Bootstrap 实例 - 轮播（Carousel）插件方法</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\t<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write(" </head> \n");
      out.write(" <body>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("#demo {\n");
      out.write("background: #FFF;\n");
      out.write("overflow:hidden;\n");
      out.write("border: 1px dashed #CCC;\n");
      out.write("width: auto;\n");
      out.write("}\n");
      out.write("#demo img {\n");
      out.write("border: 3px solid #F2F2F2;\n");
      out.write("}\n");
      out.write("#indemo {\n");
      out.write("float: left;\n");
      out.write("width: 800%;\n");
      out.write("}\n");
      out.write("#demo1 {\n");
      out.write("float: left;\n");
      out.write("}\n");
      out.write("#demo2 {\n");
      out.write("float: left;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("<!--向左滚动-->\n");
      out.write("<div id=\"demo\">\n");
      out.write("<div id=\"indemo\">\n");
      out.write("<div id=\"demo1\">\n");
      out.write("<a href=\"#\"><img src=\"images/pi3.jpg\"  class=\"img-rounded\" alt=\"Cinque Terre\" width=\"180\" height=\"220\" /></a>\n");
      out.write("<a href=\"#\"><img src=\"images/pi4.jpg\"  class=\"img-rounded\" alt=\"Cinque Terre\" width=\"180\" height=\"220\" /></a>\n");
      out.write("<a href=\"#\"><img src=\"images/pi5.jpg\"  class=\"img-rounded\" alt=\"Cinque Terre\" width=\"180\" height=\"220\" /></a>\n");
      out.write("<a href=\"#\"><img src=\"images/pi6.jpg\"  class=\"img-rounded\" alt=\"Cinque Terre\" width=\"180\" height=\"220\" /></a>\n");
      out.write("<a href=\"#\"><img src=\"images/pi7.jpg\"  class=\"img-rounded\" alt=\"Cinque Terre\" width=\"180\" height=\"220\" /></a>\n");
      out.write("<a href=\"#\"><img src=\"images/PI8.jpg\"  class=\"img-rounded\" alt=\"Cinque Terre\" width=\"180\" height=\"220\" /></a>\n");
      out.write("</div>\n");
      out.write("<div id=\"demo2\"></div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("<!--\n");
      out.write("var speed=10; //数字越大速度越慢\n");
      out.write("var tab=document.getElementById(\"demo\");\n");
      out.write("var tab1=document.getElementById(\"demo1\");\n");
      out.write("var tab2=document.getElementById(\"demo2\");\n");
      out.write("tab2.innerHTML=tab1.innerHTML;\n");
      out.write("function Marquee(){\n");
      out.write("if(tab2.offsetWidth-tab.scrollLeft<=0)\n");
      out.write("tab.scrollLeft-=tab1.offsetWidth\n");
      out.write("else{\n");
      out.write("tab.scrollLeft++;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("var MyMar=setInterval(Marquee,speed);\n");
      out.write("tab.onmouseover=function() {clearInterval(MyMar)};\n");
      out.write("tab.onmouseout=function() {MyMar=setInterval(Marquee,speed)};\n");
      out.write("-->\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div style=\"height:5000px;\"></div>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".fdPhone{position:fixed; _position:absolute; width:320px; height:50px; position:fixed; left:50%; margin-left:-160px; top:0px; display:none;}\n");
      out.write("</style>\n");
      out.write("<div class=\"fdPhone\">\n");
      out.write("<a href=\"tel:123456789\" target=\"_blank\"><img src=\"images/phone.gif\" width=\"320\" height=\"50\"></a>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(function(){\n");
      out.write("  $(window).scroll(function() {\n");
      out.write("    if($(window).scrollTop() >= 100){ //向下滚动像素大于这个值时，即出现浮窗~\n");
      out.write("      $('.fdPhone').fadeIn(300); //浮窗淡入的时间，越小出现的越快~\n");
      out.write("    }else{\n");
      out.write("      $('.fdPhone').fadeOut(300); //浮窗淡出的时间，越小消失的越快~\n");
      out.write("    }\n");
      out.write("  });\n");
      out.write("  $('.actGotop').click(function(){$('html,body').animate({scrollTop: '0px'}, 800);}); //浮窗动画停留时间，越小消失的越快~\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write(" </body>\n");
      out.write("\n");
      out.write("</html>");
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
