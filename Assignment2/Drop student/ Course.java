import java.util.ArrayList;

public class Course {

	private ArrayList<Student> roster; //collection of Student objects

	public Course() {
		roster = new ArrayList<Student>();
	}

	public void dropStudent(String last) {
		/* Type your code here */
	 Student dropStudent = null;
	       for(Student student:roster) {
	           if(student.getLast().equals(last)) {
	               dropStudent = student;
	               break;
	           }
	       }
	       if(dropStudent != null) {
	           roster.remove(dropStudent);
	       }
	   }

   public void addStudent(Student s) {
      roster.add(s);
   }
    
   public int countStudents() {
      return roster.size();
   }
}