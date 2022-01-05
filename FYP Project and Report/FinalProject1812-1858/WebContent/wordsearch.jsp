<%@page import="com.servlet.SearchSimilarity"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8" import="java.io.File, java.util.ArrayList,
 java.util.Arrays"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DOCUMENT SEARCH RESULT PAGE</title>
<link rel="stylesheet" href="css/mainstyle.css" />

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
        <li><a href="upload.jsp"><button class="btn btn-success btn-lg"><i class="fa fa-upload"></i> Upload</button></a></li>
         <li><a href="index.jsp"><button class="btn btn-info btn-lg"><i class="fa fa-search"></i> SEARCH</button></a></li>
        
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
		<div class="container">
			<div class="jumbotron">
				<div class="row">
					<div class="Resleft col-md-4 col-sm-4">
						<%
						
						File f1 = new File("C:/Users/Public/FinalProject1812-1858/WebContent/categories/category1");
		                int count1 = 0;
		                for (File file : f1.listFiles()) {
		                        if (file.isFile()) {
		                                count1++;
		                        }
		                }
		                
		                File f2 = new File("C:/Users/Public/FinalProject1812-1858/WebContent/categories/category2");
		                int count2 = 0;
		                for (File file : f2.listFiles()) {
		                        if (file.isFile()) {
		                                count2++;
		                        }
		                }
		                
		                File f3 = new File("C:/Users/Public/FinalProject1812-1858/WebContent/categories/category3");
		                int count3 = 0;
		                for (File file : f3.listFiles()) {
		                        if (file.isFile()) {
		                                count3++;
		                        }
		                }
		                
		                File f4 = new File("C:/Users/Public/FinalProject1812-1858/WebContent/categories/category4");
		                int count4 = 0;
		                for (File file : f4.listFiles()) {
		                        if (file.isFile()) {
		                                count4++;
		                        }
		                }
		                File f5 = new File("C:/Users/Public/FinalProject1812-1858/WebContent/categories/other category");
		                int count5 = 0;
		                for (File file : f5.listFiles()) {
		                        if (file.isFile()) {
		                                count5++;
		                        }
		                }
						%>
						<ul>
						<h3>CATEGORIES</h3>
						  
		   					<li> <button type="button" class="btn btn-primary">&nbsp;&nbsp;Category 1&nbsp;&nbsp;<span style="color:#000;" class="badge">&nbsp;<%=count1 %></span></button></li>
		   					<li> <button type="button" class="btn btn-primary">&nbsp;&nbsp;Category 2&nbsp;&nbsp;<span style="color:#000;" class="badge">&nbsp;<%=count2 %></span></button></li>
		   					<li> <button type="button" class="btn btn-primary">&nbsp;&nbsp;Category 3&nbsp;&nbsp;<span style="color:#000;" class="badge">&nbsp;<%=count3 %></span></button></li>
		   					<li> <button type="button" class="btn btn-primary">&nbsp;&nbsp;Category 4&nbsp;&nbsp;<span style="color:#000;" class="badge">&nbsp;<%=count4 %></span></button></li>
		   					<li> <button type="button" class="btn btn-primary" style="width:136px">&nbsp;&nbsp;Others&nbsp;&nbsp;&nbsp;&nbsp;<span style="color:#000;margin-left:23%;" class="badge"><%=count5 %></span></button></li>
		   				</ul>
					</div>
					<div class="Resright col-md-8 col-sm-8">
					<!--  <center><h3><u>Your Search Results</u></h3></center><br> -->
					<% 

								SearchSimilarity search_sim= new SearchSimilarity();
								
								
								
								ArrayList<String> s= SearchSimilarity.getSimilarDocument;
								 
								
								
								if(s != null){
									
								
								
								for(String q:s)
								{
									q = q.replace("\\", "/");
										
								 %>
								
								<a href="<%=q.substring(49)  %>"  style="font-size:20px;text-decoration:none;"><%out.println(q.substring(q.lastIndexOf("/")+1)+"<br>"); %></a>
								
								<% 
									
								}
								}else{
									%>
									<h1>NO DOCUMENT FOUND</h1>
									<% 
								} 
								%>
		   				
					</div>
					
				</div>
			</div>
			
			<div id="Mainfooter">
				<center><strong>&copy;WBDC&amp;R | By 1812-1858/F12 - <i>IIUI</i></strong></center>
			</div>
		</div>

</body>

</html>