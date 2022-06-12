package inheritanceExercises;

import java.util.ArrayList;

public class UserAccountManager {
	
	
	private ArrayList<UserAccount> userAccounts = new ArrayList <UserAccount>();
	
	
	public void addUser(UserAccount user) {
		userAccounts.add(user);
		
	}
	
	
	public boolean login(String username, String password) {
		for(int i = 0; i< userAccounts.size(); i++) {
			if (userAccounts.get(i).getUsername().equals(username)
					&& userAccounts.get(i).getPassword().equals(password)) {
				return true;
			}
				
		}
		return false;
	}
	
	
	
	

}
