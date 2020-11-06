package com.example.web;


import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import com.example.web.*;

public class InsertProduct extends HttpServlet{
	
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
			
	String c1 = request.getParameter("name");
        
        String c2 = request.getParameter("barcode");
	
	String c3 = request.getParameter("color");

	String c4 = request.getParameter("description");

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

	out.println("<center><h1>Product Info</h1> <br><br><br>");

	out.println("NAME        :  "+c1+"<br>");
	out.println("BARCODE       :  "+c2+"<br>");
	out.println("COLOR       :  "+c3+"<br>");
	out.println("DESCRIPTION               :"+c4+"<br></center>");
	
	//RequestDispatcher view = request.getRequestDispatcher("result.jsp");
	//view.forward(request, response);

            try {  
            // Initialize the database 
            Connection con = DatabaseConnection.initializeDatabase(); 
  			out.println("<html><body><center><b>Successfully Inserted"
                        + "</b></center></body></html>");
          	
		
            // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
            
            PreparedStatement st = con.prepareStatement("INSERT INTO Product(?,?,?,?)"); 
            out.println("<html><body><b>Successfully Inserted"+ "</b></body></html>");         
  
            st.setString(1, c1); 
  
            st.setString(2, c2); 

			st.setString(3, c3);

			st.setString(4, c4);  
  
            st.executeUpdate(); 
  
            st.close(); 
            con.close(); 
  
        
            out.println("<html><body><b>Successfully Inserted"
                        + "</b></body></html>"); 
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
            System.out.print(e);
        } 
            
            
            
//		Context context = new InitialContext();
//		DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Products");
//		String c1 = request.getParameter("name");
//		String c2 = request.getParameter("barcode");
//		BeerExpert be = new BeerExpert();
//		List result = be.getBrands(c);

//		response.setContentType("text/html");
//		PrintWriter out =response.getWriter();
//		out.println("Product Info <br>");
//		out.println(c1);
//		out.println(c2);
		
//		request.setAttribute("styles",result);
		
//		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
//		view.forward(request, response);
	}
}
