import java.util.ArrayList;

public class Course {

	private ArrayList<Student> roster; //collection of Student objects

	public Course() {
		roster = new ArrayList<Student>();
	}

	public ArrayList<Student> getDeansList() {
		/* Type your code here */
	 ArrayList<Student> deans = new ArrayList<Student>();
         for (Student student: roster) {
                 if (student.getGPA() >= 3.5) {
                         deans.add(student);
                 }
         }
         return deans;
 }

	public void addStudent(Student s) {
		roster.add(s);
	}
}