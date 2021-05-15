import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class Employee extends HttpServlet
{
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException
{
String sal=request.getParameter("Basic Pay");
String desig = request.getParameter("Designation");
float pay = Float.parseFloat(sal);
if(desig.equalsIgnoreCase("Sales Representative")){
pay = 175*pay/100;
}
else if(desig.equalsIgnoreCase("Manager")){
pay = 190*pay/100;
}
else if(desig.equalsIgnoreCase("Receptionist")){
pay = 135*pay/100;
}
else if(desig.equalsIgnoreCase("Employee")){
pay = 150*pay/100;
}
else if(desig.equalsIgnoreCase("Intern")){
pay = 110*pay/100;
}
response.setContentType("text/html");
PrintWriter pw = response.getWriter();
pw.println("<html><head><title>Form details</title>");
pw.println("<link rel='stylesheet' href='style.css'>");
pw.println("</head>");
pw.println("<body style='background-color:cyan'><br><br><br>");
pw.println("<div class='divform'>");
pw.println("<table align='center' width='60%' border='1'><br>");
pw.println("<caption>Employee Details</caption><br>");
pw.println("<br><br><table>");
pw.println("<thead><tr><th colspan='2'>Employee Details</th></tr></thead>");
Enumeration paramNames = request.getParameterNames();
while(paramNames.hasMoreElements()){
String paramName = (String)paramNames.nextElement();
pw.println("<tr><td>"+paramName+"</td>");
String[] paramValues = request.getParameterValues(paramName);
if (paramValues.length == 1){
String paramValue = paramValues[0];
if (paramValue.length() == 0)
pw.println("<td>NO VALUE</td>");
else
pw.println("<td>"+paramValue+"</td>");
} else{
pw.print("<td>");
for(int i=0; i<paramValues.length; i++){
pw.print(paramValues[i]+" ");
}
pw.print("</td></tr>\n");
}
}
pw.println("<tr><td>Gross Pay</td><td>"+pay+"</td></tr>");
pw.println("</table>\n</body>");
pw.print("</html>");
pw.close();
}
}
