package inheritanceExercises;

public abstract class UserAccount {
	
	private String username;
	protected String password;
	private String fullname;
	
	//constructor
	public UserAccount(String username, String password, String fullname) {
		this.username = username;
		this.password = password;
		this.fullname =fullname;
	}
	//getters and setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}


	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public void accessWebsite() {
		System.out.println("Welcome! You are now signed in");
		//TODO how do you return level of rights
	}
	
	//abstract method
	//I need to re-watch lecture and take notes on abstract methods.
	public boolean changePassword(String newPass, String confirmPass) {
		
		if(newPass.equals(confirmPass)) {
			this.password = newPass;
			return true;
		}
		return false;
		
	}
	



}
