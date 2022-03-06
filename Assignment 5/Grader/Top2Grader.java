import java.util.Arrays;

public class Top2Grader extends Grader {

   public Top2Grader(Integer[] m_ary) {
       super(m_ary);
   }

   @Override
   public double calculateGrade() {

       Integer[] grades = getGrades();

       if (grades.length == 0)
           return 0.0;
       if (grades.length == 1)
           return (double) grades[0];

       Arrays.sort(grades);

       int len = grades.length;

       double avg = (grades[len - 1] + grades[len - 2]) / 2.0;

       return avg;

   }

   @Override
   public String toString() {
       return "Top2Grader";
   }

}