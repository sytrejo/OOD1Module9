package inheritanceExercises;

public class Runner {
	
	private AdminUser adminUser;
	private Customer customer;
	private UserAccount userAccount;
	
	
	public static void main(String[] args) {
		
		AdminUser adminUser1 = new AdminUser("admin1","password1","JaneDoe");
		AdminUser adminUser2 = new AdminUser("admin2", "password2", "JoeDoe");
		
		Customer customer1 = new Customer("customer1", "password12", "EricDoe");
		Customer customer2 = new Customer("customer2", "password123", "BrianDoe");
		
	
		//prints the location of the information in the Stack
		//I need to add them an arrayList
		System.out.println(adminUser1);
		
	
	}

}
