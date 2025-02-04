/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.text.DecimalFormat;
import Settings1.*;
import java.util.Vector;
/**
 *
 * @author User
 */
public class MasterReport1 {
    private String[]totaldays={"","31","28","31","30","31","30","31","31","30","31","30","31"};
    //private String[]monthNames={"","","","","","","","","","","","",""};
    private int month;
    private int year;
    boolean flag=false;
    private StringBuilder sb;
    private int start=1;
    private int end=6;
    public void init(int month,int year){
        this.month=month;
        flag=(year%4==0)?true:false;  
        sb=new StringBuilder("SELECT ");
    }
    public int getTotalDays(){
        if(flag){month=Integer.parseInt(totaldays[month]);month++;}
        else{
            month=Integer.parseInt(totaldays[month]);
        }
        return month;
    }
    public StringBuilder setSingleQuery(int days){        
        for(int i=1;i<=days;i++){
            sb.append("mast.day_").append(i).append(",");
        }
        //sb.deleteCharAt((sb.length()-1));
        sb.append("ad.s_name from tbleattendmaster mast,adm_tble ad,stud_profile_tble reg where ");
    return sb;
    }
    public StringBuilder setGroupQuery(int days){
        sb.replace(0,sb.length(),"SELECT DISTINCT ");
        for(int i=1;i<=days;i++){
            sb.append("mast.day_").append(i).append(",");
        }
        //sb.replace(sb.lastIndexOf(","),sb.length(),"");
        sb.append("ad.s_name,reg.reg_no,ad.st_admno from tbleattendmaster mast,stud_profile_tble reg,adm_tble ad where ");
    return sb;
    }
    public void setTableHeader(StringBuilder sb1,Object name,String yrMonth){
        sb1.append("<table><tr><td style=background-color:#FFFF00>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;MONTHLY REPORT OF "+name+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td><td style=color:red>Date:"+yrMonth+"</td></tr></table><br/><table border=1>");
        sb1.append("<tr><td style=background-color:#FFFF00>DAY</td><td align=center>&nbsp;</td><td style=background-color:#FFFF00>DAY</td><td align=center>&nbsp;</td><td style=background-color:#FFFF00>DAY</td>");
        sb1.append("<td align=center>&nbsp;</td><td style=background-color:#FFFF00>DAY</td><td align=center>&nbsp;</td><td style=background-color:#FFFF00>DAY</td><td align=center>&nbsp;</td></tr>");
                          
    }
    
    public void setTableBody(StringBuilder sb2,Vector data,int days){        
        int start=1;int end=6;
        int status=0;
        int total=0;
        int atdays=0;
        
        for(int da=0;da<days;da++){
            if((start+5)==end){
                sb2.append("<tr>");
            }if(da<days){
                status=Integer.parseInt(data.get((da)).toString());
                if(status<3&&status>=0){
                    atdays++;
                    total+=status;
                }
                
            } 
                
            String color="";
            if(status==1){color="yellow";}else if(status==2){color="orange";}else{color="red";}
            sb2.append("<td>"+(da+1)+"</td>").append("<td style=background-color:"+color+">").append(status).append("</td>");
            start++;
            if(start==end){
            sb2.append("</tr>");start=1;}
           
        }   
        double d=total;
        Double db=new Double(Double.MAX_EXPONENT);
        double avg=db.valueOf(d/2);
       d=(avg/atdays)*100;
       DecimalFormat df=new DecimalFormat("#.00");
       
        sb2.append("<td><b><tt>TOTAL</tt></b></td><td align=center colspan=9 style=background-color:yellow>").append(df.format(d)).append("%</td></table>W Days=").append(atdays).append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Days Present=").append(avg);
    }
    
    
}
//SELECT DISTINCT mast.day_1,mast.day_2,mast.day_3,mast.day_4,mast.day_5,mast.day_6,mast.day_7,mast.day_8,mast.day_9,mast.day_10,mast.day_11,mast.day_12,mast.day_13,mast.day_14,mast.day_15,mast.day_16,mast.day_17,mast.day_18,mast.day_19,mast.day_20,mast.day_21,mast.day_22,mast.day_23,mast.day_24,mast.day_25,mast.day_26,mast.day_27,mast.day_28,mast.day_29,mast.day_30,mast.day_31,ad.s_name,reg.reg_no,ad.st_admno FROM tbleattendmaster mast,stud_profile_tble reg,adm_tble ad WHERE mast.datecode LIKE('20140529%') AND mast.courseid=104 AND mast.sem=1 AND reg.st_admno=ad.st_admno AND mast.regno=reg.reg_no GROUP BY ad.st_admno