package springDemo;


public class User {
	private int id;
	private String username;
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(){
		System.out.println("无参构造方法");
	};
	
	public User(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		System.out.println("有参构造方法");
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
		+ password + "]";
	}
	



}


