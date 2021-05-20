package day3Homework2;

public class InstructorManager extends UserManager{
	
	//OVERRIDING
	public void addUser(User instructor) {
		System.out.println("Added new instructor: " + instructor.getFirstName() + " " + instructor.getLastName() + ".");
	}

	public void deleteUser(User instructor) {
		System.out.println("Deleted instructor: " + instructor.getFirstName() + " " + instructor.getLastName() + ".");
	}
	
}
