package exercise1;

import java.io.Serializable;

public class Student implements Serializable {
	// Generated default serial id
	private static final long serialVersionUID = 1003864999747371149L;
	
	// Instance Variables
	private String fullName;
	private int sid;
	private transient String email;
	private String phoneNumber;
	private static int numStudents = 0;
	
	// Constructor
	public Student(String fullName, int sid, String email, String phoneNumber) {
		this.fullName = fullName;
		this.sid = sid;
		this.email = email;
		this.phoneNumber = phoneNumber;
		numStudents++;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Student [fullName=" + fullName + ", sid=" + sid + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", total number of students " + numStudents + "]";
	}
	
	
	

}
