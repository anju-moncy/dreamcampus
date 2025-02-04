/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import org.jboss.logging.Logger;


public class GenerateCode1 {
    public static StringBuilder generatestudmsg(int nm) throws SQLException
    {
     StringBuilder sub=new StringBuilder();
     System.out.println("fffffffffffffffffffffffffffffffffffffffffff"+nm);
     
     String sql1="SELECT course.course, semester.semester, registration.sname, smessage . * \n" +
"FROM course, semester, registration, smessage\n" +
"WHERE smessage.course = course.courseid\n" +
"AND smessage.semester = semester.semid\n" +
"AND smessage.sname = registration.sid\n" +
"AND smessage.tname =  '"+nm+"'" ;
     System.out.println("got stud nameeeeeeeeeeeeeeeee");
     ResultSet rs1=connect.getData(sql1); 
   

     sub.append("<br><br><table><tr><td>Course </td><td>Semester </td><td>Student name </td><td>Message </td><td>Documents </td></tr>");
     try
     {
         
        while(rs1.next())
                {
             sub.append("<tr><td>"+rs1.getString(1)+"</td>");
             sub.append("<td>"+rs1.getString(2)+"</td>");
             sub.append("<td>"+rs1.getString(3)+"</td>");
             sub.append("<td>"+rs1.getString(8)+"</td>");
             sub.append("<td>"+rs1.getString(9)+"</td>"); 
                }
             
         
         
          
         sub.append("</tr></table>");
             
         }
     
         catch(SQLException ex)
         {
             java.util.logging.Logger.getLogger(GenerateCode1.class.getName()).log(Level.SEVERE, null, ex);
         }
        
     return sub;
  }  
}