<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.DriverManager, java.sql.Connection,java.sql.ResultSet,
  java.sql.Statement" %>

<%
Class.forName ("com.mysql.jdbc.Driver").newInstance ();

Connection con = DriverManager.getConnection("jdbc:mysql://localhost/fyp?","root","");
Statement stemt = null;
   ResultSet res = null;
int rowCount = -1;

 stemt = con.createStatement();
 res = stemt.executeQuery("SELECT COUNT(*) FROM `upload` WHERE `temp`='1'");
// get the number of rows from the result set
res.next();
rowCount = res.getInt(1);
%>

<div id="notiPanel" class="headercolumn">
  <div class="notiwrapper"> <a href="javascript:;" class="notialert radius2"><% out.println(rowCount); %></a>
    <div class="notibox">
      <ul class="tabmenu">
        <li class="current"><a href="notify_admin.jsp" class="msg">Request (<% out.println(rowCount); %>)</a></li>
      </ul>
      <br clear="all" />
    </div>
    <!--notibox--> 
  </div>
  <!--notiwrapper--> 
</div>
