package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *  ApplicationScope01.java 에서 Application scope로 "value"에 1을 저장
 *  ApplicationScope02.java 에서 "value"에 1을 더한 후 저장 후 출력
 *  applicationscope01.jsp 에서 "value"에 2를 더한 후 저장 후 출력
 *  Application scope는 웹 어플리케이션을 사용하는 모든 브라우저에서 같은 값을 사용하게 한다.
 *  (브라우저, 탭이 바뀌어도 값을 공유한다! = 다른 클라이언트여도 같은 값을 공유한다!)
 *  언제까지? 웹 어플리케이션이 다시 시작 할 때 까지!
 */

@WebServlet("/ApplicationScope01")
public class ApplicationScope01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ApplicationScope01() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		ServletContext application = getServletContext();
		int value = 1;	//value 값을 1로 초기화시킨다.
		application.setAttribute("value", value);
		
		out.print("<h1>value : " + value + "</h1>");
	}

}
