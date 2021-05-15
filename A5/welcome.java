import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.*;
import java.lang.*;
import java.io.*;

public class welcome extends HttpServlet{
  public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{

    response.setContentType("text/html");
    PrintWriter pw = response.getWriter();

    pw.println("<html><head><meta charset='utf-8'><meta name='viewport' content='width=device-width, initial-scale=1, shrink-to-fit=no'>");
    pw.println("<title>Welcome</title>");
    pw.println("<style>h1{color:black; margin-left:auto; margin-right:auto; text-align:center; font-size: 3em;}</style></head>");
    pw.print("<body><h1>");
    
    HttpSession session = request.getSession(false);
    String user = (String)session.getAttribute("name");
    
    pw.print("Welcome "+user);
    pw.print("</h1><br><br><br>");
    pw.println("<center><button style='justify-content: center; align-content: center; margin-left: auto; margin-right: auto;'><a href ='/a5/Profile'>View Profile in Detail</a></button><center>");
    pw.print("</body></html>");
    pw.close();

  }

}
