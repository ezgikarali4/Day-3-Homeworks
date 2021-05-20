package day3Homework2;

public class StudentManager extends UserManager{
	
	//OVERRIDING
	public void addUser(User student) {
		System.out.println("Added new student: " + student.getFirstName() + " " + student.getLastName() + ".");
	}

	public void deleteUser(User student) {
		System.out.println("Deleted student: " + student.getFirstName() + " " + student.getLastName() + ".");
	}
}
