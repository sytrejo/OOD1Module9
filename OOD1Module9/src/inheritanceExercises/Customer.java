package inheritanceExercises;

public class Customer extends UserAccount {
	
	private static int minCustomerPasswordLength;
	
	
	//constructor
	public Customer(String username, String password, String fullname) {
		//because this class is extending the parent class I can make a call to super
		super(username, password, fullname);
	}
	
	//getter and setters
	
	public static int getMinCustomerPasswordLength() {
		return minCustomerPasswordLength;
		
	}
	
	public static void setMinCustomerPasswordLength(int length) {
		minCustomerPasswordLength = length;
		
	}
	
	@Override
	public void accessWebsite() {
		System.out.println("Welcome! You are now signed in as a CUSTOMER");
	}
	
	@Override
	public boolean changePassword(String newPass, String confirmPass) {
		
		if(newPass.equals(confirmPass) && newPass.length() >= Customer.getMinCustomerPasswordLength()) {
			this.password = newPass;
			return true;
		}
		return false;
		
	}

	

}
