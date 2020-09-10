package examples;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/front")
public class FrontServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FrontServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int diceValue = (int)(Math.random() * 6) + 1;	// (int)(Math.random() * 최대값) + 최소값 ==> diceValue는 정수값 1~6까지 랜덤 값 출력
		request.setAttribute("dice", diceValue);	
		//"dice"는 닉네임(내가 정하는 이름), diceValue는 값(저장할 값). Object 타입으로 맡겨진다.
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/next");
		//RequestDispatcher : forward할 때 도움을 주는 객체
		//인자 값은 포워드 할 곳. 포워드 경로는 / 로 시작해야하고 같은 웹 어플리케이션 안에서만 가능하다
    	//그리고 포워드 할 곳이 /next 여도 url은 바뀌지 않고 /front로 그대로다!
		requestDispatcher.forward(request, response);	//request, response 객체를 반드시 넘겨야한다!
		
	}
	
	/*
 	foward란? (=/= redirect) redirect랑 구분 잘하기!

	[Client] ==request ==> [Servlet1] ==forward==> [Servlet2] ==response ==> [Client]
	
	
	1. 웹 브라우저에서 Servlet1에게 요청을 보냄
	2. Servlet1은 요청을 처리한 후, 그 결과를 HttpServletRequest에 저장
	3. Servlet1은 결과가 저장된 HttpServletRequest와 응답을 위한 HttpServletResponse를 
	같은 웹 어플리케이션 안에 있는 Servlet2에게 전송(forward)
	4. Servlet2는 Servlet1으로 부터 받은 HttpServletRequest와 HttpServeletRespose를
	이용하여 요청을 처리한 후 웹 브라우저에게 결과를 전송
	
	
	
	* redirect는 클라이언트가 서버에게 요청을 보냈고
	그러면 서버는 어떤 일들을 처리하고 다시 클라이언트한테 새로운 요청할 곳을
	알려주면서 이걸로 다시 요청해요. 라고 주는 것이 redirect.
	그래서 결과가 실제 실행한 다음에 url 주소가 바뀐다.
	
	* foward는 클라이언트는 요청을 서버에게 보냈는데
	서버쪽에서 그 요청에 대해 혼자 처리하는 것이 아니라 다른 누군가한테
	처리를 맡긴다.
	이 때 클라이언트는 이 요청받은 서블릿1이 혼자서 다 처리해서 응답을 했는지
	아니면 다른 누군가한테 부탁해서 처리를 했는지 전혀 알 필요가 없다.
	그래서 포워드가 실행된 다음에는 url이 바뀌지 않는다.
	
	
	클라이언트가 서버한테 요청을 보내면 반드시 request와 response라는 객체가 존재한다.
	WAS는 request와 response라는 객체를 만들어서 요청이 들어와서 응답을 할 때까지
	requset와 response라는 객체는 계속 유지가 되고 있는 상태이다.
	
	forward 같은 경우에는 요청이 한 번이니까 request와 response 객체가 한 번 만들어진다.
	redirect는 요청이 여러번 왔다갔다 한다. redirect01.jsp의 요청과 redirect02.jsp의 요청은
	서로 다른 요청이다. request, response 객체가 만들어지고, 또 새로운 request, response 객체가 만들어진다.
	=> forward와 redirect의 차이는 요청이 하나인지, 요청이 서로다른 두개인지이다.

	 */

}
