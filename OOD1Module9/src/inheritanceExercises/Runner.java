package inheritanceExercises;

public class Runner {
	
	private AdminUser adminUser;
	private Customer customer;
	private UserAccount userAccount;
	private UserAccountManager userAccountManager;
	
	
	public static void main(String[] args) {
		
		AdminUser adminUser1 = new AdminUser("admin1","password1","JaneDoe");
		AdminUser adminUser2 = new AdminUser("admin2", "password2", "JoeDoe");
		
		Customer customer1 = new Customer("customer1", "password12", "EricDoe");
		Customer customer2 = new Customer("customer2", "password123", "BrianDoe");
		
	
		//prints the location of the information in the Stack
		//I need to add them an arrayList
		System.out.println(adminUser1);
		
		customer1.changePassword("password12345", "password12345");
		System.out.println(customer1.getPassword());
		
		customer2.changePassword("password125", "password12345");
		System.out.println(customer2.getPassword());
		
		
		adminUser1.accessWebsite();
		customer1.accessWebsite();
		//create a UserAcountManager
		//TODO: Do I have to add attributes to this class?
		UserAccountManager userAccountManager1 = new UserAccountManager();
		
		//adding the users to the account Manager array
		userAccountManager1.addUser(adminUser1);
		userAccountManager1.addUser(adminUser2);
		userAccountManager1.addUser(customer1);
		userAccountManager1.addUser(customer2);
		
		System.out.println(userAccountManager1.login("customer2", "password123"));
		
		System.out.println(userAccountManager1.login("customer2", "password"));
		
		AdminUser.setMinAdminPasswordLength(10);
		
		//calling password on Admin
		adminUser1.changePassword("password12345", "password12345");
		System.out.println(adminUser1.getPassword());
		
		adminUser2.changePassword("password", "password");
		System.out.println(adminUser2.getPassword());
		
		///Example of Overloading
		adminUser1.changePassword("PASSWORD12345", "PASSWORD12345", customer1);
		System.out.println(customer1.getPassword());
		
		//set the minimum length for the customer
		Customer.setMinCustomerPasswordLength(7);
		
		//checking the min length requirement 
		customer1.changePassword("password12345", "password12345");
		System.out.println(customer1.getPassword());
		
		customer2.changePassword("PASS", "PASS");
		System.out.println(customer2.getPassword());
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
