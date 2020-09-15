package kr.ac.ks.jdbctest;

import kr.ac.ks.jdbctest.dao.RoleDao;
import kr.ac.ks.jdbctest.dto.Role;

public class JDBCExam1 {
	public static void main(String[] args) {
		RoleDao dao = new RoleDao();
		Role role = dao.getRole(100);	//roid_id가 100인 것
										//getRole의 리턴 타입은 Role 타입이니 Role 타입으로 받아낸다
		System.out.println(role);
	}
}
