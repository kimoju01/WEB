package kr.ac.ks.jdbctest;

import java.util.List;

import kr.ac.ks.jdbctest.dao.RoleDao;
import kr.ac.ks.jdbctest.dto.Role;

public class JDBCExam3 {

	public static void main(String[] args) {
		RoleDao dao = new RoleDao();
		
		List<Role> list = dao.getRoles();	//getRoles()는 List를 리턴한다. => List로 반환받음
		
		for(Role role : list) {
			System.out.println(role);
		}
	}

}
