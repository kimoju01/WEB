package kr.ac.ks.webapitest.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import kr.ac.ks.jdbctest.dao.RoleDao;
import kr.ac.ks.jdbctest.dto.Role;

@WebServlet("/roles")
public class RolesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public RolesServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");	//응답하는데 응답 객체에 CharacterEncoding을 utf-8로
		response.setContentType("application/json");	//json을 사용할 것 => json으로 응답
		
		RoleDao dao = new RoleDao();	//JDBC로 만든 RoleDao 객체 생성
		
		List<Role> list = dao.getRoles();	//RoleDao가 갖고있는 메서드인 getRoles()를 이용해 Role의 list를 얻는다.
		
		ObjectMapper objectMapper = new ObjectMapper();	//json 라이브러리(pom.xml에 추가했던)가 제공하는 객체 => json 문자열로 바꾸거나, json 문자열을 객체로 바꾸어 주는 역할을 수행.
		String json = objectMapper.writeValueAsString(list);	//파라미터로 list를 넣어주면 해당 list가 json 문자로 바뀌어서 리턴 해준다.
		
		PrintWriter out = response.getWriter();
		out.println(json);	//list가 json 문자열로 바뀌어서 출력될 것이다.
		out.close();
	}

}
