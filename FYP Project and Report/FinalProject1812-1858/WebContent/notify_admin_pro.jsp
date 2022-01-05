<%@page import="java.nio.file.Paths"%>
<%@page import="com.sun.corba.se.spi.orbutil.fsm.Guard.Result"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.DriverManager, java.sql.Connection,java.sql.ResultSet,
  java.sql.Statement, java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Check Process</title>
</head>
<body>

<%
Class.forName ("com.mysql.jdbc.Driver").newInstance();
	
Connection c = DriverManager.getConnection("jdbc:mysql://localhost/fyp?","root","");
Statement cs =c.createStatement();

String selected = request.getParameter("selected");
String id = request.getParameter("id");


if( selected.equals("approve") ){

	cs.executeUpdate("UPDATE upload SET delivered = '1', temp = '0' WHERE `id` = '"+id+"'");
	 
	 ResultSet rs =  cs.executeQuery("SELECT `title` FROM `upload` WHERE `id`= '"+id+"'");

		

	 String FileName = "";
	 
		
		while(rs.next()){
		
			FileName = rs.getString(1);
			
		}
		
		InputStream inStream = null;
		OutputStream outStream = null;

	    	try{
			File afile = new File("C:\\Users\\Public\\FinalProject1812-1858\\WebContent\\Temp\\" + FileName );
			
			File bfile = new File("C:\\Users\\Public\\FinalProject1812-1858\\WebContent\\upload\\" + afile.getName());
			
			 inStream = new FileInputStream(afile);
	    	    outStream = new FileOutputStream(bfile);

	    	    byte[] buffer = new byte[1024];

	    	    int length;
	    	    //copy the file content in bytes
	    	    while ((length = inStream.read(buffer)) > 0){

	    	    	outStream.write(buffer, 0, length);

	    	    }

	    	    inStream.close();
	    	    outStream.close();

	    	    //delete the original file
	    	    afile.delete();

	    	    System.out.println("File is Moved successful!");

	    	}catch(IOException e){
	    	    e.printStackTrace();
	    	}
	
	response.sendRedirect("notify_admin.jsp");

} else {
	
	cs.execute("DELETE FROM `upload` WHERE `id` = '"+id+"'");
	 
	
	response.sendRedirect("notify_admin.jsp");
	
}

  
%>


</body>
</html>