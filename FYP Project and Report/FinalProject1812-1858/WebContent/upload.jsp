<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload Section</title>
<link href="css/mainstyle.css" rel="stylesheet">

<link rel="stylesheet" href="css/mainstyle.css" />
<script src="js/jquery-1.12.2.js"></script>
<script type="text/javascript" src="js/mainscript.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/font-awesome.min.css" />
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
      <a class="navbar-brand" href="index.jsp"><i class="fa fa-globe"></i>  WEB BASED DOCUMENT CLUESTRING AND RETRIVAL</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav">
        <li>
          </ul>
        </li>
      </ul> 
      <ul class="nav navbar-nav navbar-right">
      
         <li><a href="index.jsp"><button class="btn btn-info btn-lg"><i class="fa fa-search"></i> SEARCH</button></a></li>
        
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
	<div class="container">
	<div class="jumbotron">
			<div class="row">
			
				
				<center>
					<h3>Select a Document file to upload</h3>
						<form id="upload" name="UploadForm" action="/FinalProject1812-1858/Upload" method="post" enctype="multipart/form-data">
						
							<input class="btn" type="file" name="file"
								onchange="Checkfiles()" id="file" required accept=".doc,.docx" style="background:#5b86cc;color:#fff;">
							 <br>
								<button type="submit" value="Submit" name="submit"
								onclick="UploadFile();"  class="btn" id="upBtn">UPLOAD</button>
	
						</form>
						</center>
					
	</div>
	</div>
	</div>
			<div id="Mainfooter">
				<center><strong>&copy;WBDC&amp;R | By 1812-1858/F12 - <i>IIUI</i></strong></center>
			</div>


</body>
</html>