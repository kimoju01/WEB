package kr.ac.ks.jdbctest;

import kr.ac.ks.jdbctest.dao.RoleDao;

public class JDBCExam4 {

	public static void main(String[] args) {
		int roleId = 500;
		
		RoleDao dao = new RoleDao();
		int deleteCount = dao.deleteRole(roleId);
		
		System.out.println(deleteCount);
		
	}

}
