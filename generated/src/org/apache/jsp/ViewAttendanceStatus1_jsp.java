package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ViewAttendanceStatus1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html lang=\"en-US\"><!doctype html>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div id=\"wrap\">\n");
      out.write("\n");
      out.write("<section id=\"top\">\n");
      out.write("<nav id=\"mainnav\">\n");
      out.write("<h1 id=\"sitename\" class=\"logotext\">\n");
      out.write("</h1>\n");
      out.write("<ul>\n");
      out.write("   \n");
      out.write("</ul>\n");
      out.write("</nav>\n");
      out.write("</section>    \n");
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<section id=\"page\"><font color=\"#FFFFFF\"></font>\n");
      out.write("<header id=\"pageheader\" class=\"homeheader\">\n");
      out.write("<h1 class=\"sitedescription\">&nbsp;</h1>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".style1 {color: #FF0000}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("        function loadResults(){\n");
      out.write("            document.getElementById('divresult').innerHTML='';\n");
      out.write("                obj=(window.XMLHttpRequest)?new XMLHttpRequest():((window.ActiveXObject)?new ActiveXObject(\"MicroSoft.XMLHTTP\"):null);\n");
      out.write("                if(obj!=null){\n");
      out.write("                        datecode=document.getElementById('datecode').value;\n");
      out.write("                        datecode1=document.getElementById('datecode1').value;\n");
      out.write("                        r1=document.getElementById('r1');\n");
      out.write("                        r2=document.getElementById('r2');\n");
      out.write("\n");
      out.write("                        searchby=parseInt((r1.checked==true)?r1.value:((r2.checked==true)?r2.value:0));\n");
      out.write("                        searchby=(searchby==1)?document.getElementById('regno').value:searchby;\n");
      out.write("                        metacode=document.getElementById('metacode').value;\n");
      out.write("                            if(searchby>0&metacode>0&metacode.length>='4'){//&datecode>0\t\t\t\t\n");
      out.write("                                    obj.onreadystatechange=function(){\n");
      out.write("                                            if(obj.readyState==4&obj.status==200){\n");
      out.write("                                                    document.getElementById('divresult').innerHTML=obj.responseText;\n");
      out.write("                                            }\n");
      out.write("                                    };\n");
      out.write("                                    obj.open('post','LoadResult1.jsp?metacode='+metacode+'&regno='+searchby+'&datecode='+datecode+'&datecode1='+datecode1+'',true);\n");
      out.write("                                    obj.send(null);\n");
      out.write("                            }else{\n");
      out.write("                                    alert('SEARCH NOT ALLOWED');\n");
      out.write("                            }\n");
      out.write("                }\n");
      out.write("        }\n");
      out.write("\t\t\tfunction setVisible(flag){\n");
      out.write("\t\t\t\tdocument.getElementById('d1').style.display=flag;\n");
      out.write("\t\t\t}\n");
      out.write("</script>\n");
      out.write("</header>\n");
      out.write("   \n");
      out.write("<article class=\"post\">\n");
      out.write("<header class=\"postheader\">\n");
      out.write("<p><a href=\"#\"></a></p>\n");
      out.write("</header>\n");
      out.write("\t<form action=\"\" method=\"post\">\n");
      out.write("\t<table width=\"744\" border=\"1\">\n");
      out.write("  <tr>\n");
      out.write("      <td width=\"147\" height=\"37\" rowspan=\"2\"><p><tt><font size=\"3\">ENTER DATE CODE</font></tt><tt>ex:(<span class=\"style1\">20140101</span>) </tt></p>      </td>\n");
      out.write("    <td width=\"92\">From</td>\n");
      out.write("    <td>\n");
      out.write("        <input name=\"datecode\" type=\"text\" id=\"datecode\" size=\"10\" /><font size=\"3\">yyyymm</font></td>\n");
      out.write("    <td width=\"208\" rowspan=\"2\"><div align=\"justify\">\n");
      out.write("            <tt><font size=\"3\">SEARCH BY </font></tt></td>\n");
      out.write("    <td width=\"105\" rowspan=\"2\"><p>\n");
      out.write("          <input name=\"searchby\" type=\"radio\" id=\"r1\" value=\"1\" onclick=\"setVisible('block')\" />\n");
      out.write("        <font size=\"3\"> single</font>\n");
      out.write("        <input name=\"searchby\" type=\"radio\" id=\"r2\" value=\"2\" onclick=\"setVisible('none')\" />\n");
      out.write("        <font size=\"3\"> group </font>    </td>\n");
      out.write("    <td width=\"49\" rowspan=\"4\"><input name=\"btnshow\" type=\"button\" id=\"btnshow\" value=\"LOAD\" onclick=\"loadResults()\"/></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("      <td><font size=\"3\">To</font></td><td><input name=\"datecode1\" type=\"text\" id=\"datecode1\" size=\"10\" /><font size=\"3\">yyyymm</font></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("      <td height=\"20\"><tt><font size=\"3\">ENTER METACODE &and; SEM</font> </tt></td>\n");
      out.write("    <td width=\"92\"><input name=\"metacode\" type=\"text\" id=\"metacode\" size=\"15\" /></td>\n");
      out.write("    <td width=\"103\">&nbsp;</td>\n");
      out.write("    <td width=\"208\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"42\">&nbsp;</td>\n");
      out.write("    <td width=\"92\">&nbsp;</td>\n");
      out.write("    <td width=\"103\">&nbsp;</td>\n");
      out.write("    <td width=\"208\"><div id=\"d1\" style=\"display:none\"><tt><font size=\"3\">ENTER REGNO:</font></tt><br/><input type=\"text\" name=\"regno\" id=\"regno\" size=\"15\"/></div></td>\n");
      out.write("  </tr>  \n");
      out.write("</table>\n");
      out.write("<table>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td><div id=\"divresult\"></div></td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("        </form></body>\n");
      out.write(" </html>");
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
