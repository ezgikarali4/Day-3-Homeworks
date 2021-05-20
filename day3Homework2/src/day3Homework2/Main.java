package day3Homework2;


public class Main {

	public static void main(String[] args) {
		
		//INSTRUCTOR
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setUserId(0);
				
		//STUDENT
		Student student = new Student();
		student.setFirstName("Ezgi");
		student.setLastName("Karalý");
		student.setUserId(1);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addUser(instructor);
		instructorManager.deleteUser(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.addUser(student);
		studentManager.deleteUser(student);
		
	}

}
