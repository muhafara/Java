<%@page import="com.servlet.DocumentSimilarity"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.io.File, java.util.ArrayList,
 java.util.Arrays"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DOCUMENT SEARCH RESULT PAGE</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/mainstyle.css" />
<script type="text/javascript" src="js/plugins/jquery-2.2.2.min.js"></script>
<script type="text/javascript" src="js/plugins/jquery-2.2.2.js"></script>
<script type="text/javascript" src="js/custom/general.js"></script>
<script type="text/javascript" src="js/mainscript.js"></script>

</head>
<body>
		<div class="container">
		<div class="row">
			<div class="col-md-8">
			<header><center><h3>WEB BASED DOCUMENT CLUESTRING<br> AND RETRIVAL</h3></center></div>
			<div class="col-md-4 bothButton">
			<a href="upload.jsp" class="btn btn-danger btn-lg">Upload</a>
			<a href="main.jsp" class="btn btn-warning btn-lg">Search</a></header>
			</div>
			</div>
			<div class="main-content">
				<div class="row">
					<div class="Resleft col-ms-4">
						<%
						
						File f1 = new File("C:/Users/Public/Servlet/WebContent/categories/computer");
		                int count1 = 0;
		                for (File file : f1.listFiles()) {
		                        if (file.isFile()) {
		                                count1++;
		                        }
		                }
		                
		                File f2 = new File("C:/Users/Public/Servlet/WebContent/categories/culture");
		                int count2 = 0;
		                for (File file : f2.listFiles()) {
		                        if (file.isFile()) {
		                                count2++;
		                        }
		                }
		                
		                File f3 = new File("C:/Users/Public/Servlet/WebContent/categories/mathematics");
		                int count3 = 0;
		                for (File file : f3.listFiles()) {
		                        if (file.isFile()) {
		                                count3++;
		                        }
		                }
		                
		                File f4 = new File("C:/Users/Public/Servlet/WebContent/categories/physics");
		                int count4 = 0;
		                for (File file : f4.listFiles()) {
		                        if (file.isFile()) {
		                                count4++;
		                        }
		                }
		                File f5 = new File("C:/Users/Public/Servlet/WebContent/categories/others");
		                int count5 = 0;
		                for (File file : f5.listFiles()) {
		                        if (file.isFile()) {
		                                count5++;
		                        }
		                }
						%>
						<ul>
							<h3>CATEGORIES</h3>
		   					<li> &nbsp;&nbsp;Category 1<span style="color:#000;">&nbsp;(<%=count1 %>)</span></li>
		   					<li> &nbsp;&nbsp;Category 2<span style="color:#000;">&nbsp;(<%=count2 %>)</span></li>
		   					<li> &nbsp;&nbsp;Category 3<span style="color:#000;">&nbsp;(<%=count3 %>)</span></li>
		   					<li> &nbsp;&nbsp;Category 4<span style="color:#000;">&nbsp;(<%=count4 %>)</span></li>
		   					<li> &nbsp;&nbsp;Others<span style="color:#000;margin-left:23%;">(<%=count5 %>)</span></li>
		   					
		   				</ul>
					</div>
					<div class="Resright col-ms-8">
					<% 

								DocumentSimilarity search_sim= new DocumentSimilarity();
								
								//Double d = search_sim.sim_score;
								
								ArrayList<String> s= DocumentSimilarity.getSimilarDocument;
								 
								String nu = s.toString();
								
								for(String q:s)
								{
									q = q.replace("\\", "/");
									 
									//String q1 = q.substring(35)+chooser.getSelectedFile();
									
								
										
								 %>
								
								<a href="/" style="font-size:20px;text-decoration:none;"><%out.println(q.substring(q.lastIndexOf("/")+1)+"<br>"); %></a>
							<!-- 	<input type="hidden" value="<%out.println(q.substring(q.lastIndexOf("/")+1)); %>" name="fileName" id="fileName">
								<input type="hidden" value="<%out.println(q); %>" name="path" id="path">
								<input type="submit" value="Download"> -->
								</form>
								<% 
									
								
								} 
								%>
		   				
					</div>
					
				</div>
			</div>
			
			<div id="Mainfooter2">
				<center>&copy;WBDC&amp;R | By 1812-1858/F12 - IIUI</center>
			</div>
		</div>

</body>

</html>