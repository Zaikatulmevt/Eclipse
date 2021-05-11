package business.concretes;

import business.abstracts.AuthService;
import business.abstracts.UserService;
import core.AmazonServiceAdapter;
import entities.concretes.User;

public class AuthManager implements AuthService {
	
	private UserService userService; 

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}
	
	
	private boolean checkUserForLogin(User user) {
		if(user.isVerified() && !(user.geteMail().isBlank() && user.geteMail() == null) && !(user.getPass().isBlank() && user.getPass() == null) ) {
            return true;
        }
        return false;
		
	}

	@Override
	public void signIn(User user) {
		if(checkUserForLogin(user)){
            if(userService.ifTheEmailCanBeConfirmed(user) && userService.�fThePasswordCanBeConfirmed(user)){
                System.out.println("Giri� yap�ld�");
            }else{
                System.out.println("Email veya �ifre hatas�");
            }
            return;
        }
        System.out.println("Do�rulanmam�� Hesap");
		
	}

	@Override
	public void signInOrUpWithAmazonService(User user) {
		user.setVerified(true);
        if(checkUserForLogin(user)) {
            AmazonServiceAdapter amazonApi = new AmazonServiceAdapter();
            amazonApi.signIn(user.geteMail(), user.getPass());
            userService.add(user);
            return;
        }
        System.out.println("Do�rulanmam�� Hesap");
    }
		

	@Override
	public void signUp(User user) {
		userService.add(user);
        int random = (int)Math.floor(Math.random()*9999);
        String dogrulamaKodu = user.getFirstName().substring(0, 1)+user.getId()+user.getLastName().substring(0, 1)+random;
        System.out.println("Do�rulama Kodu: "+dogrulamaKodu);
        user.setVerifyCode(dogrulamaKodu);
		
	}

	@Override
	public void verify(User user, String code) {
		 User verifiedUser = userService.get(user.getId());
	        if(verifiedUser.getVerifyCode() == code) {
	            verifiedUser.setVerified(true);
	            System.out.println("Kod do�ruland�");
	            return;
	        }
	        System.out.println("Do�rulama kodu hatal�");
		
	}

}
