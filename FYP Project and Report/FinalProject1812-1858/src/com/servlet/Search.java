package com.servlet;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	//SearchSim ssim = new SearchSim();
	DocumentSimilarity doc_sim = new DocumentSimilarity();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    
    String titleName = "";
  
	public void Check(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException{
	    
		 
		
		titleName = request.getParameter("searchbar");
		
       	   //    System.out.println(titleName+"GOT\n");
       	   
			
	    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		try {
			Check(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
			
			
			 SearchStopWord sstop = new SearchStopWord();
			
			 sstop.StopwordRemoval(titleName);
			
			
		
		 SearchStemming sstem = new SearchStemming();
		 
		 sstem.Dostemming();
		
		 
		
		
		 SearchToken stoken = new SearchToken();
		 
		 stoken.ReadDocument();
		 
		
		
		SearchSimilarity search_sim= new SearchSimilarity();
		
		search_sim.FolderSimilarity();
		
		
		 
		 String ssim="";
		if(ssim=="null"){
			response.sendRedirect("index.jsp");
		}
		else{
			response.sendRedirect("wordsearch.jsp");
		}
	}

	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
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
				
		saveFile="C:/Users/Public/FinalProject1812-1858/WebContent/upload/"+saveFile;
		File ff = new File(saveFile);

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
		
		System.out.println(name);
		System.out.println(saveFile);
		
		try
		{
			Class.forName ("com.mysql.jdbc.Driver").newInstance ();
		   Connection c = DriverManager.getConnection("jdbc:mysql://localhost/fyp?","root","");
	       Statement   s = c.createStatement();
	       
	       String q ="INSERT INTO `notify_admin` (`id`, `title`, `description`, `delivered`,`temp`) VALUES (NULL, '"+name+"', '"+saveFile+"', '1','0')";
			 s.executeUpdate(q);
			
		}
		catch (Exception e){
			
			System.out.println("Failed");
		}
		/*End Insertion*/

			
			 DocumentStopWord docstop = new DocumentStopWord();
			
			
			 docstop.StopwordRemoval(name);
			
			
		
			DocumenStemming docstem = new DocumenStemming();
		 
		      docstem.Dostemming();
		
		 
		
		 DocumentToken doctoken = new DocumentToken();
		 
		 doctoken.ReadDocument();
		
		
		 DocumentSimilarity docsearch = new DocumentSimilarity();
		 
		docsearch.FolderSimilarity();
		
		
		 
		 if(doc_sim.getValue=="null"){
				response.sendRedirect("index.jsp");
			}
			else{
				response.sendRedirect("documentsearch.jsp");
			}
	}


		
}