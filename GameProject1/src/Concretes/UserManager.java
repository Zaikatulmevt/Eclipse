package Concretes;

import Abstracts.UserCheckService;
import Abstracts.UserService;
import Entities.User;

public class UserManager implements UserService {
	
	private UserCheckService userCheckService;

	public UserManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		if(userCheckService.checkIfRealPerson(user)){
			System.out.println("Kullan�c� ba�ar�yla kaydedildi : " + user.getFirstName() + user.getLastName());
			
		}else {
			System.out.println("Kay�t ba�ar�s�z. Bilgilerinizi kontrol ediniz.");
		}
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() +" ba�ar�yla g�ncellendi");
		
	}

	@Override
	public void remove(User user) {
		System.out.println("Ba�ar�yla kald�r�ld� : " + user.getFirstName());
		
	}

}
