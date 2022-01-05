package com.servlet;


import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Statement;
import java.sql.Connection;

/**
 * Servlet implementation class Upload
 */
@WebServlet("/Upload")
public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Upload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	    	   
		
	}

	String name = null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String saveFile=new String();
		String contentType = request.getContentType();

		if ((contentType != null) && (contentType.indexOf("multipart/form-data") >= 0)) 
		{
		DataInputStream in = new DataInputStream(request.getInputStream());
		int formDataLength = request.getContentLength();
		byte dataBytes[] = new byte[formDataLength];
		int byteRead = 0;
		int totalBytesRead = 0;
		while (totalBytesRead < formDataLength) {
		byteRead = in.read(dataBytes, totalBytesRead,formDataLength);
		totalBytesRead += byteRead;
		}

		String file = new String(dataBytes);
		saveFile = file.substring(file.indexOf("filename=\"") + 10);
		saveFile = saveFile.substring(0, saveFile.indexOf("\n"));
		saveFile = saveFile.substring(saveFile.lastIndexOf("\\") + 1,saveFile.indexOf("\""));
		int lastIndex = contentType.lastIndexOf("=");
		String boundary = contentType.substring(lastIndex + 1,contentType.length());
		int pos;
		pos = file.indexOf("filename=\"");
		pos = file.indexOf("\n", pos) + 1;
		pos = file.indexOf("\n", pos) + 1;
		pos = file.indexOf("\n", pos) + 1;

		int boundaryLocation = file.indexOf(boundary, pos) - 4;
		int startPos = ((file.substring(0, pos)).getBytes()).length;
		int endPos = ((file.substring(0, boundaryLocation)).getBytes()).length;
		
		 name = saveFile;
				
		saveFile="C:/Users/Public/FinalProject1812-1858/WebContent/Temp/"+saveFile;
		//File ff = new File(saveFile);

		try{
			FileOutputStream fileOut = new FileOutputStream(saveFile);
			fileOut.write(dataBytes, startPos, (endPos - startPos));
			fileOut.flush();
			fileOut.close();
			}
		catch(Exception e)
		{
			System.out.print(e);
			
			}
		}
		
		
		
		try
		{
			Class.forName ("com.mysql.jdbc.Driver").newInstance ();
		   Connection c = DriverManager.getConnection("jdbc:mysql://localhost/fyp?","root","");
	       Statement   s = c.createStatement();
	       
	       String q ="INSERT INTO `upload` (`id`, `title`, `description`, `delivered`,`temp`) VALUES (NULL, '"+name+"', '"+saveFile+"', '0','1')";
			 s.executeUpdate(q);
			
		}
		catch (Exception e){
			
			System.out.println("Failed");
		}
		/*End Insertion*/

			response.setContentType("text/html");
			
			PrintWriter out =  response.getWriter();
			
			out.println("<html><head><script>alert('File Uploaded Successfully'); location='/FinalProject1812-1858/upload.jsp';</script></head><body>");
			
			
			System.out.println("File Uploaded");
			  
			
	}

}

