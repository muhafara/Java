<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SEARCH YOUR DOCUMENT</title>
<link rel="stylesheet" href="css/mainstyle.css" />
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/font-awesome.min.css" />
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js">  -->
<script type="text/javascript" src="js/jquery-2.2.2.min.js"></script>
<script type="text/javascript" src="js/jquery-2.2.2.js"></script>
<script type="text/javascript" src="js/mainscript.js"></script>
  <script type="text/javascript">
$(document).ready(function(){

var search  = $("#searchbar").val();


var fileSize;

$('#file').bind('change', function() {

fileSize =this.files[0].size;

$(".alertDoc").hide(500);

});
$("#searchBtn").bind('click',function() {
	 if(fileSize>1){
	$("#main").hide(500);
    $( "#dialogDocument" ).show();
    $("#uploada").hide(500);
 
	 }else
		{
		 alert("upload a Word file");
		} 
  });


$("#third-btn").click(function() {
	
	
	if ($('input[name="searchbar"]').val().length < 1) {
		
		alert ("Please write atleast 10 digits or a paragraph \n Can't proceed in empty");
	}
	
	else {
		
		 $( "#dialogSearch" ).show();
		    $("#main").hide(500);
		    $("#uploada").hide(500);
	}
  });
  });
</script>

</head>

<body>

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
      <a class="navbar-brand" href="index.jsp"><i class="fa fa-globe"></i>WEB BASED DOCUMENT CLUESTRING AND RETRIVAL</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav">
        <li>
          </ul>
        </li>
      </ul> 
      <ul class="nav navbar-nav navbar-right">
        <li><a href="upload.jsp" id="uploada"><button class="btn btn-success"><i class="fa fa-upload"></i> Upload</button></a></li>
        
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
		<div class="container">
			<!--  <header><center><h1>WEB BASED DOCUMENT CLUESTRING<br> AND RETRIVAL</h1></center>
			 <a href="upload.jsp" id="uploada" class="btn  offset5">Upload</a></header>
			-->
			
				
					
					<div class="container">
        
        <div class="jumbotron">
        
       				 <div id="dialogSearch" title="SEARCHING....." style="display:none;margin-top:10%;margin-left:35%">
					 <h2 style="margin-left:-10%;">Wait for your Search Result</h2>
					  <img src="images/g-dots.gif" alt="Placeholder Image" />
					</div>
					
					<div id="dialogDocument" title="SEARCHING....." style="display:none;margin-top:10%;margin-left:35%">
					  <h2 style="margin-left:-25%;">Wait for your Document Match Search Result</h2>
					  <img src="images/g-dots.gif" alt="Placeholder Image" />
					</div>
          
            <div class="row" id="main">
            
                <div class="col-md-5 col-sm-6">
               
                
                   <form action="/FinalProject1812-1858/Search"method="get" onsubmit="checkText()" name="formWord">
                        <div class="form-group">
                        
                            <h3 class="text-center">Search By Paragraph Or Key Words</h3><br>
                            <input type="text" class="form-control" name="searchbar" placeholder="Search" id="searchbar" required>
                           <br>
                           <br>
                           <div id="buttonOne">
                            <button type="submit" class="btn btn-primary pull-right" id="third-btn" style="margin-top: 5px;"><i class="fa fa-search"></i>Search</button>
                            </div>
                        </div>
                        
                    </form>
                    
                </div>
                
                
                <div class="col-md-5 col-sm-6 col-md-offset-1">
                
					 
					
                  <form name="UploadForm" action="/FinalProject1812-1858/Search" method="post" name="formDoc" enctype="multipart/form-data"> 
                        <div class="form-group" id="two">
                        
                            <h3 class="text-center">Search By Uploading A Document</h3><br>
                            <input type="file" class="form-control" name="file" onchange="Checkfiles()" id="file" required accept=".doc,.docx">
                          	<br>
                          	<br>
                           <div id="buttonTwo">
                            <button type="submit" class="btn btn-primary pull-right" style="margin-top: 5px;" name="search"  id="searchBtn"> <i class="fa fa-paper-plane"></i> Search </button>
                            </div>
                        </div>
                        
                    </form>
                
                </div>
                
            </div>
            
        </div>
    </div>
				<!-- 	<div class="alertWord" style="display:none;">
                     <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span>
                    <strong>ALERT!</strong> Please Enter a Word to search.
                    </div>
                    <div class="alertDoc" style="display:none;">
                     <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span>
                    <strong>ALERT!</strong> Please select a file search.
                    </div>  -->
                    
			<!--  <div class="main-content">
				<div class="row row1">
					<div class="col-md-6 col-sm-12 left">
					<h2>SEARCH BY PARAGRAPH OR KEY WORDS</h2><br>
					
					<form action="/FinalProject1812-1858/Search" method="get" onsubmit="checkText()" name="formWord">

						<input type="text" class="form-control" name="searchbar" size="110" placeholder="Search" id="searchbar" required>
						<br>
					 <div id="buttonOne">
						<input type="submit" value="Search" class="btn " id="third-btn" style="background:#b90000">
					</div>
					</form>
					</div>
					<div class="col-md-6 col-sm-12 right">
					<h2>SEARCH BY UPLOADING A DOCUMENT</h2><br>
					
					<form  name="UploadForm" action="/FinalProject1812-1858/Search" method="post" name="formDoc" enctype="multipart/form-data">
					<div id="buttonTwo">
					
						<input class="btn " type="file" name="file" onchange="Checkfiles()" id="file" style="background:#b90000" required accept=".doc,.docx"><br>
								
						<button type="submit" name="search" class="btn "  id="searchBtn" style="background:#b90000">Search</button>
						</div>
					</form>
					</div>
					
						
				</div>
			</div>
			-->
			<div id="Mainfooter">
				<center><strong>&copy;WBDC&amp;R | By 1812-1858/F12 - <i>IIUI</i></strong></center>
			</div>
		</div>

</body>
</html>