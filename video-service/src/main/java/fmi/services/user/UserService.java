package fmi.services.user;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	List<User> usersDb;
	
	public UserService() {
		usersDb = new ArrayList<>();
		usersDb.add(new User(1, "Stoqn", "Ivanov"));
		usersDb.add(new User(2, "Ivan", "Stoqnov"));
		usersDb.add(new User(3, "Maria", "Stoqnova"));
	}
	
	public User getById(int id) throws Exception {
		for(User user: usersDb) {
			if(user.id == id) {
				return user;
			}
		}
		throw new Exception("No such user");
	}
	
	public List<User> getAll(){
		return usersDb;
	}
	
	public List<User> create(int id, String firstName, String lastName) throws Exception{
		for(User user: usersDb) {
			if(user.id == id) {
				throw new Exception("Stoqn doesn't like repeating ids..");
			}
		}
		usersDb.add(new User(id, firstName, lastName));
		return usersDb;
	}
}
