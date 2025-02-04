package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import DbConnection.connect;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!--Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Digital Campus</title>\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"js/jquery-1.11.0.min.js\"></script>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Training Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!--Google Fonts-->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Asap:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Kreon:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- start-smoth-scrolling -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tjQuery(document).ready(function($) {\n");
      out.write("\t\t\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t</script>\n");
      out.write("<!-- //end-smoth-scrolling -->\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!--header start here-->\n");
      out.write("<div class=\"banner\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("\t\t\t<div class=\"col-md-7 logo\">\n");
      out.write("\t\t\t\t<a href=\"home.jsp\"><h1>Digital Campus</h1></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-5 details\">\n");
      out.write("\t\t\t\t\n");
      out.write("                            ");
      out.write("\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                                 <div class=\"addre\">\n");
      out.write("\t\t\t\t\t<span class=\"location\"> </span>\n");
      out.write("\t\t\t\t\t  <div class=\"detail-para\">\n");
      out.write("                                              <a href=\"login.jsp\"><p>Login</p></a>\t\t\t\t\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("                                     </div>\n");
      out.write("                                 \n");
      out.write("\t\t\t\t<div class=\"addre addres-mes\">\n");
      out.write("\t\t\t\t\t<span class=\"mess\"></span>\n");
      out.write("\t\t\t\t\t <div class=\"detail-para\">\n");
      out.write("\t\t\t\t\t\t<p>+648 4859</p>\t\t\t\t\t\n");
      out.write("\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t  <div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t  <div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"top-nav\">\n");
      out.write("\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t   \t\t\t <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("\t                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t                <span class=\"icon-bar\"></span>\n");
      out.write("\t                <span class=\"icon-bar\"></span>\n");
      out.write("\t                <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("              </div>\n");
      out.write("\t   \t\t\t<div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("\t              <ul class=\"nav navbar-nav\">\n");
      out.write("\t                  <li class=\"home\"><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                                          <li class=\"\"><a href=\"about.jsp\">About</a></li> \n");
      out.write("                                          <li class=\"\"><a href=\"registration.jsp\">Student Registration</a></li>\n");
      out.write("                                          <li class=\"\"><a href=\"gallery.jsp\">Gallery</a></li>\t                 \n");
      out.write("\t\t\t\t\t  <li class=\"\"><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("\t              </ul>\n");
      out.write("\t            </div>\n");
      out.write("\t            </div>\n");
      out.write("                                \n");
      out.write("                  \n");
      out.write("                                \n");
      out.write("                    <marquee><div class=\"banner-bottom\">\n");
      out.write("                         <div class=\"bann-para\" style=\"margin-top: 3em;\" style=\"padding: 2em;\">\n");
      out.write("                         <h2 style=\"color: #9a488d\">\"Intelligence plus character - that is the goal </h2>\n");
      out.write("                         <h2 style=\"color: #9a488d\">of true education\"</h2></font>\n");
      out.write("                            <p> - Martin Luther King Jr.</p>\n");
      out.write("\t\t     </div>\n");
      out.write("                         <a href=\"about.jsp\">Read More</a>\n");
      out.write("\t\t     </div></marquee>\n");
      out.write("                     \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("<!--header strat here-->\n");
      out.write("<!--welcome start here-->\n");
      out.write("<div class=\"welcome\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"wel-main\">\n");
      out.write("\t\t  <div class=\"wel-top\">\n");
      out.write("\t\t\t<h3>Welcome To Modern Technologies</h3>\n");
      out.write("\t      </div>\n");
      out.write("\t      <div class=\"wel-bottom\">\n");
      out.write("\t      \t  <div class=\"col-md-6 wel-left\">\n");
      out.write("                         <div class=\"wel-block\">\n");
      out.write("\t\t      \t  \t <div class=\"wel-img\">\n");
      out.write("\t\t      \t  \t \t<img src=\"images/lb.jpg\" alt=\"\" class=\"img-responsive\">\n");
      out.write("\t\t      \t  \t </div>\n");
      out.write("\t\t      \t  \t <div class=\"wel-text\">\n");
      out.write("\t\t      \t  \t \t<h4>Library</h4>\n");
      out.write("\t\t      \t  \t \t<p>To take a trivial example, which of us ever undertakes laborious physical exercise</p>\n");
      out.write("\t\t      \t  \t </div>\n");
      out.write("\t\t      \t   <div class=\"clearfix\"> </div>\n");
      out.write("                          </div>\n");
      out.write("\t      \t    <div class=\"wel-block\">\n");
      out.write("\t\t      \t  \t <div class=\"wel-img\">\n");
      out.write("\t\t      \t  \t \t<img src=\"images/lab2.jpg\" alt=\"\" class=\"img-responsive\">\n");
      out.write("\t\t      \t  \t </div>\n");
      out.write("\t\t      \t  \t <div class=\"wel-text\">\n");
      out.write("\t\t      \t  \t \t<h4>Computer Lab</h4>\n");
      out.write("\t\t      \t  \t \t<p>To take a trivial example, which of us ever undertakes laborious physical exercise</p>\n");
      out.write("\t\t      \t  \t </div>\n");
      out.write("\t\t      \t   <div class=\"clearfix\"> </div>\n");
      out.write("\t      \t    </div>\n");
      out.write("\t      \t  </div>\n");
      out.write("\t      \t  <div class=\"col-md-6 wel-right\">\n");
      out.write("\t      \t  \t <div class=\"wel-block\">\n");
      out.write("\t\t      \t  \t <div class=\"wel-img\">\n");
      out.write("\t\t      \t  \t \t<img src=\"images/sem1.jpg\" alt=\"\" class=\"img-responsive\">\n");
      out.write("\t\t      \t  \t </div>\n");
      out.write("\t\t      \t  \t <div class=\"wel-text\">\n");
      out.write("\t\t      \t  \t \t<h4>Seminar hall</h4>\n");
      out.write("\t\t      \t  \t \t<p>To take a trivial example, which of us ever undertakes laborious physical exercise</p>\n");
      out.write("\t\t      \t  \t </div>\n");
      out.write("\t\t      \t   <div class=\"clearfix\"> </div>\n");
      out.write("\t      \t    </div>\n");
      out.write("\t      \t  \t <div class=\"wel-block\">\n");
      out.write("\t\t      \t  \t <div class=\"wel-img\">\n");
      out.write("\t\t      \t  \t \t<img src=\"images/cls2.jpg\" alt=\"\" class=\"img-responsive\">\n");
      out.write("\t\t      \t  \t </div>\n");
      out.write("\t\t      \t  \t <div class=\"wel-text\">\n");
      out.write("\t\t      \t  \t \t<h4>Classrooms</h4>\n");
      out.write("\t\t      \t  \t \t<p>To take a trivial example, which of us ever undertakes laborious physical exercise</p>\n");
      out.write("\t\t      \t  \t </div>\n");
      out.write("\t\t      \t   <div class=\"clearfix\"> </div>\n");
      out.write("\t      \t    </div>\n");
      out.write("\t      \t   <div class=\"clearfix\"> </div>\n");
      out.write("\t      \t  </div>\n");
      out.write("\t      \t<div class=\"clearfix\"> </div>\n");
      out.write("\t      </div></marquee>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                \n");
      out.write("<!--course strat here-->\n");
      out.write("<div class=\"course\">\n");
      out.write("    \n");
      out.write("        <div class=\"col-md-6 course-right\">\n");
      out.write("\t\t<!--<h6>voluptatem accusantium</h6>-->\n");
      out.write("\t\t<h3>Notification/Events</h3>\n");
      out.write("                ");
 String sql1="select* from notification";
                    ResultSet rs1=connect.getData(sql1);
                     while(rs1.next())
                     {
                         
                       
      out.write("\n");
      out.write("                       <ul>\n");
      out.write("                           <font face=\"Lucida Calligraphy\" size=\"4\"><p style=\"color: #003399;\"><marquee><li>");
      out.print(rs1.getString(2));
      out.write("</li></marquee></p></font>\n");
      out.write("                       </ul>\n");
      out.write("                       ");

                           }  
      out.write("\t \n");
      out.write("                           \n");
      out.write("                           ");
 String sql="select* from event";
                    ResultSet rs=connect.getData(sql);
                     while(rs.next())
                     {
                         
                       
      out.write("\n");
      out.write("                       <ul>\n");
      out.write("                           <font face=\"Lucida Calligraphy\" size=\"4\"><h4><p style=\"color: #003399\"><marquee><li>");
      out.print(rs.getString(2));
      out.write("</li></marquee></p></h4></font>\n");
      out.write("                       </ul>\n");
      out.write("                       ");

                           }  
      out.write("\t \n");
      out.write("                           \n");
      out.write("\t</div>\n");
      out.write("    \n");
      out.write("                           ");
      out.write("\n");
      out.write("   <div class=\"clearfix\"> </div>\n");
      out.write("</div>\n");
      out.write("<!--courses end here-->\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("          <label></label>\n");
      out.write("          </div> \n");
      out.write("          \n");
      out.write("<div class=\"form-group\">\n");
      out.write("          <label></label>\n");
      out.write("          </div> \n");
      out.write("          \n");
      out.write("<div class=\"form-group\">\n");
      out.write("          <label></label>\n");
      out.write("          </div> \n");
      out.write("          \n");
      out.write("\n");
      out.write("\n");
      out.write("<!--welcome end here-->\n");
      out.write("<!--testimonial start here-->\n");
      out.write("<div class=\"testimo\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"testimo-main\">\n");
      out.write("\t\t\t<h3>True Education</h3>\n");
      out.write("\t\t\t<p>A great university needs a place where thinkers from across its campus and around the world come together to take risks, explore new ideas, and connect theory and practice.</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!--testimonial end here-->\n");
      out.write("<!--our admissions start here-->\n");
      out.write("<div class=\"admission\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"admissions-main\">\n");
      out.write("\t\t\t<div class=\"admission-top\">\n");
      out.write("\t\t\t\t<h3>Light up the Educational Fire</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"admission-bottom\">\n");
      out.write("\t\t\t\t<div class=\"col-md-6 admission-left\">\n");
      out.write("\t\t\t\t\t<span class=\"quot1\"> </span>\n");
      out.write("\t\t\t\t\t<div class=\"quot-text\">\n");
      out.write("\t\t\t\t\t\t<p>Black color is sentimentaly bad But every black board makes the students life Bright.</p>\n");
      out.write("\t\t\t\t\t    <h4>Dr.APJ Abdul Kalam</h4>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t <div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-6 admission-left\">\n");
      out.write("\t\t\t\t\t<span class=\"quot1\"> </span>\n");
      out.write("\t\t\t\t\t<div class=\"quot-text\">\n");
      out.write("\t\t\t\t\t\t<p>Education is the most powerful weapon which you can use to change the world.</p>\n");
      out.write("\t\t\t\t\t    <h4>Nelson Mandela</h4>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t  <div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t  <div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!--our admissions end here-->\n");
      out.write("<!--course strat here-->\n");
      out.write("<div class=\"course\">\n");
      out.write("\t<div class=\"col-md-6 course-left\">\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"col-md-6 course-right\">\n");
      out.write("\t\t<!--<h6>voluptatem accusantium</h6>-->\n");
      out.write("\t\t<h3>What We Do</h3>\n");
      out.write("\t\t<p>On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire.</p>\n");
      out.write("\t    <a href=\"contact.jsp\">Contact Us</a>\n");
      out.write("\t</div>\n");
      out.write("   <div class=\"clearfix\"> </div>\n");
      out.write("</div>\n");
      out.write("<!--courses end here-->\n");
      out.write("<!--footer start here-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--footer end here-->\n");
      out.write("<!--copy right-->\n");
      out.write("<div class=\"copy-rights\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"copy-rights-main\">\n");
      out.write("\t\t\t<p>&copy; 2016 Training. All rights reserved | Design by <a href=\"http://w3layouts.com/\">W3layouts</a></p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!--/copy rights-->\n");
      out.write("</body>\n");
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
