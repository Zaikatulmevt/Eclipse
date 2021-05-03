
public class Main {

	public static void main(String[] args) {
		
		
		
		
		
		Student student = new Student();
		student.setFirstName("Mehmet");
		student.setLastName("Kuru");
		student.seteMail("mkuru@hotmail.com");
		student.setContactNumber("05309314898");
		student.setRegisteredCourses("Java kursu");
		
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiro�");
		instructor.seteMail("edemiro�@hotmail.com");
		instructor.setContactNumber("05300245417");
		
		//Bu �ekilde devam edilebilir.
		
		UserManager userManager = new UserManager();
		userManager.log�n(instructor);
		userManager.Delete(student);
		userManager.Update(student);
		
		
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.addTheLesson(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.completeThisLesson(student);
		studentManager.takeAttendance(student);
		//Bu �ekilde imzalar devam ettirilebilir.
		
		LogOperations logOperations = new LogOperations();
		logOperations.add(new UserManager(), student, new FileLogger());
		logOperations.add(new UserManager(), student, new EmailLogger());
		
		
		
	

	}

}
