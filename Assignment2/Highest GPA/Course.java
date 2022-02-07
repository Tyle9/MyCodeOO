import java.util.ArrayList;

public class Course {

	private ArrayList<Student> roster; //collection of Student objects

	public Course() {
		roster = new ArrayList<Student>();
	}

	public Student findStudentHighestGpa() {
		/* Type your code here */
		Student HighestGpa=roster.get(0);
        for(int i=0;i<roster.size();i++){
            if(HighestGpa.getGPA()<roster.get(i).getGPA()){
            	HighestGpa=roster.get(i);
            }
        }
        return HighestGpa;
    }

	public void addStudent(Student s) {
		roster.add(s);
	}
}