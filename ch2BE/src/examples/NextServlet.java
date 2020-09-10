package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/next")
public class NextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NextServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>form</title></head>");
		out.print("<body>");
		
		int dice = (Integer)request.getAttribute("dice");
		//FrontServlet에서 setAttribute 해서 맡겼던 "dice"(닉네임)를 setAttribute로 찾아온다.
		//Object 타입으로 맡겨졌었기 때문에 Integer로 형 변환을 해준다.
		out.print("dice : " + dice);
		for(int i=0; i<dice; i++) {
			out.print("<br>hello");
		}
		
		out.print("</body>");
		out.print("</html>");
	}

}
