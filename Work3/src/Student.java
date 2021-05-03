
public class Student extends User{
	
	
	public Student(String firstName, String lastName, String eMail, String contactNumber, int percentageOfCompletion) {
		super(firstName, lastName, eMail, contactNumber, percentageOfCompletion);
	}

	private String registeredCourses;
	

	public String getRegisteredCourses() {
		return registeredCourses;
	}

	public void setRegisteredCourses(String registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	
	public Student() {
		
	}
	
	

	

}
