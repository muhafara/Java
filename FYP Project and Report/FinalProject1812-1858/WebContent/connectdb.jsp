<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.DriverManager, java.sql.Connection,java.sql.ResultSet,
  java.sql.Statement"%>
<% 
try
{
	Class.forName ("com.mysql.jdbc.Driver").newInstance ();
	
   Connection c = DriverManager.getConnection("jdbc:mysql://localhost/fyp?","root","");
  
}
catch (Exception e){
	
	System.out.println("Failed");
}


	 %>
