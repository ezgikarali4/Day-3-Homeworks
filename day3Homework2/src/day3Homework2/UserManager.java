package day3Homework2;

public class UserManager {
	public void addUser(User user) {
		System.out.println("Added new user: " + user.getFirstName() + " " + user.getLastName() + ".");
	}

	public void deleteUser(User user) {
		System.out.println("Deleted user: " + user.getFirstName() + " " + user.getLastName() + ".");
	}
}
