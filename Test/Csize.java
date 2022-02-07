import java.util.ArrayList;

public class Course {

	private ArrayList<Student> roster;  //collection of Student objects

	public Course() {
		roster = new ArrayList<Student>();
	}

	public int courseSize() {
		/* Your code goes here */
		return roster.size();
	}
	
	public void addStudent(Student s) {
		roster.add(s);
	}
}


public class LabProgram {
    public static void main (String [] args) {
       Course course = new Course();
      
      // Example students for testing
      course.addStudent(new Student("Henry", "Bendel", 3.6));   
      course.addStudent(new Student("Johnny", "Min", 2.9)); 
       
      System.out.println("Course size: " + course.courseSize());
    } 
}


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