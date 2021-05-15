import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;
public class country extends HttpServlet{
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException
{
    String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    String DB_URL= "jdbc:mysql://localhost:3306/a6";
    String USER ="root"; 
    String PASS="db@321v";
try{
    response.setContentType("text/html");
    PrintWriter pw = response.getWriter();
    Connection conn = DriverManager.getConnection(DB_URL,USER,PASS); 
    String country_name = request.getParameter("country");
    String search = "Select name from country_list where name like '"+country_name+"%' ;";
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(search);
while(rs.next()){
    String country = rs.getString("name");
    pw.println("<option name='"+country+"'>"+country+"</option>");
}
}catch(Exception E){
    E.printStackTrace();
}
}
}