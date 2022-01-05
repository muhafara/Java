<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.DriverManager, java.sql.Connection,java.sql.ResultSet,
  java.sql.Statement"%>

<% 
String uname = request.getParameter("username");
String pass = request.getParameter("password");


	Class.forName ("com.mysql.jdbc.Driver").newInstance ();
	
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost/fyp?","root","");
	 
	 Statement st = con.createStatement();
	    ResultSet rs;
	    rs = st.executeQuery("SELECT * FROM `admin` WHERE `username`= '"+uname+"' AND `password`='"+pass+"'");
	   
        if (rs.next()) {
        session.setAttribute("userid", uname);
        
        response.sendRedirect("dashboard.jsp");
    } else {
    	%>
    	<input type="hidden" name="username">
    	<% 
       response.sendRedirect("adminlogin.jsp");
    }
%>
