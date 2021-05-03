
public class Instructor extends User {
	
	private int numberOfStudents;

	public Instructor(String firstName, String lastName, String eMail, String contactNumber, int percentageOfCompletion,
			int numberOfStudents) {
		super(firstName, lastName, eMail, contactNumber, percentageOfCompletion);
		this.numberOfStudents = numberOfStudents;
	}
	
	public Instructor() {
		
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}


}
