package kr.ac.ks.webapitest.api;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import kr.ac.ks.jdbctest.dao.RoleDao;
import kr.ac.ks.jdbctest.dto.Role;


@WebServlet("/roles/*")	//path가 roles로 시작은 하지만 그 다음에 어떤 문자든지 올 수 있다. (실제 role_id로 바꾸어서 실행)
/***** 아이디 한 건에 대해서 role 정보를 읽어오는 서블릿 *****/
public class RolebyIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
  public RolebyIdServlet() {
      super();
  }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setCharacterEncoding("utf-8");
			response.setContentType("application/json");
			
			String pathInfo = request.getPathInfo(); 	//getPathInfo()를 통해 Path정보를 읽어온다. /roles/{roleId}
			String[] pathParts = pathInfo.split("/");	//Path정보를 슬래시(/) 기준으로 잘라서 배열을 구함
			String idStr = pathParts[1];				/* 배열 : /roles/{roleId} 인데 슬래시 기준으로 자르면 
														 * pathParts[0] => roles	pathParts[1] => roleId	
														 * 문자열 idStr = pathParts[1]이니 idStr이 실제 id값이 될 것 */
			int id = Integer.parseInt(idStr);
			
			RoleDao dao = new RoleDao();
			
			Role role = dao.getRole(id);
			
			ObjectMapper objectMapper = new ObjectMapper();
			String json = objectMapper.writeValueAsString(role);	//json 문자열을 구한다
			
			PrintWriter out = response.getWriter();	
			out.println(json);	//문자열을 출력한다
			out.close();
					
	}

}