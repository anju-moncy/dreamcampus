
package DbConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GenerateCode {
    public static StringBuilder generatedownload(String c) throws SQLException
    {
     StringBuilder sub=new StringBuilder();
     System.out.println("fffffffffffffffffffffffffffffffffffffffffff"+c);
     //System.out.println("ffffffffffffffffffffffffffff"+s);
     
     String sql1="select * from syllabus where course='"+c+"'";
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
     sub.append("<br><br><table><tr><td>Syllabus</td><td> </td><td> </td><td> </td>");
     try
     {
          if(rs1.next())
          {
              sub.append("<td><a href=syllabusmsccs.jsp>Download M.Sc cs</a></td>");
          }
          else if(rs1.next())
                  {
                      sub.append("<td><a href=syllabusmca.jsp>Download MCA</a></td>");
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
