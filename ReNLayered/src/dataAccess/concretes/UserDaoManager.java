package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserDaoManager implements UserDao {
	
	public UserDaoManager() {
		
		super();
		this.users = new ArrayList<User>();
	}
	
	private List<User> users;

	public UserDaoManager(List<User> users) {
		super();
		this.users = users;
	}

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.geteMail() + " kayýt oldu");
		
	}

	@Override
	public void update(User user) {
		
		User updatedUser = users.stream().filter(u -> u.getId() == user.getId()).findFirst().get();
        System.out.println(updatedUser.toString());
        updatedUser.setId(user.getId());
        updatedUser.setFirstName(user.getFirstName());
        updatedUser.setLastName(user.getLastName());
        updatedUser.seteMail(user.geteMail());
        updatedUser.setPass(user.getPass());
        System.out.println( updatedUser.toString() + " güncellendi");
    }
		

	@Override
	public void delete(User user) {
		User updatedUser = users.stream().filter(u -> u.getId() == user.getId()).findFirst().get();
		users.remove(updatedUser);
		
	}

	@Override
	public boolean mailMatch(User user) {
		// TODO Auto-generated method stub
		return getEmails().stream().anyMatch(x -> x == user.geteMail());
	}

	@Override
	public boolean passwordMatch(User user) {
		// TODO Auto-generated method stub
		return users.stream().anyMatch(user_ -> user_.getPass() == user.getPass());
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public List<String> getEmails() {
		List<String> emails = new ArrayList<String>();
		for(User user : users) {
			emails.add(user.geteMail());
		}
		return emails;
	}

	@Override
	public User get(int id) {

		return users.stream().filter(u -> u.getId() == id).findFirst().get();
	}

}
