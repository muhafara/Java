<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.DriverManager, java.sql.Connection,java.sql.ResultSet,
  java.sql.Statement" %>

<%
Class.forName ("com.mysql.jdbc.Driver").newInstance ();

Connection c = DriverManager.getConnection("jdbc:mysql://localhost/fyp?","root","");

Statement cs = c.createStatement();
 
   
    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
%>
<link rel="stylesheet" href="css/mainstyle.css" />
<div class="alertLogin" style="text-align:center; color:#fff;">
   
   <strong>Login Alert!</strong> <br/> It seemed that you not login as a Admin. <br/>If your are admin so please Login to access this page.
   <br /><a href="adminlogin.jsp" style="color:#fff;">CLICK HERE TO LOGIN</a>
  </div>
<%} else {

	
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Approved</title>
<link rel="stylesheet" href="css/style.css" type="text/css" />
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/font-awesome.min.css" />
<script type="text/javascript" src="js/custom/general.js"></script>
<script type="text/javascript" src="js/custom/dashboard.js"></script>
<script type="text/javascript" src="js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript" src="js/custom/general.js"></script>
<script type="text/javascript" src="js/mainscript.js"></script>

<!--[if lt IE 9]>
	<script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
<![endif]-->
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
</head>

<body class="loggedin">

<!-- START OF HEADER -->
<div class="header radius3">
  <div class="headerinner"> <a href="#" style="color:#fff;text-decoration:none"><h1 style="font-family: 'BebasNeueRegular', Arial, Helvetica, sans-serif; letter-spacing: 0.5px; font-weight: normal; color: #fff;font-size:28px;">WEB BASED APP FOR DOCUMENT CLUESTRING AND RETRIEVAL </h1><!--  <img src="images/starlight_admin_template_logo_small.png" alt="" />--></a>
    <div class="headright">
      <div class="headercolumn">&nbsp;</div>
      <!--headercolumn-->
      <%@ include file="notify_popup.jsp"%>
        <!--notiwrapper--> 
      <!--headercolumn-->
      <div id="userPanel" class="headercolumn"> <a href="javascript:;" class="userinfo radius2"> Welcome <!--  <img src="images/avatar.png" alt="" class="radius2" /> --><span><strong>Admin</strong></span> </a>
        <div class="userdrop">
          <ul>
          	
            <li><a href="logout.jsp">Logout</a></li>
            
          </ul>
        </div>
        <!--userdrop--> 
      </div>
      <!--headercolumn--> 
    </div>
    <!--headright--> 
    
  </div>
  <!--headerinner--> 
</div>
<!--header--> 
<!-- END OF HEADER --> 

<div class="mainwrapper">
  <div class="mainwrapperinner">
    <div class="mainleft">
      <div class="mainleftinner">
        <div class="leftmenu">
          <ul>
            <li><a href="dashboard.jsp" class="dashboard"><span>Dashboard</span></a></li>
            <li><a href="notify_admin.jsp" class="notify"><span>Notify</span></a></li>
            <li class="current"><a href="approved.jsp" class="approved"><span>Approved</span></a></li>
          </ul>
        </div>
        <!--leftmenu-->
        <div id="togglemenuleft"><a></a></div>
      </div>
      <!--mainleftinner--> 
    </div>
    <!--mainleft-->
    
    <div class="maincontent">
      <div class="maincontentinner">
        <ul class="maintabmenu">
          <li class="current"><a href="javascript:;">Approved</a></li>
        </ul>
        <!--maintabmenu-->
        
        <div class="content">
          <div class="contenttitle">
            <h2 class="table"><span class="approved">Approved Files</span></h2>
          </div>
           <!--contenttitle-->
          <table cellpadding="0" cellspacing="0" border="0" class="stdtable" id="dyntable">
            <colgroup>
            <col class="con0" />
            <col class="con1" />
            <col class="con0" />
            <col class="con1" />
            <col class="con0" />
            </colgroup>
            <thead>
              <tr>
                <th class="head0">Title</th>
                <th class="head1">Description</th>
                <th class="head0">Delivered</th>
                
              </tr>
            </thead>
            <tfoot>
              <tr>
                <th class="head0">Title</th>
                <th class="head1">Description</th>
                <th class="head0">Delivered</th>
                
              </tr>
            </tfoot>
            <tbody>
            
              <% 
              
             ResultSet  rsu=  cs.executeQuery("SELECT * FROM `upload` where `delivered`='1'");
             
            int id;
              while(rsu.next()) {
             
            	id = rsu.getInt(1);
            	
            	int d = rsu.getInt(4);
            	
            	
            	
            	String description = rsu.getString(3);
            	
            	
  	        
			%>
              <tr class="gradeA">
                <td><%= rsu.getString(2) %></td>
                <td><% if(d == 1){out.println("File Uploaded");} else { out.println(description);} %></td>
                <td><% if(d == 1){out.println("<span style='color:green'>Approved</span>");} else { out.println("");} %></td>
                
              </tr>
              <% 
              
			}
          
             // System.out.println(id);
          %>
            </tbody>
          </table>
          <br clear="all" />
        </div>
        <!--content--> 
        
      </div>
      <!--maincontentinner-->
      
      <div class="footer">
        <p>WEB BASED APP FOR DOCUMENT CLUESTRING AND RETRIEVAL </p>
      </div>
      <!--footer--> 
      
    </div>
    <!--maincontent-->
    
    <div class="mainright">
      <div class="mainrightinner"> </div>
      <!--mainrightinner--> 
    </div>
    <!--mainright--> 
    
  </div>
  <!--mainwrapperinner--> 
</div>
<!--mainwrapper--> 
<!-- END OF MAIN CONTENT -->

</body>
</html>
<% }%>