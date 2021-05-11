package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	boolean ifTheEmailCanBeConfirmed(User user);
	boolean ÝfThePasswordCanBeConfirmed(User user);
	List<User> getAll();
	User get(int id);

}
