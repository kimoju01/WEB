package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/param")
public class ParameterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ParameterServlet() {
        super();
    }

    //그냥 실행하면 name,age값이 null인데 
    //실행 후 URL 뒤에 ?name=kim&age=30 이런 식으로 써주면 값이 나타난다
    //하지만 form태그 안에 input 태그를 사용하면 주소창에 꼭 안써도 똑같이 된다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//응답으로 보내기 위한 부분 => response
		//내가 꺼내올 정보들 => request
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>form</title></head>");
		out.println("<body>");
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");	//숫자여도 인식 못해서 다 문자열로 들어온다.
		
		out.println("name : " + name + "<br>");
		out.println("age : " + age + "<br>");
		
		out.println("</body>");
		out.println("</html>");
	}

}
