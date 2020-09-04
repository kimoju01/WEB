package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/info")
public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InfoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>info</title></head>");
		out.print("<body>");
		
		String uri = request.getRequestURI();			//URI : /ch2BE/info
		StringBuffer url = request.getRequestURL();		//URL : http://localhost:8090/ch2BE/info
		String contentPath = request.getContextPath();	//contentPath : /ch2BE
		String remoteAddr = request.getRemoteAddr();	//remoteAddr : 0:0:0:0:0:0:0:1
		
		out.print("URI : " + uri + "<br>");
		out.print("URL : " + url + "<br>");
		out.print("contentPath : " + contentPath + "<br>");
		out.print("remoteAddr : " + remoteAddr + "<br>");
		
		out.print("</body>");		
		out.print("</html>");
	}

}
