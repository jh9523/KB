package library.vo;

public class Member {
	private String name;
	private String id;
	private String password;
	private String phonenum;
	
	public Member() {
	}

	public Member(String id, String name, String password, String phonenum) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.phonenum = phonenum;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + ", password=" + password + ", phonenum=" + phonenum;
	}

	
	
	
}
