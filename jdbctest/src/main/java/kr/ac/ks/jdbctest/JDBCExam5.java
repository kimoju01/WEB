package kr.ac.ks.jdbctest;

import kr.ac.ks.jdbctest.dao.RoleDao;
import kr.ac.ks.jdbctest.dto.Role;

public class JDBCExam5 {
	public static void main(String[] args) {
		int roleId = 500;
		String description = "CEO";
		
		Role role = new Role(roleId, description);
		
		RoleDao dao = new RoleDao();
		int updateCount = dao.updateRole(role);
		
		System.out.println(updateCount);
	}
}
