package pqr;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class zzz extends HttpServlet
{
public void doGet(HttpServletRequest rq,HttpServletResponse rs)
{
try
{
String n=rq.getParameter("name");
String a=rq.getParameter("address");
String l=rq.getParameter("location");
String d=rq.getParameter("destination");
String m=rq.getParameter("mob");
String g=rq.getParameter("gender");
System.out.println("Data Arrived");
System.out.println("Name : "+n);
System.out.println("Address : "+a);
System.out.println("Location : "+l);
System.out.println("Destination : "+d);
System.out.println("Mobile no. : "+m);
System.out.println("Gender : "+g);
PrintWriter pw;
pw=rs.getWriter();
rs.setContentType("text/html");
pw.println("<!DOCTYPE HTML>");
pw.println("<html lang=en>");
pw.println("<head>");
pw.println("<meta charset='utf-8'>");
pw.println("<title>Application for booking train ticket</title>");
pw.println("</head>");
pw.println("<body>");
pw.println("<style>");
pw.println("body");
pw.println("{");
pw.println("background-image: url('train1.jpg');");
pw.println("background-repeat: no-repeat;");
pw.println("background-attachment: fixed;");
pw.println("background-size: 100% 100%;");
pw.println("}");
pw.println("</style>");
pw.println("<center>");
pw.println("<h3>Data Saved</h3>");
pw.println("<form action='/ap/index.html'>");
pw.println("<button type='submit'>Ok</button>");
pw.println("</center>");
pw.println("</form>");
pw.println("</body>");
pw.println("</html>");
}catch(Exception e)
{
System.out.println(e);
}
}
}