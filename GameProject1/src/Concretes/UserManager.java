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
			System.out.println("Kullanýcý baþarýyla kaydedildi : " + user.getFirstName() + user.getLastName());
			
		}else {
			System.out.println("Kayýt baþarýsýz. Bilgilerinizi kontrol ediniz.");
		}
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() +" baþarýyla güncellendi");
		
	}

	@Override
	public void remove(User user) {
		System.out.println("Baþarýyla kaldýrýldý : " + user.getFirstName());
		
	}

}
