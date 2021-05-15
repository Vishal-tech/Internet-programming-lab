import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.sql.*;


public class profile extends HttpServlet{
  public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{

    response.setContentType("text/html");
    PrintWriter pw = response.getWriter();

    HttpSession session = request.getSession();
    String user = (String)session.getAttribute("name");

    pw.println("<html><head><meta charset='utf-8'><meta name='viewport' content='width=device-width, initial-scale=1, shrink-to-fit=no'>");
    pw.println("<title>Profile</title>");
    pw.println("<style>h1{color:black; margin-left:auto; margin-right:auto; text-align:center; font-size: 3em;justify-content: space-between;}</style><link rel='stylesheet' href='static/style_2.css'></head>");
    pw.print("<body><center><h1>");
    pw.print("Profile Page");
    pw.println("<button style='width:10%; justify-content: center; margin-right: 0px; margin-left:80%;'><a href='/a5/Logout'>Log Out</a></button></h1></center>");

    if(user != null)
    {
      String JDBC_DRIVER="com.mysql.jdbc.Driver";
      String PASS="db@321v";
      String USER="root";
      String DB_URL="jdbc:mysql://localhost:3306/A5";
      
      
      Connection conn = null;

      try{
        
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
        String search = "SELECT * FROM Profile WHERE name='"+user+"'";

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(search);

        rs.next();

        pw.print("<table border=\"2px dotted green\" align=\"center\"><tr><th>Name</th><td>"+rs.getString("name")+"</td></tr><tr><th>Date of Birth</th><td>"+rs.getString("dob")+"</td></tr><tr><th>Address</th><td>"+rs.getString("address")+"</td></tr><tr><th>Gender</th><td>"+rs.getString("gender")+"<tr><th>Marital Status</th><td>"+rs.getString("marstatus")+"</td></tr><tr><th>Age</th><td>"+rs.getString("age")+"</td></tr><tr><th>Contact</th><td>"+rs.getString("Contact")+"</td></tr></table>");
        
      }catch(Exception E){
        E.printStackTrace();
      }
      
    }

    else{
      pw.println("<script>");
      pw.println("alert('Session information not available')");
      pw.println("location='http://localhost:8080/a5/'");
      pw.println("</script>");
    }
    pw.print("</body></html>");
    pw.close();


  }
}