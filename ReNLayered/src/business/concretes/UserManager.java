package business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	
	private boolean ifValid(User user) {
		String regex = "\\w+@\\w+\\.[a-zA-Z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.geteMail());
		
		if(user.getFirstName() == null || user.getLastName() == null || user.geteMail() == null || user.getPass() == null) {
			
			System.out.println("Bo� b�rak�lamaz");
			return false;
			
		}else {
			if(!matcher.matches()){
				
				System.out.println("Email veya �ifre hatal�");
				return false;
				
				
			}else {
				if (user.getFirstName().length() < 2 && user.getLastName().length() < 2) {
                    if (user.getPass().length() < 6) {
                        System.out.println("�ifreniz en az 6 haneli olmal�d�r.");
                        return false;
			}
				}
			}
		}
		return true;
	
			}
				
              
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		if(ifValid(user) && !ifTheEmailCanBeConfirmed(user)) {
			userDao.add(user);
			return;
			
		}
		
	}

	@Override
	public void update(User user) {
		if(ifValid(user) && !ifTheEmailCanBeConfirmed(user)){
            userDao.update(user);
            return;
		}
	}

	@Override
	public void delete(User user) {
		 userDao.delete(user);
		
	}

	@Override
	public boolean ifTheEmailCanBeConfirmed(User user) {
		return userDao.mailMatch(user);
	
	}

	@Override
	public boolean �fThePasswordCanBeConfirmed(User user) {
		return userDao.passwordMatch(user);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}


	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
