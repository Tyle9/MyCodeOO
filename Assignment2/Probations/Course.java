import java.util.ArrayList;

public class Course {

	private ArrayList<Student> roster;  //collection of Student objects

	public Course() {
		roster = new ArrayList<Student>();
	}

	public int countProbation() {
		/* Type your code here */
		 int count = 0;
	        for (int i = 0; i < roster.size(); i++) {
	            if (roster.get(i).getGPA() < 2.0)
	                ++count;
	        }
	        return count;
	    }


	public void addStudent(Student s) {
		roster.add(s);
	}
}