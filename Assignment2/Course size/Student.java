// Class representing a student
public class Student {

	private String first;  // first name
	private String last;   // last name
	private double gpa;    // grade point average
	
	// Student class constructor
	public Student(String first, String last, double gpa) {
		this.first = first;    // first name
		this.last = last;      // last name
		this.gpa = gpa;        // grade point average
	}

	public double getGPA() {
		return gpa;
	}

	public String getLast() {
		return last;
	}
}