package SpringBootApp2.SpringBootEntityClass;

public class UserData {
	private String username;
	private String useradd;
	private String usercity;
	
	public UserData() {
		// TODO Auto-generated constructor stub
	}

	public UserData(String username, String useradd, String usercity) {
		this.username = username;
		this.useradd = useradd;
		this.usercity = usercity;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseradd() {
		return useradd;
	}

	public void setUseradd(String useradd) {
		this.useradd = useradd;
	}

	public String getUsercity() {
		return usercity;
	}

	public void setUsercity(String usercity) {
		this.usercity = usercity;
	}
	

}
