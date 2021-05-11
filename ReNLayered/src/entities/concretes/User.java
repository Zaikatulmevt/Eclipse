package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity{
	
	private int id;
	private String firstName;
	private String lastName;
	private String eMail;
	private String pass;
	private String verifyCode;
	private boolean verified;
	
	public User() {
		
	}


	public User(int id, String firstName, String lastName, String eMail, String pass) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.pass = pass;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getVerifyCode() {
		return verifyCode;
	}


	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}


	public boolean isVerified() {
		return verified;
	}


	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	public String toString() {
        return "Id:"+id+" Email: " + eMail + " Full Name: " + firstName + " "+ getLastName()+ " þifre: "+pass + "\n";
    }

}
