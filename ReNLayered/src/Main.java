import java.util.List;

import business.concretes.AuthManager;
import business.concretes.UserManager;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.UserDaoManager;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1, "Metehan Melih Yapan", "Yapan", "metehanmelihyapan@gmail.com", "123456789");
		User user2 = new User(2, "Engin Demiroð", "Demiroð", "engin@hotmail.com", "12345");
		
		
		UserManager manager = new UserManager(new UserDaoManager());
		AuthManager authManager = new AuthManager(manager);
		authManager.signUp(user);
		authManager.signInOrUpWithAmazonService(user2);
		authManager.signIn(user);
	}

}
