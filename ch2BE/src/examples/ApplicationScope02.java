package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ApplicationScope02")
public class ApplicationScope02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ApplicationScope02() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		ServletContext application = getServletContext();
		try {	// 만약 Servlet02가 Servlet01보다 먼저 실행된다면 value값이 null이라 나올테니까 예외 처리해준다.
			int value = (int)application.getAttribute("value");	// 형 변환 해준다
			value++;
			application.setAttribute("value", value);
		
			out.print("<h1>value : " + value + "</h1>");
		} catch (NullPointerException e) {
			out.print("value 값이 설정되지 않았습니다.");
		}
	}

}
