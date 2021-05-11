package core;

import amazonAuthService.AmazonAuthManagar;

public class AmazonServiceAdapter {
	
	public void signIn(String email, String password) {
		AmazonAuthManagar amazonAuthManager = new AmazonAuthManagar();
				amazonAuthManager.sign(email, password);
	}

}
