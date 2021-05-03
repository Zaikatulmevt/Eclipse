
public class User {
	
	private String firstName;
	private String lastName;
	private String eMail;
	private String contactNumber;
	private int percentageOfCompletion;
	
	
	public User(String firstName, String lastName, String eMail, String contactNumber, int percentageOfCompletion) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.contactNumber = contactNumber;
		this.percentageOfCompletion = percentageOfCompletion;
	}
	
	public User() {
		
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public int getPercentageOfCompletion() {
		return percentageOfCompletion;
	}
	

}
