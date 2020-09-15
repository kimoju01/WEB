package kr.ac.ks.jdbctest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.ac.ks.jdbctest.dto.Role;

public class RoleDao {
	private static String dburl = "jdbc:mysql://localhost:3306/connectdb";
	private static String dbuser = "connectuser";
	private static String dbpasswd = "connect123!@#";
	
	public Role getRole(Integer roleId) {	
		//프라이머리 키 roleId에 해당하는 한 건의 정보를 가져오는 메서드
		//한 건 가져왔을 때 한 건에 대한 정보를 담아 올 객체 = Role
		Role role = null;
		Connection conn = null;			//1. 연결을 맺어낼 수 있는 객체 선언
		PreparedStatement ps = null;	//2. 명령을 선언할 객체
		ResultSet rs = null;			//3. 결과값을 담아낼 객체
		
		try {					//예외처리한 후 연결 해둔 것 연결 끊기! 연결 끊을 땐 연결한 반대 순서대로(rs->ps->conn) 끊어준다
			Class.forName("com.mysql.jdbc.Driver");		//드라이버를 로딩한다.
			conn = DriverManager.getConnection(dburl, dbuser, dbpasswd);	//connection 객체를 얻어온다.
			String sql = "SELECT description,role_id FROM role WHERE role_id = ?";
			ps = conn.prepareStatement(sql);	//수행해야 할 쿼리문을 넣어준다.
			ps.setInt(1, roleId);
			//ps.set의 첫번째 인자 = String sql 변수에서 몇 번째 물음표인지(물음표 여러개 올 수 있다)
			// 두번째 인자 = 물음표 대신에 넣을 값
			rs = ps.executeQuery();		//쿼리를 실행해라.
			
			if(rs.next()) {		//쿼리를 실행하고 결과값이 있다면 첫 번째 레코드로 커서를 이동시키고 true를 리턴한다. 또 next가 수행되면 다음 레코드로 커서를 이동시킨다.
				String description = rs.getString(1);
				//SELECT문 순서대로 적어줘서 값을 꺼낸다. description이 첫 번째 컬럼의 값이 될 거다. 
				//description은 String값이다.
				int id = rs.getInt("role_id");		//2로 안적고 컬럼 이름을 적어도 괜찮다.
				role = new Role(id, description);	//해당 role 객체에 값이 담겨서 실행될 수 있다.
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {				//finally : 반드시 수행되는 구절 => 객체들 반드시 close 해주기
			if(rs != null) {	//만약 윗부분에서 예외가 발생해서 rs가 null인 상태인데 rs.close()하면 예외 발생해서 오류나기 때문에 미리 대비해준다. 
				try {	
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}	//if끝
			
			if(ps != null) {		 
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {		 
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}	//finally 구문 끝
		
		return role;	//선언한 role을 리턴해준다.
	}
	
	
	public int addRole(Role role) {	//한 건을 입력(insert)하는 메서드. int <= 몇 건 수정했는지
		int insertCount = 0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		//insert문이기 때문에 ResultSet은 쓰이지 않는다.
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(dburl, dbuser, dbpasswd);
			String sql = "INSERT INTO role (role_id, description) VALUES (?,?)";
			
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, role.getRoleId());	//1번째 물음표에 대한 값을 바인딩하는 코드
			//인자로 받아온 Role객체가 갖고 있는 Role_id와 Description을 넣어준다.
			ps.setString(2, role.getDescription());	//2번째 물음표에 대한 값을 바인딩하는 코드
			
			insertCount = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (Exception ex) {}
			} //if
			
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception ex) {}
			} //if
		} //finally
		
		return insertCount;
	}
	
	
	public int deleteRole(Integer roleId) {
		int deleteCount = 0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		//delete문이기 때문에 ResultSet은 쓰이지 않는다.
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(dburl, dbuser, dbpasswd);
			String sql = "DELETE FROM role WHERE role_id = ?";
			
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, roleId);	//1번째 물음표에 대한 값을 바인딩하는 코드
			
			deleteCount = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (Exception ex) {}
			} //if
			
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception ex) {}
			} //if
		} //finally
		
		return deleteCount;
	}
	
	
	public int updateRole(Role role) {
		int updateCount = 0;
		
		Connection conn = null;
		PreparedStatement ps = null;
		//update문이기 때문에 ResultSet은 쓰이지 않는다.
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(dburl, dbuser, dbpasswd);
			String sql = "UPDATE role SET description = ? WHERE role_id = ?";
			
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, role.getDescription());
			ps.setInt(2, role.getRoleId());
			
			updateCount = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(ps != null) {
				try {
					ps.close();
				} catch (Exception ex) {}
			} //if
			
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception ex) {}
			} //if
		} //finally
		
		return updateCount;
	}
	
	
	public List<Role> getRoles() {
		List<Role> list = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String sql = "SELECT description, role_id FROM role order by role_id desc";
		try (Connection conn = DriverManager.getConnection(dburl, dbuser, dbpasswd);
				PreparedStatement ps = conn.prepareStatement(sql)) {
				//알아서 close 하는 문법. => finally 구문이 필요 X
				
				try (ResultSet rs = ps.executeQuery()) {
					
					while (rs.next()) {	//한 건이 아니라 여러 건이기 때문에 next() => 있으면 true를 주고 커서를 다음으로 이동ㅎ나다
						String description = rs.getString(1);
						int id = rs.getInt("role_id");	//int id = rs.getInt(2); 랑 같다
						Role role = new Role(id, description);
						list.add(role);	//list에 반복할때마다 Role인스턴스를 생성하여 list에 추가한다.
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return list;	//모든 데이터를 담은 list를 반환
	}	
	
}
