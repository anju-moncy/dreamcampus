/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;


public class GenerateCode4 {
     public static StringBuilder generateteachmsg(int nm) throws SQLException
    {
     StringBuilder sub=new StringBuilder();
     System.out.println("fffffffffffffffffffffffffffffffffffffffffff"+nm);
     
     String sql1="SELECT teacher.tname,uploadnote . * \n" +
"FROM teacher, uploadnote\n" +
"WHERE uploadnote.tname = teacher.tid\n" +
"AND uploadnote.tname =  '"+nm+"'" ;
     System.out.println("got stud nameeeeeeeeeeeeeeeee");
     ResultSet rs1=connect.getData(sql1); 
   

     sub.append("<br><br><table><tr><td>Teacher name </td><td>Message </td><td>Documents </td></tr>");
     try
     {
         
        while(rs1.next())
                {
             sub.append("<tr><td>"+rs1.getString(1)+"</td>");
             //sub.append("<td>"+rs1.getString(2)+"</td>");
             //sub.append("<td>"+rs1.getString(3)+"</td>");
             sub.append("<td>"+rs1.getString(8)+"</td>");
             sub.append("<td>"+rs1.getString(9)+"</td>"); 
                }
             
         
         
          
         sub.append("</tr></table>");
             
         }
     
         catch(SQLException ex)
         {
             java.util.logging.Logger.getLogger(GenerateCode4.class.getName()).log(Level.SEVERE, null, ex);
         }
        
     return sub;
  }  
    
}
