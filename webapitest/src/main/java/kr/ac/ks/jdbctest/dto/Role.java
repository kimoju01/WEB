package kr.ac.ks.jdbctest.dto;

public class Role {
	private Integer roleId;
	private String description;
	
	public Role() {
		
	}
	
	public Role(Integer roleId, String description) {	//객체 생성 시 편하게 생성하기위해 각각 값을 담아주는 생성자
		//한 건 가져왔을 때 한 건에 대한 정보를 담아낼 객체
		super();
		this.roleId = roleId;
		this.description = description;
	}
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {	//값을 편하게 출력할 목적으로 toString() 오버라이딩
		return "Role [roleId=" + roleId + ", description=" + description + "]";
	}
	
	
}
