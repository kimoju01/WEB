package examples;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logic")
public class LogicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LogicServlet() {
        super();
    }

    /* ** Servlet과 jsp 연동하는 예제 **
    1~100까지 랜덤한 정수 두 개의 합을 result.jsp로 넘겨준다. */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int v1 = (int)(Math.random() * 100) + 1;
		int v2 = (int)(Math.random() * 100) + 1;
		int result = v1 + v2;
		// 여기서 얻은 result를 jsp에서 쓰고 싶다! 
		// => forward!! 하는 것! 그렇기때문에 setAttribute로 request한테 맡겨야 돼!
		
		request.setAttribute("v1", v1);		//("닉네임", 실제맡길값)
		request.setAttribute("v2", v2);
		request.setAttribute("result", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("/JSP/result.jsp");
		rd.forward(request, response);
		
	}
	
	/*
	 * 	Servlet은 프로그램 로직이 수행되기에 유리하다.
	 	JSP는 결과를 출력하기에 Servlet보다 유리하다. 필요한 html문을 그냥 입력하면 된다.
	 	=> 즉, 프로그램 로직 수행은 Servlet에서, 결과 출력은 JSP에서 하는것이 유리하다!
	 	
	 *	Servlet과 JSP의 장단점을 해결하기 위해 Servlet에서 프로그램 로직이 수행되고,
	 	그 결과를 JSP에게 포워딩하는 방법이 사용되게 되었다.
	 	이를 Servlet과 JSP연동이라고 한다.
	 	
	 */

}
