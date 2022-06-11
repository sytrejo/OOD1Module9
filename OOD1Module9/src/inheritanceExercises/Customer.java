package inheritanceExercises;

public class Customer {
	
	//attributes
	public String username;
	public String password;
	public String fullname;
	
	//constructor
	public Customer(String username, String password, String fullname) {
		this.username = username;
		this.password = password;
		this.fullname = fullname;
	}
	
	public void accessWebsite() {
		System.out.println("Welcome! You are now signed in as a CUSTOMER");
	}
	

	

}
