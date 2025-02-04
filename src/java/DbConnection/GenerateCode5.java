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


public class GenerateCode5 {
    public static StringBuilder generateqn(String c,String s) throws SQLException
    {
     StringBuilder sub=new StringBuilder();
     System.out.println("fffffffffffffffffffffffffffffffffffffffffff"+c);
     System.out.println("ffffffffffffffffffffffffffff"+s);
     
     String sql1="select * from qnpaper where course='"+c+"' and semester='"+s+"'";
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
     sub.append("<br><br><table border=1><tr><td>Year</td><td>Sample Qnpapers</td></tr>");
     try
     {
          while(rs1.next())
          {
              sub.append("<tr><td>"+rs1.getString(4)+"</td>");
              //sub.append("<td>""<img src=qnpaper/"+rs1.getString(5)+"height=200 width=200>">""</td>");
              sub.append("<td><img src=qnpaper/"+rs1.getString(5)+" height=550 width=550></td>");
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
