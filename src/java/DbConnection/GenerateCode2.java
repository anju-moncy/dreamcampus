/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbConnection;

import static DbConnection.connect.rs;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GenerateCode2 {
    public static StringBuilder generatename(String n) throws SQLException
    {
     StringBuilder sub=new StringBuilder();
     System.out.println("fffffffffffffffffffffffffffffffffffffffffff"+n);
     
     
   /*  String sql1="select * from registration where sid='"+n+"'";
     ResultSet rs1=connect.getData(sql1);
     
     */
     String sql1="SELECT * from registration WHERE user= '"+n+"'" ;
     
     ResultSet rs1=connect.getData(sql1);
     
     sub.append("<table border=1><tr><td>Student ID </td><td>Student name </td><td>Gender </td><td>Date of birth </td><td>E-mail id </td><td>Course </td><td>Semester </td><td>Address </td><td>Ph no</td></tr>");
     try
     {
          while(rs1.next())
          {
              sub.append("<tr><td>"+rs1.getString(1)+"</td>");
              System.out.println(rs1.getString(1));
              sub.append("<tr><td>"+rs1.getString(1)+"</td>");
              sub.append("<td>"+rs1.getString(2)+"</td>");
              sub.append("<td>"+rs1.getString(3)+"</td>");
              sub.append("<td>"+rs1.getString(4)+"</td>");
              sub.append("<td>"+rs1.getString(5)+"</td>");
              sub.append("<td>"+rs1.getString(6)+"</td>");
              sub.append("<td>"+rs1.getString(7)+"</td>");
              sub.append("<td>"+rs1.getString(8)+"</td>");
              sub.append("<td>"+rs1.getString(9)+"</td>");
              sub.append("<td><a href=approveuser.jsp?username="+rs1.getString(2)+">Approve</a></td>");
             // sub.append("<td><a href=approveuser.jsp?sid="+n+">Delete</a></td>");
          }
          sub.append("</tr></table>");
     }
         catch(SQLException ex)
         {
             Logger.getLogger(GenerateCode2.class.getName()).log(Level.SEVERE, null, ex);
         }
         //}
     return sub;
     }
    }
