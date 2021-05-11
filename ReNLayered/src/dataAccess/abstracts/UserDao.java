package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	boolean mailMatch(User user);
	boolean passwordMatch(User user);
	List<User> getAll();
	List<String> getEmails();
	User get(int id);
	

}
