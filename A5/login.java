import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.sql.*;


public class login extends HttpServlet{
  public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    String DB_URL = "jdbc:mysql://localhost:3306/A5";

    String USER = "root";
    String PASS = "db@321v";

    response.setContentType("text/html");
    PrintWriter pw = response.getWriter();

    String uname = (String)request.getParameter("name");
    String pass = request.getParameter("pass");

    Connection conn = null;
    int flag = 0;

    try{
      conn = DriverManager.getConnection(DB_URL,USER,PASS);

      String search = "SELECT passw FROM Profile WHERE name='"+uname+"'";
      Statement stmt = conn.createStatement();

      ResultSet rs = stmt.executeQuery(search);

      if(rs.next()){
        String password = rs.getString("passw");
        if(password.equals(pass)){
          flag = 1;
          HttpSession session = request.getSession();
          session.setAttribute("name", uname);
          response.sendRedirect("/a5/Welcome");
        }
      }

      if(flag == 0){
        pw.println("<script>");
        pw.println("alert(\"Wrong UserName or Password!!!\")");
        pw.println("location='http://localhost:8080/a5/'");
        pw.println("</script>");
      }
    }
    catch(Exception E){
      E.printStackTrace();
    }

    pw.close();

  }
}

