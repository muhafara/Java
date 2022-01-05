package com.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class NewTestServlet
 */
@WebServlet("/NewTestServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Boolean success=true;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    String p_id="";
    String titleName = "";
	public void Check(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ClassNotFoundException, SQLException{
	    
		String id = request.getParameter("id");
       
	    
	
	       Class.forName("com.mysql.jdbc.Driver");

	       // Open a connection
	       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/fyp?","root","");

	       // Execute SQL query
	       Statement stmt = conn.createStatement();
	       String sql;
	       sql = "SELECT `title` FROM `upload` WHERE `id`= '"+id+"'";

	       ResultSet rs = stmt.executeQuery(sql);
	       
	       String title="";
	       while(rs.next()){
	    	   
	    	   title = rs.getString(1);
	    	   
	    	  
	    	   titleName = title;
	    	   p_id= id;
	    	   
	       }
	       
	       
	       System.out.println(titleName+"\n");
			
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
		
		if (request.getParameter("stopword") != null) {
			
			System.out.println("STOP WORD START");
			
			
			
			 StopWords stop = new StopWords();
			
			 stop.StopwordRemoval(titleName);
			
			
			System.out.println("\n STOP WORD END\n ");
			
			
			
		}
	 
	 else if (request.getParameter("stemming") != null) {
			
		 System.out.println("STEMMING STRAT \n");
		
		 Stemming stem = new Stemming();
		 
		 stem.Dostemming();
		
		 
		 System.out.println("\n STEMING END\n");
		}
	
		
	 else if (request.getParameter("tokenization") != null) {
			
		 System.out.println("Tokenization STRAT \n");
		
		 Tokenization token = new Tokenization();
		 
		 token.ReadDocument();
		 
		 System.out.println("\n TOkenization END\n");
		}
		//response.sendRedirect("Process.jsp?id="+p_id);
	
	 else if (request.getParameter("similarity") != null) {
			
		 System.out.println("Similarity STRAt\n");
		
		 CosineSimilarity cosin = new CosineSimilarity();
		 
		cosin.CalculateCosineSimilarity(titleName);
		 
		 System.out.println("\n Similarity END \n");
		}
		
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	}
