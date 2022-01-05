<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  import="java.sql.DriverManager, java.sql.Connection,java.sql.ResultSet,
  java.sql.Statement, java.io.File, java.sql.DriverManager, java.sql.Connection,java.sql.ResultSet,
  java.sql.Statement" %>

<%
Class.forName ("com.mysql.jdbc.Driver").newInstance ();

Connection c = DriverManager.getConnection("jdbc:mysql://localhost/fyp?","root","");

Statement st = c.createStatement();
   ResultSet rs;
   
    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
%>
<link rel="stylesheet" href="css/mainstyle.css" />
<div class="alertLogin"">
   
   <strong>Login Alert!</strong> <br/> It seemed that you not login as a Admin. <br/>If your are admin so please Login to access this page.
   <br /><a href="adminlogin.jsp">CLICK HERE TO LOGIN</a>
  </div>
<%} else {

%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Process to Related category</title>


<link href="css/mainstyle.css" rel="stylesheet">

<script type="text/javascript" src="js/jquery-2.2.2.min.js"></script>
<script type="text/javascript" src="js/jquery-2.2.2.js"></script>
<script src="js/jquery-1.12.2.js"></script>
<script type="text/javascript" src="js/mainscript.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/font-awesome.min.css" />
<style>
.btn {
	width:102px;
}
</style>
</head>
<script type="text/javascript">

$(document).ready(function(){

	var id =$("input#id").val();
	
	var stopword = $("input#first-btn").val();
	
	var stemming = $("input#second-btn").val();
	
	var tokenization = $("input#third-btn").val();
	
	var similarity = $("input#fourth-btn").val();
	
	//alert("id is "+id+" and name is "+stopword+stemming+tokenization);
	
		 $('#first-btn').click(function() {
			 $.get('NewTestServlet?id='+id+'&stopword='+stopword, {
					},function(responseText) {
						$('#out').html(responseText);
					}); 
			 });
		

		
		 $('#second-btn').click(function() {
				$.get('NewTestServlet?id='+id+'&stemming='+stemming, {
				}, function(responseText) {
					$('#out').text(responseText);
				}); 
					
		 });
		
		 
		 
		 $('#third-btn').click(function() {
				$.get('NewTestServlet?id='+id+'&tokenization='+tokenization, {
				}, function(responseText) {
					$('#out').text(responseText);
				}); 		
		 });
		 
		 $('#fourth-btn').click(function() {
				$.get('NewTestServlet?id='+id+'&similarity='+similarity, {
				}, function(responseText) {
					$('#out').text(responseText);
				}); 
				
				
				$(location).attr('href', 'notify_admin.jsp')
				
		 });
});
	

/**
 * Display and Disable buttons
 */
$(document).ready(function(){
    $("#first-btn").click(function(){
    	
        $("#second-btn").show();
       $("#first-btn").prop('disabled', true);
    });
});

$(document).ready(function(){
    $("#second-btn").click(function(){
    	
        $("#third-btn").show();
       $("#second-btn").prop('disabled', true);
    });
});
$(document).ready(function(){
    $("#third-btn").click(function(){
    
        $("#fourth-btn").show();
       $("#third-btn").prop('disabled', true);
    });
});
$(document).ready(function(){
    $("#fourth-btn").click(function(){
    	
        $("#fifth-btn").show();
       $("#fourth-btn").prop('disabled', true);
    });
});
$(document).ready(function(){
    $("#fifth-btn").click(function(){
    	
        $("#sixth-btn").show();
       $("#fifth-btn").prop('disabled', true);
    });
});

</script>
</head>
<body>

<%
		
		String id = request.getParameter("id");
		
		
%>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="dashboard.jsp"><i class="fa fa-arrow-circle-left"></i>  BACK TO DASHBOARD</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav">
        <li>
          </ul>
        </li>
      </ul> 
      <ul class="nav navbar-nav navbar-right">
        <li><a href="upload.jsp" id="uploada" style="display:none;"><button class="btn btn-success"><i class="fa fa-upload"></i> Upload</button></a></li>
        
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
	
	
	
			<div class="container">
			<div class="row">
			
				<div class="col-md-6 col-sm-6 col-sm-offset-3" style="border:3px solid #fff;padding:10px;"">
			<center>
					<input type="submit" value="stopWord" class="btn " name="stopword" id="first-btn" onclick="btnStopWord(<%= id %>)" style="background:#fff;color:#b90000;"></br>
					 <input type="hidden" id="id" name="id" value="<%= id %>">
					<input type="submit" name="stemming" class="btn " id="second-btn"  value="stemming" onclick="btnStemming(<%= id %>)" style="display:none;background:#fff;color:#b90000;"><br>
					<input type="submit" class="btn " id="third-btn" value="tokenization" name="Tokenization" onclick="btnTokenization(<%= id %>)" style="background:#fff;color:#b90000;display:none"><br>
					<input type="submit" class="btn " id="fourth-btn" value="similarity" style="background:#fff;color:#b90000;display:none"><br>
					
					</center>
				</div>
				
          </div>
	</div>
	<br>
	<br>
			<div id="Mainfooter">
				<center>&copy;WBDC&amp;R | By 1812-1858/F12 - IIUI</center>
			</div>
		



	<!--   <script src="js/sitescript.js"></script> 
	<script src="js/jquery-1.12.2.js"></script>-->

</body>
</html>
<%}%>