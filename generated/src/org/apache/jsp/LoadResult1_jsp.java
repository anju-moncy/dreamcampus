package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.Vector;
import java.util.Arrays;

public final class LoadResult1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/RequestReader.jsp");
  }

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      Settings1.MasterReport1 master = null;
      synchronized (_jspx_page_context) {
        master = (Settings1.MasterReport1) _jspx_page_context.getAttribute("master", PageContext.PAGE_SCOPE);
        if (master == null){
          master = new Settings1.MasterReport1();
          _jspx_page_context.setAttribute("master", master, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      Settings1.LockManager lm = null;
      synchronized (_jspx_page_context) {
        lm = (Settings1.LockManager) _jspx_page_context.getAttribute("lm", PageContext.PAGE_SCOPE);
        if (lm == null){
          lm = new Settings1.LockManager();
          _jspx_page_context.setAttribute("lm", lm, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

                lm.init();
                boolean serFlag=true;                
                String metacode=request.getParameter("metacode");
                String datecode=request.getParameter("datecode");
                String datecode1=request.getParameter("datecode1");
                long regno=Long.parseLong(request.getParameter("regno")); 
               
                
                int month=Integer.parseInt(datecode.substring(4,6));
                int year=Integer.parseInt(datecode.substring(0,4));
                System.out.println(metacode);
                System.out.println(datecode);
                        System.out.println(serFlag);
                System.out.println(datecode1);
               System.out.println(regno);
                System.out.println(month+"mn");
                System.out.println(year+"yr");
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        ");

            
             /*   boolean serFlag=true;
                lm.init();
                String metacode=request.getParameter("metacode");
                String datecode=request.getParameter("datecode");
                String datecode1=request.getParameter("datecode1");
                int regno=Integer.parseInt(request.getParameter("regno"));
                
                int month=Integer.parseInt(datecode.substring(4,6));
                int year=Integer.parseInt(datecode.substring(0,4));*/
                //int day=Integer.parseInt(datecode.substring(6,8));
                
                String[]metaInfo=new String[2];
                metaInfo[0]=metacode.substring(0,3);
                metaInfo[1]=metacode.substring(3);
                System.out.println(metaInfo[0]);
                  System.out.println(metaInfo[1]+"metaaaaaaaaaaaaaa");
                System.out.println("in load"+month);
                 System.out.println("in load"+year);
                
                master.init(month,year);
                int totalDays=master.getTotalDays();
                System.out.println(totalDays+"totaldays");
                int totalDays1=0;
                String between="";
                int monDiff=0;
                Vector<Integer> daysVector=new Vector <Integer> ();
                daysVector.add(totalDays);                
                String[]datecodearray=null;                
                boolean flag=false;
                if(datecode1 != null    &&  !datecode1.isEmpty())
                {
                    System.out.println("Info:   in if");
                    flag=true;                    
                    between="OR datecode like('".concat(datecode1).concat("%')");
                    month=Integer.parseInt(datecode1.substring(4,6));
                    year=Integer.parseInt(datecode1.substring(0,4));
                    monDiff=Integer.valueOf(datecode1)-Integer.valueOf(datecode);monDiff++;                    
                    datecodearray=new String[monDiff];
                    System.out.println("length:"+datecodearray.length);
                    datecodearray[0]=datecode; 
                    System.out.println(datecodearray[0]+"gggggggggggggggggggggggg");
                        String yr=datecode.substring(0,4);
                        System.out.println(yr+" yr");
                        String yr1=datecode1.substring(0,4);
                        System.out.println(yr1+"yr6");
                        int j=1;
                        if(yr.equals(yr1)){
                            int mn=Integer.valueOf(datecode.substring(4,6));
                            int mn1=Integer.valueOf(datecode1.substring(4,6));                            
                            do{
                                System.out.println(mn+"mn of yr");
                                mn++; 
                                System.out.println(mn+"mn of yr");
                                
                                master.init(mn,Integer.valueOf(yr));
                                totalDays1=master.getTotalDays();
                                System.out.println(totalDays1+"days 1");
                                daysVector.add(totalDays1);                                
                                if(mn<10){
                                    datecodearray[j]=yr.concat("0"+mn);  
                                    System.out.println("date:"+datecodearray[j]);
                                }else{
                                    datecodearray[j]=yr.concat(String.valueOf(mn));                                                                  
                                }j++;
                            }while(j<datecodearray.length);
                        }else{
                            int diff=yr1.compareTo(yr);
                            if(diff==1){
                                int mn=Integer.valueOf(datecode.substring(4,6));
                                int mn1=Integer.valueOf(datecode1.substring(4,6));
                                System.out.println(mn1+"difffffffff");
                                mn1+=12;
                                System.out.println(mn1+"aftrrrrrrrrrrrrr");
                                j=1;
                                if((mn1-mn)<=6){
                                        do{
                                            if(mn<=12){
                                                    master.init(mn,Integer.valueOf(yr));
                                                    totalDays1=master.getTotalDays();
                                                    daysVector.add(totalDays1);
                                                    if(mn<10){
                                                        datecodearray[j]=yr.concat("0"+mn);  
                                                    }else{
                                                        datecodearray[j]=yr.concat(String.valueOf(mn));                                                                  
                                                    }                                        
                                            }else{
                                                master.init((mn-12),Integer.valueOf(yr1));
                                                totalDays1=master.getTotalDays();
                                                System.out.println(totalDays1+"dayss122");
                                                daysVector.add(totalDays1);
                                                datecodearray[j]=yr1.concat(String.valueOf("0"+(mn-12)));
                                            }
                                                j++;mn++;

                                        }while(mn<=mn1);
                                }else{
                                    out.println("INVALID SEARCH...");serFlag=false;
                                }
                            }else{
                                out.println("INVALID SEARCH...");serFlag=false;
                            }
                        }                  
                }else{
                    datecodearray=new String[1];
                    datecodearray[0]=datecode; 
                    }
                System.out.println("between:"+between+"d:"+datecode+"d1:"+datecode1+"v:"+daysVector.size());
                if(serFlag){
                        if(regno>2){
                            int k=0;
                            for(Iterator dayIt=daysVector.iterator();dayIt.hasNext();){
                                System.out.println(dayIt+"days in it");
                                int days=(Integer)dayIt.next();   
                                System.out.println(days+"printttttttttttttttttt days");
                                StringBuilder sb=master.setSingleQuery(days);
                                String yrMonth=datecodearray[k].substring(0,6);
                                sb.append("mast.datecode like('").append(datecodearray[k]).append("%')").append(" AND mast.regno=").append(regno).append(" AND mast.sem=").append(metaInfo[1]).append(" AND reg.regno=").append(regno);
                                k++;                                
                                Vector attData=lm.executeQuery(sb.toString());                    
                                Iterator it=attData.iterator();
                                int i=1;  
                               // sb.replace(0,sb.length(),"");
                                boolean flag1=true;
                                while(it.hasNext()){   flag1=false;                                 
                                    Vector data=(Vector)it.next();   
                                    System.out.println(days+":data:"+data);
                                    sb.replace(0,sb.length(),"");  
                                    if(i==1){i++;                                       
                                      master.setTableHeader(sb,data.get(days).toString(),yrMonth);
                                      out.println(sb.toString());
                                    }sb.replace(0,sb.length(),"");                        
                                    master.setTableBody(sb,data,days);
                                    
                                    
                                }
                                sb.append("</table>");
                                if(!flag1){out.println(sb.toString());}                              
                                sb.replace(0,sb.length(),"SELECT ");
                            }
                        }else if(regno==2){  
                            int k=0;
                            for(Iterator dayIt=daysVector.iterator();dayIt.hasNext();){
                                int days=(Integer)dayIt.next();
                                StringBuilder sb1=master.setGroupQuery(days);
                                String yrMonth=datecodearray[k].substring(0,6);
                               // sb1.append("mast.datecode like('").append(datecodearray[k]).append("%')").append(" AND  mast.regno=reg.regno ").append(" GROUP BY reg.regno");  
                                 sb1.append("mast.datecode like('").append(datecodearray[k]).append("%')").append(" AND  mast.regno=reg.regno ").append(" GROUP BY mast.regno"); 
                                System.out.println("group query:"+sb1.toString());k++;                                
                                Vector group=lm.executeQuery(sb1.toString());
                                Iterator it=group.iterator();
                                int i=0;
                                sb1.replace(0,sb1.length(),"");                   
                                int st=1;
                                int end=6;
                                out.println("<table border=1>");
                                while(it.hasNext()){
                                    Vector v=(Vector)it.next();                                    
                                    if((st+3)==end){
                                        out.println("<tr>");
                                    }
                                    out.println("<td>");                                    
                                    master.setTableHeader(sb1,v.get((days)).toString(),yrMonth);
                                    out.println(sb1.toString());                        
                                    sb1.replace(0,sb1.length(),"");
                                    master.setTableBody(sb1,v,days);
                                    out.println(sb1.toString());
                                    sb1.replace(0,sb1.length(),"");
                                    out.println("</td>");
                                    st++;
                                    if(st==end){
                                        st=1;
                                        out.println("</tr>");
                                    }                        
                                }out.println("</table>");
                            }
                        }
                }else{
                    out.println("INVALID SEARCH...");
                }
                
        
      out.write("\n");
      out.write("   </body>\n");
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
