package inheritanceExercises;

public class AdminUser {
	
	//attributes
	public String username;
	public String password;
	public String fullname;
	
	//constructor
	public AdminUser(String username, String password, String fullname) {
		this.username = username;
		this.password = password;
		this.fullname = fullname;
	}
	
	public void accessWebsite() {
		System.out.println("Welcome! You are now signed in as ADMIN");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
