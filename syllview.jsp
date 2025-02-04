<%@page import="java.sql.ResultSet"%>
<%@page import="DbConnection.connect"%>
<!--Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>Approve Students</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.0.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Training Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--Google Fonts-->
<link href='//fonts.googleapis.com/css?family=Asap:400,700' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Kreon:400,700,300' rel='stylesheet' type='text/css'>
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
	<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
				});
			});
	</script>
<!-- //end-smoth-scrolling -->
<script src="js/bootstrap.min.js"></script>
</head>
<body>
<!--header start here-->
<div style="background: #FFC107;">
	<div class="container">
		<div class="header">
			<div class="col-md-7 logo">
				<a href="principalhome.jsp"><h1>Digital CamPus</h1></a>
			</div>
			<div class="col-md-5 details">
				<div class="addre">
					<!--span class="location"> </span>
					  <div class="detail-para">
						<p>One reject</p>				
					  </div>
					<div class="clearfix"> </div>-->
				</div>
				<div class="addre ad-para">
					<span class="tel-ph"> </span>
					 <div class="detail-para">					
						<p> Email: <a href="mailto:anjanakrishnan1993@gmail.com">@gmail.com</a></p>
					  </div>
					  <div class="clearfix"> </div>
				</div>
				
			  <div class="clearfix"> </div>
			</div>
		  <div class="clearfix"> </div>
		</div>
		<div class="top-nav">
			<div class="navbar-header">
	   			 <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
	                <span class="sr-only">Toggle navigation</span>
	                <span class="icon-bar"></span>
	                <span class="icon-bar"></span>
	                <span class="icon-bar"></span>
                </button>
              </div>
	   		<div id="navbar" class="navbar-collapse collapse">
	                    <ul class="nav navbar-nav">
	                    <li class="home"><a href="principalhome.jsp">Admin Home</a></li>
					  <li class=""><a href="teacher.jsp">Register Teacher</a></li>
					  <li class=""><a href="regview.jsp">Approve Students</a></li>
					  <li class=""><a href="course.jsp">Add Courses&Departments</a></li>
                                          <li class=""><a href="duty.jsp">Add Duty to Teacher</a></li>
                                          <li class=""><a href="syllabus.jsp">Upload Syllabus</a></li>
                                          <li class=""><a href="logout.jsp">Logout</a></li>
	                    </ul>
	                </div>
                   
 
      </div>    
        </div>
    <div class="contact">
        <form>
      <h3 class="grid1" style="background-color: #fff;">
          
          <div class="container">
		<div class="wel-main">
		  <div class="wel-top">
			<h3>
                            <p class="grid1">
                            <button type="button" class="btn btn-xs btn-success"><</button>
                            <button type="button" class="btn btn-xs btn-success"><</button>
                            <button type="button" class="btn btn-xs btn-success"><</button>
                            Syllabus
                            <button type="button" class="btn btn-xs btn-success">></button>
                            <button type="button" class="btn btn-xs btn-success">></button>
                            <button type="button" class="btn btn-xs btn-success">></button>
                            </p>
                        </h3>
                    </div>
	      </div>
            
          
    <div class="bs-example" data-example-id="contextual-table" style="font-size: 0.6em;" style="border: 1px solid #eee;">
    <table class="table">
      <thead>
        <tr class="warning">
          <th>Course</th>
          <th>Syllabus</th>
        </tr>
      </thead>
          
        <tbody>
            <%
                    String sql="select course.course,semester.semester,syllabus.supload from course,semester,syllabus where course.courseid=syllabus.course and semester.semid=syllabus.semester";
                    ResultSet r=connect.getData(sql);
                    %>
                <%
                    while(r.next())
                    {
                       
                 %>
        <tr class="success">
          <th scope="row"><%=r.getString(1)%></th>
          <td><%=r.getString(2)%></td>
        </tr>
         <%
                    }%>
       
      </tbody>
    </table>
  </div>
                
                
          </div>
    
        </form>
    </div>
  

<!--header start here-->


<div class="admission">
	<div class="container">
		<div class="admissions-main">
			<div class="admission-top">
				<h3>Light up the Educational Fire</h3>
			</div>
			<div class="admission-bottom">
				<div class="col-md-6 admission-left">
					<span class="quot1"> </span>
					<div class="quot-text">
						<p>Black color is sentimentaly bad But every black board makes the students life Bright.</p>
					    <h4>Dr.APJ Abdul Kalam</h4>
					</div>
				 <div class="clearfix"> </div>
				</div>
				<div class="col-md-6 admission-left">
					<span class="quot1"> </span>
					<div class="quot-text">
						<p>Education is the most powerful weapon which you can use to change the world.</p>
					    <h4>Nelson Mandela</h4>
					</div>
				  <div class="clearfix"> </div>
				</div>
			  <div class="clearfix"> </div>
			</div>
		</div>
	</div>
</div>


<!--welcome start here-->

<!--welcome end here-->
<!--testimonial start here-->
<div class="testimo">
	<div class="container">
		<div class="testimo-main">
			<h3>True Education</h3>
			<p>A great university needs a place where thinkers from across its campus and around the world come together to take risks, explore new ideas, and connect theory and practice.</p>
		</div>
	</div>
</div>
<!--testimonial end here-->
<!--our admissions start here-->

<!--our admissions end here-->
<!--course strat here-->

<!--footer end here-->
<!--copy right-->
<div class="copy-rights">
	<div class="container">
		<div class="copy-rights-main">
			<p>&copy; 2016 Training. All rights reserved | Design by <a href="http://w3layouts.com/">W3layouts</a></p>
		</div>
	</div>
</div>
<!--/copy rights-->
</body>
</html>