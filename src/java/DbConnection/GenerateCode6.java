/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GenerateCode6 {
    
    public static StringBuilder generatetimetable(String c,String s) throws SQLException
    {
     StringBuilder sub=new StringBuilder();
     System.out.println("fffffffffffffffffffffffffffffffffffffffffff"+c);
     System.out.println("ffffffffffffffffffffffffffff"+s);
     
     String sql1="select * from timetable where course='"+c+"' and semester='"+s+"'";
     ResultSet rs1=connect.getData(sql1);
     /*if(rs1.next())
     {
         //String syllabus=rs1.getString(4);
         System.out.println(sql1);
         System.out.println(syllabus);
         
 String sql="select supload"+
                "from syllabus" +
                "where course = '"+rs1.getString(2)+"'" +
                "and semester = '"+rs1.getString(3)+"'";
     
     System.out.println(sql);
     ResultSet rs=connect.getData(sql);*/
     
     sub.append("<div class=\"form-group\">\n" +
"          <label></label>\n" +
"          </div>");
     sub.append("<div class=\"bs-example\" data-example-id=\"simple-horizontal-form\" style=\"font-size: 0.9em;\" style=\"border: 1px solid #eee;\">\n");
     sub.append("<br><br><table class=\"table\" border=1 align=\"center\">");
     try
     {
          while(rs1.next())
          {
              sub.append("<tr><td align=\"center\"\n>" +
" <td align=\"center\"\n>9:30am-10:30am\n" +
" <td align=\"center\"\n>10:30am-11:30am\n" +
" <td align=\"center\"\n>11:30am-12:30pm\n" +
" <td align=\"center\"\n>12:30pm-1:30pm\n" +
" <td align=\"center\"\n>1:30pm-2:30pm\n" +
" <td align=\"center\"\n>2:30pm-3:30pm</tr>");
              sub.append("<tr>\n" +
" <td align=\"center\">MONDAY\n" +
" <td align=\"center\"><font color=\blue\">"+rs1.getString(4)+"("+rs1.getString(5)+")<br>\n" +
" <td align=\"center\"><font color=\"pink\">"+rs1.getString(6)+"("+rs1.getString(7)+")<br>\n" +
" <td align=\"center\"><font color=\"red\">"+rs1.getString(8)+"("+rs1.getString(9)+")<br>\n" +
" <td rowspan=\"5\"align=\"center\"><br><br>L<br>U<br>N<br>C<br>H\n" +
" <td align=\"center\"><font color=\"maroon\">"+rs1.getString(10)+"("+rs1.getString(11)+")<br>\n" +
" <td align=\"center\"><font color=\"brown\">"+rs1.getString(12)+"("+rs1.getString(13)+")</tr>");
              
              sub.append("<tr>\n" +
" <td align=\"center\">TUESDAY\n" +
" <td align=\"center\"><font color=\"blue\">"+rs1.getString(14)+"("+rs1.getString(15)+")<br>\n" +
" <td align=\"center\"><font color=\"red\">"+rs1.getString(16)+"("+rs1.getString(17)+")<br>\n" +
" <td align=\"center\"><font color=\"pink\">"+rs1.getString(18)+"("+rs1.getString(19)+")<br>\n" +
" <td align=\"center\"><font color=\"orange\">"+rs1.getString(20)+"("+rs1.getString(21)+")<BR>\n" +
" <td align=\"center\"><font color=\"maroon\">"+rs1.getString(22)+"("+rs1.getString(23)+")<br>\n" +
"</tr>");
              
              sub.append("<tr>\n" +
" <td align=\"center\">WEDNESDAY\n" +
" <td align=\"center\"><font color=\"pink\">"+rs1.getString(24)+"("+rs1.getString(25)+")<br>\n" +
" <td align=\"center\"><font color=\"orange\">"+rs1.getString(26)+"("+rs1.getString(27)+")<BR>\n" +
" <td align=\"center\"><font color=\"brown\">"+rs1.getString(28)+"("+rs1.getString(29)+")<br>\n" +
" <td align=\"center\"><font color=\"green\">"+rs1.getString(30)+"("+rs1.getString(31)+")<BR>\n" +
"  <td align=\"center\"><font color=\"orange\">"+rs1.getString(32)+"("+rs1.getString(33)+")<BR>\n" +
"</tr>");
              
            sub.append("<tr>\n" +
" <td align=\"center\">THURSDAY\n" +
" <td align=\"center\">"+rs1.getString(34)+"("+rs1.getString(35)+")<br>\n" +
" <td align=\"center\"><font color=\"brown\">"+rs1.getString(36)+"("+rs1.getString(37)+")<br>\n" +
" <td align=\"center\"><font color=\"orange\">"+rs1.getString(38)+"("+rs1.getString(39)+")<BR>\n" +
" <td align=\"center\"><font color=\"blue\">"+rs1.getString(40)+"("+rs1.getString(41)+")<br>\n" +
" <td align=\"center\"><font color=\"red\">"+rs1.getString(42)+"("+rs1.getString(43)+")<br>\n" +
"</tr>");  
            
            sub.append("<tr>\n" +
" <td align=\"center\">FRIDAY\n" +
" <td align=\"center\"><font color=\"orange\">"+rs1.getString(44)+"("+rs1.getString(45)+")<BR>\n" +
" <td align=\"center\"><font color=\"maroon\">"+rs1.getString(46)+"("+rs1.getString(47)+")<br>\n" +
" <td align=\"center\"><font color=\"blue\">"+rs1.getString(48)+"("+rs1.getString(49)+")<br>\n" +
" <td align=\"center\"><font color=\"pink\">"+rs1.getString(50)+"("+rs1.getString(51)+")<br>\n" +
" <td align=\"center\"><font color=\"brown\">"+rs1.getString(52)+"("+rs1.getString(53)+")<br>\n" +
"</tr>");
            
            
            
            sub.append("<tr>\n" +
" <td align=\"center\" colspan=\"7\">\n" +
"</tr>");
            
            
            
            sub.append("<tr>\n" +
" <td align=\"center\" colspan=2>TEACHER(HOURS TAKEN)\n" +
" <td align=\"center\"><font color=\"orange\">"+rs1.getString(54)+"("+rs1.getString(55)+")<BR>\n" +
" <td align=\"center\"><font color=\"maroon\">"+rs1.getString(56)+"("+rs1.getString(57)+")<br>\n" +
" <td align=\"center\"><font color=\"blue\">"+rs1.getString(58)+"("+rs1.getString(59)+")<br>\n" +
" <td align=\"center\"><font color=\"pink\">"+rs1.getString(60)+"("+rs1.getString(61)+")<br>\n" +
" <td align=\"center\"><font color=\"brown\">"+rs1.getString(62)+"("+rs1.getString(63)+")<br>\n" +
"</tr>");
    
            
            
          }
          sub.append("</tr></table>");
     }
         catch(SQLException ex)
         {
             Logger.getLogger(GenerateCode.class.getName()).log(Level.SEVERE, null, ex);
         }
         //}
     return sub;
     }
    
    
}
