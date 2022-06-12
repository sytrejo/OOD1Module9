package inheritanceExercises;

public class AdminUser extends UserAccount{
	
	private static int minAdminPasswordLength;
	
	//constructor
	public AdminUser(String username, String password, String fullname) {
		super(username, password, fullname);
	}
	
	
	//getters and setters
	
	
	@Override
	public void accessWebsite() {
		System.out.println("Welcome! You are now signed in as ADMIN");
	}
	
	
	public static int getMinAdminPasswordLength() {
		return minAdminPasswordLength;
		
	}
	

	public static void setMinAdminPasswordLength(int length) {
		minAdminPasswordLength = length;
	}
	
	@Override
	public boolean changePassword(String newPass, String confirmPass) {
		
		if(newPass.equals(confirmPass) && newPass.length() >= AdminUser.getMinAdminPasswordLength()) {
			this.password = newPass;
			return true;
		}
		return false;
		
	}
	
	public boolean changePassword(String newPass, String confirmPass, UserAccount user) {
		return user.changePassword(newPass, confirmPass);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
